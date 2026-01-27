package com.navneet.anthropic.service.impl;

import com.navneet.anthropic.constants.AgentConstants;
import com.navneet.anthropic.models.ChatResponse;
import com.navneet.anthropic.service.ChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.anthropic.AnthropicChatModel;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author navneet.prabhakar
 */
@Slf4j
@Service
public class ChatServiceImpl implements ChatService {

  private final ChatClient chatClient;

  @Autowired
  public ChatServiceImpl(AnthropicChatModel anthropicChatModel){
    this.chatClient=ChatClient.create(anthropicChatModel);
  }

  @Override
  public ChatResponse statelessChat(String message) {
    Long startTime=System.currentTimeMillis();
    log.info("Received stateless chat message: {}", message);
    String response=chatClient.prompt().system(AgentConstants.SYSTEM_PROMPT)
        .user(message).call().content();
    Long endTime=System.currentTimeMillis();
    // Calling content() closes the call advisors, hence they become unavailable after first call
    log.info("Response received in {} ms: response: {}",(endTime-startTime), response);
    return ChatResponse.builder()
        .response(response)
        .timeTaken(endTime-startTime)
        .build();
  }
}

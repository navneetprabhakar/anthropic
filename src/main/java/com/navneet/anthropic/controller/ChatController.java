package com.navneet.anthropic.controller;

import com.navneet.anthropic.models.ChatResponse;
import com.navneet.anthropic.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author navneet.prabhakar
 */
@RestController
@RequestMapping("v1/chat")
public class ChatController {

  @Autowired private ChatService chatService;


  @PostMapping("/stateless" )
  public ChatResponse statelessChat(@RequestBody String message){
    return chatService.statelessChat(message);
  }

}

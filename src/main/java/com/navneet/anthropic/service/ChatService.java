package com.navneet.anthropic.service;


import com.navneet.anthropic.models.ChatResponse;

/**
 * @author navneet.prabhakar
 */
public interface ChatService {

  ChatResponse statelessChat(String message);
}

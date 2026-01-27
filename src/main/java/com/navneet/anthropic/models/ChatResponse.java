package com.navneet.anthropic.models;

import lombok.Builder;
import lombok.Data;

/**
 * @author navneet.prabhakar
 */
@Data
@Builder
public class ChatResponse {

  private String response;
  private Long timeTaken;

}

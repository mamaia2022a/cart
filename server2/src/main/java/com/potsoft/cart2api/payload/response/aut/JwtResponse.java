package com.potsoft.cart2api.payload.response.aut;

import java.util.List;

import com.potsoft.cart2api.model.aut.AutUser;

public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private Long id;
  private String username;
  private List<String> roles;
  private AutUser autuser;

  public JwtResponse(String accessToken, Long id, String username, List<String> roles, AutUser autuser) {
    this.token = accessToken;
    this.id = id;
    this.username = username;
    this.roles = roles;
    this.autuser = autuser;
  }

  public String getAccessToken() {
    return token;
  }

  public void setAccessToken(String accessToken) {
    this.token = accessToken;
  }

  public String getTokenType() {
    return type;
  }

  public void setTokenType(String tokenType) {
    this.type = tokenType;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserName() {
    return username;
  }

  public void setEmail(String username) {
    this.username = username;
  }


  public List<String> getRoles() {
    return roles;
  }

  public AutUser getAutUser() {
    return autuser;
  }
}

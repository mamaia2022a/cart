package com.potsoft.cart2api.payload.response.aut;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {
	private String accessToken;
	private String tokenType = "Bearer";

	public JwtAuthenticationResponse(String accessToken) {
		this.accessToken = accessToken;
	}

  public String getAccessToken() 
  {
		return this.accessToken;
	}

	public final void setAccessToken(String accessToken)
  {
    this.accessToken = accessToken;
	}


  public String getTokenType() 
  {
		return this.tokenType;
	}

	public final void setTokenType(String tokenType)
  {
    this.tokenType = tokenType;
	}
  
}

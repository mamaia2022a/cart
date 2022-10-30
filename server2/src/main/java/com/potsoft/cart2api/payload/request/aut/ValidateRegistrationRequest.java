package com.potsoft.cart2api.payload.request.aut;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ValidateRegistrationRequest
{
	@NotNull
	private Long codValidare;

	public Long getCodValidare() 
	{
	  return this.codValidare;
	}
  
	public void setCodValidare(Long codValidare) 
	{
	  this.codValidare = codValidare;
	}
  

}

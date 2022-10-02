package com.potsoft.cart2api.payload.response.aut;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ValidateRegistrationResponse
{
	@NotBlank
	private String codValidareAcceptat; //"y"/"n"

	public String getCodValidareAcceptat() 
	{
	  return this.codValidareAcceptat;
	}
  
	public void setCodValidareAcceptat(String codValidareAcceptat) 
	{
	  this.codValidareAcceptat = codValidareAcceptat;
	}
  

}

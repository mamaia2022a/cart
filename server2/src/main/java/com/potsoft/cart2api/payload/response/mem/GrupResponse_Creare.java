package com.potsoft.cart2api.payload.response.mem;

import com.potsoft.cart2api.model.mem.MemGrup;

import lombok.Data;


@Data
public class GrupResponse_Creare
{
	private MemGrup memgrup;

	public MemGrup getMemgrup() 
	{
	  return this.memgrup;
	}
  
	public void setMemgrup(MemGrup memgrup) 
	{
	  this.memgrup = memgrup;
	}
	
}


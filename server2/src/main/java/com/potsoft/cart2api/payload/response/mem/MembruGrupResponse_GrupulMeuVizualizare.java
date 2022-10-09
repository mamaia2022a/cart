package com.potsoft.cart2api.payload.response.mem;

import com.potsoft.cart2api.model.mem.MemMembruGrup;
import com.potsoft.cart2api.model.mem.MemGrup;
import com.potsoft.cart2api.model.mem.MemSefGrup;
import com.potsoft.cart2api.model.mem.MemMembru;

import java.util.List;
import lombok.Data;


@Data
public class MembruGrupResponse_GrupulMeuVizualizare
{
	private MemGrup     grup; //sef grup ca membru
	private MemSefGrup  sefgrup;
	private MemMembru   membru;
	private List<MemMembruGrup>  membrigrup;



	public MemMembru getMembru() 
	{
	  return this.membru;
	}
  
	public void setMembru(MemMembru membru) 
	{
	  this.membru = membru;
	}



	public MemGrup getGrup() 
	{
	  return this.grup;
	}
  
	public void setGrup(MemGrup grup) 
	{
	  this.grup = grup;
	}



	public MemSefGrup getSefGrup() 
	{
	  return this.sefgrup;
	}
  
	public void setSefGrup(MemSefGrup sefgrup) 
	{
	  this.sefgrup = sefgrup;
	}


	
	public List<MemMembruGrup> getMembriGrup() 
	{
	  return this.membrigrup;
	}
  
	public void setMembriGrup(List<MemMembruGrup> membrigrup) 
	{
	  this.membrigrup = membrigrup;
	}

}


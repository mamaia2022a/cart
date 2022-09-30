package com.potsoft.cart2api.payload.response.mes;

import com.potsoft.cart2api.model.mes.MesDestinatar;
import com.potsoft.cart2api.model.mes.MesExpeditor;

import lombok.Data;


@Data
public class MesExpSiDestResponse_CreareRol
{

	MesExpeditor  mesExpeditor;
	MesDestinatar mesDestinatar;


	public MesExpeditor getMesExpeditor()
	{
      return this.mesExpeditor;
	}


	public void setMesExpeditor(MesExpeditor mesExpeditor)
	{
      this.mesExpeditor = mesExpeditor;
	}


	public MesDestinatar getMesDestinatar()
	{
      return this.mesDestinatar;
	}


	public void setMesDestinatar(MesDestinatar mesDestinatar)
	{
      this.mesDestinatar = mesDestinatar;
	}
	
}


package com.potsoft.cart2api.payload.response.mes;


import lombok.Data;

import java.util.List;

import com.potsoft.cart2api.model.mes.MesDestinMesaj;
import com.potsoft.cart2api.model.mes.MesMesaj;


@Data
public class MesMesajePrimiteResponse
{

	List<MesDestinMesaj>  noimesajeprimite;
    boolean needrelogin;
    boolean acceptatingrup;
	boolean refuzatingrup;
	boolean suntcererideafilierelagrup;


	public List<MesDestinMesaj> getNoimesajeprimite()
	{
      return this.noimesajeprimite;
	}


	public void setNoiMesajePrimite(List<MesDestinMesaj> noimesajeprimite)
	{
      this.noimesajeprimite = noimesajeprimite;
	  seteazaNeedRelogin(this.noimesajeprimite);
	  seteazaAcceptatInGrup(this.noimesajeprimite);
	  seteazaRefuzatInGrup(this.noimesajeprimite);
	  seteazaSuntCereriDeAfiliereLaGrup(this.noimesajeprimite);
	}


	public void seteazaNeedRelogin(List<MesDestinMesaj> mesajenoi)
	{
	  setNeedrelogin(false);
      for(MesDestinMesaj crtDestinMesaj : mesajenoi)
	  {
        MesMesaj crtMesaj = crtDestinMesaj.getMesaj();
		String reloginyn = crtMesaj.getMesMesajReloginyn();
		if (reloginyn.equals("y"))
		{
          setNeedrelogin(true);
		}
	  }
	}


	public void seteazaAcceptatInGrup(List<MesDestinMesaj> mesajenoi)
	{
	  setAcceptatingrup(false);
      for(MesDestinMesaj crtDestinMesaj : mesajenoi)
	  {
        MesMesaj crtMesaj  = crtDestinMesaj.getMesaj();
		String tipmesajcod = crtMesaj.getMesMesajTipmesajcod();
		if (tipmesajcod.equals("ACCAFLGRUP"))
		{
		  setAcceptatingrup(true);
		  break;
		}
	  }
	}


	public void seteazaRefuzatInGrup(List<MesDestinMesaj> mesajenoi)
	{
	  setRefuzatingrup(false);
      for(MesDestinMesaj crtDestinMesaj : mesajenoi)
	  {
        MesMesaj crtMesaj  = crtDestinMesaj.getMesaj();
		String tipmesajcod = crtMesaj.getMesMesajTipmesajcod();
		if (tipmesajcod.equals("REFAFLGRUP"))
		{
		  setRefuzatingrup(true);
		  break;
		}
	  }
	}


	public void seteazaSuntCereriDeAfiliereLaGrup(List<MesDestinMesaj> mesajenoi)
	{
	  setSuntcererideafilierelagrup(false);
      for(MesDestinMesaj crtDestinMesaj : mesajenoi)
	  {
        MesMesaj crtMesaj  = crtDestinMesaj.getMesaj();
		String tipmesajcod = crtMesaj.getMesMesajTipmesajcod();
		if (tipmesajcod.equals("CERAFLGRUP"))
		{
		  setSuntcererideafilierelagrup(true);
		  break;
		}
	  }
	}



	//--------------------------------
	//  set / get
	//--------------------------------
	public boolean getNeedRelogin()
	{
      return this.needrelogin;
	}


	public void setNeedrelogin(boolean needrelogin)
	{
      this.needrelogin = needrelogin;
	}



	public boolean getAcceptatingrup()
	{
      return this.acceptatingrup;
	}


	public void setAcceptatingrup(boolean acceptatingrup)
	{
      this.acceptatingrup = acceptatingrup;
	}


	
	public boolean getRefuzatingrup()
	{
      return this.refuzatingrup;
	}


	public void setRefuzatingrup(boolean refuzatingrup)
	{
      this.refuzatingrup = refuzatingrup;
	}



	public boolean getSuntcererideafilierelagrup()
	{
      return this.suntcererideafilierelagrup;
	}


	public void setSuntcererideafilierelagrup(boolean suntcererideafilierelagrup)
	{
      this.suntcererideafilierelagrup = suntcererideafilierelagrup;
	}

}


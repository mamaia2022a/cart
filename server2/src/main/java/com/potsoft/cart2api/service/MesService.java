package com.potsoft.cart2api.service;

import com.potsoft.cart2api.model.aut.AutRol;
import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.gen.GenAcoperireGeografica;
import com.potsoft.cart2api.model.mes.MesDestinMesaj;
import com.potsoft.cart2api.model.mes.MesDestinatar;
import com.potsoft.cart2api.model.mes.MesExpeditor;
import com.potsoft.cart2api.model.mes.MesMesaj;
import com.potsoft.cart2api.model.mes.MesTipMesaj;

import java.util.List;


public interface MesService {

  MesExpeditor creazaMesExpeditor(Long userId, String userRolcod);                          
  MesExpeditor creazaSiSalveazaMesExpeditor(Long userId, String userRolcod);
  MesExpeditor creazaMesExpeditor(AutUser autUser, AutUserInfo autUserInfo, AutRol autRol);                          
  MesExpeditor creazaSiSalveazaMesExpeditor(AutUser autUser, AutUserInfo autUserInfo, AutRol autRol);
  
  MesDestinatar creazaMesDestinatar(Long userId, String userRolcod);                          
  MesDestinatar creazaSiSalveazaMesDestinatar(Long userId, String userRolcod);
  MesDestinatar creazaMesDestinatar(AutUser autUser, AutUserInfo autUserInfo, AutRol autRol);                          
  MesDestinatar creazaSiSalveazaMesDestinatar(AutUser autUser, AutUserInfo autUserInfo, AutRol autRol);


  MesMesaj creazaMesMesaj(String mesText, String mesTipMesajCod, 
                          MesExpeditor mesExpeditor, List<MesDestinatar> mesDestinari,
                          String genAcoperireGeograficCod);
  MesMesaj creazaSiSalveazaMesMesaj(String mesText, String mesTipMesajCod, 
                                    MesExpeditor mesExpeditor, List<MesDestinatar> mesDestinari,
                                    String genAcoperireGeograficaCod);


	MesMesaj creazaSiSalveazaMesaj(Long expUserId,  String expRolcod,
	                               Long destUserId, String destRolcod,
								                 String tipMesajCod);

  MesMesaj creazaMesMesaj(String mesText, MesTipMesaj  mesTipMesaj, 
                          MesExpeditor mesExpeditor, List<MesDestinatar> mesDestinari,
                          GenAcoperireGeografica genAcoperireGeografica);
  MesMesaj creazaSiSalveazaMesMesaj(String mesText, MesTipMesaj  mesTipMesaj, 
                                    MesExpeditor mesExpeditor, List<MesDestinatar> mesDestinari,
                                    GenAcoperireGeografica genAcoperireGeografica);
      
                                    
  List<MesDestinMesaj> creazaListaMesDestinMesaj(MesMesaj  mesMesaj, List<MesDestinatar> mesDestinatari);
  List<MesDestinMesaj> creazaSiSalveazaListaMesDestinMesaj(MesMesaj  mesMesaj, List<MesDestinatar> mesDestinatari);

  MesDestinMesaj creazaMesDestinMesaj(MesMesaj  mesMesaj, MesDestinatar mesDestinatar);
  MesDestinMesaj creazaSiSalveazaMesDestinMesaj(MesMesaj  mesMesaj, MesDestinatar mesDestinatar);

}


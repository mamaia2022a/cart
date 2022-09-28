package com.potsoft.cart2api.service;

import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.gen.GenAcoperireGeografica;
//import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.model.mem.MemGrup;
import com.potsoft.cart2api.model.mem.MemMembru;
import com.potsoft.cart2api.model.mem.MemMembruCI;
import com.potsoft.cart2api.model.mem.MemMembruCotizatie;
import com.potsoft.cart2api.model.mem.MemMembruGrup;
import com.potsoft.cart2api.model.mem.MemMembruRol;
import com.potsoft.cart2api.model.mem.MemMembruTip;
import com.potsoft.cart2api.model.mem.MemSefGrup;
import com.potsoft.cart2api.model.mem.MemTip;
import com.potsoft.cart2api.model.mem.MemTipRol;
import com.potsoft.cart2api.payload.request.mem.GrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.GrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.GrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembriGrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruAdresaRequest_Actualizare;
import com.potsoft.cart2api.payload.request.mem.MembruAdresaRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCIRequest_Actualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCIRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruCIRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Actualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_AcceptareAfiliere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Activare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_CerereAfiliere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Excludere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Plecare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruRolRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruRolRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Schimbare;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembriGrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruAdresaResponse_Actualizare;
import com.potsoft.cart2api.payload.response.mem.MembruAdresaResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCIResponse_Actualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCIResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruCIResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Actualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_AcceptareAfiliere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Activare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_CerereAfiliere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Excludere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Plecare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruRolResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruRolResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Schimbare;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Vizualizare;

//import java.util.List;

public interface MemService {
	
  MembruResponse_Creare      membru_Creare     (Long userid, String rolCod);
  MembruResponse_Creare      membru_Creare     (Long userid, MembruRequest_Creare      membruRequestCreare);
  MembruResponse_Stergere    membru_Stergere   (Long userid, MembruRequest_Stergere    membruRequestStergere);
  MembruResponse_Vizualizare membru_Vizualizare(Long userid, MembruRequest_Vizualizare membruRequestVizualizare);
  
  MembruCIResponse_Creare      membruCI_Creare       (Long userid, MembruCIRequest_Creare      membruCIRequestCreare);
  MembruCIResponse_Actualizare membruCI_Actualizare  (Long userid, MembruCIRequest_Actualizare membruCIRequestActualizare);
  MembruCIResponse_Vizualizare membruCI_Vizualizare  (Long userid, MembruCIRequest_Vizualizare membruCIRequestVizualizare);

  MembruCotizatieResponse_Creare       membruCotizatie_Creare     (Long userid, MembruCotizatieRequest_Creare      membruCotizatieRequestCreare);
  MembruCotizatieResponse_Actualizare  membruCotizatie_Actualizare(Long userid, MembruCotizatieRequest_Actualizare membruCotizatieRequestActualizare);
  MembruCotizatieResponse_Stergere     membruCotizatie_Stergere   (Long userid, MembruCotizatieRequest_Stergere    membruCotizatieRequestStergere);
  MembruCotizatieResponse_Vizualizare  membruCotizatie_Vizualizare(Long userid, MembruCotizatieRequest_Vizualizare membruCotizatieRequestVizualizare);

  MembruAdresaResponse_Actualizare membruAdresa_Actualizare  (Long userid, MembruAdresaRequest_Actualizare membruCIRequestActualizare);
  MembruAdresaResponse_Vizualizare membruAdresa_Vizualizare  (Long userid, MembruAdresaRequest_Vizualizare membruCIRequestVizualizare);


  MembruTipResponse_Creare     membruTip_Creare  (Long userid, MembruTipRequest_Creare   membruTipRequestCreare);
  MembruTipResponse_Stergere   membruTip_Stergere(Long userid, MembruTipRequest_Stergere membruTipRequestStergere);
  MembruTipResponse_Schimbare  membruTip_Schimbare(Long userid, MembruTipRequest_Schimbare  membruTipRequestSchimbare);

  MembruRolResponse_Creare   membruRol_Creare  (Long userid, MembruRolRequest_Creare   membruRolRequestCreare);
  MembruRolResponse_Stergere membruRol_Stergere(Long userid, MembruRolRequest_Stergere membruRolRequestStergere);


  MembruGrupResponse_CerereAfiliere    membruGrup_CerereAfiliere(Long userid,
                                                     MembruGrupRequest_CerereAfiliere  membruGrupRequestCerereAfiliere);
  MembruGrupResponse_AcceptareAfiliere membruGrup_AcceptareAfiliere(Long userid, 
                                                    MembruGrupRequest_AcceptareAfiliere  membruGrupRequestAcceptareAfiliere);
  MembruGrupResponse_Activare  membruGrup_Activare(Long userid,  MembruGrupRequest_Activare  membruGrupRequestActivare);
  MembruGrupResponse_Plecare   membruGrup_Plecare (Long userid,  MembruGrupRequest_Plecare   membruGrupRequestPlecare);
  MembruGrupResponse_Excludere membruGrup_Excludere(Long userid, MembruGrupRequest_Excludere membruGrupRequestActivare);

                                                  
  MembruGrupResponse_Creare      membruGrup_Creare     (Long userid, MembruGrupRequest_Creare   membruGrupRequestCreare);
  MembruGrupResponse_Stergere    membruGrup_Stergere   (Long userid, MembruGrupRequest_Stergere membruGrupRequestStergere);
  MembruGrupResponse_Vizualizare membruGrup_Vizualizare(Long userid, MembruGrupRequest_Vizualizare membruGrupRequestVizualizare);

  SefGrupResponse_Creare         sefGrup_Creare     (Long userid, SefGrupRequest_Creare      sefGrupRequestCreare);
  SefGrupResponse_Stergere       sefGrup_Stergere   (Long userid, SefGrupRequest_Stergere    sefGrupRequestStergere);
  SefGrupResponse_Vizualizare    sefGrup_Vizualizare(Long userid, SefGrupRequest_Vizualizare sefGrupRequestVizualizare);

  GrupResponse_Creare            grup_Creare     (Long userid, GrupRequest_Creare grupRequestCreare);
  GrupResponse_Stergere          grup_Stergere   (Long userid, GrupRequest_Stergere grupRequestStergere);
  GrupResponse_Vizualizare       grup_Vizualizare(Long userid, GrupRequest_Vizualizare grupRequestVizualizare);

  MembriGrupResponse_Vizualizare membriGrup_Vizualizare(Long userid, MembriGrupRequest_Vizualizare    grupRequestVizualizare);


  MemMembru                    creazaMemMembru(AutUser autUser, AutUserInfo autUserInfo, MemTip memTip);
  MemMembru                    creazaSiSalveazaMemMembru(AutUser autUser, AutUserInfo autUserInfo, MemTip memTip);
  MembruTipResponse_Schimbare  schimbaretipMemMembru(Long userid, String crtMemTipCod, String newMemTipCod, 
                                                                  String crtMemTiprolCod, String newMemTiprolCod);

  MemMembruTip  creazaMemMembruTip(MemMembru memMembru, MemTip memTip);
  MemMembruTip  creazaSiSalveazaMemMembruTip(MemMembru memMembru, MemTip memTip);

  MemMembruRol  creazaMemMembruRol(MemMembru memMembru, MemTipRol memTipRol, GenAcoperireGeografica acoperireGeografica);
  MemMembruRol  creazaSiSalveazaMemMembruRol(MemMembru memMembru, MemTipRol memTipRol, GenAcoperireGeografica acoperireGeografica);

  MemSefGrup    creazaMemSefGrup(MemMembru memMembru);
  MemSefGrup    creazaSiSalveazaMemSefGrup(MemMembru memMembru);

  MemGrup       creazaMemGrup(MemSefGrup memSefGrup, GrupRequest_Creare grupRequestCreare);
  MemGrup       creazaSiSalveazaMemGrup(MemSefGrup memSefGrup, GrupRequest_Creare grupRequestCreare);

  MemMembruGrup creazaMemMembruGrup(MemMembru memMembru, MemGrup memGrup);
  MemMembruGrup creazaSiSalveazaMemMembruGrup(MemMembru memMembru, MemGrup memGrup);

  MemMembruCI   creazaMemMembruCI(MemMembru memMembru, MembruCIRequest_Creare membruCIRequestCreare);
  MemMembruCI   creazaSiSalveazaMemMembruCI(MemMembru memMembru, MembruCIRequest_Creare membruCIRequestCreare);

  MemMembruCotizatie  creazaMemMembruCotizatie(MemMembru memMembru, MembruCotizatieRequest_Creare membruCIRequestCreare);
  MemMembruCotizatie  creazaSiSalveazaMemMembruCotizatie(MemMembru memMembru, MembruCotizatieRequest_Creare membruCIRequestCreare);

}


package com.potsoft.cart2api.model.mes;

//import com.potsoft.cart2api.model.aut.userrol.MesDestinMesajRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mes_destinmesaj")
public class MesDestinMesaj {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mes_destinmesaj_id")
  private Long mesDestinmesajId;

  
  @NotNull
  @Column(name = "mes_destinmesaj_mesajid")
  private Long mesDestinmesajMesajid;


  @NotBlank
  @Size(max = 1)
  @Column(name = "mes_destinmesaj_primit_yn")
  private String mesDestinmesajPrimityn;


  @NotNull
  @Column(name = "mes_destinmesaj_destid")
  private Long mesDestinmesajDestid;

  @NotNull
  @Column(name = "mes_destinmesaj_destuserid")
  private Long mesDestinmesajDestuserid;
  
  @NotNull
  @Size(max = 20)
  @Column(name = "mes_destinmesaj_destusernume")
  private String mesDestinmesajDestusernume;


  @NotNull
  @Column(name = "mes_destinmesaj_destrolid")
  private Long mesDestinmesajDestrolid;

  @Size(max = 10)
  @Column(name = "mes_destinmesaj_destrolcod")
  private String mesDestinmesajDestrolcod;


 
  @NotNull
  @Column(name = "mes_destinmesaj_an")
  private Long mesDestinmesajAn;

  @NotNull
  @Column(name = "mes_destinmesaj_luna")
  private Long mesDestinmesajLuna;

  @NotNull
  @Column(name = "mes_destinmesaj_zi")
  private Long mesDestinmesajZi;


  @Size(max = 20)
  @Column(name = "mes_destinmesaj_dataprimirii", insertable = false, updatable = false)
  private String mesDestinmesajDataprimirii;




	public MesDestinMesaj() 
  {
	}

	public MesDestinMesaj(  Long mesDestinmesajid, 
                    Long mesDestinmesajMesajid, 
                    String mesDestinmesajPrimityn,
                    Long mesDestinmesajDestid,
                    Long mesDestinmesajDestuserid, String mesDestinmesajDestusernume, 
                    Long mesDestinmesajDestrolid, String mesDestinmesajDestrolcod, 
                    Long mesDestinmesajAn, Long mesDestinmesajLuna,  Long mesDestinmesajZi, String mesDestinmesajDataprimirii
                  ) 
  {
    this.mesDestinmesajId              = mesDestinmesajid;

    this.mesDestinmesajMesajid         = mesDestinmesajMesajid;
    
    this.mesDestinmesajPrimityn        = mesDestinmesajPrimityn;

    this.mesDestinmesajDestid          = mesDestinmesajDestid;

    this.mesDestinmesajDestuserid      = mesDestinmesajDestuserid;
    this.mesDestinmesajDestusernume    = mesDestinmesajDestusernume;

    this.mesDestinmesajDestrolid       = mesDestinmesajDestrolid;
    this.mesDestinmesajDestrolcod      = mesDestinmesajDestrolcod;

    this.mesDestinmesajAn              = mesDestinmesajAn;
    this.mesDestinmesajLuna            = mesDestinmesajLuna;
    this.mesDestinmesajZi              = mesDestinmesajZi;
    this.mesDestinmesajDataprimirii    = mesDestinmesajDataprimirii;

  }


  public Long getMesDestinmesajId() 
  {
    return this.mesDestinmesajId;
  }

  public void setMesDestinmesajId(Long mesDestinmesajId) 
  {
    this.mesDestinmesajId = mesDestinmesajId;
  }


  public Long getMesDestinmesajeMesajid() 
  {
    return this.mesDestinmesajMesajid;
  }

  public void setMesDestinmesajMesajid(Long mesDestinmesajMesajid) 
  {
    this.mesDestinmesajMesajid = mesDestinmesajMesajid;
  }


  public Long getMesDestinmesajDestid() 
  {
    return this.mesDestinmesajDestid;
  }

  public void setMesDestinmesajDestid(Long mesDestinmesajDestid) 
  {
    this.mesDestinmesajDestid = mesDestinmesajDestid;
  }



  public Long getMesDestinmesajDestserid() 
  {
    return this.mesDestinmesajDestuserid;
  }

  public void setMesDestinmesajDestuserid(Long mesDestinmesajDestuserid) 
  {
    this.mesDestinmesajDestuserid = mesDestinmesajDestuserid;
  }


  public String getMesDestinmesajDestusernume() 
  {
    return this.mesDestinmesajDestusernume;
  }

  public void setMesDestinmesajDestusernume(String mesDestinmesajDestusernume) 
  {
    this.mesDestinmesajDestusernume = mesDestinmesajDestusernume;
  }



  public Long getMesDestinmesajDestrolid() 
  {
    return this.mesDestinmesajDestrolid;
  }

  public void setMesDestinmesajDestrolid(Long mesDestinmesajDestrolid) 
  {
    this.mesDestinmesajDestrolid = mesDestinmesajDestrolid;
  }
  

  public String getMesDestinmesajDestrolcod() 
  {
    return this.mesDestinmesajDestrolcod;
  }

  public void setMesDestinmesajDestrolcod(String mesDestinmesajDestrolcod) 
  {
    this.mesDestinmesajDestrolcod = mesDestinmesajDestrolcod;
  }


  public String getMesDestinmesajPrimityn() 
  {
    return this.mesDestinmesajPrimityn;
  }

  public void setMesDestinmesajPrimityn(String mesDestinmesajPrimityn) 
  {
    this.mesDestinmesajPrimityn = mesDestinmesajPrimityn;
  }



  public Long getMesDestinmesajAn() 
  {
    return this.mesDestinmesajAn;
  }

  public void setMesDestinmesajAn(Long mesDestinmesajAn) 
  {
    this.mesDestinmesajAn = mesDestinmesajAn;
  }


  public Long getMesDestinmesajLuna() 
  {
    return this.mesDestinmesajLuna;
  }

  public void setMesDestinmesajLuna(Long mesDestinmesajLuna) 
  {
    this.mesDestinmesajLuna = mesDestinmesajLuna;
  }


  public Long getMesDestinmesajZi() 
  {
    return this.mesDestinmesajZi;
  }

  public void setMesDestinmesajZi(Long mesDestinmesajZi) 
  {
    this.mesDestinmesajZi = mesDestinmesajZi;
  }


  public String getMesMesajDataprimirii() 
  {
    return this.mesDestinmesajDataprimirii;
  }

  public void setMesMesajDatagenerarii(String mesMesajDataprimirii) 
  {
    this.mesDestinmesajDataprimirii = mesMesajDataprimirii;
  }

 
}

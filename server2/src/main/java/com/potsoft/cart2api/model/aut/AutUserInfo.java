package com.potsoft.cart2api.model.aut;

//import com.potsoft.cart2api.model.aut.userrol.AutUserRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "aut_userinfo")
public class AutUserInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aut_userinfo_id")
  private Long autUserInfoId;


  @NotNull
  @Column(name = "aut_userinfo_userid")
  private Long autUserInfoUserid;

  @NotBlank
  @Size(max = 32)
  @Column(name = "aut_userinfo_nume")
  private String autUserInfoNume;

  @NotBlank
  @Size(max = 32)
  @Column(name = "aut_userinfo_prenume")
  private String autUserInfoPrenume;

  @NotBlank
  @Size(max = 32)
  @Column(name = "aut_userinfo_telefon")
  private String autUserInfoTelefon;

  @Size(max =1)
  @Column(name = "aut_userinfo_sex")
  private String autUserInfoSex;

  @Column(name = "aut_userinfo_datanasterii")
  private Long autUserInfoDatanasterii;

  @Size(max = 32)
  @Column(name = "aut_userinfo_email")
  private String autUserInfoEmail;
  
  @Column(name = "aut_userinfo_dom_zonataraid")
  private Long autUserInfoDomZonaTaraid;
  
  @Size(max = 2)
  @Column(name = "aut_userinfo_dom_zonataracod")
  private String autUserInfoDomZonaTaracod;
  
  @Column(name = "aut_userinfo_dom_judetid")
  private Long autUserInfoDomJudetid;
  
  @Size(max = 2)
  @Column(name = "aut_userinfo_dom_judetcod")
  private String autUserInfoDomJudetcod;
  
  @Column(name = "aut_userinfo_dom_uatid")
  private Long autUserInfoDomUatid;
  

  @Column(name = "aut_userinfo_dom_uatcod")
  private Long autUserInfoDomUatcod;

  @Column(name = "aut_userinfo_dom_localitateid")
  private Long autUserInfoDomLocalitateid;
  
  @Column(name = "aut_userinfo_dom_localitatecod")
  private Long autUserInfoDomLocalitatecod;
  
  @Size(max = 16)
  @Column(name = "aut_userinfo_dom_codpostal")
  private String autUserInfoDomCodpostal;
 
  @Size(max = 128)
  @Column(name = "aut_userinfo_dom_adresa")
  private String autUserInfoDomAdresa;
 
  @Size(max =1)
  @Column(name = "aut_userinfo_rez_dif_de_dom")
  private String autUserInfoRezdifdedom;

  @Column(name = "aut_userinfo_rez_zonataraid")
  private Long autUserInfoRezZonaTaraid;
  
  @Size(max = 2)
  @Column(name = "aut_userinfo_rez_zonataracod")
  private String autUserInfoRezZonaTaracod;
  
  @Column(name = "aut_userinfo_rez_judetid")
  private Long autUserInfoRezJudetid;
  
  @Size(max = 2)
  @Column(name = "aut_userinfo_rez_judetcod")
  private String autUserInfoRezJudetcod;
  
  @Column(name = "aut_userinfo_rez_uatid")
  private Long autUserInfoRezUatid;
  
  @Column(name = "aut_userinfo_rez_uatcod")
  private Long autUserInfoRezUatcod;

  @Column(name = "aut_userinfo_rez_localitateid")
  private Long autUserInfoRezLocalitateid;
  
  @Column(name = "aut_userinfo_rez_localitatecod")
  private Long autUserInfoRezLocalitatecod;
  
  @Size(max = 16)
  @Column(name = "aut_userinfo_rez_codpostal")
  private String autUserInfoRezCodpostal;
 
  @Size(max = 128)
  @Column(name = "aut_userinfo_rez_adresa")
  private String autUserInfoRezAdresa;
 

	public AutUserInfo() 
  {
	}

	public AutUserInfo( Long userinfoid, Long userid, String nume, String prenume, String telefon, String sex, String email,
                      Long domZonaTaraid, String domZonaTaracod, Long domJudetid, String domJudetcod, 
                      Long domUatid, Long domUatcod, 
                      Long domLocalitateid, Long domLocalitatecod, String domCodpostal, String domAdresa,
                      String rezdifdedom,
                      Long rezZonaTaraid, String rezZonaTaracod, Long rezJudetid, String rezJudetcod,
                      Long rezUatid, Long rezUatcod,
                      Long rezLocalitateid, Long rezLocalitatecod, String rezCodpostal, String rezAdresa,
                      Long datanasterii) 
  {
    this.autUserInfoId                = userinfoid;
    this.autUserInfoUserid            = userid;
    this.autUserInfoNume              = nume;
    this.autUserInfoPrenume           = prenume;
    this.autUserInfoTelefon           = telefon;
    this.autUserInfoSex               = sex;
    this.autUserInfoEmail             = email;
    this.autUserInfoDatanasterii      = datanasterii;
    this.autUserInfoDomZonaTaraid     = domZonaTaraid;
    this.autUserInfoDomZonaTaracod    = domZonaTaracod;
    this.autUserInfoDomJudetid        = domJudetid;
    this.autUserInfoDomJudetcod       = domJudetcod;
    this.autUserInfoDomUatid          = domUatid;
    this.autUserInfoDomUatcod         = domUatcod;
    this.autUserInfoDomLocalitateid   = domLocalitateid;
    this.autUserInfoDomLocalitatecod  = domLocalitatecod;
    this.autUserInfoDomCodpostal      = domCodpostal;
    this.autUserInfoDomAdresa         = domAdresa;
    this.autUserInfoRezdifdedom       = rezdifdedom;
    this.autUserInfoRezZonaTaraid     = rezZonaTaraid;
    this.autUserInfoRezZonaTaracod    = rezZonaTaracod;
    this.autUserInfoRezJudetid        = rezJudetid;
    this.autUserInfoRezJudetcod       = rezJudetcod;
    this.autUserInfoRezUatid          = rezUatid;
    this.autUserInfoRezUatcod         = rezUatcod;
    this.autUserInfoRezLocalitateid   = rezLocalitateid;
    this.autUserInfoRezLocalitatecod  = rezLocalitatecod;
    this.autUserInfoRezCodpostal      = rezCodpostal;
    this.autUserInfoRezAdresa         = rezAdresa;
  }

  public Long getAutUserInfoId() 
  {
    return this.autUserInfoId;
  }

  public void setAutUserInfoId(Long autUserInfoId) 
  {
    this.autUserInfoId = autUserInfoId;
  }


  public String getAutUserInfoNume() 
  {
    return this.autUserInfoNume;
  }

  public void setAutUserInfoNume(String autUserInfoNume) 
  {
    this.autUserInfoNume = autUserInfoNume;
  }


  public String getAutUserInfoPrenume() 
  {
    return this.autUserInfoPrenume;
  }

  public void setAutUserInfoPrenume(String autUserInfoPrenume) 
  {
    this.autUserInfoPrenume = autUserInfoPrenume;
  }


  public Long getAutUserInfoUserid() 
  {
    return this.autUserInfoUserid;
  }

  public void setAutUserInfoUserid(Long autUserInfoUserid) 
  {
    this.autUserInfoUserid = autUserInfoUserid;
  }


  public String getAutUserInfoTelefon() 
  {
    return this.autUserInfoTelefon;
  }

  public void setAutUserInfoTelefon(String autUserInfoTelefon) 
  {
    this.autUserInfoTelefon = autUserInfoTelefon;
  }
   
  
  public String getAutUserInfoSex() 
  {
    return this.autUserInfoSex;
  }

  public void setAutUserInfoSex(String autUserInfoSex) 
  {
    this.autUserInfoSex = autUserInfoSex;
  }


  public String getAutUserInfoEmail() 
  {
    return this.autUserInfoEmail;
  }

  public void setAutUserInfoEmail(String autUserInfoEmail) 
  {
    this.autUserInfoEmail = autUserInfoEmail;
  }


  public Long getAutUserInfoDatanasterii() 
  {
    return this.autUserInfoDatanasterii;
  }

  public void setAutUserInfoDatanasterii(Long autUserInfoDatanasterii) 
  {
    this.autUserInfoDatanasterii = autUserInfoDatanasterii;
  }


  public Long getAutUserInfoDomZonaTaraid() 
  {
    return this.autUserInfoDomZonaTaraid;
  }

  public void setAutUserInfoDomZonaTaraid(Long autUserInfoDomZonaTaraid) 
  {
    this.autUserInfoDomZonaTaraid = autUserInfoDomZonaTaraid;
  }

  public String getAutUserInfoDomZonaTaracod() 
  {
    return this.autUserInfoDomZonaTaracod;
  }

  public void setAutUserInfoDomZonaTaracod(String autUserInfoDomZonaTaracod) 
  {
    this.autUserInfoDomZonaTaracod = autUserInfoDomZonaTaracod;
  }


  public Long getAutUserInfoDomJudetid() 
  {
    return this.autUserInfoDomJudetid;
  }

  public void setAutUserInfoDomJudetid(Long autUserInfoDomJudetid) 
  {
    this.autUserInfoDomJudetid = autUserInfoDomJudetid;
  }

  public String getAutUserInfoDomJudetcod() 
  {
    return this.autUserInfoDomJudetcod;
  }

  public void setAutUserInfoDomJudetcod(String autUserInfoDomJudetcod) 
  {
    this.autUserInfoDomJudetcod = autUserInfoDomJudetcod;
  }



  public Long getAutUserInfoDomUatid() 
  {
    return this.autUserInfoDomUatid;
  }

  public void setAutUserInfoDomUatid(Long autUserInfoDomUatid) 
  {
    this.autUserInfoDomUatid = autUserInfoDomUatid;
  }

  public Long getAutUserInfoDomUatcod() 
  {
    return this.autUserInfoDomUatcod;
  }

  public void setAutUserInfoDomUatcod(Long autUserInfoDomUatcod) 
  {
    this.autUserInfoDomUatcod = autUserInfoDomUatcod;
  }



  public Long getAutUserInfoDomLocalitateid() 
  {
    return this.autUserInfoDomLocalitateid;
  }

  public void setAutUserInfoDomLocalitateid(Long autUserInfoDomLocalitateid) 
  {
    this.autUserInfoDomLocalitateid = autUserInfoDomLocalitateid;
  }

  public Long getAutUserInfoDomLocalitatecod() 
  {
    return this.autUserInfoDomLocalitatecod;
  }

  public void setAutUserInfoDomLocalitatecod(Long autUserInfoDomLocalitatecod) 
  {
    this.autUserInfoDomLocalitatecod = autUserInfoDomLocalitatecod;
  }


  public String getAutUserInfoDomCodpostal() 
  {
    return this.autUserInfoDomCodpostal;
  }

  public void setAutUserInfoDomCodpostal(String autUserInfoDomCodpostal) 
  {
    this.autUserInfoDomCodpostal = autUserInfoDomCodpostal;
  }


  public String getAutUserInfoDomAdresa() 
  {
    return this.autUserInfoDomAdresa;
  }

  public void setAutUserInfoDomAdresa(String autUserInfoDomAdresa) 
  {
    this.autUserInfoDomAdresa = autUserInfoDomAdresa;
  }


  public String getAutUserInfoRezdifdedom() 
  {
    return this.autUserInfoRezdifdedom;
  }

  public void setAutUserInfoRezdifdedom(String autUserInfoRezdifdedom) 
  {
    this.autUserInfoRezdifdedom = autUserInfoRezdifdedom;
  }


  public Long getAutUserInfoRezZonaTaraid() 
  {
    return this.autUserInfoRezZonaTaraid;
  }

  public void setAutUserInfoRezZonaTaraid(Long autUserInfoRezZonaTaraid) 
  {
    this.autUserInfoRezZonaTaraid = autUserInfoRezZonaTaraid;
  }

  public String getAutUserInfoRezZonaTaracod() 
  {
    return this.autUserInfoRezZonaTaracod;
  }

  public void setAutUserInfoRezZonaTaracod(String autUserInfoRezZonaTaracod) 
  {
    this.autUserInfoRezZonaTaracod = autUserInfoRezZonaTaracod;
  }


  public Long getAutUserInfoRezJudetid() 
  {
    return this.autUserInfoRezJudetid;
  }

  public void setAutUserInfoRezJudetid(Long autUserInfoRezJudetid) 
  {
    this.autUserInfoRezJudetid = autUserInfoRezJudetid;
  }

  public String getAutUserInfoRezJudetcod() 
  {
    return this.autUserInfoRezJudetcod;
  }

  public void setAutUserInfoRezJudetcod(String autUserInfoRezJudetcod) 
  {
    this.autUserInfoRezJudetcod = autUserInfoRezJudetcod;
  }


  public Long getAutUserInfoRezUatid() 
  {
    return this.autUserInfoRezUatid;
  }

  public void setAutUserInfoRezUatid(Long autUserInfoRezUatid) 
  {
    this.autUserInfoRezUatid = autUserInfoRezUatid;
  }

  public Long getAutUserInfoRezUatcod() 
  {
    return this.autUserInfoRezUatcod;
  }

  public void setAutUserInfoRezUatcod(Long autUserInfoRezUatcod) 
  {
    this.autUserInfoRezUatcod = autUserInfoRezUatcod;
  }



  public Long getAutUserInfoRezLocalitateid() 
  {
    return this.autUserInfoRezLocalitateid;
  }

  public void setAutUserInfoRezLocalitateid(Long autUserInfoRezLocalitateid) 
  {
    this.autUserInfoRezLocalitateid = autUserInfoRezLocalitateid;
  }

  public Long getAutUserInfoRezLocalitatecod() 
  {
    return this.autUserInfoRezLocalitatecod;
  }

  public void setAutUserInfoRezLocalitatecod(Long autUserInfoRezLocalitatecod) 
  {
    this.autUserInfoRezLocalitatecod = autUserInfoRezLocalitatecod;
  }


  public String getAutUserInfoRezCodpostal() 
  {
    return this.autUserInfoRezCodpostal;
  }

  public void setAutUserInfoRezCodpostal(String autUserInfoRezCodpostal) 
  {
    this.autUserInfoRezCodpostal = autUserInfoRezCodpostal;
  }


  public String getAutUserInfoRezAdresa() 
  {
    return this.autUserInfoRezAdresa;
  }

  public void setAutUserInfoRezAdresa(String autUserInfoRezAdresa) 
  {
    this.autUserInfoRezAdresa = autUserInfoRezAdresa;
  }

}

package com.potsoft.cart2api.payload.request.aut;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class RegisterRequest 
{
	@NotBlank
	private String username;

	@NotBlank
	private String password;

	private Long   userinfoid;

	private Long   userid;

	@NotBlank
	private String nume;

	@NotBlank
	private String prenume;

	@NotBlank
	private String telefon;

	private String sex;

	private String email;

	private Long datanasterii;

	private Long   domZonataraid;

	private String domZonataracod;

	private Long   domJudetid;

	private String domJudetcod;

	private Long   domUatid;

	private Long   domUatcod;

	private Long   domLocalitateid;

	private Long  domLocalitatecod;

	private String domCodpostal;

	private String domAdresa;

	private String rezdifdedom;

	private Long   rezZonataraid;

	private String rezZonataracod;

	private Long   rezJudetid;

	private String rezJudetcod;

	private Long   rezUatid;

	private Long   rezUatcod;

	private Long   rezLocalitateid;

	private Long   rezLocalitatecod;

	private String rezCodpostal;

	private String rezAdresa;	
	


	public String getUsername() 
	{
	  return this.username;
	}
  
	public void setUsername(String username) 
	{
	  this.username = username;
	}
  

	public String getPassword() 
	{
	  return this.password;
	}
  
	public void setPassword(String password) 
	{
	  this.password = password;
	}

	public Long getUserinfoid() 
	{
	  return this.userinfoid;
	}
  
	public void setUserinfoid(Long userinfoid) 
	{
	  this.userinfoid = userinfoid;
	}
  
  
	public String getNume() 
	{
	  return this.nume;
	}
  
	public void setNume(String nume) 
	{
	  this.nume = nume;
	}
  
  
	public String getPrenume() 
	{
	  return this.prenume;
	}
  
	public void setPrenume(String prenume) 
	{
	  this.prenume = prenume;
	}
  
  
	public Long getUserid() 
	{
	  return this.userid;
	}
  
	public void setUserid(Long userid) 
	{
	  this.userid = userid;
	}
  
  
	public String getTelefon() 
	{
	  return this.telefon;
	}
  
	public void setTelefon(String telefon) 
	{
	  this.telefon = telefon;
	}
	 
	
	public String getSex() 
	{
	  return this.sex;
	}
  
	public void setSex(String sex) 
	{
	  this.sex = sex;
	}
  
  
	public String getEmail() 
	{
	  return this.email;
	}
  
	public void setEmail(String email) 
	{
	  this.email = email;
	}

	
	public Long getDatanasterii() 
	{
	  return this.datanasterii;
	}
  
	public void setDatanasterii(Long datanasterii) 
	{
	  this.datanasterii = datanasterii;
	}
  

	public Long getDomZonataraid() 
	{
	  return this.domZonataraid;
	}
  
	public void setDomZonataraid(Long domZonataraid) 
	{
	  this.domZonataraid = domZonataraid;
	}
  
	public String getDomZonataracod() 
	{
	  return this.domZonataracod;
	}
  
	public void setDomZonataracod(String domZonataracod) 
	{
	  this.domZonataracod = domZonataracod;
	}
  
  
	public Long getDomJudetid() 
	{
	  return this.domJudetid;
	}
  
	public void setDomJudetid(Long domJudetid) 
	{
	  this.domJudetid = domJudetid;
	}
  
	public String getDomJudetcod() 
	{
	  return this.domJudetcod;
	}
  
	public void setDomJudetcod(String domJudetcod) 
	{
	  this.domJudetcod = domJudetcod;
	}



	public Long getDomUatid() 
	{
	  return this.domUatid;
	}
  
	public void setDomUatid(Long domUatid) 
	{
	  this.domUatid = domUatid;
	}


	public Long getDomUatcod() 
	{
	  return this.domUatcod;
	}
  
	public void setDomUatcod(Long domUatcod) 
	{
	  this.domUatcod = domUatcod;
	}
  
  
  
	public Long getDomLocalitateid() 
	{
	  return this.domLocalitateid;
	}
  
	public void setDomLocalitateid(Long domLocalitateid) 
	{
	  this.domLocalitateid = domLocalitateid;
	}
  
	public Long getDomLocalitatecod() 
	{
	  return this.domLocalitatecod;
	}
  
	public void setDomLocalitatecod(Long domLocalitatecod) 
	{
	  this.domLocalitatecod = domLocalitatecod;
	}
  
  
	public String getDomCodpostal() 
	{
	  return this.domCodpostal;
	}
  
	public void setDomCodpostal(String domCodpostal) 
	{
	  this.domCodpostal = domCodpostal;
	}
  
  
	public String getDomAdresa() 
	{
	  return this.domAdresa;
	}
  
	public void setDomAdresa(String domAdresa) 
	{
	  this.domAdresa = domAdresa;
	}
  
  
	public String getRezdifdedom() 
	{
	  return this.rezdifdedom;
	}
  
	public void setRezdifdedom(String rezdifdedom) 
	{
	  this.rezdifdedom = rezdifdedom;
	}
  
  
	public Long getRezZonataraid() 
	{
	  return this.rezZonataraid;
	}
  
	public void setRezZonataraid(Long rezZonataraid) 
	{
	  this.rezZonataraid = rezZonataraid;
	}
  
	public String getRezZonataracod() 
	{
	  return this.rezZonataracod;
	}
  
	public void setRezZonataracod(String rezZonataracod) 
	{
	  this.rezZonataracod = rezZonataracod;
	}
  
  
	public Long getRezJudetid() 
	{
	  return this.rezJudetid;
	}
  
	public void setRezJudetid(Long rezJudetid) 
	{
	  this.rezJudetid = rezJudetid;
	}
  
	public String getRezJudetcod() 
	{
	  return this.rezJudetcod;
	}
  
	public void setRezJudetcod(String rezJudetcod) 
	{
	  this.rezJudetcod = rezJudetcod;
	}
  

	public Long getRezUatid() 
	{
	  return this.rezUatid;
	}
  
	public void setRezUatid(Long rezUatid) 
	{
	  this.rezUatid = rezUatid;
	}
  
	public Long getRezUatcod() 
	{
	  return this.rezUatcod;
	}
  
	public void setRezUatcod(Long rezUatcod) 
	{
	  this.rezUatcod = rezUatcod;
	}
	
  
	public Long getRezLocalitateid() 
	{
	  return this.rezLocalitateid;
	}
  
	public void setRezLocalitateid(Long rezLocalitateid) 
	{
	  this.rezLocalitateid = rezLocalitateid;
	}
  
	public Long getRezLocalitatecod() 
	{
	  return this.rezLocalitatecod;
	}
  
	public void setRezLocalitatecod(Long rezLocalitatecod) 
	{
	  this.rezLocalitatecod = rezLocalitatecod;
	}
  
  
	public String getRezCodpostal() 
	{
	  return this.rezCodpostal;
	}
  
	public void setRezCodpostal(String rezCodpostal) 
	{
	  this.rezCodpostal = rezCodpostal;
	}
  
  
	public String getRezAdresa() 
	{
	  return this.rezAdresa;
	}
  
	public void setRezAdresa(String rezAdresa) 
	{
	  this.rezAdresa = rezAdresa;
	}
  
}

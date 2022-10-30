package com.potsoft.cart2api.security;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.potsoft.cart2api.model.aut.AutUser;

public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private Long id;
  
  private String usernume;
  
  @JsonIgnore
  private String parola;

  @JsonIgnore
  private String activ_yn;

  @JsonIgnore
  private String startdt;

  @JsonIgnore
  private String enddt;

  private Collection<? extends GrantedAuthority> authorities;

  public UserDetailsImpl(Long id, String usernume, String parola,
                         String activ_yn, String startdt, String enddt,
      Collection<? extends GrantedAuthority> authorities) {
    this.id          = id;
    this.usernume    = usernume;
    this.parola      = parola;
    this.activ_yn    = activ_yn;
    this.authorities = authorities;
  }

  public static UserDetailsImpl build(AutUser user) {
    List<GrantedAuthority> authorities = user.getRoles().stream()
        .map(role -> new SimpleGrantedAuthority(role.getAutUserrolRolcod()))
        .collect(Collectors.toList());

    return new UserDetailsImpl(
        user.getAutUserId(),  
        user.getAutUserNume(),
        user.getAutUserParola(),
        user.getAutUserActivyn(),
        user.getAutUserStartdt(),
        user.getAutUserEnddt(), 
        authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public Long getId() {
    return id;
  }

  @Override
  public String getPassword() {
    return parola;
  }

  @Override
  public String getUsername() {
    return usernume;
  }
 

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(id, user.id);
  }
}

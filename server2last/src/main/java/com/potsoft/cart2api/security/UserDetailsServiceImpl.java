package com.potsoft.cart2api.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.potsoft.cart2api.model.aut.user.AutUser;
import com.potsoft.cart2api.repository.AutRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService 
{
  @Autowired
  AutRepository autRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    AutUser user = autRepository.findByAutUserNume(username)
        .orElseThrow(() 
        -> new UsernameNotFoundException("User Not Found with username: " + username));

    return UserDetailsImpl.build(user);
  }

  //@Override
  @Transactional
  public UserDetails loadUserById(Long id) throws UsernameNotFoundException 
  {
    AutUser user = autRepository.findById(id)
        .orElseThrow(() 
        -> new UsernameNotFoundException("User Not Found with id: " + id));

    return UserDetailsImpl.build(user);
  }
}

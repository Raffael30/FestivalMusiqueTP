package com.inti.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.inti.model.utilisateur;
import com.inti.repository.IUtilisateurRepository;

@Service
public class SecurityUserDetailsService implements UserDetailsService{
	
	@Autowired
	IUtilisateurRepository iu;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		utilisateur u = iu.findByLogin(username);
		
		List<GrantedAuthority> listeGA = new ArrayList<>();
		listeGA.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		return new User(u.getLogin(), u.getMdp(), listeGA);
	}

}

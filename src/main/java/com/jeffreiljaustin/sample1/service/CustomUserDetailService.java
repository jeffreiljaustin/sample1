package com.jeffreiljaustin.sample1.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jeffreiljaustin.sample1.Model.UserAuth;
import com.jeffreiljaustin.sample1.Repository.UserAuthRepository;


@Service
public class CustomUserDetailService implements UserDetailsService{

    private UserAuthRepository userauthRepository;

    public CustomUserDetailService(UserAuthRepository userauthRepository) {
        this.userauthRepository = userauthRepository;
    }

    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException{
        UserAuth userauth = userauthRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail).orElseThrow(() ->
            new UsernameNotFoundException("User not found with username or email"));
        
        Set<GrantedAuthority> authorities = userauth
            .getRoles()
            .stream()
            .map((role) -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toSet());

        return new org.springframework.security.core.userdetails.User(
            userauth.getEmail(),
            userauth.getPassword(),
            authorities
        );
    }

}

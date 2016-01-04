package com.learnandpush.authorities;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

import javax.management.relation.Role;

import java.io.IOException;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.mapping.GrantedAuthoritiesMapper;

public class ActiveDirectoryGrantedAuthoritiesMapper implements GrantedAuthoritiesMapper {

	@Override
	public Collection<? extends GrantedAuthority> mapAuthorities(Collection<? extends GrantedAuthority> authorities) {
		// TODO Auto-generated method stub
		Set<SecurityContextAuthority> roles = EnumSet.noneOf(SecurityContextAuthority.class);
		// adding a role to be provided to the user when mapping the roles
		// against a user trying to login into the system
		roles.add(SecurityContextAuthority.ROLE_USER);
		return roles;
	}

}

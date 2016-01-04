package com.learnandpush.authorities;
//this class contains the roles that can be assigned to the user
import org.springframework.security.core.GrantedAuthority;
public enum SecurityContextAuthority implements GrantedAuthority {
	ROLE_USER;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return name();
	}

	
	
}

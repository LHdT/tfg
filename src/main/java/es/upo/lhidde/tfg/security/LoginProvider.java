package es.upo.lhidde.tfg.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class LoginProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authProvider) throws AuthenticationException {
		String username = authProvider.getName();
		String password = authProvider.getCredentials().toString();
		
		
		return null;
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated prueba eclipse
		return false;
	}

}

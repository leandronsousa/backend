package br.com.tiss.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerOAuth2 extends AuthorizationServerConfigurerAdapter {
	
	@Autowired
	@Qualifier("authenticationManagerBean")
	private AuthenticationManager authenticationManager;
	
	
	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
	}
	
//	@Override
//	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//		clients.jdbc(dataSource())
//			.withClient("sampleClientId")
//			.authorizedGrantTypes("implicit")
//			.scopes("read")
//			.autoApprove(true)
//			.and()
//			.withClient("clientIdPassword")
//			.secret("secret")
//			.authorizedGrantTypes("password", "authorization_code", "refresh_token")
//			.scopes("read");
//	}
	
//	@Override
//	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//		endpoints.tokenStore(tokenStore()).authenticationManager(authenticationManager);
//	}

//	private TokenStore tokenStore() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private DataSource dataSource() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

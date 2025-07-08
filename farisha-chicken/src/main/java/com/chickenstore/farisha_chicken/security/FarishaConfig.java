//package com.chickenstore.farisha_chicken.security;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
////import org.springframework.security.core.userdetails.User;
////import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class FarishaConfig {
//	
//	@Bean
//	public UserDetailsManager userDetailsManager(DataSource dataSource) {
//		
//		
//		     return new JdbcUserDetailsManager(dataSource);
//		      
//		      
////	JdbcUserDetailsManager jdbcUserDetailsManager=new JdbcUserDetailsManager(dataSource);
////    jdbcUserDetailsManager.setUsersByUsernameQuery("select user_id, pw, active from user_details where user_id=?");		      
////    jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("select user_id, role from roles where user_id=?");		      
////    return jdbcUserDetailsManager; 
//	}
//	
////Below code is for inmemory security
////	@Bean
////	public InMemoryUserDetailsManager userDetailsManager() {
////		
////		UserDetails nishadh=User.builder()
////				.username("nishadh").password("{noop}Riza")
////				.roles("Employee").build();
////		
////		UserDetails nazrin=User.builder()
////				.username("nazrin").password("{noop}Fiza")
////				.roles("Employee","Manager").build();
////		
////		UserDetails ahamed=User.builder()
////				.username("ahamed").password("{noop}Farisha")
////				.roles("Employee","Manager","Admin").build();
////		
////
////		      return new InMemoryUserDetailsManager(nishadh,nazrin,ahamed);
////		      
////	}
////	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
//	{
//	http.authorizeHttpRequests(Configurer->Configurer
//			.requestMatchers(HttpMethod.GET, "/chicken/item").hasAnyRole("EMPLOYEE","MANAGER","ADMIN")
//			.requestMatchers(HttpMethod.GET, "/chicken/item/**").hasAnyRole("EMPLOYEE","MANAGER","ADMIN")
//			.requestMatchers(HttpMethod.POST, "/chicken/item").hasAnyRole("MANAGER","ADMIN")
//			.requestMatchers(HttpMethod.PUT, "/chicken/item/**").hasAnyRole("MANAGER","ADMIN")
//			.requestMatchers(HttpMethod.DELETE, "/chicken/item/**").hasRole("ADMIN")
//			
//			);
//		http.httpBasic(Customizer.withDefaults());
//		http.csrf(csrf->csrf.disable());
//		return http.build();
//		
//	}
//}
//
//
//

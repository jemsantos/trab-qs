/**
 * 
 */
package br.com.cotemig.petshostel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Jose Eustaquio Muniz
 * 
 * configurando um bean para encriptação de dados. ex.: senha
 */
@Configuration
public class AppConfig {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}

package org.sid.ebankservice.security;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class KeycloakAdapterConfig {

    /***
     * Façon de dire à keycloak que la conf de keycloak se trouve dans le fichier application.properties
     * Il existe une autre façon: fichier json
     * ***/

    @Bean
    KeycloakSpringBootConfigResolver keycloakSpringBootConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
}

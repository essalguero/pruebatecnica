package com.autentia.pruebatecnica.configurations;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
 
@Configuration 
@ApplicationPath("/rest") //url to access the service
public class JerseyConfiguration extends ResourceConfig {
 
    public JerseyConfiguration() {
        packages("com.autentia.pruebatecnica");
 
    }
}

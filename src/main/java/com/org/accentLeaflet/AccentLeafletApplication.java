package com.org.accentLeaflet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.org.accentLeaflet.entities.Arch_1004901;

@SpringBootApplication
public class AccentLeafletApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AccentLeafletApplication.class, args);
	}
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration; 
	
	@Override
	public void run(String... args) throws Exception {
		
		repositoryRestConfiguration.exposeIdsFor(Arch_1004901.class);
	}

}

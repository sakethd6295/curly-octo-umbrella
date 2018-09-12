package com.iheart.station.data;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(StationRepository repository) {
		return args -> {
//			log.info("Preloading " + repository.save(new StationData("001", "Pop", true, "Yes")));
//			log.info("Preloading " + repository.save(new StationData("002", "Rock", true, "Yes")));
//			log.info("Preloading " + repository.save(new StationData("003", "Country", true, "Yes")));
//			log.info("Preloading " + repository.save(new StationData("004", "EDM", true, "Yes")));
//			log.info("Preloading " + repository.save(new StationData("001", "Hip-Hop", true, "Yes")));
		};
	}

}
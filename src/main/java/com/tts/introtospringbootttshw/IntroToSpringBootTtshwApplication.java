package com.tts.introtospringbootttshw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tts.introtospringbootttshw.model.Feline;
import com.tts.introtospringbootttshw.repository.FelineRepository;
//import com.tts.introtospringbootttshw.IntroToSpringBootTtshwApplication;

@SpringBootApplication
public class IntroToSpringBootTtshwApplication {
	private static final Logger log = LoggerFactory.getLogger(IntroToSpringBootTtshwApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringBootTtshwApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(FelineRepository repository) {
		return (args) -> {
			// save a couple of felines
			repository.save(new Feline("American Short Hair", "Squeakers", "Male", "Fuzzball"));
			repository.save(new Feline("Persian", "Nick Furry", "Male", "Catnip Pillow"));
			repository.save(new Feline("Bengal", "Cateye", "Male", "Hair Tie"));
			repository.save(new Feline("Munchkin", "The Mountain", "Femmale", "Spring"));
			repository.save(new Feline("Calico", "Butter", "Female", "Food"));

			// read all felines
			log.info("Felines found with findAll():");
			log.info("-------------------------------");
			for (Feline feline : repository.findAll()) {
				log.info(feline.toString());
			}
			log.info("");

			// read an individual feline by ID
			repository.findById(1L)
				.ifPresent(feline -> {
					log.info("Feline found with findById(1L):");
					log.info("--------------------------------");
					log.info(feline.toString());
					log.info("");
				});

			// read felines by name
			log.info("Feline found with findByCatName('Squeakers'):");
			log.info("--------------------------------------------");
			repository.findByCatName("Squeakers").forEach(bauer -> {
				log.info(bauer.toString());
			});
			
			log.info("");
		};
	}
}

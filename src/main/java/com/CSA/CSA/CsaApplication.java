package com.CSA.CSA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication(scanBasePackages = {"com.CSA.CSA", "entities"})
@EntityScan(basePackages = {"com.CSA.CSA", "entities"})
@EnableJpaRepositories(basePackages = "com.CSA.CSA.Controller")

public class CsaApplication implements WebMvcConfigurer {
	public static void main(String[] args) {
		/*if (args.length > 0 && args[0].equals("testData")) {
			System.out.println("Running with testData option. Initializing test data...");
			return;
		}
*/
		SpringApplication.run(CsaApplication.class);
	}
	/*@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new GsonHttpMessageConverter(gson()));
	}
	@Bean
	public Gson gson() {
		return new GsonBuilder().create();
	}
	@Bean
	public CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository,
											   FormationRepository formationRepository,
											   PromotionRepository promotionRepository) {
		return args -> {
			// Test Data Population Logic
			Formation formation = new Formation();
			formation.setCodeFormation("INFO1");
			formation.setDiplome("BAC");
			formation.setN0Annee((byte) 1);
			formation.setNomFormation("Informatique 1");
			formation.setDoubleDiplome('N');
			formation.setDebutHabilitation(Instant.now());
			formation.setFinHabilitation(Instant.now().plusSeconds(86400)); // 1 day later
			formationRepository.save(formation);

			Promotion promotion = new Promotion();
			promotion.setAnneePro("2023-2024");
			promotion.setCodeFormation(formation);
			promotion.setSiglePro("INF1");
			promotion.setNbEtuSouhaite((short) 50);
			promotion.setEtatPreselection("PRE");
			promotion.setDateRentree(Instant.now().plusSeconds(172800)); // 2 days later
			promotion.setLieuRentree("Campus");
			promotionRepository.save(promotion);

			Etudiant etudiant = new Etudiant();
			etudiant.setNoEtudiantNat("12345");
			etudiant.setAnneePro(promotion);
			etudiant.setNom("Doe");
			etudiant.setPrenom("John");
			etudiant.setSexe("M");
			etudiant.setDateNaissance(Instant.parse("2000-01-01T00:00:00Z"));
			etudiant.setLieuNaissance("City");
			etudiant.setSituation("C");
			etudiant.setNationalite("French");
			etudiant.setPermAdresse("Permanent Address");
			etudiant.setPermCp("12345");
			etudiant.setPermVille("City");
			etudiant.setPermPays("France");
			etudiant.setDernierDiplome("BAC");
			etudiant.setUniversite("University");
			etudiant.setSigleEtu("ABC");
			etudiant.setCompteCri("CR123");
			etudiantRepository.save(etudiant);

			// Ensure foreign key relationships
			promotionRepository.save(promotion); // Save again to update the foreign key in promotion
			etudiantRepository.save(etudiant); // Save again to update the foreign key in etudiant

			System.out.println("Test data initialization completed.");

			//File templateDir = new File("/app/resources/templates/*");
			//System.out.println("Templates in directory: " + Arrays.toString(templateDir.listFiles()));

		};
	}*/
}


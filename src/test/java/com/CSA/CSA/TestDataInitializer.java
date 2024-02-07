package com.CSA.CSA;

import com.CSA.CSA.Controller.EtudiantRepository;
import com.CSA.CSA.Controller.FormationRepository;
import com.CSA.CSA.Controller.PromotionRepository;
import entities.Etudiant;
import entities.Formation;
import entities.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class TestDataInitializer implements CommandLineRunner {

    private final EtudiantRepository etudiantRepository;
    private final FormationRepository formationRepository;
    private final PromotionRepository promotionRepository;

    @Autowired
    public TestDataInitializer(EtudiantRepository etudiantRepository,
                               FormationRepository formationRepository,
                               PromotionRepository promotionRepository) {
        this.etudiantRepository = etudiantRepository;
        this.formationRepository = formationRepository;
        this.promotionRepository = promotionRepository;
    }

    @Override
    public void run(String... args) {
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
    }
}

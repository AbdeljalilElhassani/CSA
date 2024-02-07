package com.CSA.CSA;

import com.CSA.CSA.Controller.EtudiantRepository;
import com.CSA.CSA.Controller.FormationRepository;
import com.CSA.CSA.Controller.PromotionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@TestInstance(Lifecycle.PER_CLASS)
class CsaApplicationTests {

	@Autowired
	private EtudiantRepository etudiantRepository;

	@Autowired
	private FormationRepository formationRepository;

	@Autowired
	private PromotionRepository promotionRepository;

	/*@Test
	void contextLoads() {
		// This test ensures that the application context loads successfully
	}*/

	// Test for data initializer logic
	@Test
	void testDataInitializerTest() {
		TestDataInitializer initializer = new TestDataInitializer(etudiantRepository, formationRepository, promotionRepository);
		initializer.run();
		// Add assertions if needed to verify that test data has been initialized correctly
	}
}

plugins {
	java
	id("org.springframework.boot") version "3.2.2"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.CSA"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation ("jakarta.validation:jakarta.validation-api:3.0.0")
	implementation ("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.mysql:mysql-connector-j")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation ("org.apache.pdfbox:pdfbox:2.0.24")

}

/*tasks.withType<Test> {
	useJUnitPlatform()
}*/

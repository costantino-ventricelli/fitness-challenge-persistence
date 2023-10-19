import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.1.5"
	id("io.spring.dependency-management") version "1.1.3"
	kotlin("jvm") version "1.8.22"
	kotlin("plugin.spring") version "1.8.22"
	kotlin("plugin.jpa") version "1.8.22"
	kotlin("plugin.allopen") version "1.8.0"
	kotlin("kapt") version "1.9.10"
}

group = "it.fitness.challenge"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

kapt {
	arguments {
		arg("mapstruct.unmappedTargetPolicy", "ignore")
	}
	keepJavacAnnotationProcessors = true
}


dependencies {
	// actuator
	implementation("org.springframework.boot:spring-boot-starter-actuator:3.1.0")
	// persistence
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.4")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.10")
	runtimeOnly("com.mysql:mysql-connector-j:8.0.32")
	// open-api / swagger
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")
	// spring boot
	implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
	implementation("org.springframework.session:spring-session-core:3.0.0")
	// tools
	api("com.github.pozo:mapstruct-kotlin:1.4.0.0")
	kapt("com.github.pozo:mapstruct-kotlin:1.4.0.0")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor:3.0.4")
	implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.10")
	implementation("org.mapstruct:mapstruct:1.5.3.Final")
	developmentOnly("org.springframework.boot:spring-boot-devtools:3.0.4")
	testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.0")
	testImplementation("org.springframework.security:spring-security-test:6.0.2")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

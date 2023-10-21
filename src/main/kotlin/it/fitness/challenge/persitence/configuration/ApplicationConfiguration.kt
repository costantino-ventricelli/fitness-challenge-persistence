package it.fitness.challenge.persitence.configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

class ApplicationConfiguration {

    @Configuration
    class OpenApiConfig {
        @Bean
        fun usersMicroserviceOpenAPI(): OpenAPI {
            return OpenAPI()
                .info(
                    Info().title("Persistenza api fitness challenge")
                        .description("Esposizione api per generazione client persistenza applicativo fitness-challenge")
                        .version("1.0")
                )
        }
    }

}
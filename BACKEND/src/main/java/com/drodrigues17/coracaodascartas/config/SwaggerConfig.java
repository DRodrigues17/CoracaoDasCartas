package com.drodrigues17.coracaodascartas.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Yu-gi-oh REST API")
                        .description("Interface para YGproDeck(https://db.ygoprodeck.com/api/v7/cardinfo.php) usando SpringBoot")
                        .version("2.0.0"))
                .components(new Components());
    }
}

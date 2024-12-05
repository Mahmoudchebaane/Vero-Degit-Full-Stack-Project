import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Chemins des endpoints API
                        .allowedOrigins("http://localhost:3001") // Autoriser cette origine
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Méthodes HTTP autorisées
                        .allowedHeaders("*") // Autoriser tous les headers
                        .allowCredentials(true); // Permettre les cookies si nécessaire
            }
        };
    }
}

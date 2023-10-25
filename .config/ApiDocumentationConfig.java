@Configuration
public class ApiDocumentationConfig {

    @Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("Restaurante IFSUL")
                        .description("Aplicação de Restaurantes")
                        .version("0.0.1")
                        .contact(new Contact()
                                .name("Tiago Fleischauer")
                                .email("tiagofleischauer@hotmail.com")))
                .externalDocs(new ExternalDocumentation()));
    }
}
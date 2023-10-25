@Configuration
public class ApiDocumentationConfig {

    @Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("Nome da API")
                        .description("Descrição da API")
                        .version("0.0.1") //você sabe como funciona uma versão?
                        .contact(new Contact()
                                .name("Nome do DEV")
                                .email("email@do.dev")))
                .externalDocs(new ExternalDocumentation()
                        .description("Algum link externo")
                        .url("https:/wiki...."));
    }
}
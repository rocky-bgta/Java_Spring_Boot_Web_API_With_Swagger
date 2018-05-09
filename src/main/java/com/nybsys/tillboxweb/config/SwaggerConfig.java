package com.nybsys.tillboxweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.nybsys.tillboxweb.controllers"))
                //.paths(PathSelectors.regex("/api/user.*")) //PathSelectors.regex("/anyPath.*"))
                .paths(PathSelectors.any())
                //.paths(PathSelectors.regex("/api/purchase/supplierPayment.*"))
                .build();
    }

    private ApiInfo getApiInfo() {
        Contact contact = new Contact("Nybsys Ltd", "http://www.nybsys.com", "salahine.rocky@nybsys.bd.com");
        return new ApiInfoBuilder()
                .title("TillBoxWeb Api List")
                .description("Start up module api documentation")
                .version("1.0.0")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .contact(contact)
                .build();
    }

    @Bean
    public WebMvcConfigurer mvcConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedMethods("GET", "PUT","POST");
            }
        };
    }

}

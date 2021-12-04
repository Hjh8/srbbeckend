package com.srb.config;


import com.google.common.base.Predicates;
import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class Swagger2Config {

    // admin
    @Bean
    public Docket adminApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("adminApi")
                .apiInfo(apiInfo("尚融宝系统 管理员 API"))
                .select()
                .paths(Predicates.and(PathSelectors.regex("/admin/.*")))  // 只展示admin路径的接口
                .apis(RequestHandlerSelectors.basePackage("com.srb")) // 注意修改此处的包名
                .build();
    }

    // web端
    @Bean
    public Docket webApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(apiInfo("尚融宝系统 API"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.srb")) // 注意修改此处的包名
                .paths(Predicates.and(PathSelectors.regex("/api/.*")))  // 只展示admin路径的接口
                .build();
    }

    /**
     * 创建api的基本信息
     * @return
     */
    private ApiInfo apiInfo(String name) {
        return new ApiInfoBuilder()
                .title(name)
                .version("1.0")
                .build();
    }
}

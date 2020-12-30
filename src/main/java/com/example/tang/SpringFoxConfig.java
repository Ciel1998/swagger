package com.example.tang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/12/30 20:40
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/v2/**"))
                .build()
                .apiInfo(getApiInfo());
    }
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "liziyi的swagger",
                "描述暂无",
                "V1.0",
                "http://www.baidu.com",
                new Contact("liziyi", "http://www.baidu.com", "xxxxx@163.com"),
                "LICENSE",
                "http://www.baidu.com",
                Collections.emptyList()
        );
    }
}

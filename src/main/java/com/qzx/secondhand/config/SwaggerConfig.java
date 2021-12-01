package com.qzx.secondhand.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author XiaolongLi
 * Description: 配置 Swagger
 * @date 2021-07-27 21:22
 */

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket docket(Environment environment) {
        Profiles profiles = Profiles.of("dev", "test");
        //environment。acceptsProfiles判断自己是否在自己设定的环境中
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).enable(flag);
    }

    // 配置swagger基本信息
    private ApiInfo apiInfo() {
        Contact contact = new Contact("HUAWEI", "http://localhost:9655/", "email@.com");
        return new ApiInfo(
                "标题：西电活力工作室_二手交易系统_接口文档",
                "描述：二手交易系统接口汇总",
                "v1.0",
                "http://localhost:9655/",
                contact,
                "Apache 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }
}

/*
 * Copyright (c) 2015 - 7 - 20
 * ---6 :59:55
 * ---一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * ---作者:吴培基
 * ---QQ:757671834
 */

package w.p.j;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.paths.SwaggerPathProvider;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.Resource;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/20.18:59
 * ****************************************************
 */
@Configuration
@EnableSwagger
@ComponentScan(basePackages = {"w.p.j.controller"})
@EnableWebMvc
public class SwaggerConfig {
    @Resource
    private SpringSwaggerConfig springSwaggerConfig;
    @Bean  // Don't forget the @Bean annotation
    public SwaggerSpringMvcPlugin customImplementation() {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                .apiInfo(apiInfo())
                .includePatterns("/(?!error).*")
                ;
    }
    /**
     * 描述一些关于
     * @return
     */
    private ApiInfo apiInfo() {
//  ApiInfo(String title, String description, String termsOfServiceUrl, String contact, String license, String licenseUrl)

        ApiInfo apiInfo = new ApiInfo("Rest API.作者吴培基", "使用Swagger产生的API接口文档",
                "<a href='https://github.com/BigDuck'>Github</a>", "757671834@qq.com",
                "API许可证", "https://github.com/BigDuck"
        );
        return apiInfo;
    }

//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//
//    class GtPaths extends SwaggerPathProvider {
//        @Override
//        protected String applicationPath() {
//            return "/restapi";
//        }
//        @Override
//        protected String getDocumentationPath() {
//            return "/restapi";
//        }
//    }
}

package com.youhui.lv.eureke_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableSwagger2
public class EurekeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekeClientApplication.class, args);
	}
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.youhui.lv.eureke_client.controller"))
				.paths(PathSelectors.any())
				.build();
	}
    private ApiInfo apiInfo(){
		return new ApiInfoBuilder().title("测试swwiger").description("接口AP列表").termsOfServiceUrl("").contact(new Contact("惠农科技", "http://www.cnhnb.com/", "chenshanzi@cnhnkj.com"))
				.version("v1").build();
	}
	@Bean
	@LoadBalanced //负载均衡策略
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}

package com.youhui.lv.zipken.serverzipken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ServerZipkenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerZipkenApplication.class, args);
	}
}

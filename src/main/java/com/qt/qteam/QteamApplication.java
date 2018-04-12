package com.qt.qteam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.qt.qteam.user.mapper","com.qt.qteam.group.mapper"})

public class QteamApplication {

	public static void main(String[] args) {
		SpringApplication.run(QteamApplication.class, args);
	}
}

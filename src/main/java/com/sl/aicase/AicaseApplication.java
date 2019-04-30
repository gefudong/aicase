package com.sl.aicase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by gefudong on 2019/4/26.
 */
@MapperScan("com.sl.aicase.mapper")
@SpringBootApplication
public class AicaseApplication{
	private static final Logger logger = LoggerFactory.getLogger(AicaseApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AicaseApplication.class, args);
		logger.info("SpringBoot Start Success");
	}

}


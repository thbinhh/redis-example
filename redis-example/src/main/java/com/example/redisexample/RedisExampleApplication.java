package com.example.redisexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class RedisExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedisExampleApplication.class, args);
		BlockScheduler rs = new BlockScheduler();
		rs.scanLatestBlock();
	}

}

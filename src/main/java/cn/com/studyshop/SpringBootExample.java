package cn.com.studyshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 启动用主类
 * 
 * @author weiyiLiu
 *
 */

@SpringBootApplication
public class SpringBootExample {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExample.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

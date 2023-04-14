package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 스프링부트는
// @SpringBootApplication가 있는 패키지랑 패키지 하위에 있는 패키지 전부
// 스프링이 컴포넌트 스캔을 한다.
// 그래서 스프링 빈으로 자동 등록
@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);
	}

}

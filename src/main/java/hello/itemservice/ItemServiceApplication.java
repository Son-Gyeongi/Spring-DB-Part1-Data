package hello.itemservice;

import hello.itemservice.config.*;
import hello.itemservice.repository.ItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;


@Import(MemoryConfig.class) // MemoryConfig 파일을 설정 파일로 쓴다.
/**
 * 컴포넌트 스캔 경로를 hello.itemservice.web 하위로 지정
 * 컨트롤러만 컴포넌트 스캔 하겠다. 나머지는 수동으로 빈 등록
 */
@SpringBootApplication(scanBasePackages = "hello.itemservice.web")
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	/*
	빈으로 등록해야 확인용 초기 데이터 TestDataInit 가 호출된다.
	 */
	@Bean
	@Profile("local") // : 특정 프로필의 경우에만 해당 스프링 빈을 등록
	/*
	여기서는 local 이라는
	이름의 프로필이 사용되는 경우에만 testDataInit 이라는 스프링 빈을 등록한다. 이 빈은 앞서 본 것인데,
	편의상 초기 데이터를 만들어서 저장하는 빈
	 */
	public TestDataInit testDataInit(ItemRepository itemRepository) {
		return new TestDataInit(itemRepository);
	}

}

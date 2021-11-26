package kr.or.connect.daoexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"kr.or.connect.daoexam.dao"})
//이 코드로 인해 자동으로 Repository 부분이 Bean으로 등록됨.
@Import({DBConfig.class})
public class ApplicationConfig {

}
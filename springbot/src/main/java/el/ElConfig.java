package el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:el/text.txt")
public class ElConfig {
	@Value("i love you")
	private String normal;
	
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	@Value("#{T(java.lang.Math).random()*100.0}")
	private double randomNumber;
	
	@Value("#{demoService.another}")
	private String another;
	
	@Value("classpath:el/text.txt")
	private Resource resource;
	
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	@Value("${book.name}")
	private String name;
	
	@Autowired
	Environment environment;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer configurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}

	
	
	
	
}

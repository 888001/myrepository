package el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("el")
@Configuration
public class Config {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ElConfig config = context.getBean(ElConfig.class);
		System.out.println(config);
		context.close();
	}
}

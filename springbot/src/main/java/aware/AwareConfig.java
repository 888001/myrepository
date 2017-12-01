package aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("aware")
public class AwareConfig {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AwareConfig.class);
		AwareService service = context.getBean(AwareService.class);
		service.outResult();
		context.close();
		
	}
}

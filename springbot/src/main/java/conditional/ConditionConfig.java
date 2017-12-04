package conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**通过@Conditional 注解,符合windows则实例化windowsListService
 * 通过@Conditional 注解,符合linux则实例化linuxService
 * @author win7
 *
 */
@Configuration
public class ConditionConfig {
	@Bean
	@Conditional(WindowCondition.class)
	public ListService window(){
		return new WindowService();
	}
}

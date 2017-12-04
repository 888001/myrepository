package conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**根据不同的系统创建出不同的类,在打包项目到服务器时有用
 * 判断linux的condition
 * @author win7
 *
 */
public class LinuxCondion implements Condition {

	public boolean matches(ConditionContext context,
			AnnotatedTypeMetadata metadata) {
		
		return context.getEnvironment().getProperty("os.name").contains("Linux");
	}

}

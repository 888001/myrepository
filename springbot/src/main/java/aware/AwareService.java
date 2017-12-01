package aware;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	private String beanName;
	private ResourceLoader loader;

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void outResult() throws Exception {
		System.out.println("Bean 的名称为" + beanName);
		Resource resource = loader.getResource("classpath:aware/text.txt");
		System.out.println(resource.getInputStream().toString());
	}

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}
}

package BP.Difference;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
@PropertySource(value = "classpath:jflow.properties", ignoreResourceNotFound = true,encoding = "UTF-8" )
public class Helper {

	/**
	 * @return
	 * @throws IOException
	 */

	public static Properties loadResource() throws IOException {
		Properties properties = new Properties();
//		ResourceLoader loader = new DefaultResourceLoader();
//		Resource resource = loader.getResource("jflow.properties");
//		properties.load(resource.getInputStream());
		
		properties.load(new InputStreamReader(Object.class.getResourceAsStream("/jflow.properties"), "UTF-8"));
//        properties.get(key).toString();
		return properties;
	}
}

package ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {       //获得Bean名称和资源加载的服务

    private String beanName;
    private ResourceLoader loader;
    
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void outputResult() {
        System.out.println("bean的名称为： " + this.beanName);
        Resource resource = this.loader.getResource("classpath:ch3/aware/test.txt");
        try {
            System.out.println("ResourseLoader加载的文件内容为： " + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

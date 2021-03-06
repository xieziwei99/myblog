// 测试
package ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)     // 在JUnit环境下提供Spring TestContext Framework的功能
@ContextConfiguration(classes = {TestConfig.class})     // 用来加载配置ApplicationContext，其中classes属性用来加载配置类
@ActiveProfiles("prod")     // 声明活动的profile
public class DemoBeanIntegrationTests {
    @Autowired      // 使用普通的@Autowired注入Bean
    private TestBean testBean;
    
    @Test       // 测试代码
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}

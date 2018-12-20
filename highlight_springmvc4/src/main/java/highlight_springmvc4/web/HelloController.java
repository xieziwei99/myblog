package highlight_springmvc4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 声明是一个控制器
@Controller
public class HelloController {

    // 配置URL和方法之间的映射
    @RequestMapping("/index")
    public String hello() {
        // ?
        return "index";
    }
}

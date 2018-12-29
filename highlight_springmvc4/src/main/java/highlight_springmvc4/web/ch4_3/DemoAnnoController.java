package highlight_springmvc4.web.ch4_3;

import highlight_springmvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller     // 声明此类是一个控制类
@RequestMapping("/anno")        // 映射此类的访问路径是 /anno
public class DemoAnnoController {

    // 此方法未标注路径，因此用类级别的路径 /anno
    /* produces 可定制返回的 response 的媒体类型和字符集，
    若需要返回值是 json 对象，则设置 produces="application/json;charset=UTF-8" */
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access";
    }

    // 演示接收路径参数，并在方法参数前结合 @PathVariable 使用，访问路径为 /anno/pathvar/xx
    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access, str: " + str;
    }

    // 演示常规的 request 参数获取，访问路径为 /anno/requestParam?id=1
    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id, HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access, id: " + id;
    }

    // 演示解释参数到对象，访问路径为 /anno/obj?id=1&name=xx
    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access, obj id: " + obj.getId() + " obj name: " +obj.getName();
    }

    // 演示映射不同的路径到相同的方法，访问路径为 /anno/name1 或 /anno/name2
    @RequestMapping(value = { "/name1", "/name2" }, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access";
    }
}

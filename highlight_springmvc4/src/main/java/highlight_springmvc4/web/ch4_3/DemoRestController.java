package highlight_springmvc4.web.ch4_3;

import highlight_springmvc4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     // 声明是控制器，且返回数据时不需要用 @ResponseBody
@RequestMapping("/rest")
public class DemoRestController {

    // 返回数据的媒体类型为 json，直接返回对象，对象会自动转换成 json
    @RequestMapping(value = "/getjson", produces={"application/json;charset=UTF-8"})
    public DemoObj getjson(DemoObj obj){
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }

    // 返回数据的媒体类型为 xml，直接返回对象，对象会自动转换成 xml
    @RequestMapping(value = "/getxml", produces={"application/xml;charset=UTF-8"})
    public DemoObj getxml(DemoObj obj){
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }
}

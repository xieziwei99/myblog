package highlight_springmvc4.domain;

public class DemoObj {
    private Long id;
    private String name;

    public DemoObj() {      // jackson 对 对象和 json 做转换时，一定需要此空构造函数
        super();
    }
    public DemoObj(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package test;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

public class Person {
	@JSONField(name="name")  
    private String name;  
      
    @JSONField(name="age")  
    private String age;  
      
    @JSONField(name="desc")  
    private String desc;  
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getAge() {  
        return age;  
    }  
    public void setAge(String age) {  
        this.age = age;  
    }  
    public String getDesc() {  
        return desc;  
    }  
    public void setDesc(String desc) {  
        this.desc = desc;  
    }  
      
    public void setNAME(String NAME) {  //没有生效，字段上注解中的name的值为"name"，则setter为setName
        this.name = NAME;  
    }  
      
    public void setAGE(String AGE) {  //没有生效，字段上注解中的name的值为"name"，则setter为setAge
        this.age = AGE;  
    }  
      
    public void setDESC(String DESC) {  //没有生效，字段上注解中的name的值为"name"，则setter为setDesc
        this.desc = DESC;  
    }  
      
    public String toString() {  
        return JSONObject.toJSONString(this);  
    }  
}

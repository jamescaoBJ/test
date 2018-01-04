package test;

import com.alibaba.fastjson.JSONObject;  
import com.alibaba.fastjson.annotation.JSONField;  
  
public class Product {  
  
    private String productName;  
    private String desc;  
    private String price;  
      
    @JSONField(name="name")  
    public String getProductName() {  
        return productName;  
    }  
      
    @JSONField(name="name")  
    public void setProductName(String productName) {  
        this.productName = productName;  
    }  
      
    @JSONField(name="desc")  
    public String getDesc() {  
        return desc;  
    }  
      
    @JSONField(name="desc")  //测试代码中对jsonStr有一个toUpperCase的操作。就会这与"DESC"匹配
    public void setDesc(String desc) {  
        this.desc = desc;  
    }  
      
    @JSONField(name="price")  
    public String getPrice() {  
        return price;  
    }  
      
    @JSONField(name="price")  
    public void setPrice(String price) {  
        this.price = price;  
    }  
      
    public String toString() {  
        return JSONObject.toJSONString(this);  
    }  
      
}

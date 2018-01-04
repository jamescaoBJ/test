package test;

  
import com.alibaba.fastjson.JSONObject;  
  
/** 
 * 对fastjson中的JSON转换做一个测试 
*/  
public class JsonObjectTest {  
  
    public static void main(String[] args) {  
        Product product = new Product();  
        product.setProductName("产品");  
        product.setDesc("这是一个产品");  
        product.setPrice("22.3");  
          
        String jsonStr = JSONObject.toJSONString(product);  
        System.out.println("转换为json:" + JSONObject.toJSONString(product));  
          
        jsonStr = jsonStr.toUpperCase();  
        System.out.println(jsonStr);  
          
        product = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), Product.class);  
        System.out.println(product.toString());  
    }  
}
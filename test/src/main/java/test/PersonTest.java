package test;

  
import com.alibaba.fastjson.JSONObject;  
  
public class PersonTest {  
  
      
    public static void main(String[] args) {
    	Person person=new Person();  
        person.setName("xianglj");  
        person.setAge("20");  
        person.setDesc("只是一个测试");  
        String jsonStr = JSONObject.toJSONString(person);
        System.out.println("bean to json:" + jsonStr);  
          
        /*person = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), Person.class);  
        System.out.println("json to bean:" + person.getName());  
        System.out.println("@@@");*/
        //改变json的key为大写  
        jsonStr = jsonStr.toUpperCase();  
          
        System.out.println("需要转换的json:" + jsonStr);  
        person = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), Person.class);  
        System.out.println("json to bean:" + person.getName());  
    }  
}
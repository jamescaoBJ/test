/**
 * 
 */
package hello;
/**  
 * @Title: Application.java
 * @Package hello
 * @Description: 
 * @author caoyange 
 * @date 2017-8-29 ÏÂÎç7:36:23
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
public class Application {
	
	@ResponseBody
    @RequestMapping(value = "/")
    String home() {
        return "Hello World!.....";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

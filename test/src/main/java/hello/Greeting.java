package hello;
/**
 * 
 */
/**  
 * @Title: Greeting.java
 * @Package 
 * @Description: 
 * @author caoyange 
 * @date 2017-8-29 7:33:07
 */
public class Greeting {
	private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

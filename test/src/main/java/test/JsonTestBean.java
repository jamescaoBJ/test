package test;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * json bean相互转化
 * @author james
 *
 */
public class JsonTestBean {
	@JSONField(name = "user_name")
    private String userName;
    private String expValue;
    @JSONField(name = "USER_AGE")
    private int userAge;
    @JSONField(name = "EXP_VALUE")
    public String getExpValue() {
        return expValue;
    }
    public void setExpValue(String expValue) {
        this.expValue = expValue;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "JsonTestBean{" +
                "expValue='" + expValue + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
    public static void main(String[] args) {
    	 JsonTestBean jsonTestBean = new JsonTestBean();
         jsonTestBean.setUserName("username1");
         jsonTestBean.setExpValue("exp1");
         jsonTestBean.setUserAge(11);
         System.out.println("bean->json : " + JSONObject.toJSONString(jsonTestBean));

         String jsonStr = "{\"expvalue\":\"exp2\",\"USER_AGE\":22,\"user_name\":\"username2\"}";
         JsonTestBean toBean = JSONObject.toJavaObject(JSONObject.parseObject(jsonStr), JsonTestBean.class);
         if (toBean != null) {
             System.out.println("json-> bean : " + toBean.toString());
         }
         
         System.out.println("##########");
         System.out.println("bean 向xml转化");
         System.out.println(JSONObject.toJSONString(jsonTestBean, false));
	}

}

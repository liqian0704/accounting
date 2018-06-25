import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by yp-tc-2646 on 17/11/15.
 */
public class jsonTest {
    public static void main(String [] args){

    Student student=new Student();

        student.setName("lala");
        student.setAge("11");
        student.setAddress("beijing");

        System.out.println(student);




    }

    /**
     * JsonObject序列化
     */
   // @Test
    public void ToStringTest(){
        Student stu=new Student();
        stu.setName("JSON");
        stu.setAge("23");
        stu.setAddress("北京市西城区");

        //1、使用JSONObject
        JSONObject json = JSONObject.fromObject(stu);
        //2、使用JSONArray
        JSONArray array=JSONArray.fromObject(stu);

        String strJson=json.toString();
        String strArray=array.toString();

        System.out.println("strJson:"+strJson);
        System.out.println("strArray:"+strArray);
        
    }
    /**
     * JsonObject反序列化
     */
    @org.testng.annotations.Test
    public void toObjectTest(){
        Student stu=new Student();
        stu.setName("JSON");
        stu.setAge("23");
        stu.setAddress("北京市西城区");

        //1、使用JSONObject
        JSONObject json = JSONObject.fromObject(stu);
        //2、使用JSONArray
        JSONArray array=JSONArray.fromObject(stu);

        String strJson=json.toString();
        String strArray=array.toString();
        JSONObject obj = new JSONObject().fromObject(strJson);
       Student stu1= (Student)JSONObject.toBean(obj,Student.class);
        System.out.println(stu1.getAge());

    }
    }


//package CustomerUser;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Properties;
//
///**
// * Created by yp-tc-2646 on 18/2/5.
// */
//public class DBUtil {
//    private static  String driver="";
//    private static String url="";
//    private  static String user="";
//    private  static String pwd="";
//
//    static {
//       InputStream inputStream= DBUtil.class.getClassLoader().getResourceAsStream("conf/mitang.properties");
//        Properties properties=new Properties();
//        try {
//            properties.load(inputStream);
//            driver=properties.getProperty("driverClass");
//            url=properties.getProperty("jdbcUrl");
//            user=properties.getProperty("user");
//            pwd=properties.getProperty("password");
//
//            try {
//                Class.forName(driver);
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static SqlSession Opensession(){
//        String resource="conf/mybatis-config.xml";
//        InputStream inputStream= null;
//        try {
//            inputStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
//        return  sqlSessionFactory.openSession();
//    }
//    public static Connection getConnection(){
//        Connection connection=null;
//        try {
//            connection= DriverManager.getConnection(url,user,pwd);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return connection;
//    }
//    @Test
//    public void test(){
//        System.out.println(driver+"--"+url);
//    }
//
//
//
//}

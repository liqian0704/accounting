//package CustomerUser;
//
//import com.yeepay.g3.utils.config.ConfigurationUtils;
//import common.util.MybatisUtils;
//import entity.tool.ToolsSMSCode;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.Connection;
//
///**
// * Created by yp-tc-2646 on 18/2/8.
// */
//public class TestMybatis {
//    //@Before
//    public void set(){
//        ConfigurationUtils.init();
//
//    }
//    @Test
//    public void  test(){
//        String resource="conf/mybatis-config.xml";
//        try {
//            InputStream inputStream= Resources.getResourceAsStream(resource);
//            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//            SqlSession openSession=sqlSessionFactory.openSession();
//            String sql="toolSMSCode";
//            ToolsSMSCode toolsSMSCode= (ToolsSMSCode) openSession.selectOne(sql);
//            System.out.println(toolsSMSCode.getCreateDate());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//   // @Test
//    public void testConnection(){
//        Connection connection=DBUtil.getConnection();
//        System.out.println(connection);
//    }
//    //@Test
//    public void testSqlSession(){
//        try {
//            SqlSession sqlSession= MybatisUtils.openSession();
//            System.out.println(sqlSession);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

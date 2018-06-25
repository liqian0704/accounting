//package common.util;
//
//
//import com.yeepay.g3.utils.common.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import java.io.IOException;
//import java.io.InputStream;
//
///**
// * Created by yp-tc-2646 on 18/2/1.
// */
//public class MybatisUtils {
//
//    public static SqlSession openSession() throws IOException {
//        String resouce="conf/mybatis-config.xml";
//        InputStream in= Resources.getResourceAsStream(resouce);
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
//        return sqlSessionFactory.openSession();
//    }
//}

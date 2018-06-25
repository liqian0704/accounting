//package typehandler;
//
//import entity.tool.SMSCodeStatusEnum;
//import org.apache.ibatis.type.JdbcType;
//import org.apache.ibatis.type.TypeHandler;
//
//import java.sql.CallableStatement;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
///**
// * Created by yp-tc-2646 on 18/2/27.
// */
//public class StatusTypeHandler implements TypeHandler {
//
//    @Override
//    public void setParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
//
//    }
//
//    @Override
//    public Object getResult(ResultSet resultSet, String s) throws SQLException {
////        Integer toSplitStr = resultSet.getInt(s);
////        return convertResult(toSplitStr);
//        return SMSCodeStatusEnum.INIT;
//    }
//
//
//    public Object getResult(ResultSet resultSet, int i) throws SQLException {
//        Integer toSplitStr = resultSet.getInt(i);
//        return SMSCodeStatusEnum.INIT;
////        return convertResult(toSplitStr);
//    }
//
//    @Override
//    public Object getResult(CallableStatement callableStatement, int i) throws SQLException {
//        Integer toSplitStr = callableStatement.getInt(i);
//        return SMSCodeStatusEnum.INIT;
////        return convertResult(toSplitStr);
//    }
//
//    private Enum convertResult(Integer input) {
//        for(SMSCodeStatusEnum i: SMSCodeStatusEnum.values()){
//            if (i.getId().compareTo(input)==0){
//                return i;
//            }
//        }
//        return null;
//    }
//
//}

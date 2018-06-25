//package typehandler;
//
//import com.miitang.facade.customer.enumtype.user.UserStatus;
//import entity.tool.SMSCodeStatusEnum;
//import org.apache.ibatis.type.JdbcType;
//
//import java.sql.CallableStatement;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
///**
// * Created by yp-tc-2646 on 18/2/26.
// */
//public class EnumStatusHandler {
//    private Class<SMSCodeStatusEnum> type;
//    private final SMSCodeStatusEnum[] enums;
//        /*
//         * 设置配置文件设置的转换类以及枚举类内容，供其他方法更便捷高效的实现
//         * @param type 配置文件中设置的转换类
//         */
//
//    public EnumStatusHandler(Class<SMSCodeStatusEnum> type) {
//        if (type == null)
//        throw new IllegalArgumentException("Type argument cannot be null");
//        this.type = type;
//        this.enums = type.getEnumConstants();
//        if (this.enums == null)
//        throw new IllegalArgumentException(type.getSimpleName()
//                        + " does not represent an enum type.");
//    }
//
//    @Override
//    public void setNonNullParameter(PreparedStatement ps, int i,
//                                    SMSCodeStatusEnum parameter, JdbcType jdbcType) throws SQLException {
//        // baseTypeHandler已经帮我们做了parameter的null判断
//        ps.setInt(i, parameter.getId());
//
//    }
//
//    @Override
//    public SMSCodeStatusEnum getNullableResult(ResultSet rs, String columnName)
//
//        throws SQLException {
//        // 根据数据库存储类型决定获取类型，本例子中数据库中存放INT类型
//        int i = rs.getInt(columnName);
//        if (rs.wasNull()) {
//            return null;
//        } else {
//            // 根据数据库中的code值，定位EnumStatus子类
//            return locateEnumStatus(i);
//        }
//    }
//    @Override
//    public UserStatus getNullableResult(ResultSet rs, int columnIndex)
//        throws SQLException {
//
//        // 根据数据库存储类型决定获取类型，本例子中数据库中存放INT类型
//        int i = rs.getInt(columnIndex);
//        if (rs.wasNull()) {
//            return null;
//        } else {
//            // 根据数据库中的code值，定位EnumStatus子类
//            return locateEnumStatus(i);
//        }
//    }
//
//    @Override
//    public UserStatus getNullableResult(CallableStatement cs, int columnIndex)
//        throws SQLException {
//        // 根据数据库存储类型决定获取类型，本例子中数据库中存放INT类型
//        int i = cs.getInt(columnIndex);
//        if (cs.wasNull()) {
//            return null;
//        } else {
//            // 根据数据库中的code值，定位EnumStatus子类
//            return locateEnumStatus(i);
//        }
//    }
//        /**
//         088
//         * 枚举类型转换，由于构造函数获取了枚举的子类enums，让遍历更加高效快捷
//         089
//         * @param code 数据库中存储的自定义code属性
//        090
//         * @return code对应的枚举类
//        091
//         */
//
//    private UserStatus locateEnumStatus(int code) {
//        for(SMSCodeStatusEnum status : enums) {
//            if(status.getId()==(Integer.valueOf(code))) {
//                return status;
//            }
//        }
//        throw new IllegalArgumentException("未知的枚举类型：" + code + ",请核对" + type.getSimpleName());
//    }
//
//
//
//}

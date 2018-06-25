package CustomerUser;


import com.miitang.facade.merchant.enums.merchant.PromotType;
import entity.merchant.Merchant;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/** 手写jdbc需要导入mysql-connector-java.jar
 * Created by yp-tc-2646 on 18/2/1.
 */
public class Testjdbc {
    Connection conn=null;
    PreparedStatement statement=null;
    ResultSet rs=null;
    String dbURL="jdbc:mysql://10.151.11.3:3306/mt_merchant";
    String dbName="mt_merchant";
    String  userName="mt";
    String  pwd="mt1234";
    @Test
    public void selectAllMerchant(){


        String sql="select * from mt_merchant.tbl_mt_merchant_0";

        List<Merchant> list=new ArrayList<Merchant>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn= DriverManager.getConnection(dbURL,userName,pwd);
                System.out.println(conn);
               statement= conn.prepareStatement(sql);
               rs= statement.executeQuery();
                while(rs.next()){
                    Merchant merchant=new Merchant();
                    merchant.setMerchantNo(rs.getString("merchant_no"));
                    merchant.setMerchantName(rs.getString("merchant_name"));
                    merchant.setParentMerchantNo(rs.getString("parent_merchant_no"));
                    merchant.setAgentMerchantNo(rs.getString("agent_merchant_no"));
                    merchant.setBankcardInfo(rs.getString("bankcard_info"));
                    merchant.setCityCode(rs.getString("city_code"));
                    merchant.setCreateDate(rs.getDate("create_date"));
                    merchant.setCustomerNo(rs.getString("customer_no"));
                    merchant.setEmail(rs.getString("email"));
                    merchant.setInviteCode(rs.getString("invite_code"));
                    merchant.setLegalName(rs.getString("legal_name"));
                    merchant.setLegalPhoneNumber(rs.getString("legal_phone_number"));
                    merchant.setMerchantAddr(rs.getString("merchant_addr"));
                   // merchant.setMerchantBiztype(rs.get("merchantBizType"));
                    merchant.setMerchantShortName(rs.getString("merchant_short_name"));
                    merchant.setPromoterMerchantNo(rs.getString("promoter_merchant_no"));
                    merchant.setPromotType(PromotType.valueOf(rs.getString("promot_type")));
                    merchant.setRemark(rs.getString("remark"));
                    merchant.setSecretKey(rs.getString("secret_key"));
                    merchant.setSettleType(com.miitang.facade.merchant.enums.product.SettleType.valueOf(rs.getString("settle_type")));//
                    merchant.setTrxPwd(rs.getString("trx_pwd"));
                    merchant.setUpdateDate(rs.getDate("update_date"));
                    list.add(merchant);
                }
                for(int i=0;i<list.size();i++){
                    System.out.println(list.get(i).getMerchantNo());
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void selectOneMerchant(){
        String sql="select * from mt_merchant.tbl_mt_merchant_0 where merchant_no=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn= DriverManager.getConnection(dbURL,userName,pwd);
                System.out.println(conn);
                Merchant merchant =new Merchant();
                statement= conn.prepareStatement(sql);
                statement.setString(1,"11050953278649");
                rs= statement.executeQuery();
                while(rs.next()){
                    merchant.setMerchantNo(rs.getString("merchant_no"));
                    merchant.setMerchantName(rs.getString("merchant_name"));
                    merchant.setParentMerchantNo(rs.getString("parent_merchant_no"));
                    merchant.setAgentMerchantNo(rs.getString("agent_merchant_no"));
                    merchant.setBankcardInfo(rs.getString("bankcard_info"));
                    merchant.setCityCode(rs.getString("city_code"));
                    merchant.setCreateDate(rs.getDate("create_date"));
                    merchant.setCustomerNo(rs.getString("customer_no"));
                    merchant.setEmail(rs.getString("email"));
                    merchant.setInviteCode(rs.getString("invite_code"));
                    merchant.setLegalName(rs.getString("legal_name"));
                    merchant.setLegalPhoneNumber(rs.getString("legal_phone_number"));
                    merchant.setMerchantAddr(rs.getString("merchant_addr"));
                    // merchant.setMerchantBiztype(rs.get("merchantBizType"));
                    merchant.setMerchantShortName(rs.getString("merchant_short_name"));
                    merchant.setPromoterMerchantNo(rs.getString("promoter_merchant_no"));
                    merchant.setPromotType(PromotType.valueOf(rs.getString("promot_type")));
                    merchant.setRemark(rs.getString("remark"));
                    merchant.setSecretKey(rs.getString("secret_key"));
                    merchant.setSettleType(com.miitang.facade.merchant.enums.product.SettleType.valueOf(rs.getString("settle_type")));//
                    merchant.setTrxPwd(rs.getString("trx_pwd"));
                    merchant.setUpdateDate(rs.getDate("update_date"));
                    System.out.println(merchant.getMerchantNo());

                }



            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

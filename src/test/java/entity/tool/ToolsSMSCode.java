//package entity.tool;
//
//import com.miitang.common.util.mango.AesDecrypt;
//import com.miitang.common.util.mango.AesEncrypt;
//import org.jfaster.mango.annotation.Getter;
//import org.jfaster.mango.annotation.Setter;
//import org.jfaster.mango.invoker.function.enums.EnumToIntegerFunction;
//import org.jfaster.mango.invoker.function.enums.IntegerToEnumFunction;
//
//import java.lang.reflect.Type;
//import java.util.Date;
//
///**
// * Created by hubian on 22/12/2017.
// */
//public class ToolsSMSCode {
//    private Long id;
//    private String parentMerchantNo;
//    private Integer template;
//    private String businessType;
//    private String phoneNumber;
//    private String code;
//    private Date invalidTime;
//    private SMSCodeStatusEnum status;
//    private Date createDate;
//    private Date updateDate;
//    private String source;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getParentMerchantNo() {
//        return parentMerchantNo;
//    }
//
//    public void setParentMerchantNo(String parentMerchantNo) {
//        this.parentMerchantNo = parentMerchantNo;
//    }
//
//    @Getter(AesEncrypt.class)
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    @Setter(AesDecrypt.class)
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public Date getInvalidTime() {
//        return invalidTime;
//    }
//
//    public void setInvalidTime(Date invalidTime) {
//        this.invalidTime = invalidTime;
//    }
//
//    public Date getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(Date createDate) {
//        this.createDate = createDate;
//    }
//
//    public Date getUpdateDate() {
//        return updateDate;
//    }
//
//    public void setUpdateDate(Date updateDate) {
//        this.updateDate = updateDate;
//    }
//
//    public Integer getTemplate() {
//        return template;
//    }
//
//    public void setTemplate(Integer template) {
//        this.template = template;
//    }
//
//    public String getBusinessType() {
//        return businessType;
//    }
//
//    public void setBusinessType(String businessType) {
//        this.businessType = businessType;
//    }
//
//    @Getter(SMSCodeStatusToIntegerFunction.class)
//    public SMSCodeStatusEnum getStatus() {
//        return status;
//    }
//
//    @Setter(IntegerToSMSCodeStatusFunction.class)
//    public void setStatus(SMSCodeStatusEnum status) {
//        this.status = status;
//    }
//
//    public String getSource() {
//        return source;
//    }
//
//    public void setSource(String source) {
//        this.source = source;
//    }
//
//
//
//
//}
//
//final class SMSCodeStatusToIntegerFunction extends EnumToIntegerFunction {
//    @Override
//    public Integer apply(Enum input) {
//        return input == null ? null : Integer.valueOf(((SMSCodeStatusEnum)input).getId());
//    }
//}
//
//
//final class IntegerToSMSCodeStatusFunction extends IntegerToEnumFunction {
//    @Override
//    public Enum apply(Integer input, Type runtimeOutputType) {
//        if(input == null) {
//            return null;
//        } else {
//            for(SMSCodeStatusEnum i: SMSCodeStatusEnum.values()){
//                if (i.getId().compareTo(input)==0){
//                    return i;
//                }
//            }
//            return null;
//        }
//    }
//}
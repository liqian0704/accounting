//package entity.user;
//
//import com.miitang.facade.merchant.enums.user.RequestSource;
//import com.miitang.facade.merchant.enums.user.UserStatus;
//import entity.BaseEntity;
//import org.jfaster.mango.annotation.Getter;
//import org.jfaster.mango.annotation.Setter;
//import org.jfaster.mango.invoker.function.enums.EnumToStringFunction;
//import org.jfaster.mango.invoker.function.enums.StringToEnumFunction;
//
//import java.util.Date;
//
///**
// * Description: app用户
// * Author: wei.li
// * Date: 17/12/25
// * Version: 1.0
// * Copyright © 2016 YeePay.com All rights reserved.
// */
//public class AppUserEntity extends BaseEntity {
//
//    /**
//     * 运营商商编
//     */
//    private String parentMerchantNo;
//
//    /**
//     * 用户商编
//     */
//    private String merchantNo;
//
//    /**
//     * 手机号
//     */
//    private String phoneNumber = "";
//
//    /**
//     * 注册来源
//     */
//    private RequestSource requestSource;
//
//    /**
//     * 微信uid
//     */
//    private String wechantId = "";
//
//    /**
//     * 微信昵称
//     */
//    private String wechantNick = "";
//
//    /**
//     * 微信头像
//     */
//    private String wechantPhoto = "";
//
//    /**
//     * 用户状态
//     */
//    private UserStatus userStatus;
//
//    /**
//     * 邀请码
//     */
//    private String inviteCode = "";
//
//    /**
//     * 用户姓名
//     */
//    private String userName = "";
//
//    /**
//     * 入网成功标志
//     */
//    private boolean netInFlag = false;
//
//    /**
//     * 交易标志
//     */
//    private boolean tradeFlag = false;
//
//    /**
//     * 入网请求id
//     */
//    private String opRequestId = "";
//
//    /**
//     * 创建时间
//     */
//    private Date createDate;
//
//    /**
//     * 更新时间
//     */
//    private Date updateDate;
//
//    public String getParentMerchantNo() {
//        return parentMerchantNo;
//    }
//
//    public void setParentMerchantNo(String parentMerchantNo) {
//        this.parentMerchantNo = parentMerchantNo;
//    }
//
//    public String getMerchantNo() {
//        return merchantNo;
//    }
//
//    public void setMerchantNo(String merchantNo) {
//        this.merchantNo = merchantNo;
//    }
//
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//
//    public RequestSource getRequestSource() {
//        return requestSource;
//    }
//
//
//    public void setRequestSource(RequestSource requestSource) {
//        this.requestSource = requestSource;
//    }
//
//    public String getWechantId() {
//        return wechantId;
//    }
//
//    public void setWechantId(String wechantId) {
//        this.wechantId = wechantId;
//    }
//
//    public String getWechantNick() {
//        return wechantNick;
//    }
//
//    public void setWechantNick(String wechantNick) {
//        this.wechantNick = wechantNick;
//    }
//
//    public String getWechantPhoto() {
//        return wechantPhoto;
//    }
//
//    public void setWechantPhoto(String wechantPhoto) {
//        this.wechantPhoto = wechantPhoto;
//    }
//
//    @Getter(EnumToStringFunction.class)
//    public UserStatus getUserStatus() {
//        return userStatus;
//    }
//
//    @Setter(StringToEnumFunction.class)
//    public void setUserStatus(UserStatus userStatus) {
//        this.userStatus = userStatus;
//    }
//
//    public String getInviteCode() {
//        return inviteCode;
//    }
//
//    public void setInviteCode(String inviteCode) {
//        this.inviteCode = inviteCode;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public boolean isNetInFlag() {
//        return netInFlag;
//    }
//
//    public void setNetInFlag(boolean netInFlag) {
//        this.netInFlag = netInFlag;
//    }
//
//    public boolean isTradeFlag() {
//        return tradeFlag;
//    }
//
//    public void setTradeFlag(boolean tradeFlag) {
//        this.tradeFlag = tradeFlag;
//    }
//
//    public String getOpRequestId() {
//        return opRequestId;
//    }
//
//    public void setOpRequestId(String opRequestId) {
//        this.opRequestId = opRequestId;
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
//}

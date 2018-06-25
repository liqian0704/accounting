/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package entity.merchant;
/**
 * 类名称: Merchant <br>
 * 类描述: <br>
 *
 * @author: xxxx.xxx
 * @since: 17/12/20 下午4:54
 * @version: 1.0.0
 */


import com.miitang.facade.merchant.enums.merchant.MerchantBizType;
import com.miitang.facade.merchant.enums.merchant.MerchantStatus;
import com.miitang.facade.merchant.enums.merchant.MerchantType;
import com.miitang.facade.merchant.enums.merchant.PromotType;
import com.miitang.facade.merchant.enums.product.SettleType;
import entity.BaseEntity;

import java.util.Date;

/**
 * @ClassName: Merchant
 * @Description: Merchant 商户信息表
 * @author: dongxulu
 * @date: 17/12/20 下午5:22
 * @version: 1.0.0
 */
public class Merchant extends BaseEntity {
    private static final long serialVersionUID = -5135816951595434495L;
    /**
     * 运营商编号
     */
    private String parentMerchantNo="";
    /**
     * 代理商编号
     */
    private String agentMerchantNo="";
    /**
     * 商户编号
     */
    private String merchantNo="";
    /**
     * 商户名称
     */
    private String merchantName="";
    /**
     * 商户简称
     */
    private String merchantShortName="";
    /**
     * 上级推广员编号
     */
    private String promoterMerchantNo="";
    /**
     * 邀请码
     */
    private String inviteCode="";
    /**
     * 客户编号
     */
    private String customerNo="";
    /**
     * 法人姓名
     */
    private String legalName="";
    /**
     * 法人手机号
     */
    private String legalPhoneNumber="";
    /**
     * 邮箱
     */
    private String email="";
    /**
     * 商户省份编码
     */
    private String provinceCode="";
    /**
     * 商户市编码
     */
    private String cityCode="";
    /**
     * 商户地址
     */
    private String merchantAddr="";
    /**
     * 结算类型
     */
    private SettleType settleType=SettleType.T1;
    /**
     * 推广角色
     */
    private PromotType promotType=PromotType.CONSUMER;
    /**
     * 商户状态
     */
    private MerchantStatus merchantStatus=MerchantStatus.INACTIVE;
    /**
     * 商户秘钥
     */
    private String SecretKey="";
    /**
     * 交易密码
     */
    private String trxPwd="";
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 商户类型
     */
    private MerchantType merchantType=MerchantType.MERCHANT;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getAgentMerchantNo() {
        return agentMerchantNo;
    }

    public void setAgentMerchantNo(String agentMerchantNo) {
        this.agentMerchantNo = agentMerchantNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantShortName() {
        return merchantShortName;
    }

    public void setMerchantShortName(String merchantShortName) {
        this.merchantShortName = merchantShortName;
    }

    public String getPromoterMerchantNo() {
        return promoterMerchantNo;
    }

    public void setPromoterMerchantNo(String promoterMerchantNo) {
        this.promoterMerchantNo = promoterMerchantNo;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalPhoneNumber() {
        return legalPhoneNumber;
    }

    public void setLegalPhoneNumber(String legalPhoneNumber) {
        this.legalPhoneNumber = legalPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getMerchantAddr() {
        return merchantAddr;
    }

    public void setMerchantAddr(String merchantAddr) {
        this.merchantAddr = merchantAddr;
    }

    public SettleType getSettleType() {
        return settleType;
    }

    public void setSettleType(SettleType settleType) {
        this.settleType = settleType;
    }

    public PromotType getPromotType() {
        return promotType;
    }

    public void setPromotType(PromotType promotType) {
        this.promotType = promotType;
    }

    public MerchantStatus getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(MerchantStatus merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public String getSecretKey() {
        return SecretKey;
    }

    public void setSecretKey(String secretKey) {
        SecretKey = secretKey;
    }

    public String getTrxPwd() {
        return trxPwd;
    }

    public void setTrxPwd(String trxPwd) {
        this.trxPwd = trxPwd;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public MerchantType getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(MerchantType merchantType) {
        this.merchantType = merchantType;
    }

    public MerchantBizType getMerchantBiztype() {
        return merchantBiztype;
    }

    public void setMerchantBiztype(MerchantBizType merchantBiztype) {
        this.merchantBiztype = merchantBiztype;
    }

    public String getBankcardInfo() {
        return bankcardInfo;
    }

    public void setBankcardInfo(String bankcardInfo) {
        this.bankcardInfo = bankcardInfo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 商户业务类型
     */
    private MerchantBizType merchantBiztype=MerchantBizType.DEFAULT;


    /**
     * 结算卡信息 存绑卡id 多个以逗号分隔
     */
    private String bankcardInfo="";
    /**
     * 备注信息
     */
    private String remark="";



}
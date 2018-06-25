/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package entity.merchant;


import com.miitang.common.enums.ChargeTypeEnum;
import com.miitang.facade.merchant.enums.merchant.OpStatus;
import entity.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 类名称: OpInfo <br>
 * 类描述: <br>
 * 入网请求信息
 * @author: dongxu.lu
 * @since: 17/12/21 下午3:49
 * @version: 1.0.0
 */
public class OpInfo extends BaseEntity {
    /**
     * 入网请求流水
     */
    private String opRequestno="";
    /**
     *运营商编号
     */
    private String parentMerchantNo;
    /**
     * 商户编号,注册用户号与商编一致了
     */
    private String merchantNo="";
    /**
      邀请码
     */
    private String inviteCode="";
    /**
     * 销售名称
     */
    private String salesName="";
    /**
     *销售电话
     */
    private String salePhoneNumber="";
    /**
     *销售部门
     */
    private String saleDepartment="";
    /**
     * 请求时间
     */
    private Date requestDate;
    /**
     *签约类型
     */
    private String signType="";
    /**
     * 签约主体
     */
    private String signSubject="";
    /**
     * 协议发送方式
     */
    private String postType="";
    /**
     * 接收地址
     */
    private String receiveAddr="";
    /**
     * 协议存储地址
     */
    private String contractImg="";
    /**
     * 联系人
     */
    private String contactName="";
    /**
     * 联系人手机
     */
    private String contactPhoneNumber="";
    /**
     * 结算主体
     */
    private String settleSubject="";
    /**
     * 结算账号
     */
    private String bankAccountNo="";
    /**
     * 结算账号开户名
     */
    private String bankAccountName="";
    /**
     * 银行全称
     */
    private String bankFullName="";
    /**
     * 银行编码
     */
    private String bankCode="";
    /**
     * 支行名称
     */
    private String branchBankName="";
    /**
     * 支行编码
     */
    private String branchBankCode="";
    /**
     * 支行所在省
     */
    private String branchProvince="";
    /**
     *支行省编码
     */
    private String branchProvinceCode="";
    /**
     *支行所在市
     */
    private String branchCity="";

    /**
     *支行所在市编码
     */
    private String branchCityCode="";
    /**
     *银行卡信息照片地址
     */

    private String bankAccountnoImg="";
    /**
     * 产品编码
     */
    private String productCode="";
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 分润比例
     */
    private BigDecimal profitRatio=new BigDecimal(0);

    private OpStatus opStatus= OpStatus.INREVIEW;

    private String  remark="";

    private String  description="";
    /**
     *证件背面照片
     */

    private String backIdcardImg="";
    /**
     *证件正面照片
     */

    private String frontIdcardImg="";
    /**
     *手持身份证
     */

    private String handIdcardImg="";
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
    private String detailAddr="";
    /**
     * 扣费类型  内扣INNER or外扣OUT 取值 ChargeTypeEnum  默认内扣
     */
    private String payFeeType= ChargeTypeEnum.INNER.getValue();

    public String getPayFeeType() {
        return payFeeType;
    }

    public void setPayFeeType(String payFeeType) {
        this.payFeeType = payFeeType;
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getInviteCode() {
        return inviteCode;
    }
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
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

    public String getDetailAddr() {
        return detailAddr;
    }

    public void setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
    }

    public String getBackIdcardImg() {
        return backIdcardImg;
    }

    public void setBackIdcardImg(String backIdcardImg) {
        this.backIdcardImg = backIdcardImg;
    }

    public String getFrontIdcardImg() {
        return frontIdcardImg;
    }

    public void setFrontIdcardImg(String frontIdcardImg) {
        this.frontIdcardImg = frontIdcardImg;
    }

    public String getHandIdcardImg() {
        return handIdcardImg;
    }

    public void setHandIdcardImg(String handIdcardImg) {
        this.handIdcardImg = handIdcardImg;
    }

    public String getOpRequestno() {
        return opRequestno;
    }

    public void setOpRequestno(String opRequestno) {
        this.opRequestno = opRequestno;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public String getSalePhoneNumber() {
        return salePhoneNumber;
    }

    public void setSalePhoneNumber(String salePhoneNumber) {
        this.salePhoneNumber = salePhoneNumber;
    }

    public String getSaleDepartment() {
        return saleDepartment;
    }

    public void setSaleDepartment(String saleDepartment) {
        this.saleDepartment = saleDepartment;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSignSubject() {
        return signSubject;
    }

    public void setSignSubject(String signSubject) {
        this.signSubject = signSubject;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getReceiveAddr() {
        return receiveAddr;
    }

    public void setReceiveAddr(String receiveAddr) {
        this.receiveAddr = receiveAddr;
    }

    public String getContractImg() {
        return contractImg;
    }

    public void setContractImg(String contractImg) {
        this.contractImg = contractImg;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getSettleSubject() {
        return settleSubject;
    }

    public void setSettleSubject(String settleSubject) {
        this.settleSubject = settleSubject;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankFullName() {
        return bankFullName;
    }

    public void setBankFullName(String bankFullName) {
        this.bankFullName = bankFullName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBranchBankName() {
        return branchBankName;
    }

    public void setBranchBankName(String branchBankName) {
        this.branchBankName = branchBankName;
    }

    public String getBranchBankCode() {
        return branchBankCode;
    }

    public void setBranchBankCode(String branchBankCode) {
        this.branchBankCode = branchBankCode;
    }

    public String getBranchProvince() {
        return branchProvince;
    }

    public void setBranchProvince(String branchProvince) {
        this.branchProvince = branchProvince;
    }

    public String getBranchProvinceCode() {
        return branchProvinceCode;
    }

    public void setBranchProvinceCode(String branchProvinceCode) {
        this.branchProvinceCode = branchProvinceCode;
    }

    public String getBranchCity() {
        return branchCity;
    }

    public void setBranchCity(String branchCity) {
        this.branchCity = branchCity;
    }

    public String getBranchCityCode() {
        return branchCityCode;
    }

    public void setBranchCityCode(String branchCityCode) {
        this.branchCityCode = branchCityCode;
    }

    public String getBankAccountnoImg() {
        return bankAccountnoImg;
    }

    public void setBankAccountnoImg(String bankAccountnoImg) {
        this.bankAccountnoImg = bankAccountnoImg;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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

    public BigDecimal getProfitRatio() {
        return profitRatio;
    }

    public void setProfitRatio(BigDecimal profitRatio) {
        this.profitRatio = profitRatio;
    }

    public OpStatus getOpStatus() {
        return opStatus;
    }

    public void setOpStatus(OpStatus opStatus) {
        this.opStatus = opStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
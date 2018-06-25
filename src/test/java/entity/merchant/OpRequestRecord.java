/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package entity.merchant;


import com.miitang.facade.merchant.enums.merchant.OpStatus;
import entity.BaseEntity;

import java.util.Date;

/**
 * 类名称: OpRequestRecord <br>
 * 类描述: <br>
 * 入网请求记录,针对去三方三方公司入网的请求记录
 * @author: dongxu.lu
 * @since: 17/12/21 下午5:00
 * @version: 1.0.0
 */
public class OpRequestRecord extends BaseEntity {

    private String parentMerchantno="";
    private String agentMerchantno="";
    private String merchantNo="";
    /**
     *op唯一流水号
     */
    private String opRequestNo="";
    /**
     * 支付公司
     */
    private String payCompany="";
    /**
     * 支付公司商编
     */
    private String outMerchantNo="";
    /**
     * 三方流水号
     */
    private String outRequestNo="";
    /**
     * 三方父商编
     */
    private String outParentMerchantNo="";
    /**
     * 开户状态
     */
    private OpStatus opStatus=OpStatus.INREVIEW;
    private String errorMessage="";
    private Date createDate;
    private Date updateDate;
    private String remark="";

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }

    public String getOutParentMerchantNo() {
        return outParentMerchantNo;
    }

    public void setOutParentMerchantNo(String outParentMerchantNo) {
        this.outParentMerchantNo = outParentMerchantNo;
    }

    public String getOutMerchantNo() {
        return outMerchantNo;
    }

    public void setOutMerchantNo(String outMerchantNo) {
        this.outMerchantNo = outMerchantNo;
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

    public String getParentMerchantno() {
        return parentMerchantno;
    }

    public void setParentMerchantno(String parentMerchantno) {
        this.parentMerchantno = parentMerchantno;
    }

    public String getAgentMerchantno() {
        return agentMerchantno;
    }

    public void setAgentMerchantno(String agentMerchantno) {
        this.agentMerchantno = agentMerchantno;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOpRequestNo() {
        return opRequestNo;
    }

    public void setOpRequestNo(String opRequestNo) {
        this.opRequestNo = opRequestNo;
    }

    public String getPayCompany() {
        return payCompany;
    }

    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
    }

    public OpStatus getOpStatus() {
        return opStatus;
    }

    public void setOpStatus(OpStatus opStatus) {
        this.opStatus = opStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
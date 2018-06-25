package entity.product;


import entity.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Description:
 * Author: wei.li
 * Date: 18/1/8
 * Version: 1.0
 * Copyright © 2016 YeePay.com All rights reserved.
 */
public class CalFee extends BaseEntity {

    private static final long serialVersionUID = 169648211769798698L;

    /**
     * 业务请求号
     */
    private String bizRequestNo;

    /**
     * 业务方编码
     */
    private String bizSystemNo;

    /**
     * 运营商商编
     */
    private String parentMerchantNo;

    /**
     * 商编
     */
    private String merchantNo;

    /**
     * 计费项
     */
    private String feeBizCode;

    /**
     * 计费产品
     */
    private String feeProduct;

    /**
     * 交易金额
     */
    private BigDecimal tradeAmount;

    /**
     * 交易手续费
     */
    private BigDecimal payFee;

    /**
     * 取现手续费
     */
    private BigDecimal settleFee;

    /**
     * 手续费
     */
    private BigDecimal totalFee;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    public String getBizRequestNo() {
        return bizRequestNo;
    }

    public void setBizRequestNo(String bizRequestNo) {
        this.bizRequestNo = bizRequestNo;
    }

    public String getBizSystemNo() {
        return bizSystemNo;
    }

    public void setBizSystemNo(String bizSystemNo) {
        this.bizSystemNo = bizSystemNo;
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getFeeBizCode() {
        return feeBizCode;
    }

    public void setFeeBizCode(String feeBizCode) {
        this.feeBizCode = feeBizCode;
    }

    public String getFeeProduct() {
        return feeProduct;
    }

    public void setFeeProduct(String feeProduct) {
        this.feeProduct = feeProduct;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public BigDecimal getSettleFee() {
        return settleFee;
    }

    public void setSettleFee(BigDecimal settleFee) {
        this.settleFee = settleFee;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
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
}

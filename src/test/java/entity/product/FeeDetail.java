/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package entity.product;


import entity.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: FeeDetail
 * @Description: FeeDetail 费率明细 记录每个商户费率信息
 * @author: dongxulu
 * @date: 17/12/21 上午10:45
 * @version: 1.0.0
 */
public class FeeDetail extends BaseEntity implements Comparable<FeeDetail> {

    private static final long serialVersionUID = -3876189452264598341L;
    /**
     *运营商编号
     */
    private String parentMerchantNo;

    /**
     * 运营商名称
     */
    private String parentMerchantName = "";
    /**
     * 代理商编号
     */
    private String agentMerchantno = "";
    /**
     * 商户编号
     */
    private String merchantNo;

    /**
     * 商户名称
     */
    private String merchantName = "";
    /**
     *业务方
     */
    private String feeBizCode;
    /**
     *产品编码
     */
    private String feeProduct;
    /**
     * 费率类型
     */
    private String feeType = "";
    /**
     * 收费模式
     */
    private String chargeMode = "";
    /**
     * 比例
     */
    private BigDecimal feeRate = new BigDecimal(0);
    /**
     *金额
     */
    private BigDecimal feeAmount = new BigDecimal(0);
    /**
     * 费率生效开始时间
     */
    private Date feeEffectiveDate;
    /**
     * 费率失效截止时间
     */
    private Date feeExpiryDate;
    /**
     * 计费状态
     */
    private String feeStatus;
    /**
     *创建时间
     */
    private Date createDate;
    /**
     *更新时间
     */
    private Date updateDate;

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getParentMerchantName() {
        return parentMerchantName;
    }

    public void setParentMerchantName(String parentMerchantName) {
        this.parentMerchantName = parentMerchantName;
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

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
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

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Date getFeeEffectiveDate() {
        return feeEffectiveDate;
    }

    public void setFeeEffectiveDate(Date feeEffectiveDate) {
        this.feeEffectiveDate = feeEffectiveDate;
    }

    public Date getFeeExpiryDate() {
        return feeExpiryDate;
    }

    public void setFeeExpiryDate(Date feeExpiryDate) {
        this.feeExpiryDate = feeExpiryDate;
    }

    public String getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus;
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

    /**
     * 按字母排序
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(FeeDetail o) {
        if (feeProduct.compareTo(o.getFeeProduct()) > 0) {
            return 1;
        }
        if (feeProduct.compareTo(o.getFeeProduct()) == 0) {
            return 0;
        }
        return -1;
    }
}
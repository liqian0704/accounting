/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package entity.product;


import entity.BaseEntity;

import java.util.Date;

/**
 * @ClassName: FeeTemplate
 * @Description: FeeTemplate 费率模板表
 * @author: dongxulu
 * @date: 17/12/20 下午9:24
 * @version: 1.0.0
 */
public class FeeTemplate extends BaseEntity {

    private static final long serialVersionUID = -4750748519010882663L;
    private String feeBizCode;
    private String feeProduct = "";
    private String feeProductType = "";
    private String payWay = "";
    private String cardType = "";
    private Date createDate;
    private Date updateDate;
    private String remark = "";

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

    public String getFeeProductType() {
        return feeProductType;
    }

    public void setFeeProductType(String feeProductType) {
        this.feeProductType = feeProductType;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
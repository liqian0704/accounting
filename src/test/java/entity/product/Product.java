package entity.product;


import entity.BaseEntity;

import java.util.Date;

/**
 * @ClassName: Product
 * @Description: Product 记录业务产品信息
 * @author: dongxulu
 * @date: 17/12/20 下午8:23
 * @version: 1.0.0
 */
public class Product extends BaseEntity {
    private static final long serialVersionUID = 3917976734421087248L;
    /**
     * 产品编码
     */
    private String productCode="";
    /**
     * 产品名称
     */
    private String productName="";
    /**
     * 一级产品编码
     */
    private String productLevel1="";
    /**
     * 二级产品编码
     */
    private String productLevel2="";
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 备注信息 预留字段
     */
    private String remark="";

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLevel1() {
        return productLevel1;
    }

    public void setProductLevel1(String productLevel1) {
        this.productLevel1 = productLevel1;
    }

    public String getProductLevel2() {
        return productLevel2;
    }

    public void setProductLevel2(String productLevel2) {
        this.productLevel2 = productLevel2;
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
/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package entity.product;
/**
 * 类名称: MappingInfo <br>
 * 类描述: <br>
 *
 * @author: xxxx.xxx
 * @since: 17/12/21 下午4:30
 * @version: 1.0.0
 */


import com.miitang.facade.merchant.enums.product.MappingType;
import entity.BaseEntity;

import java.util.Date;

public class MappingInfo extends BaseEntity {

    /**
     * 原始信息
     */
    private String srcMessage="";
    /**
     * 映射类型
     */
    private MappingType mappingType;
    /**
     * 映射信息
     */
    private String targetMessage="";
    /**
     *支付公司
     */
    private String payCompany="";
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 备注
     */
    private String remark="";

    public String getSrcMessage() {
        return srcMessage;
    }

    public void setSrcMessage(String srcMessage) {
        this.srcMessage = srcMessage;
    }

    public MappingType getMappingType() {
        return mappingType;
    }

    public void setMappingType(MappingType mappingType) {
        this.mappingType = mappingType;
    }

    public String getTargetMessage() {
        return targetMessage;
    }

    public void setTargetMessage(String targetMessage) {
        this.targetMessage = targetMessage;
    }

    public String getPayCompany() {
        return payCompany;
    }

    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
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
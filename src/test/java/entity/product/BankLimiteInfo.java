package entity.product;
/**
 * 类名称: BankLimiteInfo <br>
 * 类描述: <br>
 *
 * @author: dongxulu
 * @since: 18/1/19 上午10:24
 * @version: 1.0.0
 */


import com.miitang.common.enums.CardTypeEnum;
import entity.BaseEntity;

import java.util.Date;

/**
 * Created by dongxulu on 18/1/19.
 */
public class BankLimiteInfo extends BaseEntity {

    /**
     *业务产品编码
     */
    private String bizProductCode="";
    /**
     * 业务产品名称
     */
    private String bizProductName="";
    /**
     * 银行编码
     */
    private String bankCode="";
    /**
     * 银行名称
     */
    private String bankName="";
    /**
     * 每笔限额
     */
    private String perLimiteAmount="";
    /**
     * 日限额
     */
    private String dayLimiteAmount="";
    /**
     * 月限额
     */
    private String monthLimiteAmount="";
    /**
     * 卡类型 默认贷记卡
     */
    private String CardType= CardTypeEnum.CREDIT.getValue();
    private Date createDate;//创建时间
    private Date updateDate;//更新时间
    /**
     * 备注
     */
    private String remark;

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

    public String getPerLimiteAmount() {
        return perLimiteAmount;
    }

    public void setPerLimiteAmount(String perLimiteAmount) {
        this.perLimiteAmount = perLimiteAmount;
    }

    public String getDayLimiteAmount() {
        return dayLimiteAmount;
    }

    public void setDayLimiteAmount(String dayLimiteAmount) {
        this.dayLimiteAmount = dayLimiteAmount;
    }

    public String getMonthLimiteAmount() {
        return monthLimiteAmount;
    }

    public void setMonthLimiteAmount(String monthLimiteAmount) {
        this.monthLimiteAmount = monthLimiteAmount;
    }

    public String getBizProductCode() {
        return bizProductCode;
    }

    public void setBizProductCode(String bizProductCode) {
        this.bizProductCode = bizProductCode;
    }

    public String getBizProductName() {
        return bizProductName;
    }

    public void setBizProductName(String bizProductName) {
        this.bizProductName = bizProductName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String cardType) {
        CardType = cardType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
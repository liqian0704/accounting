package entity.merchant;

import java.io.Serializable;
import java.util.Date;

public class InviteCodeMapping implements Serializable {
    private static final long serialVersionUID = -8523768363322273561L;

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 邀请码
     */
    private String inviteCode;
    /**
     * 运营商编号
     */
    private String parentMerchantNo;
    /**
     * 创建时间
     */
    private Date createDate;

    private String descripe="";

    private String remark="";

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDescripe() {
        return descripe;
    }

    public void setDescripe(String descripe) {
        this.descripe = descripe;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

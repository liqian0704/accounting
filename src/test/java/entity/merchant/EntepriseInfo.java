/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package entity.merchant;


import com.miitang.facade.merchant.enums.merchant.CompanyType;
import com.miitang.facade.merchant.enums.merchant.IdCardType;
import entity.BaseEntity;

import java.util.Date;

/**
 * @ClassName: EntepriseInfo
 * @Description: EntepriseInfo 企业信息
 * @author: dongxulu
 * @date: 17/12/21 下午2:23
 * @version: 1.0.0
 */
public class EntepriseInfo extends BaseEntity {

    /**
     *商编号
     */
    private String merchantNo="";
    /**
     *客户编号
     */
    private String customerNo="";
    /**
     *企业名称
     */
    private String enterpriseName="";
    /**
     * 企业类型 默认小微
     */
    private CompanyType enterpriseType= CompanyType.MICRO;
    /**
     * 邮箱
     */
    private String email="";
    /**
     * 业务经营地区
     */
    private String bizDistrict="";
    /**
     *是否三证合一  企业专用 0非三证合一,1三证合一
     */
    private int unionCertuflcate=0;
    /**
     * 信用代码编号
     */
    private String creditCode="";
    /**
     * 信用代码生效时间
     */
    private String creditCodeEffectiveStart="";
    /**
     *信用代码失效时间
     */
    private String creditCodeEffectiveEnd="";
    /**
     *信用代码图片存储地址
     */
    private String creditCodeImg="";
    /**
     *组织结构代码
     */
    private String orgNo="";
    /**
     * 组织结构代码图片
     */
    private String orgnoImg="";
    /**
     * 组织机构代码生效时间
     */
    private String orgnoEffectiveStart="";
    /**
     * 组织机构代码失效时间
     */
    private String orgnoEffectiveEnd="";
    /**
     * 税务登记证
     */
    private String taxRegistno="";
    /**
     *税务登记证图片地址
     */
    private String taxRegistnoImg="";
    /**
     *法人姓名
     */
    private String legalName="";
    /**
     * 法人证件类型
     */
    private IdCardType legalIdcardType= IdCardType.ID;
    /**
     * 法人证件号
     */
    private String legalIdcardNo="";
    /**
     * 法人证件生效时间
     */
    private String legalIdcardEffectiveStart="";
    /**
     * 法人证件失效时间
     */
    private String legalIdcardEffectiveEnd="";
    /**
     * 业务联系人呢
     */
    private String bizContact="";
    /**
     *业务联系人电话
     */
    private String bizContactPhone="";
    /**
     * 业务经营范围
     */
    private String bizScope="";
    /**
     *社交账号
     */
    private String socialAccount="";
    /**
     * 可开发票类型
     */
    private String invoiceTypes="";
    /**
     * 开户请求流水号
     */
    private String opRquestno="";
    /**
     *创建时间
     */
    private Date create_date;
    /**
     *修改时间
     */
    private Date update_date;
    /**
     *备注
     */
    private String remark="";
    /**
     * 营业执照号
     */
    private String businessLicenseNo="";
    /**
     * 营业执照生效时间
     */
    private String businessLicenseEffectiveStart="";
    /**
     * 营业执照失效时间
     */
    private String businessLicenseEffectiveEnd="";
    /**
     * 营业执照图片
     */
    private String businessLicenseImg="";
    /**
     * 开户许可证号
     */
    private String openingLicenseNo="";
    /**
     * 开户许可证生效时间
     */
    private String openingLicenseEffectiveStart="";
    /**
     * 开户许可证失效时间
     */
    private String openingLicenseEffectiveEnd="";
    /**
     * 开户许可证图片
     */
    private String openingLicenseImg="";

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public int getUnionCertuflcate() {
        return unionCertuflcate;
    }

    public void setUnionCertuflcate(int unionCertuflcate) {
        this.unionCertuflcate = unionCertuflcate;
    }

    public String getCreditCodeEffectiveStart() {
        return creditCodeEffectiveStart;
    }

    public void setCreditCodeEffectiveStart(String creditCodeEffectiveStart) {
        this.creditCodeEffectiveStart = creditCodeEffectiveStart;
    }

    public String getCreditCodeEffectiveEnd() {
        return creditCodeEffectiveEnd;
    }

    public void setCreditCodeEffectiveEnd(String creditCodeEffectiveEnd) {
        this.creditCodeEffectiveEnd = creditCodeEffectiveEnd;
    }

    public String getOrgnoEffectiveStart() {
        return orgnoEffectiveStart;
    }

    public void setOrgnoEffectiveStart(String orgnoEffectiveStart) {
        this.orgnoEffectiveStart = orgnoEffectiveStart;
    }

    public String getOrgnoEffectiveEnd() {
        return orgnoEffectiveEnd;
    }

    public void setOrgnoEffectiveEnd(String orgnoEffectiveEnd) {
        this.orgnoEffectiveEnd = orgnoEffectiveEnd;
    }

    public String getLegalIdcardEffectiveStart() {
        return legalIdcardEffectiveStart;
    }

    public void setLegalIdcardEffectiveStart(String legalIdcardEffectiveStart) {
        this.legalIdcardEffectiveStart = legalIdcardEffectiveStart;
    }

    public String getLegalIdcardEffectiveEnd() {
        return legalIdcardEffectiveEnd;
    }

    public void setLegalIdcardEffectiveEnd(String legalIdcardEffectiveEnd) {
        this.legalIdcardEffectiveEnd = legalIdcardEffectiveEnd;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public CompanyType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(CompanyType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBizDistrict() {
        return bizDistrict;
    }

    public void setBizDistrict(String bizDistrict) {
        this.bizDistrict = bizDistrict;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }


    public String getCreditCodeImg() {
        return creditCodeImg;
    }

    public void setCreditCodeImg(String creditCodeImg) {
        this.creditCodeImg = creditCodeImg;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getOrgnoImg() {
        return orgnoImg;
    }

    public void setOrgnoImg(String orgnoImg) {
        this.orgnoImg = orgnoImg;
    }


    public String getTaxRegistno() {
        return taxRegistno;
    }

    public void setTaxRegistno(String taxRegistno) {
        this.taxRegistno = taxRegistno;
    }

    public String getTaxRegistnoImg() {
        return taxRegistnoImg;
    }

    public void setTaxRegistnoImg(String taxRegistnoImg) {
        this.taxRegistnoImg = taxRegistnoImg;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }


    public IdCardType getLegalIdcardType() {
        return legalIdcardType;
    }


    public void setLegalIdcardType(IdCardType legalIdcardType) {
        this.legalIdcardType = legalIdcardType;
    }

    public String getLegalIdcardNo() {
        return legalIdcardNo;
    }

    public void setLegalIdcardNo(String legalIdcardNo) {
        this.legalIdcardNo = legalIdcardNo;
    }


    public String getBizContact() {
        return bizContact;
    }

    public void setBizContact(String bizContact) {
        this.bizContact = bizContact;
    }

    public String getBizContactPhone() {
        return bizContactPhone;
    }

    public void setBizContactPhone(String bizContactPhone) {
        this.bizContactPhone = bizContactPhone;
    }

    public String getBizScope() {
        return bizScope;
    }

    public void setBizScope(String bizScope) {
        this.bizScope = bizScope;
    }

    public String getSocialAccount() {
        return socialAccount;
    }

    public void setSocialAccount(String socialAccount) {
        this.socialAccount = socialAccount;
    }

    public String getInvoiceTypes() {
        return invoiceTypes;
    }

    public void setInvoiceTypes(String invoiceTypes) {
        this.invoiceTypes = invoiceTypes;
    }

    public String getOpRquestno() {
        return opRquestno;
    }

    public void setOpRquestno(String opRquestno) {
        this.opRquestno = opRquestno;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBusinessLicenseNo() {
        return businessLicenseNo;
    }

    public void setBusinessLicenseNo(String businessLicenseNo) {
        this.businessLicenseNo = businessLicenseNo;
    }

    public String getBusinessLicenseEffectiveStart() {
        return businessLicenseEffectiveStart;
    }

    public void setBusinessLicenseEffectiveStart(String businessLicenseEffectiveStart) {
        this.businessLicenseEffectiveStart = businessLicenseEffectiveStart;
    }

    public String getBusinessLicenseEffectiveEnd() {
        return businessLicenseEffectiveEnd;
    }

    public void setBusinessLicenseEffectiveEnd(String businessLicenseEffectiveEnd) {
        this.businessLicenseEffectiveEnd = businessLicenseEffectiveEnd;
    }

    public String getBusinessLicenseImg() {
        return businessLicenseImg;
    }

    public void setBusinessLicenseImg(String businessLicenseImg) {
        this.businessLicenseImg = businessLicenseImg;
    }

    public String getOpeningLicenseNo() {
        return openingLicenseNo;
    }

    public void setOpeningLicenseNo(String openingLicenseNo) {
        this.openingLicenseNo = openingLicenseNo;
    }

    public String getOpeningLicenseEffectiveStart() {
        return openingLicenseEffectiveStart;
    }

    public void setOpeningLicenseEffectiveStart(String openingLicenseEffectiveStart) {
        this.openingLicenseEffectiveStart = openingLicenseEffectiveStart;
    }

    public String getOpeningLicenseEffectiveEnd() {
        return openingLicenseEffectiveEnd;
    }

    public void setOpeningLicenseEffectiveEnd(String openingLicenseEffectiveEnd) {
        this.openingLicenseEffectiveEnd = openingLicenseEffectiveEnd;
    }

    public String getOpeningLicenseImg() {
        return openingLicenseImg;
    }

    public void setOpeningLicenseImg(String openingLicenseImg) {
        this.openingLicenseImg = openingLicenseImg;
    }
}
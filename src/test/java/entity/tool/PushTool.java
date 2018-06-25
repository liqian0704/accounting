package entity.tool;

import java.util.Date;
import java.util.List;

/**
 * Created by yp-tc-2646 on 18/2/7.
 */
public class PushTool {
    private Long id;
    private String parentMerchantNo;
    private String msgBusinessType;
    private String messageNo;
    private String pushId;
    private PushMsgTypeEnum pushType;
    private String receiver;
    private PushPlatformEnum platformType;
    private List<String> tags;
    private String title;
    private String hint;
    private String message;
    private PushStatusEnum status;
    private Integer sendTimes;
    private String supplier;
    private Date sendTime;
    private Date createDate;
    private Date updateDate;
    private String source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getMsgBusinessType() {
        return msgBusinessType;
    }

    public void setMsgBusinessType(String msgBusinessType) {
        this.msgBusinessType = msgBusinessType;
    }

    public String getMessageNo() {
        return messageNo;
    }

    public void setMessageNo(String messageNo) {
        this.messageNo = messageNo;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public PushMsgTypeEnum getPushType() {
        return pushType;
    }

    public void setPushType(PushMsgTypeEnum pushType) {
        this.pushType = pushType;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public PushPlatformEnum getPlatformType() {
        return platformType;
    }

    public void setPlatformType(PushPlatformEnum platformType) {
        this.platformType = platformType;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PushStatusEnum getStatus() {
        return status;
    }

    public void setStatus(PushStatusEnum status) {
        this.status = status;
    }

    public Integer getSendTimes() {
        return sendTimes;
    }

    public void setSendTimes(Integer sendTimes) {
        this.sendTimes = sendTimes;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


}

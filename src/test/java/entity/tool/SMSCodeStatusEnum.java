package entity.tool;

/**
 * Created by hubian on 20/12/2017.
 */
public enum SMSCodeStatusEnum {
    INIT(Integer.valueOf(0), "可用"),
    SEND(Integer.valueOf(1), "已使用"),
    TIMEOUT(Integer.valueOf(2), "已超时");

    private Integer id;
    private String desc;

    private SMSCodeStatusEnum(Integer id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public Integer getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }
}

package entity.tool;

/**
 * Created by hubian on 28/12/2017.
 */
public enum PushMsgTypeEnum {
    ALIAS(1,"按alias发送"),PALTFORM(2,"按平台发送"),TAGS(3,"按tag发送");
    private Integer id;
    private String desc;
    private PushMsgTypeEnum(Integer id, String desc){this.id=id;this.desc=desc;}
    public Integer getId(){return id;}
    public String getDesc(){return desc;}
}

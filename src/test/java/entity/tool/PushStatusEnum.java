package entity.tool;

/**
 * Description: 消息推送——推送状态
 * Author: jiawen.huang
 * Date: 16/1/29
 * Time: 16:39
 * Version: 1.0
 * Copyright © 2016 YeePay.com All rights reserved.
 */
public enum PushStatusEnum {

	NOT_SEND(0, "未发布"),

	SENDED(1, "已发布"),

	DELETED(2, "作废");

	private Integer id;
	private String desc;
	private PushStatusEnum(Integer id, String desc){this.id=id;this.desc=desc;}
	public Integer getId(){return id;}
	public String getDesc(){return desc;}


}

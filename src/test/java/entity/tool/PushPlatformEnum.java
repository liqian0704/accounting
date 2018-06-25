package entity.tool;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: app平台类型(消息发送时使用，版本管理请用VersionPlatform)
 * Author: jiawen.huang
 * Date: 16/10/30
 * Time: 17:14
 * Version: 1.0
 * Copyright © 2016 YeePay.com All rights reserved.
 */
public enum PushPlatformEnum {

	ALL("ALL", "全平台",1),
	ANDROID("ANDROID", "安卓",2),
	IOS("IOS", "苹果",3);

	private static final Map<String, PushPlatformEnum> VALUE_MAP = new HashMap<String, PushPlatformEnum>();
	private Integer id;
	private String value;
	private String displayName;

	PushPlatformEnum(String value, String displayName, int id) {
		this.value = value;
		this.displayName = displayName;
		this.id=id;
	}

	public static PushPlatformEnum parse(String value) {
		return VALUE_MAP.get(value);
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public static Map<String, PushPlatformEnum> getValueMap() {
		return VALUE_MAP;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

package facade.merchant.exception;

/**
 * Description: 错误码
 * Author: jiawen.huang
 * Date: 16/9/14
 * Time: 18:27
 * Version: 1.0
 * Copyright © 2016 YeePay.com All rights reserved.
 */
public class ErrorCode {

	public static final String SUCCESS_CODE = "MER00000";
	/**
	 * 对外错误码
	 */
	//系统异常
	public static final String SYSTEM_EXCEPTION = "MER10001";

	//参数异常
	public static final String PARAM_EXCEPTION = "MER10002";

	//远程服务连接异常
	public static final String HESSIAN_CONNECT_EXCEPTION = "MER10003";

	//YOP异常
	public static final String YOP_EXCEPTION = "MER10004";

	//更新失败
	public static final String UPDATE_FAILED = "MER20044";


	//主键冲突异常（不合理异常码，即将去除）
	public static final String DUPLICATE_KEY_EXCEPTION = "MER20046";

	//查询失败
	public static final String SELECT_EXCEPTION = "MER20047";

	//异步推送异常
	public static final String PUSH_TASK_EXCEPTION = "MER20047";
	
	//开户记录已存在
	public static final String ACCOUNT_OPEN_EXIST_EXCEPTION = "MER20048";

	//用户创建异常
	public static final String USER_CREATE_EXCEPTION = "MER10012";

	//用户不存在
	public static final String USER_NOT_EXIST = "MER10013";

	//用户已注册
	public static final String USER_HAS_REGISTER = "MER10014";

	//用户验证验证码未通过
	public static final String USER_UN_REGISTER = "MER10015";

	//验证验证码时用户不存在，也就是说根本没发注册验证码
	public static final String USER_UNSEND_SMS = "MER10016";

	//短信发送频率超限
	public static final String SMS_SEND_LIMIT = "MER10017";

	//用户密码或用户名错误
	public static final String USER_LOGIN_PWD_ERROR = "MER10018";

	//短信验证失败
	public static final String SMS_VERIFY_ERROR = "MER10019";

	//找回密码次数超限
	public static final String FIND_PWD_LIMIT = "MER10020";

	//验证次数超限
	public static final String VERIFY_SMS_LIMIT = "MER10021";

	//登陆密码错误次数超限
	public static final String LOGIN_LIMIT = "MER10022";

	//结算信息不存在
	public static final String SETTLE_NOT_EXIST = "MER10022";

	//远程结算信息查询异常
	public static final String SETTLE_REMOTE_EXCEPTION = "MER10022";

	//同一用户不能重复发起开户申请
	public static final String USER_ACCOUNT_OPEN_REPEAT = "MER10023";

	//开户单不存在
	public static final String ACCOUNT_NOT_EXIST = "MER10024";

	//开户状态未完成不能进行某操作
	public static final String ACCOUNT_STATUS_DENY = "MER10040";

	//验证码过期or不存在
	public static final String SMS_EXPIRED_OR_UNFIND = "MER10041";

	//时间参数异常
	public static final String DATE_PARAM_EXCEPTION = "MER10042";

	//台签牌已经被注册
	public static final String ACCOUNT_SIGNEDPAPER_REGISTER = "MER10043";

	//刷新tk未知异常
	public static final String REFRESH_TOKEN_EXCEPTION = "MER10044";

	//tk失效无法刷新
	public static final String REFRESH_TOKEN_INVALID = "MER10045";

	//收款码非法
	public static final String PASSIVE_PAY_SOURCE_ILLEGAL = "MER10046";

	//设备查询异常
	public static final String DEVICE_QUERY_EXCEPTION = "MER10047";

	//现金贷业务系统未知异常
	public static final String CFL_UNKNOW_EXCEPTION = "MER10048";

	//该商户不能开通现金贷业务
	public static final String COMMIT_CREDIT_REQ_DENY = "MER10049";

	//设备绑定关系不存在
	public static final String DEVICE_RELATION_EXCEPTION = "MER10050";

	//S0当前记录存在，key冲突
	public static final String S0_RECORD_EXIST = "MER10051";

	//s0记录不存在
	public static final String S0_RECORD_NOT_EXIST = "MER10052";

	//开通日结通异常
	public static final String RJT_OPEN_EXCEPTION = "MER10053";

	//发起日结通请求出现异常
	public static final String RJT_UNKNOW_EXCEPTION = "MER10054";

	//代理商未开通秒到，请联系代理商
	public static final String AGENT_S0_STATUS_EXCEPTION = "MER10055";

	//该产品码不存在
	public static final String PRODUCT_CODE_EXCEPTION = "MER10056";

	//邀请方式不支持开通该业务
	public static final String INVITE_TYPE_ILLEGAL = "MER10057";

	//用户状态不能开通秒到
	public static final String USER_STATUS_ILLEGAL = "MER10058";

	//不支持该结算卡
	public static final String SETTLE_CARD_INVALID = "MER10059";

	//T1结算金额未大于1000
	public static final String S0_SETTLE_AMOUNT_INVALID = "MER10060";

	//没有绑卡记录
	public static final String BIND_CARD_NOT_EXSIT = "MER10061";

	//非法提交
	public static final String COMMIT_IMG_ILLEGAL = "MER10062";

	//商户类型不支持开通该业务
	public static final String COMPANY_TYPE_ILLEGAL = "MER10063";

	//设置RJT费率失败
	public static final String MODIFY_RJT_FEE_DENY = "MER10064";

	//用户操作记录已存在
	public static final String OPERATE_RECORD_EXIST = "MER10065";

	//用户操作记录不存在
	public static final String OPERATE_RECORD_NOT_EXIST = "MER10066";

	//导出报表异常
	public static final String GENERATE_REPORT_EXCEPTION = "MER10067";

	//银行卡号不合法
	public static final String BANK_NO_ILLEGAL = "MER10068";

	//银行子系统异常
	public static final String BANK_TRADE_UNKNOW_EXCEPTION = "MER10069";

	//OCR系統异常
	public static final String OCR_UNKNOW_EXCEPTION = "MER10070";

	//OCR识别失败,请重新拍照
	public static final String OCR_RECOGNIZE_FAIL = "MER10071";

	//商户系统异常
	public static final String ALLIANCE_UNKNOW_EXCEPTION = "MER10072";

	//邀请码状态异常
	public static final String ALLIANCE_INVITE_CODE_INACTIVE = "MER10073";

	//开户已完成,不能进行该操作
	public static final String COMMIT_STATUS_ILLEGAL = "MER10074";

	//状态有误,不能提交入网单
	public static final String ALLIANCE_OPEN_ACCOUNT_DENY = "MER10075";

	//资质信息不足
	public static final String ALLIANCE_ATTACH_ILLEGAL = "MER10076";

	//分组权限拒绝
	public static final String USER_PERMISSION_DENY = "MER10077";

	//提交类型有误
	public static final String COMMIT_ATTACH_ILLEGAL = "MER10078";

	//登录密码有误
	public static final String USER_PWD_ERROR = "MER10079";

	//登录密码修改原密码验证超过限制
	public static final String LOGIN_PWD_LIMIT = "MER10080";

	//单笔交易金额超限
	public static final String OVER_ORDER_LIMIT = "MER10081";

	//不能使用s0服务
	public static final String S0_BALANCE_DENY = "MER10082";

	//功能重复
	public static final String FUNCTION_REPEAT = "";

	//功能不存在
	public static final String FUNCTION_NOT_EXIST = "";

	//功能禁用
	public static final String FUNCTION_NOT_AVAILABLE = "";

	//角色不存在
	public static final String ROLE_NOT_EXIST = "";

	//上级不存在
	public static final String ROLE_PARENT_NOT_EXIST = "";

	//角色重复
	public static final String ROLE_REPEAT = "";

	//角色功能关系重复
	public static final String ROLE_FUNC_REPEAT = "";

	//角色功能关系不存在
	public static final String ROLE_FUNC_NOT_EXIST = "";

	//不支持该卡种
	public static final String CARD_TYPE_IS_ILLEGAL = "MER10083";

	//未知卡信息
	public static final String UNKNOWN_CARD_INFO = "MER10084";

	//费率信息不存在
	public static final String FEE_INFO_NOT_EXIST = "MER10085";

	//计费系统未知异常
	public static final String CAL_FEE_UNKNOW_EXCEPTION = "MER10086";

	//风控系统未知异常
	public static final String RISK_CONTROL_UNKNOW_EXCEPTION = "MER10087";

	//分享链接不可用
	public static final String SHARE_PERMISSION_DENY = "MER10088";

	//数据跑丢了，过一会再来吧
	public static final String CAL_AND_LIMIT_EXCEPTION = "MER10089";

	//定位信息不存在
	public static final String LBS_INFO_NOT_EXIST = "MER10090";

	//信息审核中，暂时无法使用此功能
	public static final String ACCOUNT_STATUS_NOT_AVAILABLE = "MER10091";
	//订单异常
	public static final String ORDER_EXCEPTION = "MER10092";
	//不支持的企业类型
	public static final String COMPANY_TYPE_EXCEPTION = "MER10093";
	//op信息写入异常
	public static final String INSERT_OPINF_EXCEPTION = "MER10094";
	//企业信息写入异常
	public static final String INSERT_ENTEPRISE_EXCEPTION = "MER10095";
	//企业信息不存在
	public static final String NO_ENTEPRISE_EXCEPTION = "MER10096";
	//开户信息不存在
	public static final String NO_OPINFO_EXCEPTION = "MER10097";
	//文件转换异常
	public static final String IMG_ATTRIBUTE_ILLEGAL = "MER10098";
	//创建客户异常
	public static final String CREATE_CUS_ERROR = "MER10099";
	//运营商不可为空
	public static final String PARENT_NULL_EXCEPTION = "MER10100";
	//银行卡鉴权异常
	public static final String AUTH_BANKCARD_ERROR = "MER10101";
	//商编对应的商户不存在
	public static final String MERCHANT_NULL_BY_MERCHANT_NO = "MER10102";
    //生成序列异常
    public static final String GEN_UNIQUE_ERROR = "MER10103";
	//生成商编序列异常
    public static final String GEN_MERSEQ_ERROR = "MER10104";
	//生成邀请码序列异常
    public static final String GEN_INVITE_ERROR = "MER10105";

	//插入失败
	public static final String CREATE_FAILED = "MER10106";
	//运营商未入网
	public static final String NO_YEEPAY_MERCHANT_RECORED = "MER10107";
	//商户已入网
	public static final String MERCHANT_EXSIST = "MER10108";
	//认证手机号异常
	public static final String AUTH_PHONE_ERROR = "MER10109";
    //查询会员权益异常
	public static final String QUERY_MEMBER_EXCEPTION = "MER10110";
	//邀请码映射不存在
	public static final String NO_INVITECODE_EXCEPTION = "MER10111";
	//推送hmac异常
	public static final String PUSH_ACCOUNTING_HMAC_ERROR = "MER10112";
	//产品映射不存在
	public static final String PRODUCT_MAPPING_ERROR = "MER10113";
	//开户已完成
	public static final String OPINFO_COMPLETE_ERROR = "MER10114";
	//基本信息已上传
	public static final String BASICINFO_EXSIST_ERROR = "MER10115";
	//查询银行列表失败
	public static final String QUERY_BANKLIST_ERROR = "MER10116";
	//绑定卡失败
	public static final String BIND_BANKCARD_ERROR = "MER10117";
	//日期参数不符合校验规则
	public static final String DATE_VERIFY_ILLEGAL = "MER10118";
    //商户状态不可用
    public static final String MERCHANT_STATUS_ILLEGAL = "MER10119";
    //我只查运营商和子商户
    public static final String MERCHANT_TYPE_ILLEGAL = "MER10120";
    //运营商不存在
    public static final String PARENT_MERCHANT_IS_NOT_EXIST = "MER10121";
    //产品信息不存在
    public static final String NO_PRODUCT_INFO = "MER10122";
    //运营商未开通此产品
    public static final String NO_PARENT_PRODUCT = "MER10123";
	//费率信息填写有误
	public static final String FEE_INFO_IS_ILLEGAL = "MER10124";
	//商户关系有误
	public static final String MERCHANT_SHIP_IS_ILLEGAL = "MER10125";
	//没有可更新的记录
	public static final String UPDATE_FEE_DETAIL_NOT_EXIST = "MER10126";
	//结算信息已完成
	public static final String SETTLEDINFO_EXSIST_ERROR = "MER10127";
	//设置会员权益异常
	public static final String CREATE_MEMBERRECORD_ERROR = "MER10128";


	//通知系统异常
	public static final String NOTIFY_UNKNOWN_EXCEPTION = "MER20001";

	//通知系统发送频率超限
	public static final String NOTIFY_FREQUENCY_LIMIT = "MER20002";

	//通知系统接收人有误
	public static final String NOTIFY_INVALID_RECIPIENT = "MER20003";

	//创建消息索引冲突
	public static final String MSG_CREATE_REPEAT = "MER20004";

	//消息不存在或者因为状态而更新失败
	public static final String MSG_UPDATE_STATUS_ERROR = "MER20005";

	//向用户推送连接失败
	public static final String JPUSH_SYS_CONNECT_ERROR = "MER20006";

	//推送请求异常
	public static final String JPUSH_SYS_API_ERROR = "MER20007";

	//没有满足条件（会员号）的推送目标
	public static final String JPUSH_USER_UNFIND = "MER20008";

	//消息体超长，Android4000字节，iOS2000字节
	public static final String JPUSH_STRUCTURE_OVER_LIMIT = "MER20009";

	//消息不存在
	public static final String MSG_NOT_EXIST = "MER20010";

	//极光未知异常
	public static final String JPUSH_SYS_UNKNOW_ERROR = "MER20011";

	//服务器端内部逻辑错误，稍后重试
	public static final String JPUSH_INNER_EXCEPTION = "MER20012";

	//参数值不合法
	public static final String JPUSH_ILLEGAL_ARGUMENT = "MER20013";

	//版本已存在
	public static final String APP_VERSION_EXIST = "MER20014";

	//版本不存在
	public static final String APP_VERSION_NO_EXIST = "MER20015";

	//当前为最新版，无需更新
	public static final String APP_DONT_NEED_UPDATE = "MER20016";

	//版本编码非法，新版本的版本编码不能比老版本低
	public static final String APP_VERSION_CODE_INVALID = "MER20017";

	//该开户单未关联用户，无法推送支付消息
	public static final String NULL_ACCOUNT_TO_PUSH = "MER20018";

	//找不到要推送的老板
	public static final String NULL_USER_TO_PUSH = "MER20019";

	//用户不是扫台签入网的，不需要绑定台签
	public static final String QR_PAY_BOARD_BIND_DENY = "MER20020";

	//入网响应参数转换异常
	public static final String ACCOUNT_CONVERT_DTO_EXCEP = "MER20021";

	//单子状态没提交，不应该接收回调
	public static final String GET_CALLBACK_DENY = "MER20022";

	//上传文件找不到
	public static final String UPLOAD_FILE_NOTFOUND_ERROR = "MER20025";

	//ftp组件报错
	public static final String UPLOAD_FILE_FTP_EXCEPTION = "MER20026";

	//本地文件加载异常
	public static final String RESOURCE_NOT_FOUND_EXCEPTION = "MER20027";

	//替换plist配置时异常
	public static final String REPLACE_PLIST_EXCEPTION = "MER20028";

	//绑定业务员
	public static final String AGENT_BIND_BIZMAN_EXCEPTION = "MER20029";

	//OP表单注册商户失败
	public static final String OP_REGISTER_MERCHANT_FAIL = "MER20030";

	//手机号不合法
	public static final String PHONE_ILLEGAL_ARGUMENT = "MER20031";

	//用户开户未完成不应该收到交易信息
	public static final String ACCOUNT_INVALID_TO_PUSH = "MER20032";

	//该商户未开通来客业务
	public static final String MERCHANT_NOT_EXIST_IN_YMF = "MER20033";

	//该商编已注册过来客，不能重复注册
	public static final String MERCHANT_IS_EXIST = "MER20034";

	//入网请求号不存在
	public static final String OPEN_ID_NOT_EXIST = "MER20035";

	//类型不存在
	public static final String TYPE_NOT_EXIST = "MER20036";

	//查询绑卡关系参数异常
	public static final String NC_MEMBER_PARAM_ERROR = "MER20037";

	//一键用户中心系统异常
	public static final String NC_MEBER_UNKNOW_EXCEPTION = "MER20038";

	//找不到开户单或状态有误
	public static final String UPDATE_ALLIANCE_ACCOUNT_DENY = "20039";

	//信息不能为空
	public static final String REMARK_IS_ILLEGAL = "20040";

	//账户类型有误
	public static final String ACCOUNT_TYPE_ILLEGAL = "20041";

	//商编不存在
	public static final String MERCHANT_IS_NOT_EXIST = "MER20042";

	//LBS请求异常
	public static final String LBS_REQ_EXCEPTION = "MER20043";

	//订单信息不存在
	public static final String ORDER_UNKNOW_EXCEPTION = "MER20045";
	/**
	 * 秘钥信息不存在
	 */
	public static final String USERKEY_NOT_EXIST_EXCEPTION = "MER20046";
	/**
	 * MD5加密异常
     */
	public static final String MD5UTILS_EXCEPTION = "MER20047";
	/**
	 * 查询易宝二代秘钥异常
	 */
	public static final String QUERY_YEEPAY_KEY_EXCEPTION = "MER20049";
	/**
	 * Json转码异常
	 */
	public static final String QUERY_YEEPAY_GSONFORMAT_EXCEPTION = "MER20050";
	/**
	 * 查询二维码信息异常
	 */
	public static final String QUERY_QRCODEINFO_EXCEPTION = "MER20051";
	/**
	 *二维码未绑定商户
	 */
	public static final String QRCODE_NOBIND_EXCEPTION = "MER20052";

	//登陆鉴权回参空
	public static final String GENERATE_TOKEN_NULL = "MER20053";

	//登陆鉴权失败
	public static final String GENERATE_TOKEN_EXCEPTION = "MER20054";

	//OAUTH注销失败
	public static final String REVOKE_TOKEN_EXCEPTION = "MER20055";

	//参数转换异常
	public static final String CONVERT_DTO_EXCEPTION = "MER20056";

	//短信发送失败
	public static final String SMS_SEND_EXCEPTION = "MER20057";

	//短信验证失败
	public static final String SMS_VERIFY_EXCEPTION = "MER20058";

	//通知系统异常
	public static final String NOTIFY_SYS_EXCEPTION = "MER20059";

	//注册成功
	public static final String USER_REGISTER_SUCCESS = "MER20060";

    //费率模板不存在
    public static final String FEE_TEMPLATE_NOT_EXIST = "MER20061";

    //费率记录已存在
    public static final String FEE_DETAIL_IS_EXIST = "MER20062";

	//费率记录不存在
	public static final String FEE_DETAIL_IS_NOT_EXIST = "MER20063";

	//费率参数有误
	public static final String FEE_DETAIL_PARAM_ERROR = "MER20064";

    //费率信息不存在
    public static final String FEE_DETAIL_IS_NULL = "MER20065";

	//邀请码不存在
	public static final String INVITE_CODE_NOT_EXIST = "MER20066";

    //LBS未知异常
    public static final String LBS_UNKNOW_EXCEPTION = "MER20067";

    //查询编码异常
    public static final String MERCHANT_UNKNOW_EXCEPTION = "MER20068";

	//登录类型有误
	public static final String LOGIN_TYPE_EXCEPTION = "MER20069";

	//银行卡认证失败
	public static final String AUTH_BANKCARD_FAIL = "MER20070";

	//文件上传异常
	public static final String UPLOAD_FILE_EXCEPTION = "MER20071";

    //认证手机号失败
    public static final String AUTH_PHONE_FAIL = "MER20072";
	//商户编号不能为空
    public static final String MERCHANT_NO_NULL = "MER20073";

    //产品费率映射不存在
    public static final String PRODUCT_FEE_NOT_EXIST = "MER20074";
	//上传文件,名称不能为空
    public static final String FILE_NAME_NULL = "MER20075";
	//计费项不能为空
    public static final String FEE_BIZ_NULL = "MER20076";
	//计费产品不能为空
    public static final String FEE_PRODUCT_NULL = "MER20077";
	//费率集合不能为空
    public static final String FEEINFO_LIST_NULL = "MER20078";
	//业务方编码不能为空
    public static final String BIZ_SYSTEM_NO_NULL = "MER20079";
	//结算方式不能为空
    public static final String SEETLE_TYPE_NULL = "MER20080";
	//计费产品集合不能为空
    public static final String BIZ_PRODUCT_LIST_NULL = "MER20081";
	//业务请求号不能为空
    public static final String BIZ_REQUEST_NO_NULL = "MER20082";
	//法人姓名不能为空
    public static final String LEGAL_NAME_NULL = "MER20083";
	//证件类型不能为空
    public static final String ID_CARD_TYPE_NULL = "MER20084";
	//证件号码不能为空
    public static final String ID_CARD_NO_NULL = "MER20085";
	//手机号不能为空
    public static final String PHONE_NUMBER_NULL = "MER20086";
	//结算银行卡号不能为空
    public static final String SETTLE_BANK_ACCOUNT_NO_NULL = "MER20087";
	//推广员编号不能为空
    public static final String PROMOTE_MERCHANT_NO_NULL = "MER20088";
	//邀请码不能为空
    public static final String INVITE_CODE_NULL = "MER20089";
	//外部父商编(三方)不能为空
    public static final String OUT_PARENT_MERCHANT_NO_NULL = "MER20090";
	//外部商编(三方)不能为空
    public static final String OUT_MERCHANT_NO_NULL = "MER20091";
    //token不能为空
    public static final String TOKEN_NOT_NULL = "MER20092";
    //登录名不能为空
    public static final String LOGIN_NAME_NOT_NULL = "MER20093";
    //登录类型不能为空
    public static final String LOGIN_TYPE_NOT_NULL = "MER20094";
    //请求来源不能为空
    public static final String REQUEST_SOURCE_NOT_NULL = "MER20095";
    //纬度不能为空
    public static final String LAT_NOT_NULL = "MER20096";
    //经度不能为空
    public static final String LNG_NOT_NULL = "MER20097";
	//金额不能小于0.01
    public static final String MIN_BIGDECIMAL_EXCEPTION = "MER20098";
	//上传文件不能为空
    public static final String UPLOAD_FILE_NULL = "MER20099";
	//手持身份证照片不能为空
    public static final String HAND_ID_CARD_IMG_NULL = "MER20100";
	//证件背面照片不能为空
    public static final String BACK_ID_CARD_IMG_NULL = "MER20101";
	//证件正面照片不能为空
    public static final String FRONT_ID_CARD_IMG_NULL = "MER20102";
	//商户名称不能为空
    public static final String MERCHANT_NAME_NULL = "MER20103";




	/**
	 * 外部系统错误码
	 */
	//必填参数异常
	public static final String MERCHANT_CENTER_PARAM_ERROR = "MER30042";

	//参数验证失败
	public static final String MERCHANT_CENTER_PARAM_INVALID = "MER30043";

	//用户注册时会员中心异常
	public static final String MEMBER_REGISTER_EXCEPTION = "MER30064";

	//对接系统未知的默认错误码
	public static final String HESSIAN_UNKNOW_EXCEPTION = "MER30999";

	/**
	 * Web 错误
	 */
	//请勿重复提交
	public static final String REPEAT_SUBMIT_EXCEPTION = "MER40001";

	//请求过期，请刷新重试
	public static final String REQUEST_EXPIRD_EXCEPTION = "MER40002";
	
	/**
	 * 权限
	 */
	//token不存在
	public static final String USER_TOKEN_NOT_EXIST = "MER60001";
	
	//token已失效
	public static final String USER_TOKEN_INVALID = "MER60002";
	
}

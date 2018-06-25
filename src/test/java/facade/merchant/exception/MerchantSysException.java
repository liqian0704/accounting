package facade.merchant.exception;

import com.miitang.facade.merchant.exception.SystemErrorCodeTranslator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.UUID;

/**
 * @ClassName: MerchantSysException
 * @Description: MerchantSysException
 * @author: dongxulu
 * @date: 17/12/22 下午3:51
 * @version: 1.0.0
 */
public class MerchantSysException extends RuntimeException {

	private static Log LOGGER = LogFactory.getLog(com.miitang.facade.merchant.exception.MerchantSysException.class);

	private String id;
	private String message;
	private String defineCode;
	private String realClassName;

	public MerchantSysException(String defineCode) {
		this.initId();
		this.defineCode = defineCode;
		this.message = SystemErrorCodeTranslator.getErrorCodeMessage(defineCode);
	}

	public MerchantSysException(String defineCode, Throwable throwable) {
		this.initId();
		this.defineCode = defineCode;
		LOGGER.error("MerchantSysException info:", throwable);
		this.message = SystemErrorCodeTranslator.getErrorCodeMessage(defineCode);
	}

	/**
	 * 透传
	 *
	 * @param defineCode
	 * @param message
	 */
	public MerchantSysException(String defineCode, String message) {
		this.initId();
		this.defineCode = defineCode;
		this.message = message;
	}

	private void initId() {
		this.id = UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
	}

	public String getId() {
		return id;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public String getDefineCode() {
		return defineCode;
	}

	public String getRealClassName() {
		return realClassName;
	}
}

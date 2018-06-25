/**
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package entity;


import com.miitang.common.tools.LoggerUtil;
import facade.merchant.exception.ErrorCode;
import facade.merchant.exception.MerchantSysException;

import java.io.Serializable;

/**
 * 类名称: BaseEntity <br>
 * 类描述: <br>
 * 实体基类 id为策略生成
 * @author: xxxx.xxx
 * @since: 17/12/20 下午4:54
 * @version: 1.0.0
 */
public class BaseEntity implements Serializable,Cloneable {


    /**
     * 按策略生成的id号 DB唯一
     */
     String id;
    /**
     * 乐观锁信息
     */
     int optimistic=0;

    @Override
    public String toString() {

        try {
            return LoggerUtil.argsToString(this.clone());
        } catch (CloneNotSupportedException e) {
            throw new MerchantSysException(ErrorCode.CONVERT_DTO_EXCEPTION,e);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOptimistic() {
        return optimistic;
    }

    public void setOptimistic(int optimistic) {
        this.optimistic = optimistic;
    }
}
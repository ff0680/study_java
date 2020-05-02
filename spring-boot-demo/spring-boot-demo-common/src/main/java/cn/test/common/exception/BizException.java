package cn.test.common.exception;


import cn.test.common.exception.enums.BizExceptionEnum;
import lombok.Data;

@Data
public class BizException extends RuntimeException {

    private static final long serialVersionUID = -6824955838677095326L;

    private final BizExceptionEnum errorCode;

    public BizException(BizExceptionEnum errorCode) {
        this(errorCode, errorCode.getErrorDesc());
    }

    public BizException(BizExceptionEnum errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

}
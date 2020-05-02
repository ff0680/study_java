package cn.test.common.exception.enums;

import lombok.Getter;

/**
 *
 */
public enum BizExceptionEnum {
    /**
     * 000000 --- 成功
     */
    Error_Code_000000("000000", "成功"),
    /**
     * 000001 --- 请求参数非法！
     */
    Error_Code_000001("000001", "请求参数非法！"),
    /**
     * 000002 --- 不支持的操作类型！
     */
    Error_Code_000002("000002", "不支持的操作类型！"),

    /**
     * 999999 --- 未知错误，请稍后再试！
     */
    Error_Code_999999("999999", "未知错误，请稍后再试！");

    @Getter
    String errorCode;
    @Getter
    String errorDesc;

    BizExceptionEnum(String errorCode, String errorDesc) {
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    public static BizExceptionEnum transferByErrorCode(String errorCode) {
        for (BizExceptionEnum element : BizExceptionEnum.values()) {
            if (element.getErrorCode().equalsIgnoreCase(errorCode)) {
                return element;
            }
        }
        return Error_Code_999999;
    }
}

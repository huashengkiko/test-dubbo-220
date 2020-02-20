package kiko.exception.common;

import kiko.constant.BizCode;
import kiko.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_NOT_FOUND)
public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String message) {
        super(message);
    }

}

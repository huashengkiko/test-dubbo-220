package kiko.exception.common;

import kiko.constant.BizCode;
import kiko.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_EXIST_ERROR)
public class DataExistException extends RuntimeException {

    public DataExistException(String message) {
        super(message);
    }

}

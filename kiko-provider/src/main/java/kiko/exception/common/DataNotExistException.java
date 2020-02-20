package kiko.exception.common;

import kiko.constant.BizCode;
import kiko.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_NOT_EXIST_ERROR)
public class DataNotExistException extends RuntimeException {

    public DataNotExistException(String message) {
        super(message);
    }

}

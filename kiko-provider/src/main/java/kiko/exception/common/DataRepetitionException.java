package kiko.exception.common;

import kiko.constant.BizCode;
import kiko.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_REPETITION_ERROR)
public class DataRepetitionException extends RuntimeException {

    public DataRepetitionException(String message) {
        super(message);
    }

}

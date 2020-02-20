package kiko.exception.common;

import kiko.constant.BizCode;
import kiko.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_PERMISSION_ERROR)
public class DataPermissionException extends RuntimeException {

    public DataPermissionException(String message) {
        super(message);
    }

}

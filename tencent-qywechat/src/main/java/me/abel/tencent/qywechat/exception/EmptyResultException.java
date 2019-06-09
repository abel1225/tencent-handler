package me.abel.tencent.qywechat.exception;

/**
 * @description 
 * @author Abel.li
 * @contact abel0130@163.com
 * @version
 */
public class EmptyResultException extends WechatException {


    public EmptyResultException() {
    }

    public EmptyResultException(String message) {
        super(message);
    }

    public EmptyResultException(int code, String message) {
        super(code, message);
    }
}

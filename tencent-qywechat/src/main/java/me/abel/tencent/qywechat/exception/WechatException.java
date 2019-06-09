package me.abel.tencent.qywechat.exception;

public class WechatException extends RuntimeException {

    public WechatException() {
    }

    public WechatException(String message) {
        super(message);
    }

    public WechatException(int code, String message) {
        super(message + "[" + code + "]");
    }
}

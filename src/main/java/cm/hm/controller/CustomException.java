package cm.hm.controller;

/**
 * Created by HUIYE on 2017/12/8.
 */
public class CustomException extends Exception {

    //异常信息
    public String message;

    public CustomException(String message){
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
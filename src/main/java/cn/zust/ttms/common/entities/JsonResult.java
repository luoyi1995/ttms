package cn.zust.ttms.common.entities;

public class JsonResult  {
    public static final int SUCCESS=1;
    public static final int ERROR=0;
    public String message;
    public int state;
    public Object data;

    public String getMessage() {
        return message;
    }

    public int getState() {
        return state;
    }

    public Object getData() {
        return data;
    }

    public JsonResult(String message) {
        state=SUCCESS;
        this.message = message;
    }

    public JsonResult(Object data) {
        state=SUCCESS;
        this.data = data;
    }

    public JsonResult(Throwable exp ){
        state=ERROR;
        this.message=exp.getMessage();
    }
}

package xiaoming.sb1.controller;



public class VodUserResult<T> {
    private T result;

    public T  getResult() {
        return result;
    }

    public VodUserResult  setResult(T  result) {
        this.result = result;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public VodUserResult setMessage(String message) {
        this.message = message;
        return this;
    }

    private String message;


    public <T> T getSuccessResult(T result) {
        return   result;
    }

}

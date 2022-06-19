package ismail.maths;


public class Result {

    private String message;
    private int result=0;

    public Result(int result,String message) {
        this.message = message;
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }



}

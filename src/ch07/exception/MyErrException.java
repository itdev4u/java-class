package ch07.exception;

public class MyErrException extends Exception {
    private String msg;

    public MyErrException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public void printMyMessage() {
        System.out.println(this.msg);
    }
}

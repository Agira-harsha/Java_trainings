package assignment;

public class InvalidGstNumber extends Exception{
    @Override
    public String getMessage() {
        return "please Enter 15 Digits GST Number...";
    }
}

package ExceptionHandlingWays;

public class UnderAgeException extends Exception{
    @Override
    public String getMessage() {
        return "you are to Young. Have a paitence";
    }
}

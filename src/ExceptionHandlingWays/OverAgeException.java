package ExceptionHandlingWays;

public class OverAgeException extends  Exception{
    @Override
    public String getMessage() {
        return "Your to old .can't Apply for DrivingLicence";
    }
}

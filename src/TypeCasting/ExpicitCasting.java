package TypeCasting;

public class ExpicitCasting {
    double doubleValue = 45.67;
    float floatValue = (float) doubleValue;
    long longValue = (long) floatValue;
    int intValue = (int) longValue;
    short shortValue = (short) intValue;
    byte byteValue = (byte) shortValue;

    public void expicitDisplay(){
        System.out.println(" Explicit Casting:");
        System.out.println("DoubleValue: " + doubleValue);
        System.out.println("FloatValue: " + doubleValue);
        System.out.println("LongValue: " + longValue);
        System.out.println("IntValue: " + intValue);
        System.out.println("ShortValue: " + shortValue);
        System.out.println("ByteValue: " + byteValue);
    }
}

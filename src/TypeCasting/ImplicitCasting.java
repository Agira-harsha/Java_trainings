package TypeCasting;

public class ImplicitCasting {
    //implicit casting is nothing but widening casting

    byte byteValue = 123;
    short shortValue = byteValue;
    int intValue = shortValue;
    long longValue = intValue;
    float floatValue = longValue;
    double doubleValue = floatValue;

    public void implicitDisplay(){
        System.out.println("  Implicit Casting:");
        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);
    }

}

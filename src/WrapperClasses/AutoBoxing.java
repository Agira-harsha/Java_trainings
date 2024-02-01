package WrapperClasses;

public class AutoBoxing {
    int primitiveInt = 324;
    Integer wrappedInt = primitiveInt; // Autoboxing
    double primitiveDouble = 455.14;
    Double wrappedDouble = primitiveDouble; // Autoboxing
    char primitiveChar = 'H';
    Character wrappedChar = primitiveChar; // Autoboxing
    boolean primitiveBoolean = false;
    Boolean wrappedBoolean = primitiveBoolean; // Autoboxing

    byte primitiveByte = 12;
    Byte wrappedByte = primitiveByte; // Autoboxing

    short primitiveShort = 3434;
    Short wrappedShort = primitiveShort; // Autoboxing

    long primitiveLong = 4363739L;
    Long wrappedLong = primitiveLong; // Autoboxing

    float primitiveFloat = 53.718f;
    Float wrappedFloat = primitiveFloat; // Autoboxing


    public void autoBoxingDisplay(){
        System.out.println("Autoboxing.....Primitive  to Wrapper Classes:\n ");
        System.out.println("wrappedInt: " + wrappedInt);
        System.out.println("wrappedDouble: " + wrappedDouble);
        System.out.println("wrappedChar: " + wrappedChar);
        System.out.println("wrappedBoolean: " + wrappedBoolean);
        System.out.println("wrappedByte: " + wrappedByte);
        System.out.println("wrappedShort: " + wrappedShort);
        System.out.println("wrappedLong: " + wrappedLong);
        System.out.println("wrappedFloat: " + wrappedFloat +"\n");
    }
}

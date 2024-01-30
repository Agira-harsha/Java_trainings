package WrapperClasses;

import org.omg.CosNaming.IstringHelper;

public class AutoUnboxing {

        Integer wrappedInt = new Integer(34);//boxing
        int primitiveInt=wrappedInt;//auto unboxing

        Float wrappedFloat = new Float(45.4);//boxing
        float primitiveFloat = wrappedFloat; //auto unboxing

        Double wrappedDouble = new Double(435.45);//boxing
        double primitiveDouble=wrappedDouble;//auto unboxing

        Long wrappedLong = new Long(232434);//boxing
        long primitiveLong = wrappedLong;//auto unboxing

        Character wrappedChar = new Character('a');//boxinng
        char primitiveChar = wrappedChar; //auto unboxing

        Boolean wrappedBoolean = new Boolean(true);
        boolean primitiveBoolean = wrappedBoolean;//auto unboxinhg

        Byte wrappedByte =  new Byte((byte) 123);
        byte primitiveByte=wrappedByte;

        Short wrappedShort = new Short((short) 3733);
        short primitiveshort=wrappedShort;

    public void autoUnboxing_display(){
        System.out.println("AutoUnboxing.....Wrapper Classes to Primitive types:\n ");
        System.out.println("primitiveInt: " + primitiveInt);
        System.out.println("primitiveFloat: " + primitiveFloat );
        System.out.println("primitiveChar :" + primitiveChar);
        System.out.println("primitiveBoolean: " + primitiveBoolean);
        System.out.println("primitiveByte : " + primitiveByte);
        System.out.println("primitiveshort:" + primitiveshort);
        System.out.println("primitiveLong : " + primitiveLong);
        System.out.println("primitiveDouble: " + primitiveDouble);
    }
}

/*
 * Author: Sharif Md. Yousuf
 * ID: 22101128
 * 
 * Examples and Usage of the Number class in Java.
 */

public class NumberClass {
    public static void main(String[] args) {
        Integer integer = 246;
        Double doubleValue = 246.128;
        Float floatValue = 128.246f;
        Long longValue = 246128L;
        Short shortValue = 128;
        Byte byteValue = 4;

        System.out.println("Integer: " + integer);
        System.out.println("Double: " + doubleValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Long: " + longValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Byte: " + byteValue);

        System.out.println("ByteValue: " + byteValue.byteValue());
        System.out.println("ShortValue: " + shortValue.shortValue());
        System.out.println("LongValue: " + longValue.longValue());
        System.out.println("FloatValue: " + floatValue.floatValue());
        System.out.println("DoubleValue: " + doubleValue.doubleValue());
        System.out.println("IntValue: " + integer.intValue());

        System.out.println("toString: " + integer.toString());
        System.out.println("equals: " + integer.equals(246));
        System.out.println("compareTo: " + integer.compareTo(246));

        System.out.println("parseInt: " + Integer.parseInt("246"));
        System.out.println("parseDouble: " + Double.parseDouble("246.128"));
        System.out.println("parseLong: " + Long.parseLong("246128"));
        System.out.println("parseShort: " + Short.parseShort("128"));
        System.out.println("parseByte: " + Byte.parseByte("4"));
        System.out.println("parseFloat: " + Float.parseFloat("128.246"));

        System.out.println("Integer valueOf: " + Integer.valueOf("246"));
        System.out.println("Double valueOf: " + Double.valueOf("246.128"));
        System.out.println("Long valueOf: " + Long.valueOf("246128"));
        System.out.println("Short valueOf: " + Short.valueOf("128"));
        System.out.println("Byte valueOf: " + Byte.valueOf("4"));
        System.out.println("Float valueOf: " + Float.valueOf("128.246"));

        System.out.println("abs: " + Math.abs(-246));
        System.out.println("ceil: " + Math.ceil(246.128));
        System.out.println("floor: " + Math.floor(246.128));
        System.out.println("rint: " + Math.rint(246.128));
        System.out.println("round: " + Math.round(246.128));
        System.out.println("max: " + Math.max(246, 128));
        System.out.println("min: " + Math.min(246, 128));
        
        System.out.println("exp: " + Math.exp(1));
        System.out.println("log: " + Math.log(1));
        System.out.println("log10: " + Math.log10(1));
        System.out.println("pow: " + Math.pow(2, 4));
        System.out.println("sqrt: " + Math.sqrt(4));
        System.out.println("sin: " + Math.sin(1));
        System.out.println("cos: " + Math.cos(1));
        System.out.println("tan: " + Math.tan(1));
        System.out.println("asin: " + Math.asin(1));
        System.out.println("acos: " + Math.acos(1));
        System.out.println("atan: " + Math.atan(1));
        System.out.println("atan2: " + Math.atan2(1, 1));

        System.out.println("toDegrees: " + Math.toDegrees(1));
        System.out.println("toRadians: " + Math.toRadians(1));
        
        System.out.println("random: " + Math.random());
    }
}

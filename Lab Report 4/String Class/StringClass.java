/*
 * Author: Sharif Md. Yousuf
 * ID: 22101128
 * 
 * Examples and Usage of the String class in Java.
 * 
 * use these methods: charAt, compareTo, concat, contains, endsWith, equals, equalsIgnoreCase, indexOf, isEmpty, lastIndexOf, length, replace, replaceAll, split, startsWith, substring, toLowerCase, toString, toUpperCase, trim
 */

public class StringClass {
    public static void main(String[] args) {
        String string = "SharifdotG :3";
        String string2 = "SharifdotG :3";
        String string3 = "sharifdotg :3";
        String string4 = "Sharif";
        String string5 = "dotG";
        String string6 = "  SharifdotG :3";

        System.out.println("String: " + string);
        System.out.println("String2: " + string2);
        System.out.println("String3: " + string3);
        System.out.println("String4: " + string4);
        System.out.println("String5: " + string5);
        System.out.println("String6: " + string6);

        System.out.println("charAt: " + string.charAt(0));
        System.out.println("compareTo: " + string.compareTo(string2));
        System.out.println("concat: " + string4.concat(string5));
        System.out.println("contains: " + string.contains(string5));
        System.out.println("endsWith: " + string.endsWith(":3"));
        System.out.println("equals: " + string.equals(string2));
        System.out.println("equalsIgnoreCase: " + string.equalsIgnoreCase(string3));
        System.out.println("indexOf: " + string.indexOf("G"));
        System.out.println("isEmpty: " + string.isEmpty());
        System.out.println("lastIndexOf: " + string.lastIndexOf("f"));
        System.out.println("length: " + string.length());
        System.out.println("replace: " + string.replace(":3", ":')"));
        System.out.println("replaceAll: " + string.replaceAll("Sharif", "Yousuf"));
        System.out.println("startsWith: " + string.startsWith("S"));
        System.out.println("substring: " + string.substring(6, 10));
        System.out.println("toLowerCase: " + string.toLowerCase());
        System.out.println("toUpperCase: " + string.toUpperCase());
        System.out.println("trim: " + string6.trim());
    }
}

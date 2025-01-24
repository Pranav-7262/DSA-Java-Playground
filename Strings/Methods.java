package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="   I am Pranav Varpe  ";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name);

        System.out.println(name.toUpperCase());

        System.out.println(name.strip());//strip

        System.out.println(name.trim());//trim

        System.out.println(Arrays.toString(name.split(" ")));//split

        System.out.println(name.getBytes());
        System.out.println(name.compareTo("varpe"));
        System.out.println(name.contains("t"));
        System.out.println(name.contains("p"));

    }
}

package String;

// it create a new string every time we perform any operation on it. It is immutable in nature. thats why it is not memory efficient. It is thread safe and can be shared between multiple threads. It is stored in the string pool. And its becomes slow when we perform multiple operations on it. It is used when we have less number of operations to perform on the string. otherwise we can use StringBuilder or StringBuffer. It is a final class and it implements Serializable, Comparable, CharSequence interfaces.

import java.util.Arrays;

public class Str_Basic {
    public static void main(String[] args) {

        String str = "Hello World!";
        str = str.replace("World", "Bankal");

        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i));
        }

        System.out.println(str.substring(0, 5));
        System.out.println(str.trim()); // remove spaces

        System.out.println(Arrays.toString(str.split("")));

        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(String.join("-", "Hello Bankal", "Mavi"));

        System.out.println(str.repeat(10));

        System.out.println(Arrays.toString(str.chars().toArray())); // ASCII values
    }
}
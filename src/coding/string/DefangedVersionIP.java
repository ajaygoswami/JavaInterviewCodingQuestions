package coding.string;

import java.util.*;

public class DefangedVersionIP {

    public static void main(String[] args) {
        /**
         * Given a valid (IPv4) IP address, return a defanged version of that IP address.
         *
         * A defanged IP address replaces every period "." with "[.]".
         *
         * Example 1:
         *
         * Input: address = "1.1.1.1"
         * Output: "1[.]1[.]1[.]1"
         * Example 2:
         *
         * Input: address = "255.100.50.0"
         * Output: "255[.]100[.]50[.]0"
         */
        String address = "1.1.1.1";
        System.out.println("Defanged IP:"+defangedVersionIP(address));

        System.out.println("Defanged IP2:"+defangedVersionIP2(address));

       System.out.println("Defanged IP3:"+defangedVersionIP3(address));
    }


    private static String defangedVersionIP(String IP){
        return String.join("[.]", Arrays.asList(IP.split("\\.")));
    }

    private static String defangedVersionIP2(String IP){
        // dot(.) is equivalent to [.]
        return String.join("[.]", Arrays.asList(IP.split("[.]")));
    }

    private static String defangedVersionIP3(String IP){
        String defangedIP = "";
        for (int i = 0; i < IP.length(); i++){
            char c = IP.charAt(i);
            if (c == '.'){
                defangedIP += "[.]";
            }
            else {
                defangedIP += c;
            }
        }
        return defangedIP;
    }
}

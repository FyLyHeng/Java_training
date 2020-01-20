package method.chars;

import javax.jws.soap.SOAPBinding;

public class Main {
    public static void main(String[] args) {
        String str="liza kok";

        System.out.println(str.charAt(1));
        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePointCount(0,5));
        System.out.println(str.compareTo("liza"));
        System.out.println(str.concat(" and Bopha"));
        System.out.println(str.contains("kokz"));

        System.out.println("=============================================");
        String name="";
        char[] myName={'l','i','z','a'};
        name=name.copyValueOf(myName,0,2);
        System.out.println(name);
        System.out.println(str.equals("kok"));
        System.out.println(str.endsWith("z"));
        System.out.println(str.getBytes());
        System.out.println(str.hashCode());
        System.out.println(str.indexOf(2));

        System.out.println("=========================================");
        System.out.println(str.indexOf("z"));
        System.out.println(str.isEmpty());
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace('a','z'));
        System.out.println(str.replaceAll("za","xx"));
        System.out.println(str.substring(2,5));
        System.out.println(str.toCharArray());
        System.out.println(str.trim());
        System.out.println(str.valueOf(2));


    }
}

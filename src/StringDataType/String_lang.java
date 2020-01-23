package StringDataType;

public class String_lang {
    public static void main(String[] args) {
        String name="Liza kok";
        int l=name.length();
        System.out.println(l);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //String combing
        String first_name="KoK";
        String last_name="liza";
        String full_name=last_name.concat(first_name);
        System.out.println(full_name);
        //Special character
        String txt="The solution to avoid this \"problem\", is to use the backslash escape character";
        System.out.println(txt);
        String txt1="This\'s how we use comma in string";
        System.out.println(txt1);
        String txt2="The character \\ is called backslash";
        System.out.println(txt2);

    }
}

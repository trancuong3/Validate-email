public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String email : validEmail) {
            System.out.println(email+"-"+emailExample.validate(email));
        }
        for(String email : invalidEmail) {
            System.out.println(email+"-"+emailExample.validate(email));
        }
    }
}

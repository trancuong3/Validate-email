package account;

public class AccountExampleTest {
    private static AccountExample account;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        account = new AccountExample();
        for(String accountName : validAccount) {
            System.out.println(accountName+"-"+account.validate(accountName));
        }
        for(String accountName : invalidAccount) {
            System.out.println(accountName+"-"+account.validate(accountName));
        }
    }
}

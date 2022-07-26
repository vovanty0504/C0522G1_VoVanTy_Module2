package ss17_string_regex.practice;

public class AccountExampleTest {
    public static final String[] validAccount = new String[] {"123abc__","_abc123"};
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }
        for (String account : invalidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }
    }
}


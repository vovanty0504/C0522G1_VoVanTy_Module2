package ss17_string_regex.execise.class_number_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static final String NUMBER_REGEX = "^[\\d]{2}\\-[\\d]{10}$";

    public ValidateNumberPhone() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static final String[] numberPhone ={"01-0166618046"};

    public static void main(String[] args) {
        ValidateNumberPhone validateNumberPhone = new ValidateNumberPhone();
        for (String number: numberPhone){
            boolean isValid=validateNumberPhone.validate(number);
            System.out.println("Number phone is " + number + " is valid " + isValid);
        }
    }
}

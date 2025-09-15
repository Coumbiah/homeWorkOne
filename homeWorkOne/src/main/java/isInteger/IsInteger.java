package isInteger;

public class IsInteger {

//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//
    public static void main(String[] args) {
        String test1 = "123456";
        int number = Integer.parseInt(test1);
        if (number == Integer.parseInt(test1)) {
            System.out.println("This test was successful");
        }
        else {
            System.out.println("This test failed");
        }
        try {
            String test2 = "Onetwo3";
            number = Integer.parseInt(test2);
            if (number == Integer.parseInt(test2)) {
                System.out.println("This test was successful");
            } else {
                System.out.println("This test failed");
            }
        }
        catch (Exception e) {
            System.out.println("This test failed");
        }
    }
}

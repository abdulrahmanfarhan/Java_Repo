package user;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("abdulrahman" , "abood@gmail.com" , "12345");
        User user2 = new User("ahmad" , "ahmad@gmail.com" , "abcd354");

        Test test = Test.run();
        test.registerUser(user1);

        test.loginUser(user1);
        test.loginUser(user2);
    }
}

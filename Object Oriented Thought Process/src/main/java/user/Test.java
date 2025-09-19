package user;

import java.util.ArrayList;
import java.util.List;

public class Test implements UserService {
    private static final Test instance = new Test();
    private final List<User> users = new ArrayList<>();

    private Test() {
    }

    public static Test run() {
        return instance;
    }

    @Override
    public void registerUser(User user) {
        for (User u : users) {
            if (u.getEmail().equals(user.getEmail())) {
                System.out.println("This email is already registered");
                return;
            }
        }
        users.add(user);
    }

    @Override
    public boolean loginUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(user.getEmail()) && users.get(i).getPassword().equals(user.getPassword())) {
                System.out.println("Success Login");
                return true;
            }
        }

        System.out.println("failed Login");
        return false;
    }
}

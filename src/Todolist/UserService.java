package Todolist;

public class UserService {
    User[] users = new User[4];

    public UserService() {
        users[0] = new User("admin", "superhaslo", "admin@mqh.pl", 38);
        users[1] = new User("user1", "haslojeden", "user1@mqh.pl", 45);
        users[2] = new User("user2", "haslodwa", "user2@mqh.pl", 66);
        users[3] = new User("user3", "haslotrzy", "user3@mqh.pl", 12);
    }

    public User getUserByLogin(String login) {
        for(User user: users) {
            boolean isSameLogin = user.login.equals(login);
            if(isSameLogin) {
                return user;
            }
        }
        return null;
    }
}

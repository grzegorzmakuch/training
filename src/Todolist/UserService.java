package Todolist;

public class UserService {
    User[] users = new User[4];

    public UserService() {
        users[0] = new User("admin", "superhaslo", "admin@mqh.pl", 38);
        users[1] = new User("user1", "haslojeden", "user1@mqh.pl", 45);
        users[2] = new User("user2", "haslodwa", "user2@mqh.pl", 66);
        users[3] = new User("user3", "haslotrzy", "user3@mqh.pl", 12);
    }

   public User getUserByLogin(String searchingLogin) {
        for(User searchingUser : users) {
            boolean isSameLogin = searchingUser.login.equals(searchingLogin);
            if(isSameLogin) {
                return searchingUser;
            }
        }
        return null;
   }

   public int getUserAge() {
        int sum = 0;
        for(User user : users) {
            sum += user.age;
        }
        return sum;
   }
}

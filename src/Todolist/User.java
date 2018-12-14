package Todolist;

public class User {
    String login;
    String password;
    String email;
    int age;

    public User() {
        login = "login";
        password = "password";
        email = "mail@example.com";
        age = 0;
    }

    public User(String login, String password, String email, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }


}

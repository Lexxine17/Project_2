package coderslab.test;

import coderslab.entity.User;
import org.data.UserDao;

import java.sql.SQLException;

public class MainUser {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        User user = new User("Miguel", "someMail5@gmail.com", "haslojakiestam2");
        User user2 = new User("Maksymilian", "someMail6@gmail.com", "haslojakiestam3");
        User user3 = new User(3, "Aleksandra", "someMail1@gmail.com", "haslojakiestam4");
//        User newUser1 = userDao.read(7);
//
//        newUser1.setUsername("Albert");
//        newUser1.setPassword("haslojakiestam2");
//        newUser1.setEmail("jakistam@gmail.com");

//        userDao.update(newUser1);
//        userDao.update(user3);

//        userDao.create(user2);
//        userDao.delete(1);
//        System.out.println(userDao.read(6));
        for (User u : userDao.findAll()) {
            System.out.println(u);
        }

    }
}

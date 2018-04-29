package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;

import java.util.Arrays;
import java.util.List;

/*
хранилище объектов созданых спрингом, из которых есть доступ к базе

*/

@Repository
public class UserDao {
    // создадим временный массив со списком пользователей, потом переключимся на базу
    private List<User> users = Arrays.asList(
            new User("admin", "admin"),
            new User("user1", "user1"));

    // метод возвращающий список пользователей
    public List<User> getAllUsers() {
        return users;
    }

}

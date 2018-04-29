package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDao;
import system.model.User;
import java.util.List;

/*
описываем анотацию сервиса

*/
@Service
public class UserService {
    // описываем связку с DAO, с указанием для спринга что он должен подтянуть автоматом
    @Autowired
    private UserDao userDao;

    // получаем список, это не дублирование
    // и если нужно можно сделать здесь еще какие нибудь доп проверки но не в модуле DAO
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}

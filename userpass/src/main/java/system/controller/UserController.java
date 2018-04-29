package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.model.User;
import system.service.UserService;

import java.util.List;

/*
прописываем аннотации для нашего контроллера
оживили, и теперь спринг будет сам создавать объект-контроллер и он будет работать в спринг контексте
далее мы задаем какой контекст он будет обрабатывать по request запросу
example localhost:9999/userpass/users
Request от клиента
Response отправка клиенту
*/

@Controller
@RequestMapping("/users")
public class UserController {
    //автоматическое подключение сервиса в спринг домик :)
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers() {
        // отправляем клиенту список пользователей который отдает Userservice
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public ModelAndView validateUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("users_check_page");
        return modelAndView;
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public @ResponseBody
    String checkUser(@ModelAttribute("userFromServer") User user) {
        if ("admin".equals(user.getName()) && "admin".equals(user.getPassword())) {
            return "valid";
        }
        return "invalid";
    }
}

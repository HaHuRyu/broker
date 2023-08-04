package broker.spring.main;

import broker.spring.main.model.UserDAO;
import broker.spring.main.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserDAO dao;

    @RequestMapping("user_list.go")
    public String userList(Model model){

        
        List<UserDTO> list = this.dao.userList();

        model.addAttribute("List", list);

        return "user_list";

    }

}

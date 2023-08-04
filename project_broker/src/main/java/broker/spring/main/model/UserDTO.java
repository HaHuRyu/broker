package broker.spring.main.model;

import lombok.Data;

@Data
public class UserDTO {
    private int user_no;
    private String user_id;
    private String user_pwd;
    private String user_nick;
    private String user_email;
    private String user_addr;
    private String user_name;
    private int user_phone;
    private String user_birth;
    private String approve;
    private int point;
}

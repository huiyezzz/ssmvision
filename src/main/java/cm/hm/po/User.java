package cm.hm.po;

/**
 * Created by HUIYE on 2017/12/6.
 */
public class User {
    private int u_id;
    private int u_code;
    private String u_name;
    private String  u_password;
    private int u_state;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getU_code() {
        return u_code;
    }

    public void setU_code(int u_code) {
        this.u_code = u_code;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_code=" + u_code +
                ", u_name='" + u_name + '\'' +
                ", u_password='" + u_password + '\'' +
                ", u_state=" + u_state +
                '}';
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public int getU_state() {
        return u_state;
    }

    public void setU_state(int u_state) {
        this.u_state = u_state;
    }
}

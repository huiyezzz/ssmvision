package cm.hm.po;

/**
 * Created by HUIYE on 2017/12/6.
 */
public class Customer {
    private int cust_id;
    private int cust_source;
    private int cust_industry;
    private int cust_level;
    private String cust_name;

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public int getCust_source() {
        return cust_source;
    }

    public void setCust_source(int cust_source) {
        this.cust_source = cust_source;
    }

    public int getCust_industry() {
        return cust_industry;
    }

    public void setCust_industry(int cust_industry) {
        this.cust_industry = cust_industry;
    }

    public int getCust_level() {
        return cust_level;
    }

    public void setCust_level(int cust_level) {
        this.cust_level = cust_level;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    private String cust_phone;
    private String cust_address;

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", cust_source=" + cust_source +
                ", cust_industry=" + cust_industry +
                ", cust_level=" + cust_level +
                ", cust_name='" + cust_name + '\'' +
                ", cust_phone='" + cust_phone + '\'' +
                ", cust_address='" + cust_address + '\'' +
                '}';
    }
}

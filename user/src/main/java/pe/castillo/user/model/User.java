package pe.castillo.user.model;

public class User {
    private int user_id;
    private String name;
    private String lastname;
    private int phone;

    public User() {
    }

    public User(int user_id, String name, String lastname, int phone) {
        this.user_id = user_id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("user_id=").append(user_id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", phone=").append(phone);
        sb.append('}');
        return sb.toString();
    }
}

package example.a11_30androidbatch.send_object_activity;

import java.io.Serializable;

public class Student implements Serializable {

    String name;
    String address;
    int roll_no;

    public Student(String name, String address, int roll_no) {
        this.name = name;
        this.address = address;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}

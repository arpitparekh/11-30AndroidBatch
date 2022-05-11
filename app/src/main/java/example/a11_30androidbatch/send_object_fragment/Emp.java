package example.a11_30androidbatch.send_object_fragment;

import java.io.Serializable;

public class Emp implements Serializable {

    String name;
    String address;
    int age;
    float salary;

    public Emp(String name, String address, int age, float salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }
}

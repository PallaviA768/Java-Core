
package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Objects;

class User {
    private int id;
    private String name;
    private String department;
    private String designation;

    public User(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "User" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User employee = (User) obj;
        return id == employee.id;
    }
}

public class D06P10 {
    public static void main(String[] args) {
        Hashtable<Integer, User> UserTable = new Hashtable<>();

      
        UserTable.put(1, new User(1, "Sarita", "IT", "Software Engineer"));
        UserTable.put(2, new User(2, "Lalita", "HR", "HR Manager"));
        UserTable.put(3, new User(3, "Vanita", "Finance", "Accountant"));
        UserTable.put(4, new User(4, "Vani", "Marketing", "Marketing Specialist"));

      
        boolean isEmpty = UserTable.isEmpty();
        System.out.println(isEmpty);
    }
}

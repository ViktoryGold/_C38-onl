package Lesson_10.HW_task_1;

import Lesson_10.HW_task_star.Address;

import java.util.Objects;

public class User implements Cloneable{
    private Long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private boolean isActive;
    private String role;
    private Address address;

    public User(){
        this.isActive = true;
        this.role = "user";
        this.address = new Address();
    }
    public User(Long id, String userName, String password, String firstName,
                String lastName, boolean isActive, String role, Address address){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.role = role;
        this.address = address;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getFullName(){
        if (firstName != null && lastName != null){
            return firstName + " " + lastName;
        }
        return userName;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
    public User deepClone() throws CloneNotSupportedException {
        User cloned = (User) super.clone();
        cloned.address = this.address.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "User:\n" +
                "\tid: " + id + ",\n" +
                "\tusername: '" + userName + "'\n" +
                "\tfirstname: '" + firstName + "'\n" +
                "\tlastname: '" + lastName + "'\n" +
                "\tisactive: " + isActive + "\n" +
                "\trole: '" + role + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return isActive == user.isActive &&
                Objects.equals(id, user.id) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(password, user.password) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName,user.lastName) &&
                Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password, firstName, lastName, isActive, role);
    }
}

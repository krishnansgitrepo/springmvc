package org.example.app.dto;

import javax.validation.constraints.NotBlank;

public class UserRegisterDto {


    private String name;
    private String userName;
    @NotBlank(message = "Password cannot be null.")
    private String password;
    private String country;

    private String[] hobbies;
    private String gender;

//    @Age(lower=18, upper=60, message="age not in range {lower} - {upper}")
//    private int age;

    @Age(lower=33, upper=70)//not specifying the default message
    private Integer age;

    private ContactDto contactDto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public ContactDto getContactDto() {
        return contactDto;
    }

    public void setContactDto(ContactDto contactDto) {
        this.contactDto = contactDto;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

package com.kirilo.training.springlibrary.objects;

import java.util.Date;

public class Author {
    private String fullName;
    private Date birthday;

    public Author() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Author(String fullName, Date birthday) {
        this.fullName = fullName;
        this.birthday = birthday;
    }
}

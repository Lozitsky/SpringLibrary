package com.kirilo.training.springlibrary.objects;

import java.util.Date;

public class Author {
    private String foolName;
    private Date birthday;

    public Author() {
    }

    public String getFoolName() {
        return foolName;
    }

    public void setFoolName(String foolName) {
        this.foolName = foolName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Author(String foolName, Date birthday) {
        this.foolName = foolName;
        this.birthday = birthday;
    }
}

package com.kirilo.training.springlibrary.interfaces;

import com.kirilo.training.springlibrary.objects.User;

public interface SecureLibrary {
    boolean login(User user);
    void logout(User user);
}

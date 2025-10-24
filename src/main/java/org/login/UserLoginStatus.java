package org.login;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class UserLoginStatus {

    private final String userId;
    private final AtomicLong totalLogin;
    private LocalDateTime lastLoginTime;
    private final List<UserLogin> recent10Login;

    public UserLoginStatus(String userId) {
        this.userId = userId;
        this.totalLogin = new AtomicLong(0);
        this.recent10Login = new LinkedList<>();
    }

    public List<UserLogin> getRecent10Login() {
        return recent10Login;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public long getTotalLogin() {
        return totalLogin.get();
    }

    public String getUserId() {
        return userId;
    }

    public void addLogin(UserLogin userLogin) {
        totalLogin.incrementAndGet();
        lastLoginTime = userLogin.getLocalDateTime();

        recent10Login.addFirst(userLogin);

    }
}

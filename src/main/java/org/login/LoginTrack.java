package org.login;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;



//Given a login endpoint that accepts username/password, implement an in-memory data structure to:
//Track total logins
//Track logins by user
//Record last login time per user
//Provide last 10 logins (across users)
//Provide last 10 unique logins (no duplicates)
//Provide top 10 users by number of logins
//Discuss thread safety and performance considerations.
public class LoginTrack {


    private final Map<String, UserLoginStatus> loginStatusMap;
    private final AtomicLong atomicLong;
    private final LinkedList<UserLogin> globalLogin;
    private final Set<String> activeSessions;

    public LoginTrack() {
        this.loginStatusMap = new ConcurrentHashMap<>();
        this.atomicLong = new AtomicLong(0);
        this.globalLogin = new LinkedList<>();
        this.activeSessions = new LinkedHashSet<>();
    }

    public synchronized void recordLogin(String userId, String sessionId) {


        LocalDateTime loginTime = LocalDateTime.now();

        UserLogin userLogin = new UserLogin(userId, loginTime, sessionId);

        UserLoginStatus loginStatus = loginStatusMap.computeIfAbsent(userId, UserLoginStatus::new);

        loginStatus.addLogin(userLogin);

        atomicLong.incrementAndGet();
        activeSessions.add(sessionId);


        globalLogin.addFirst(userLogin);
    }
}

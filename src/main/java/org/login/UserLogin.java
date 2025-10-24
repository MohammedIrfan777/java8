package org.login;


import java.time.LocalDateTime;

//Given a login endpoint that accepts username/password, implement an in-memory data structure to:
//Track total logins
//Track logins by user
//Record last login time per user
//Provide last 10 logins (across users)
//Provide last 10 unique logins (no duplicates)
//Provide top 10 users by number of logins
//Discuss thread safety and performance considerations.
public class UserLogin {

    private final String userId;
    private final LocalDateTime localDateTime;
    private final String sessionId;

    public UserLogin(String userId, LocalDateTime localDateTime, String sessionId) {
        this.userId = userId;
        this.localDateTime = localDateTime;
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "userId='" + userId + '\'' +
                ", localDateTime=" + localDateTime +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }

    public String getSessionId() {
        return sessionId;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getUserId() {
        return userId;
    }
}

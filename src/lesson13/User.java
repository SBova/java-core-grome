package lesson13;

//User repository, part 1
public class User {
    private Long id;
    private String name;
    private String sessionId;

    public User(Long id, String name, String sessionId) {
        this.id = id;
        this.name = name;
        this.sessionId = sessionId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSessionId() {
        return sessionId;
    }
}
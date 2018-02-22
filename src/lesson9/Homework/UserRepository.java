package lesson9.Homework;

//User repository, part 2
// User repository, part 6 Весь код с изменением
// private User findById(long id) на public User findById(long id)
public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        if (users != null) {
            int UN = 0;
            //счетчик, чтобы после каждого пробега по массиву прибавлялись новый елементы.
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    UN++;
                }
            }
            String[] userNames = new String[UN];
            UN = 0;
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    userNames[UN] = users[i].getName();
                    UN++;
                }
            }
            return userNames;
        }
        return null;
    }

    public long[] getUserIds() {
        if (users != null) {
            int UI = 0;
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    UI++;
                }
            }
            long[] userIds = new long[UI];
            UI = 0;
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    userIds[UI] = users[i].getId();
                    UI++;
                }
            }
            return userIds;
        }
        return null;
    }

    public String getUserNameById(long id) {
        String name = null;
        if (users != null) {
            for (User user : users) {//пробегаем по все элементам структуры данных
                if (user != null)
                    if (user.getId() == id)
                        name = user.getName();
            }
        }
        return name;
    }

    //User repository, part 3
    public User getUserByName(String name) {

        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getName() == name)
                        return user;
            }
        }
        return null;
    }

    public User getUserById(long id) {

        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getId() == id)
                        return user;
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {

        if (users != null) {
            for (User user : users) {
                if (user != null)
                    if (user.getSessionId() == sessionId)
                        return user;
            }
        }
        return null;
    }

    // User repository, part 4
    public User save(User user) {
        if (user != null) {
            if (user.equals(findById(user.getId())))
                return null;
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = user;
                    return user;
                }
            }
        }
        return null;
    }

    public User findById(long id) {

        if (users != null) {
            int fId = 0;
            for (User user1 : users) {
                if (user1 != null)
                    if (user1.getId() == id)
                        return user1;
            }
        }
        return null;
    }

    // User repository, part 5
    public User update(User user) {
        if (user != null)
            if (users != null) {
                User rdUser = findById(user.getId());//rdUser -refresh и delete User из массива
                if (rdUser != null)
                    if (user.getId() == rdUser.getId()) {
                        for (int i = 0; i < users.length; i++) {
                            if (users[i] != null)
                                if (users[i].getId() == user.getId()) {
                                    users[i] = user;
                                }
                        }
                        return user;
                    }

            }
        return null;
    }

    public void delete(long id) {
        if (users != null) {
            User rdUser = findById(id);
            if (rdUser != null)
                if (id == rdUser.getId()) {
                    for (int i = 0; i < users.length; i++) {
                        if (users[i] != null)
                            if (users[i].getId() == id) {
                                users[i] = null;
                            }
                    }

                }
        }
    }
}
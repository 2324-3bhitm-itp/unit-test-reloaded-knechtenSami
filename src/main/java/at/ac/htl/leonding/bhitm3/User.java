package at.ac.htl.leonding.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class User extends Person {
    private static int nextUserId = 1; // first user has user id 1
    private int userId = nextUserId++; // first init then add 1 to nextUser
    private List<Garden> gardens = new LinkedList<>();

    public int getUserId() {
        return userId;
    }

    public void addGarden(Garden garden) {
        this.gardens.add(garden);
    }

    public int getNumberOfGardens() {
        return this.gardens.size();
    }
}

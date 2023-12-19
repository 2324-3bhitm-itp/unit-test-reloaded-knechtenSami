package at.ac.htl.leonding.bhitm3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
    User user;
    @Before public void setUp() {
        user = new User();
    }

    @Test public void given_user_is_instance_of_person() {
        assertTrue(user instanceof Person);
    }

    @Test public void consecutive_users_have_consecutive_ids() {
        User newUser = new User();
        User consecutiveUser = new User();
        int differenceOfIds = consecutiveUser.getUserId() - newUser.getUserId();
        assertEquals(1, differenceOfIds);
    }

    @Test public void length_of_garden_list_is_greater_than_0_when_garde_was_added() {
        user.addGarden(new Garden());
        assertEquals(1, user.getNumberOfGardens());
    }
}

package at.ac.htl.leonding.bhitm3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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


//    @Test public void given_person_test_setter_and_getter_with_valid_parameters() {
//        final int USER_ID = 0;
//
//        person.setUsername(USERNAME);
//        person.setPassword(PASSWORD);
//        person.setEmail(EMAIL);
//
//        assertEquals(USERNAME, person.getUsername());
//        assertEquals(PASSWORD, person.getPassword());
//        assertEquals(EMAIL, person.getEmail());
//    }

    @Test public void given_user_when_get_user_id_result_is_distinct() {
        User newUser = new User();
    }
}

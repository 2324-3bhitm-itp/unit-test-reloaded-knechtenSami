package at.ac.htl.leonding.bhitm3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    Person person;
    @Before public void setUp() {
        person = new Person();
    }

    @Test public void given_person_test_setter_and_getter_with_valid_parameters() {
        final String USERNAME = "First";
        final String PASSWORD = "Last";
        final String EMAIL = "a@b.c";

        person.setUsername(USERNAME);
        person.setPassword(PASSWORD);
        person.setEmail(EMAIL);

        assertEquals(USERNAME, person.getUsername());
        assertEquals(PASSWORD, person.getPassword());
        assertEquals(EMAIL, person.getEmail());
    }
}

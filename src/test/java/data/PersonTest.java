package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person("Juan");
        assertEquals("Juan", person.getName());
    }

    @Test
    void getNamePedro() {
        Person person = new Person("Pedro");
        assertEquals("Pedro", person.getName());
    }

    @Test
    void setName() {
        Person person = new Person("Pedro");
        person.setName("Juan");
        assertEquals("Pedro", person.getName());
    }
}
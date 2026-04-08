package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void test_equals_self() {
        assertEquals(true, team.equals(team));
    }

    @Test
    public void test_equals_different_type() {
        assertEquals(false, team.equals("Not a Team object"));
    }

    @Test
    public void test_equals_same_fields() {
        Team team2 = new Team("test-team");
        assertEquals(true, team.equals(team2));
    }

    @Test
    public void test_equals_different_name() {
    Team team2 = new Team("different-name");
    assertEquals(false, team.equals(team2));
    }

    @Test
    public void test_equals_different_members() {
        Team team2 = new Team("test-team");
        team2.addMember("Joe");
        assertEquals(false, team.equals(team2));
    }

    @Test
    public void test_hashCode() {
        Team t1 = new Team("t1");
        Team t2 = new Team("t1");
        assertEquals(t1.hashCode(), t2.hashCode());
}

    @Test
    public void test_default_constructor() {
        Team emptyTeam = new Team();
        assertEquals("", emptyTeam.getName());
        assertEquals(0, emptyTeam.getMembers().size());
    }

    @Test
    public void test_setMembers() {
        ArrayList<String> newMembers = new ArrayList<>();
        newMembers.add("Alice");
        team.setMembers(newMembers);
        assertEquals(newMembers, team.getMembers());
    }

    @Test
    public void test_hashCode_specific_value() {
        Team t = new Team("test-team");
        int expected = t.getName().hashCode() | t.getMembers().hashCode();
        assertEquals(expected, t.hashCode());
    }

    @Test
    public void test_hashCode_not_equal() {
        Team t1 = new Team("t1");
        Team t2 = new Team("t2");
        assertNotEquals(t1.hashCode(), t2.hashCode());
    }
}

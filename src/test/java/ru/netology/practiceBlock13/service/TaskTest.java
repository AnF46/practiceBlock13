package ru.netology.practiceBlock13.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.practiceBlock13.service.Epic;
import ru.netology.practiceBlock13.service.Meeting;
import ru.netology.practiceBlock13.service.SimpleTask;

public class TaskTest {

    @Test
    public void simpleTaskFindMatchesTest() {
        SimpleTask task = new SimpleTask(11, "собрать вещи");

        task.matches("вещи");

        boolean expected = true;
        boolean actual = task.matches("вещи");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void simpleTaskNotFindMatchesTest() {
        SimpleTask task = new SimpleTask(11, "собрать вещи");

        task.matches("собрал");

        boolean expected = false;
        boolean actual = task.matches("собрал");

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void epicFindMatchesTest() {
    Epic epic = new Epic(22, new String[]{"помыть посуду"});

    boolean expected = true;
    boolean actual = epic.matches("помыть" );

    Assertions.assertEquals(expected, actual);
    }

    @Test
    public void epicNotMatchTest() {
        Epic epic = new Epic(22, new String[]{"помыть посуду"});

        boolean expected = false;
        boolean actual = epic.matches("стирать" );

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meetingTopicFindMatchesTest() {
        Meeting meeting = new Meeting(33, "план дня", "космолет", "12 октября");

        boolean expected = true;
        boolean actual = meeting.matches( "план");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meetingProjectFindMatchesTest() {
        Meeting meeting = new Meeting(33, "план дня", "космолет", "12 октября");

        boolean expected = true;
        boolean actual = meeting.matches("космолет");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void meetingNotFindMatchesTest() {
        Meeting meeting = new Meeting(33, "план дня", "космолет", "12 октября");

        boolean expected = false;
        boolean actual = meeting.matches("космос");

        Assertions.assertEquals(expected, actual);
    }

}


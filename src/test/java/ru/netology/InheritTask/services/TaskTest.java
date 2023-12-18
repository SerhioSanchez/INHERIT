package ru.netology.InheritTask.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testSimpleTaskWhenMatches() {
        SimpleTask simpleTasks = new SimpleTask(id: 111, title: "Позвонить родителям");

        boolean actual = simpleTasks.matches(query: "Позвонить");

        Assertions.assertTrue(actual);
    }
    @Test
    public void testSimpleTaskWhenNotMatches() {
        SimpleTask simpleTasks = new SimpleTask(id: 111, title: "Позвонить родителям");

        boolean actual = simpleTasks.matches(query: "Написать");

        Assertions.assertFalse(actual);
    }
}
package com.cafekotlin;

import com.cafekotlin.config.MenuConfig;
import com.cafekotlin.foods.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@Test
@ContextConfiguration(classes = MenuConfig.class)
public class TestOrderManagerSystem extends AbstractTestNGSpringContextTests {

    @Autowired
    @Qualifier("sandwich")
    private Food sandwich;

    @Autowired
    @Qualifier("burger")
    private Food burger;

    @Test
    public void testPrepareFoodSandwich() {
        sandwich.prepareFood();
    }

    @Test
    public void testPrepareFoodBurger() {
        burger.prepareFood();
    }
}

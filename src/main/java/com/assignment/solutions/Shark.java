package com.assignment.solutions;

import com.assignment.utils.Constant;

public class Shark extends Fish {


    @Override
    public String bodySize() {
        return "large";
    }

    @Override
    public String bodyColor() {
        return "grey";
    }

    public void canEat() {
        System.out.println(Constant.FISH);
    }
}

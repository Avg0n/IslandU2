package com.javarush.island.goncharov.entities;

import com.javarush.island.goncharov.actions.*;

public abstract class Animal implements Die, Eat, Move, Reproduce {
    private final String name;
    private final double maxWeight;
    private final int maxQuantity;
    private final int maxRange;
    private final double maxFood;

}

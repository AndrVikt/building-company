package com.solvd.mycourse.builders;

import com.solvd.mycourse.exeptions.ExeptionOfElectrician;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class RoofBuilder extends Builders{
    private int saferyRope;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(RoofBuilder.class));

    public RoofBuilder(String  name, int age, int amount, int constructionTime, double price, double Break, int saferyRope) {
        super(name, age, amount, constructionTime, price, Break);
        this.saferyRope = saferyRope;
    }
    public RoofBuilder(int saferyRope) {
        if (saferyRope == 0) {
            throw new ExeptionOfElectrician(saferyRope);
        }
        this.saferyRope = saferyRope;
    }

    public int getSaferyRope() {
        return saferyRope;
    }

    public void setSaferyRope(int saferyRope) {
        this.saferyRope = saferyRope;
    }

    @Override
    public String toString() {
        return "RoofBuilder{" +
                "saferyRope=" + saferyRope +
                '}';
    }
}

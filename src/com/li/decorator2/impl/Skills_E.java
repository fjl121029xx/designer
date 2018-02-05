package com.li.decorator2.impl;

import com.li.decorator2.Hero;

public class Skills_E extends Skills {

    private String skillName;

    public Skills_E(Hero hero, String skillName) {

        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {

        System.out.println("学习了技能W : " + skillName);
        super.learnSkills();
    }
}

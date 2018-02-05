package com.li.decorator2.impl;

import com.li.decorator2.Hero;

public class Skills_Q extends Skills {

    private String skillName;

    public Skills_Q(Hero hero, String skillName) {

        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了Q技能 : " + skillName);
        super.learnSkills();
    }
}

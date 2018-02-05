package com.li.decorator2.impl;

import com.li.decorator2.Hero;

public class Skills_W extends Skills {

    private String skillName;

    public Skills_W(Hero hero, String skillName) {

        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {

        System.out.println("学习了技能W : " + skillName);
        super.learnSkills();
    }
}

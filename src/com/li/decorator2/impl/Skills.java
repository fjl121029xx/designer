package com.li.decorator2.impl;

import com.li.decorator2.Hero;

/**
 * 技能栏
 */
public class Skills implements Hero {

    protected Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {

        if (hero != null) {

            hero.learnSkills();
        }

    }
}

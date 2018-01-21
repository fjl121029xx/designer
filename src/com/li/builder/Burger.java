package com.li.builder;

/**
 * 创建实现 Packing 接口的实体类。
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {

        return new Wrapper();
    }

}

package com.li.builder;

/**
 * 创建实现 Packing 接口的实体类。
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
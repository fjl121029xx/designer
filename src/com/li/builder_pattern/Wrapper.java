package com.li.builder_pattern;

/**
 * 创建实现 Packing 接口的实体类。
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}

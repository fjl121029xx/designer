package com.li.builder_pattern;

/**
 * 创建一个表示食物条目 Item 和食物包装 Packing的接口。
 */
public interface Item {

    String name();
    Packing packing();
    float price();
}

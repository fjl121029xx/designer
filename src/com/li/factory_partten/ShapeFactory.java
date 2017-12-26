package com.li.factory_partten;

public class ShapeFactory {

    public static Shape getShape(String shapType){

        if (shapType == null){

            return  null;
        }

        if (shapType.equalsIgnoreCase("CIRCLE")){

            return new Circle();
        } else if (shapType.equalsIgnoreCase("RECTANGLE")){

            return new Rectangle();
        } else if (shapType.equalsIgnoreCase("SQUARE")){

            return new Square();
        }

        return null;
    }

    public static Object getClass(Class<?extends Shape> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }
}

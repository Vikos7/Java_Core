package lesson3;

import java.util.ArrayList;

public class RunClass {
    public static void main(String[] args) {
        Apple[] apples = new Apple[10];
        ArrayList<Apple> applesList = new ArrayList<>(10);

        Apple apple0 = new Apple(8);
        Apple apple1 = new Apple(4);
        Apple apple2 = new Apple(5);
        Apple apple3 = new Apple(12);
        apples[0] = apple0;
        applesList.add(apple0);
        apples[1] = apple1;
        applesList.add(apple1);
        apples[2] = apple2;
        applesList.add(apple2);
        apples[3] = apple3;
        applesList.add(apple3);
        Box <Apple> box1 = new Box<>(apples,applesList);

        Apple[]apples2 = new Apple[10];
        ArrayList<Apple> applesList2 = new ArrayList<>();
        apples2[0] = apple0;
        applesList2.add(apple0);
        apples2[1] = apple1;
        applesList2.add(apple1);
        apples2[2] = apple2;
        applesList2.add(apple2);
        apples2[3] = apple3;
        applesList2.add(apple3);
        Apple apples4 = new Apple(7);
        apples2[4] = apples4;
        Box<Apple> box2 = new Box<>(apples2,applesList2);

        System.out.println(box1.getWeightArray());
        System.out.println(box2.getWeightList());

        System.out.println(box1.compare(box2));
        System.out.println(box1.compareList(box2));

        box1.toEmptyArray(box2);
        box1.toEmptyList(box2);

        System.out.println(box2);

        Orange[] oranges = new Orange[10];
        ArrayList<Orange> orangesArrayList = new ArrayList<>(10);
        Box<Orange> orange = new Box<>(oranges,orangesArrayList);
        box1.compare(orange);

    }
}

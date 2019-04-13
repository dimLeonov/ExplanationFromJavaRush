package com.objects;

public class ObjectTask2 {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println("Age is: " + human.age);
        human.adjustAge(human.age);
        System.out.println("Adjusted age is: " + human.age);
    }

    public static class Human {
        private int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("Age in adjustAge() is:" + age);
        }

    }
}

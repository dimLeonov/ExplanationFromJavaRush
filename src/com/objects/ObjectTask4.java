package com.objects;

public class ObjectTask4 {
    public class Cat{
        public int age;
        public int weight;
        public int strength;

        public Cat(){}

        public boolean fight(Cat anotherCat) {
            if (this.age + this.strength + this.weight > anotherCat.weight + anotherCat.strength + anotherCat.age){
                return true;
            }
            else
                return false;
        }

    }

    public static void main(String[] args) {

    }
}

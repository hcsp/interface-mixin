package com.github.hcsp.polymorphism;

public class Main {
    interface 会跑 {
        default void 跑() {
            System.out.println(getName() + "跑啊跑啊跑");
        }

        String getName();
    }

    interface 会游泳 {
        default void 游泳() {
            System.out.println(getName() + "游啊游啊游");
        }

        String getName();
    }

    static class Animal {
        private String name;

        Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    static class 猫 extends Animal implements 会跑 {
        猫() {
            super("猫");
        }
    }

    static class 乌龟 extends Animal implements 会跑, 会游泳 {
        乌龟() {
            super("乌龟");
        }
    }

    public static void main(String[] args) {
        new 乌龟().跑();
        new 乌龟().游泳();
    }
}

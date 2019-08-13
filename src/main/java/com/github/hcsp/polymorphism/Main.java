package com.github.hcsp.polymorphism;

public class Main {
    interface 会跑 {

        default void 跑() {
            System.out.println(this.getName() + "跑啊跑啊跑");
        }

        String getName();
    }

    interface 会游泳 {
        default void 游泳() {
            System.out.println(this.getName() + "游啊游啊游");
        }

        String getName();
    }

    static class Animal implements 会游泳, 会跑 {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }
    }

    static class 猫 extends Animal {
        猫() {
            super("猫");
        }
    }

    static class 鱼 extends Animal {
        鱼() {
            super("鱼");
        }

    }

    // 现在 乌龟 想要同时复用会跑和会游泳的代码
    // 请尝试通过接口的默认方法实现mixin
    // 从而实现最大程度的代码复用
    //
    static class 乌龟 extends Animal {
        乌龟() {
            super("乌龟");
        }

        public static void main(String[] args) {
            new 乌龟().跑();
            new 乌龟().游泳();
        }
    }
}

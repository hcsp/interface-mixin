package com.github.hcsp.polymorphism;

public class Main {
    interface 会跑 {
        default void 跑() {
            System.out.println(this.getClass().getName()  + "跑啊跑啊跑");
        }
    }

    interface 会游泳 {
        default void 游泳() {
            System.out.println(this.getClass().getName() + "游啊游啊游");
        }
    }

    static class 猫 implements 会跑 {
        String name;

        猫(String name) {
            this.name = name;
        }

        @Override
        public void 跑() {
//            "小花猫"
            System.out.println(name  + "跑啊跑啊跑");
        }
    }

    static class 鱼 implements 会游泳 {
        String name;

        鱼(String name) {
            this.name = name;
        }

        @Override
        public void 游泳() {
            System.out.println(name  + "游啊游啊游");
        }
    }
    // 现在 乌龟 想要同时复用会跑和会游泳的代码
    // 请尝试通过接口的默认方法实现mixin
    // 从而实现最大程度的代码复用
    //
     static class 乌龟 implements 会跑, 会游泳 {
     }

    public static void main(String[] args) {
        new 猫("花无缺").跑();
        new 鱼("小鱼儿").游泳();
        new 乌龟().跑();
        new 乌龟().游泳();
    }
}

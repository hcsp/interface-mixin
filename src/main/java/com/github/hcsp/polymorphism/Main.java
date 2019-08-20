package com.github.hcsp.polymorphism;

public class Main {
    interface 会跑 {
        default void 跑() {
            System.out.println(this.getClass().getSimpleName() + "跑啊跑啊跑");
        }
    }

    interface 会游泳 {
        default void 游泳() {
            System.out.println(this.getClass().getSimpleName() + "游啊游啊游");
        }
    }

    static class 猫 implements 会跑 {
        猫() {

        }
    }

    static class 鱼 implements 会游泳 {
        鱼() {

        }
    }

    // 现在 乌龟 想要同时复用会跑和会游泳的代码
    // 请尝试通过接口的默认方法实现mixin
    // 从而实现最大程度的代码复用
    //
     static class 乌龟 implements 会跑, 会游泳 {
     }

    public static void main(String[] args) {
        new 乌龟().跑();
        new 乌龟().游泳();
    }
}

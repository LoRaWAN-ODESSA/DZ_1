package com.company;

public class MainSecond {
    public static void main(String[] args) {
        for (int i = args.length -1; i >= 0; i--) {
            if (i == args.length - 1) {
                System.out.print(args[i]);
            } else {
                System.out.print(" " + args[i]);
            }
        }
    }
}

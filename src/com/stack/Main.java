package com.stack;

public class Main {

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        Product laptop = new Product(1, "Laptop", 1300000);
        Product mouse = new Product(2, "Mouse", 50000);
        Product komputer = new Product(3, "Komputer", 2200000);
        Product keyboard = new Product(4, "Keyboard", 120000);

        stack.push(laptop);
        stack.push(mouse);
        stack.push(komputer);
        stack.push(keyboard);

        System.out.println("INITIAL DATA");
        stack.printStack();

        stack.pop();

        System.out.println("DATA AFTER POP");
        stack.printStack();

        System.out.print("STACK SIZE = ");
        System.out.println(stack.size());
    }
}

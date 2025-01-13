package com.example.kiosk.Lv1;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void displayMenu() {
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i));
        }
        System.out.println("0. 종료");
    }

    public MenuItem getMenuItem(int index) {
        if (index < 0 || index >= menuItems.size()) {
            return null;
        }
        return menuItems.get(index);
    }
}
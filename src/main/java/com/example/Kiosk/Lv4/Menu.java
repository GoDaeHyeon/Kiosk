package com.example.Kiosk.Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final String category;
    private final List<MenuItem> menuItems;

    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }

    public String getCategory() {
        return category;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void displayMenu(Scanner scanner) {
        System.out.println("[ " + category.toUpperCase() + " MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
        }
        System.out.println("0. 뒤로가기");

        System.out.print("번호를 입력하세요: ");
        int choice = scanner.nextInt();

        if (choice == 0) {
            return;
        } else if (choice > 0 && choice <= menuItems.size()) {
            MenuItem selectedItem = menuItems.get(choice - 1);
            System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
        } else {
            System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
        }
    }
}
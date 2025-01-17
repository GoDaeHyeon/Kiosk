package com.example.Kiosk.Lv5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;

    public Kiosk() {
        this.menus = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategory());
            }
            System.out.println("0. 종료");

            int mainChoice = scanner.nextInt();
            if (mainChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (mainChoice > 0 && mainChoice <= menus.size()) {
                Menu selectedMenu = menus.get(mainChoice - 1);
                displayMenuItems(selectedMenu, scanner);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        scanner.close();
    }

    private void displayMenuItems(Menu menu, Scanner scanner) {
        while (true) {
            System.out.println("[ " + menu.getCategory().toUpperCase() + " MENU ]");
            for (int i = 0; i < menu.getMenuItems().size(); i++) {
                MenuItem item = menu.getMenuItems().get(i);
                System.out.println((i + 1) + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            }
            System.out.println("0. 뒤로가기");

            int menuChoice = scanner.nextInt();
            if (menuChoice == 0) {
                break;
            } else if (menuChoice > 0 && menuChoice <= menu.getMenuItems().size()) {
                MenuItem selectedItem = menu.getMenuItems().get(menuChoice - 1);
                System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
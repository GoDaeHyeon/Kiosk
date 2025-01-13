package com.example.kiosk.Lv1;

import java.util.Scanner;

public class Kiosk {
    private Menu menu;

    public Kiosk() {
        menu = new Menu();
        // 메뉴 항목 추가
        menu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu.displayMenu();
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            MenuItem selectedItem = menu.getMenuItem(choice - 1);
            if (selectedItem != null) {
                System.out.println("선택한 메뉴: " + selectedItem.getName());
                System.out.println("가격: W " + selectedItem.getPrice());
                System.out.println("설명: " + selectedItem.getDescription());
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
        scanner.close();
    }
}
package com.example.Kiosk.Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus;

    public Kiosk() {
        // Kiosk 내 메뉴 초기화
        menus = new ArrayList<>();
        initializeMenus();
    }

    private void initializeMenus() {
        // Burgers 메뉴 생성
        Menu burgers = new Menu("Burgers");
        burgers.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger", 6.9, "프레디토 반과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Drinks 메뉴 생성
        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("Coke", 2.0, "콜라"));
        drinks.addMenuItem(new MenuItem("Sprite", 2.0, "사이다"));

        // Desserts 메뉴 생성
        Menu desserts = new Menu("Desserts");
        desserts.addMenuItem(new MenuItem("Ice Cream", 3.5, "바닐라 아이스크림"));

        // 메뉴 추가
        menus.add(burgers);
        menus.add(drinks);
        menus.add(desserts);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategory());
            }
            System.out.println("0. 종료");

            System.out.print("번호를 입력하세요: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice > 0 && choice <= menus.size()) {
                menus.get(choice - 1).displayMenu(scanner);
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
        scanner.close();
    }
}

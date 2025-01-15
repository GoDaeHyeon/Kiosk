package com.example.Kiosk.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();

        // 메뉴 아이템 추가
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 프로그램 실행
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("0 \t 종료");

            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + " \t " + menuItems.get(i));
            }

            System.out.print("메뉴 번호를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice > 0 && choice <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(choice - 1);
                System.out.println("선택한 메뉴: " + selectedItem.getName());
                System.out.println("가격: " + selectedItem.getPrice());
                System.out.println("설명: " + selectedItem.getDescription());
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}

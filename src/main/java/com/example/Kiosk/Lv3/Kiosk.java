package com.example.Kiosk.Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems; // 메뉴 리스트
    private Scanner scanner;

    // 생성자
    public Kiosk() {
        menuItems = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeMenu(); // 초기 메뉴 설정
    }

    // 메뉴 초기화
    private void initializeMenu() {
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    // 프로그램 시작
    public void start() {
        while (true) {
            printMenu(); // 메뉴 출력
            System.out.print("메뉴 번호를 선택하세요 (0: 종료): ");
            int choice = scanner.nextInt();

            if (choice == 0) { // 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice > 0 && choice <= menuItems.size()) { // 유효한 메뉴 선택
                handleSelection(choice);
            } else { // 잘못된 입력 처리
                System.out.println("유효하지 않은 입력입니다. 다시 시도해주세요.");
            }
        }
    }

    // 메뉴 출력
    private void printMenu() {
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("0 \t 종료");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + " \t " + menuItems.get(i));
        }
    }

    // 선택한 메뉴 처리
    private void handleSelection(int choice) {
        MenuItem selectedItem = menuItems.get(choice - 1);
        System.out.println("선택한 메뉴: " + selectedItem.getName());
        System.out.println("가격: " + selectedItem.getPrice());
        System.out.println("설명: " + selectedItem.getDescription());
    }
}

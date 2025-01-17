package com.example.Kiosk.Lv5;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();

        Menu burgers = new Menu("Burgers");
        burgers.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger", 6.9, "프레쉬 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("Coke", 2.5, "콜라 500ml"));
        drinks.addMenuItem(new MenuItem("Sprite", 2.5, "사이다 500ml"));

        Menu desserts = new Menu("Desserts");
        desserts.addMenuItem(new MenuItem("Ice Cream", 3.5, "바닐라 아이스크림"));
        desserts.addMenuItem(new MenuItem("Brownie", 4.0, "초콜릿 브라우니"));

        kiosk.addMenu(burgers);
        kiosk.addMenu(drinks);
        kiosk.addMenu(desserts);

        kiosk.start();
    }
}
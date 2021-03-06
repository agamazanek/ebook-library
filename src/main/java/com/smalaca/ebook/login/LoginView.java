package com.smalaca.ebook.login;

import com.smalaca.ebook.communication.Response;

import java.util.Scanner;

public class LoginView {
    private final Scanner scanner;
    private final LoginController controller;

    public LoginView(Scanner scanner, LoginController loginController) {
        this.scanner = scanner;
        controller = loginController;
    }

    public void show() {
        System.out.println("Podaj login:");
        String login = scanner.next();
        System.out.println("Podaj hasło:");
        String password = scanner.next();

        Response response = controller.login(login, password);

        if (response.isSuccess()) {
            System.out.println("Witaj " + login + ".");
        } else {
            System.out.println(response.getMessage());
        }
    }
}

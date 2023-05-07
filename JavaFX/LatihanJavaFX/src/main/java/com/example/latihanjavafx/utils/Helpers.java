package com.example.latihanjavafx.utils;

import com.example.latihanjavafx.dataaccount.Account;
import com.example.latihanjavafx.dataaccount.AccountList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Helpers {

    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public boolean isValidLogin(String username, String password) {
        AccountList accountList = new AccountList();
        ArrayList<Account> accounts = accountList.getAccounts();

        for (Account account : accounts) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    protected void changePage(ActionEvent event, String page) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/com/example/latihanjavafx/" + page + ".fxml"));

//            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/latihanjavafx/" + page + ".fxml")));
        } catch (IOException e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }

        stage.setScene(new Scene(root, 1280, 720));
        stage.show();
    }
}

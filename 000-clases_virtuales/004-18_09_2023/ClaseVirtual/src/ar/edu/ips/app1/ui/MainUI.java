package ar.edu.ips.app1.ui;

import java.util.Date;
import java.util.Scanner;

import ar.edu.ips.app1.sql.CreateDB;
import ar.edu.ips.app1.sql.CreateTable;

public class MainUI extends CreateDB {

    public static void main(String[] args) {
        CreateDB db = new CreateDB();
        CreateTable ct = new CreateTable();
        MainUI mu = new MainUI();
        mu.miProtected();
        String s = new String("Hola");
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        Date hoy = new Date();
        // java.sql.Date hoy2 = new java.sql.Date(System.currentTimeMillis());
    }
    
    void otroMetodo() {
        miProtected();
    }
}

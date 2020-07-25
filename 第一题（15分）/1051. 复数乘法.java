package com.daq.gread15;

import java.util.Scanner;

/**
 * 1051 ¸´Êý³Ë·¨ (15·Ö)
 * @author daq
 *
 */
public class main51 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        double p1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double p2 = sc.nextDouble();
        
        double a = r1 * Math.cos(p1) * r2 * Math.cos(p2) - r1 * Math.sin(p1) * r2 * Math.sin(p2);
        double b = r1 * Math.sin(p1) * r2 * Math.cos(p2) + r2 * Math.sin(p2) * r1 * Math.cos(p1);

        if (Math.abs(a) <= 0.001) {
            System.out.print("0.00");
        } else {
            System.out.printf("%.2f", a);
        }

        if (b > 0) {
            System.out.printf("+%.2fi", b);
        } else if (Math.abs(b) <= 0.001) {
            System.out.print("+0.00i");
        } else {
            System.out.printf("%.2fi", b);
        }
    }}

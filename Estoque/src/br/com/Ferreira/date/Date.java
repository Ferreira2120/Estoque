package br.com.Ferreira.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {

    public void validade(String receberVal) {
        Scanner sc = new Scanner(System.in);

        LocalDate dataRecebida = LocalDate.parse(receberVal, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate dataConvertida = LocalDate.parse(receberVal, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate date = LocalDate.now();



        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("A validade do produto è: " + date.format(format));

        if (date.equals(dataConvertida)) {
            System.out.println("Produto vencido!!");
        }else {
            System.out.println("Produto pode ser consumido");
        }

        date.format(format);

    }



}

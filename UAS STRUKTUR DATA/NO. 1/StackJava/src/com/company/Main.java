package com.company;

import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {

        System.out.println("DAFTAR BARANG TOKO DELIMA JAYA");
        System.out.println("====================");
        System.out.println("\n");

       Employee CocaCola = new Employee("cocacola","minuman",5000);
       Employee Fanta = new Employee("Fanta","minuman",5000);
       Employee Momogi = new Employee("momogi","makanan",1000);
       Employee Moring = new Employee("moring","makanan",1000);
       Employee Garpit = new Employee("garpit","roko",21000);
       Employee Sunlight = new Employee("sunlight","pembersih",6000);

        LinkedStack stack = new LinkedStack();

// stack push adalah perintah untuk menambahkan data pada program
        stack.push(CocaCola);
        stack.push(Fanta);
        stack.push(Momogi);
        stack.push(Moring);
        stack.push(Garpit);
        stack.push(Sunlight);



        stack.printStack();

        System.out.println("============");

        // stack peek adalah perintah untuk menampilkan data paling atas
        System.out.println(stack.peek());

        // stack pop adalah perintah untuk mengeluarkan atau menghapus data yang paling atas
        stack.pop();

        System.out.println("=============");

        //stack print adalah perintah untuk menampilkan keseluruhan data
        stack.printStack();

        //stack size adalah perintah untuk mengetahui jumlah data
        System.out.println(stack.size());



    }
}

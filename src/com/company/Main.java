package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] array;
        int x,y,sum = 0,i,j;
        //khai bao kich thuoc
        System.out.println("Nhap vao chieu dai cua mang:");
        x = scanner.nextInt();
        System.out.println("Nhap vao chieu rong cua mang:");
        y = scanner.nextInt();
        //khai bao mang nhap gia tri
        array = new int[x][y];
        for(i=0;i<array.length;i++){
            for(j=0;j<array[i].length;j++){
                System.out.println("Nhap gia tri cho toa do"+(i+1)+"-"+(j+1)+":");
                array[i][j]=scanner.nextInt();
            }
        }
        //in ra danh sach gia tri
        for(i=0;i<array.length;i++){
            System.out.print("\n");
            for(j=0;j<array[i].length;j++){
                System.out.print("\t"+array[i][j]+"\t");
            }
        }
        //tinh va in ra tong gia tri cac phan tu trong cot xac dinh
        int choice;
        System.out.print("\nChon 1 cot muon tinh tong:");
        choice = scanner.nextInt();
        for(i=0;i<array.length;i++){
            for(j=0;j<array[i].length;j++){
                if(j==(choice-1)){
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.print("\n Tong cac gia tri trong cot da chon:"+sum);
    }
}

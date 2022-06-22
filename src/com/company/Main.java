package com.company;

public class Main {

    public static void main(String[] args){
        suma(4,5,6);
        Auto miAuto= new Auto();
        miAuto.addDoor();
        miAuto.addDoor();
        miAuto.addDoor();
        System.out.println(miAuto.doorNumber);

    }

    public static void suma(int a, int b,int c){
        System.out.println(a+b+c);
    }


}
class Auto{
    public int doorNumber=4;
    public void addDoor(){
        this.doorNumber++;
    }
    public void showDoorNumber(){
        System.out.println(this.doorNumber);
    }

}

package com.company;


import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{
        Singleton s = Singleton.getInstance();
        s.name = "Andrey";
        s.num = 13;
        s.f = 2.7f;
        s.c = 'M';
        Singleton s2 = (Singleton)s.clone();
        s2.name = "Bogdan";
        s2.c = 'H';
        s.talk();
        s2.talk();
    }
}

class Singleton implements Cloneable {

    private static Singleton instance;
    String name;
    int num;
    float f;
    char c;
    private Singleton() {
    }
    public void talk(){
        System.out.println(name + ' ' + num +' ' + f + ' ' + c);
    }
    public static Singleton getInstance() {
       if(instance == null){
            instance = new Singleton();
       }
       return instance;
    }
    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }
}





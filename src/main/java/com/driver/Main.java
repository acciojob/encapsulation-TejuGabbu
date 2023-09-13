package com.driver;

public class Main
{
    public static void main(String[] args)
    {
        RWOnly rwOnly = new RWOnly();
        rwOnly.setName("tejas");
        String result = rwOnly.getName();
        System.out.println(result);
    }
}
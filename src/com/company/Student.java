package com.company;

public class Student {

        int id;
        String name;

        public Student(int i,String n)
        {
            id=i;
            name=n;
        }

        public void disp()

        {
            System.out.println("Name:"+name);
            System.out.println("ID:"+id);
        }
        public static void main(String[] args)
        {

            Student obj=new Student(1,"sri");
            obj.disp();
            System.out.println("some changes made in the main");

        }

    }



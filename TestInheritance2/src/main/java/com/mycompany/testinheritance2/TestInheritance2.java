package com.mycompany.testinheritance2;
public class TestInheritance2 
{

    public static void main(String[] args) 
    {
       SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); 
 
    }
}


//output ==>
//9
//6
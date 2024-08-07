package p3;

import p1.P;

public class P3 extends p1.P  { // ke thua tu p1.P
    
    private void test (){
        P firstObj  =  new P();
        firstObj.a = 10;
        // firstObj.b = 11; 
        super.c = 12; // protected
    
    }
     public static void main(String[] args) {
       
    }
}

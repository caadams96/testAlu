package org.Corey;

public class onebitALU {

    public int a;
    public int b;

    public int CarryIn;
    public int CarryOut;

    public int adderOutput;
    public int andOutput;
    public int orOutput;
    public int inverterOutput;
    public int multiplexorOutput;

    //Constructors
    public onebitALU(){
        this.a = 0;
        this.b = 0;
    }
    public onebitALU(int a, int b,int carryIn) {
        this.a = a;
        this.b = b;
        this.CarryIn = carryIn;
    }
    ////SETTERS
    public void setA(int input){
        this.a = input;
    }
    public void setB(int input){
        this.b = input;
    }
    //Functions
    public int AND(int a,int b){
        andOutput = a * b;
        return andOutput;
    };
    public int INVERTER(int a){
     if(a==0){
         inverterOutput = 1;
     }else {
         inverterOutput = 0;
     }
     return inverterOutput;
    }
    public int MULTIPLEXOR(int option){

        switch (option){
            case 0:
                multiplexorOutput = andOutput;
                break;
            case 1:
                multiplexorOutput = orOutput;
                break;
        }
        return  multiplexorOutput;

    }
    public  int OR(int a, int b){
        orOutput = a + b;
        if(orOutput>1){
            orOutput = 1;
        }
        return orOutput;
    }
    public void ADDER(int a, int b, int CarryIn){
        int i = 0;
        if(a == 1 ){
            ++i;
        }
        if (b == 1) {
            ++i;
        }
        if(CarryIn == 1){
            ++i;
        }
        if(i==1 || i == 3){
            adderOutput = 1;
        }else {
            adderOutput = 0;
        }

        CarryOut = OR(OR(AND(b,CarryIn),AND(a,CarryIn)),AND(a,b));

       // CarryOut = OR(OR((b*CarryIn),(a*CarryIn)),(a*b));
    }
    public void run(){
        andOutput = AND(a,b);
       orOutput = OR(a,b);
       ADDER(a,b,CarryIn);
    }
}

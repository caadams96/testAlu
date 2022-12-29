package org.Corey;

import java.util.ArrayList;

public class bitALU {

    public int a,b;
    public int CarryIn,CarryOut;

    public int sum;


    public int adderOutput;
    public int andOutput;
    public int orOutput;
    public int inverterOutput;
    public int multiplexorOutput;

    public bitALU(){
        this.a = 0;
        this.b = 0;
        this.CarryIn = 0;
    }

    public void setA(int a ){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public void setCarryIn(int carryIn){
        this.CarryIn = carryIn;

    }

    public  void setInput(int a, int b, int carryIn){
        this.a = a;
        this.b = b;
        this.CarryIn = carryIn;

    }


    public int AND(int a,int b){
        andOutput = a * b;
        return andOutput;


    }
    public int OR(int a, int b){
        orOutput = a + b;
        if(orOutput>1){
            orOutput = 1;
        }
        return  orOutput;
    }

    public void ADDER(){
        int[] inputs = {a,b,CarryIn};
        int x,y,z;
        int j = 0;
        for(int i = 0; i<=inputs.length-1; ++i){
            if(inputs[i] == 1){
                ++j;
            }
        }
        if(j == 1 || j == 3){
            sum = 1;
        }else{
            sum = 0;
        }
        x = AND(CarryIn,a);
        y = AND(CarryIn,b);
        z = AND(a,b);
        CarryOut = OR(OR(x,y),z);
    }

    public int MULTIPLEXOR(int op){
        int output = 0;
        switch (op){
            case 0:
                andOutput = AND(a,b);
                output = andOutput;
                break;
            case 1:
                orOutput = OR(a,b);
                output  =orOutput;
                break;
            case 2:
                ADDER();
                output = sum;
                break;
        }
        return output;
    }




}

package org.Corey;

public class Main {
    public static void main(String[] args) {

        bitALU alu0 = new bitALU();
        alu0.setInput(1,1,1);
        int sum = alu0.MULTIPLEXOR(2);






        System.out.println( alu0.CarryOut);
        System.out.println( sum);

//
//        System.out.println(alu0.andOutput);
//        System.out.println(alu0.orOutput);


//        onebitALU alu1 = new onebitALU();
//        alu1.CarryIn = 1;
//        alu1.setA(0);
//        alu1.setB(0);
//        alu1.run();
//        alu1.orOutput = alu1.OR(alu1.a, alu1.b);
//        System.out.println("OR: "+alu1.orOutput);
//
//        System.out.println("Carryout: "+alu1.CarryOut);
//
//        System.out.println("SUM: "+alu1.adderOutput);


//
//        alu1.run();
//       // alu1.setA(alu1.INVERTER(alu1.a));
//        int s = alu1.adderOutput;
//        int o = alu1.CarryOut;
//        int i = alu1.CarryIn;

//        onebitALU alu2 = new onebitALU(1,1,alu1.CarryOut);
//        alu2.run();
//
//        onebitALU alu3 = new onebitALU(1,1,alu2.CarryOut);
//        alu3.run();
//
//        onebitALU alu4 = new onebitALU(0,0,alu3.CarryOut);
//        alu4.run();


//        System.out.println(alu1.adderOutput);
//        System.out.println(alu1.orOutput);

        // System.out.println(alu1.MULTIPLEXOR(1));
//        System.out.println(alu2.sum);
//        System.out.println(alu3.sum);
//        System.out.println(alu4.sum);








//        System.out.println("A: "+alu.a);
//        System.out.println("B: "+alu.b);
//        System.out.println("CarryIn: "+i);
//        System.out.println("CarryOut: "+o);
//        System.out.println("SUM: "+s);
//        System.out.println("\n");
//        alu.CarryIn = o;

//        alu.setA(1);
//        alu.setB(1);
//        alu.run();
//        s = alu.sum;
//        o = alu.CarryOut;
//        i = alu.CarryIn;
//
//
//        System.out.println("A: "+alu.a);
//        System.out.println("B: "+alu.b);
//        System.out.println("CarryIn: "+i);
//        System.out.println("CarryOut: "+o);
//
//        System.out.println("SUM: "+s);
//        System.out.println("\n");
//        alu.CarryIn = o;
//
//        alu.setA(1);
//        alu.setB(1);
//        alu.run();
//        s = alu.sum;
//        o = alu.CarryOut;
//        i = alu.CarryIn;
//
//        System.out.println("A: "+alu.a);
//        System.out.println("B: "+alu.b);
//        System.out.println("CarryIn: "+i);
//        System.out.println("CarryOut: "+o);
//
//        System.out.println("SUM: "+s);
//        System.out.println("\n");
//        alu.CarryIn = o;
//
//        alu.setA(0);
//        alu.setB(0);
//        alu.run();
//        s = alu.sum;
//        o = alu.CarryOut;
//        i = alu.CarryIn;
//
//        System.out.println("A: "+alu.a);
//        System.out.println("B: "+alu.b);
//        System.out.println("CarryIn: "+i);
//        System.out.println("CarryOut: "+o);
//
//        System.out.println("SUM: "+s);
//        System.out.println("\n");
//        alu.CarryIn = o;

    }
}
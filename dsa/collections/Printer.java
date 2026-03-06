package dsa.collections;

public class Printer<T>  {//here <T>is the generic type data
    T data;
    Printer(T data) {
        this.data = data;
    }
    void printValue(){
        System.out.println("Data:"+data);
    }
//In collection we cant use primitive data type it should be caps only
    public static void main(String[] args) {
        Printer<Integer> integerPrinterprinter = new Printer<>(1);
        Printer<String > stringPrinter=new Printer<>("Java");
        Printer<Boolean > booleanPrinter=new Printer<>(true);
        Printer<Float > floatPrinter=new Printer<>(1.2f);
        Printer<Double> doublePrinter=new Printer<>(1.34);//can be 1.34d
        integerPrinterprinter.printValue();
        stringPrinter.printValue();
        booleanPrinter.printValue();
        floatPrinter.printValue();
        doublePrinter.printValue();

    }
}

package Calculator;

public class Calculator {
    double numA;
    double numB;
    double result;

    Calculator() {
       super();
    }

    public void Add(double numA, double numB) {
        result = numA + numB;
    }

    public void Subtraction(double numA, double num) {
        result = numA - numB;
    }

    public void Multi(double numA, double num) {
        result = numA * numB;
    }

    public void Division(double numA, double num) {
        result = numA / numB;
    }


}

package ar.com.ada.oop.overloading;

public class Arithmetic {

    public Integer sum(Integer valor1, Integer valor2) {
        Integer result = valor1 + valor2;
        return result;
    }
    public Integer sum(Integer valor1, int valor2) {
        Integer result = valor1 + valor2;
        return result;
    }
    public Integer sum(int valor1, Integer valor2) {
        Integer result = valor1 + valor2;
        return result;
    }
    public int sum(int valor1, int valor2) {
        int result = valor1 + valor2;
        return result;
    }
    public double sum(double valor1, double valor2) {
        double result = valor1 + valor2;
        return result;
    }
    public Double sum(Double valor1, Double valor2) {
        Double result = valor1 + valor2;
        return result;
    }
    public Double sum(Double valor1, double valor2) {
        Double result = valor1 + valor2;
        return result;
    }
    public Double sum(double valor1, Double valor2) {
        Double result = valor1 + valor2;
        return result;
    }


}

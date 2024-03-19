package projetoavaliativo;
public class Divisao extends Abstract implements Ioperacoes{ 

    @Override
    public double Operacao(double num1, double num2) {
        double resultado = num1 / num2;
        setResultado(resultado);
        if(num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitido!");
        }
        return resultado;
    }

    @Override
    public double Operacao(int num1, int num2) {
        return 0;
    }
      
}

package projetoavaliativo;
public class Multiplicacao extends Abstract implements Ioperacoes{

    @Override
    public double Operacao(double num1, double num2) {
        double resultado = num1 * num2;
        setResultado(resultado);
        return resultado;
    }

    @Override
    public double Operacao(int num1, int num2) {
     return 0;
    }
    
}

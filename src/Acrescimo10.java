import java.util.Scanner;
public class Acrescimo10 {
    public static void main(String[] args) throws Exception {
        double produto,produto10,np;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        produto = input.nextDouble();
        produto10 = produto  *10/100;
        np=produto10 + produto;
        System.out.println("Com um acrescimo de 10%, o valor é de " + np);
input.close();
    }

    public Double produto(double  produto) {
        return produto;
    }

    public Double produto10(double produto10) {
        return produto10;
    }

    public Double np(double np) {
        return np;
    }
}

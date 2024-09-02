package dominio;

public class Atributes {
    public String nome;
    public byte idade;
    public double salario01;
    public double salario02;
    public double salario03;
    private String nomeDaPessoa;

    public void imprimir() {
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("salario 1: " + this.salario01);
        System.out.println("salario 2: " + this.salario02);
        System.out.println("salario 3: " + this.salario03);

    }

    public void mediaSalariao(double salario01, double salario02, double salario03) {
        double total = (salario01 + salario02 + salario03);
        total /= 3;
        System.out.println(total);
    }

    public void setNomeDaPessoa(String x) {
        nomeDaPessoa = x;

    }
public String getNomeDaPessoa(){
    System.out.println(nomeDaPessoa);

    return "";
}


}




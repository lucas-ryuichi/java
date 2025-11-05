import java.util.ArrayList;
 public class Produto {
 private String nome;
 private double preco;
  private int codigo;
  public Produtos(String nome, int codigo, double preco){
this.nome = nome;
this.preco = preco;
this.codigo = codigo;
  }
  public String getNome(){
    return nome;
  }
  public void setNome(String n){
this.nome = n;
  }
  public int getCodigo(){
return codigo;
  }
  public void setCodigo(int i){
this.codigo = i;
  }
  public double getPreco(){
    return preco;
  }
  public void setPreco(double p){
this.preco = p;
  }

  public String toString(){
    return"";
  }
}
    



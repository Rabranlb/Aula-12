public class Principal {
    public static void main(String args[]){

        Novo n=new Novo();
        n.setEndereco(" Rua Japão, Pompeia SP ");
        n.setPreco(500000);
        n.setPrecoAdicional(250);
        System.out.println("Endereço -> "+n.getEndereco()+"Preço -> "+n.getPreco()+"Preço adicional -> "+n.getPrecoAdicional());
    
    Velho v=new Velho();
    v.setEndereco(" Rua Kazukit Yassuda, Pompeia SP ");
    v.setPreco(5000000);
    v.setDescontoPreco(3000);
    System.out.println("Endereço -> "+v.getEndereco()+"Preço -> "+v.getPreco()+"Desconto -> "+v.getDescontoPreco());
}
}

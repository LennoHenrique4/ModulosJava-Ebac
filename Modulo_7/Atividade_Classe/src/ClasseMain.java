public class ClasseMain {

    public static void main(String arg[]) {

        Vendedor vendedor = new Vendedor();

        System.out.println("...Ficha do vendedor...");

        vendedor.cadastrarNome("Lenno");
        System.out.print("Vendedor: ");
        System.out.println(vendedor.getNome());;

        vendedor.cadastrarCodigo(01);
        System.out.print("Codigo do Vendedor: ");
        System.out.println(vendedor.getCodigoVendedor());

        vendedor.cadastrarEnderecoVendedor("Rua Olá Mundo");
        System.out.print("Endereço do Vendedor: ");
        System.out.println(vendedor.getEnderecoVendedor());

        vendedor.cadastrarQuantidadeVenda(15);
        System.out.print("Quantidade de vendas: ");
        System.out.println(vendedor.getQuantidadeVenda());

//         Tá feito!
    }

}


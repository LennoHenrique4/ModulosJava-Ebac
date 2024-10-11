public class Vendedor {

    private String nome;

    private int codigoVendedor;

    private String enderecoVendedor;

    private int quantidadeVenda;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getEnderecoVendedor() {
        return enderecoVendedor;
    }

    public void setEnderecoVendedor(String enderecoVendedor) {
        this.enderecoVendedor = enderecoVendedor;
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    public void cadastrarNome(String nome) {
        setNome(nome);
    }

    public void imprimirNome() {
        System.out.println(this.nome);
    }

    public void cadastrarCodigo(int codigoVendedor) {
        setCodigoVendedor(codigoVendedor);
    }

    public void imprimirCodigoVendedor() {
        System.out.println(this.codigoVendedor);
    }

    public void cadastrarEnderecoVendedor(String enderecoVendedor) {
        setEnderecoVendedor(enderecoVendedor);
    }

    public void imprimirEnderecoVendedor() {
        System.out.println(this.enderecoVendedor);
    }

    public void cadastrarQuantidadeVenda(int quantidadeVenda) {
        setQuantidadeVenda(quantidadeVenda);
    }

    public void imprimirQuantidadeVenda() {
        System.out.println(this.quantidadeVenda);
    }
}

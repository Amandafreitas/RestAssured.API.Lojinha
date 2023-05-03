package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComValorIgualA(double valor){

        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Computador Sony Vayo");
        produto.setProdutoValor(valor);
        produto.setProdutoUrlMock("");

        List<String> cores = new ArrayList<>();
        cores.add("branco");
        cores.add("preto");

        produto.setProdutoCores(cores);

        List<ComponentePojo> componentes = new ArrayList<>();
        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Cabo carregador");
        componente.setComponenteQuantidade(1);
        componentes.add(componente);

        ComponentePojo segundoComponente = new ComponentePojo();
        segundoComponente.setComponenteNome("caixa");
        segundoComponente.setComponenteQuantidade(1);
        componentes.add(segundoComponente);
        produto.setComponentes(componentes);

        return produto;
    }
}

package cotiinformatica;

import cotiinformatica.services.ProdutoService;

public class Main {

    static void main() {

        //Criando um objeto da classe de serviço:
        var produtoService = new ProdutoService();

        produtoService.cadastrarProduto();
    }
}

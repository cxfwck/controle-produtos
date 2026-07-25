package cotiinformatica.services;

import cotiinformatica.entities.Produto;
import cotiinformatica.enums.Categoria;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class ProdutoService {

    /*
        Método para fazer com que o usuário entre com os dadoos
        de  umm produto para realizar o seu cadastro
     */
    public void cadastrarProduto(){

        //criando um objeto da  classe Scannner
        var scanner = new Scanner(System.in);

        //criando um objetoo da classe Produto
        var produto = new Produto();

        produto.id = UUID.randomUUID();
        produto.dataHoraCadastro = LocalDateTime.now();

        System.out.println("\nCADASTRO DE PRODUTO:\n");

        System.out.print("INFORME O NOME DO PRODUTO...: ");
        produto.nome = scanner.nextLine();

        System.out.print("INFORME O PREÇO DO PRODUTO...: ");
        produto.preco = Double.parseDouble(scanner.nextLine());

        System.out.print("INFORME A QUANTIDADE...: ");
        produto.quantidade = Integer.parseInt(scanner.nextLine());

        for(var item : Categoria.values()){
            System.out.println("\t" + item);

        }

        System.out.println("INFORME A  CATEGORIA.......:");
        produto.categoria = Categoria.valueOf(scanner.nextLine().toUpperCase());

        //TODO Gravação em banco de  dados
    }
}

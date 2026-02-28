fun main(){
    var saldo = 100.toDouble()
    val estoqueNome = mutableListOf<String>()
    val estoquePreco = mutableListOf<Double>()

    while (true){
        println("escolha uma opção: 1-Compra, 2-Venda, 3-Estoque, 4-financeiro ou 5-sair")
        val opcao = readln().toInt()
        if (opcao == 5){
            println("Saindo...")
            break
        }

        when (opcao) {
            1 -> {
                println("voce escolheu a opção de compra")
                print("digite o nome do produto que deseja comprar: ")
                val nomeDoProduto = readln()
                estoqueNome.add(nomeDoProduto)
                print("digite o valor: ")
                val valorDoProduto = readln()
                estoquePreco.add(valorDoProduto.toDouble())
                saldo = saldo - valorDoProduto.toDouble()
                println("saldo seu saldo é de $saldo ")

            }
            2 -> {
                println("voce escolheu a opção de venda")
                print("digite o nome do produto que deseja vender: ")
                val nomeDoProdutoParaVenda = readln()

                val lugarGuardadoProduto = estoqueNome.indexOf(nomeDoProdutoParaVenda)

                if (lugarGuardadoProduto != -1){

                    val precoOriginalDoProduto = estoquePreco[lugarGuardadoProduto]
                    val valorVenda = precoOriginalDoProduto* 1.05

                    estoqueNome.removeAt(lugarGuardadoProduto)
                    estoquePreco.removeAt(lugarGuardadoProduto)

                    saldo = saldo + valorVenda
                    println("Com a venda voçê ganho 5% de cash back e agora seu saldo é de $saldo ")
                }

            }
            3 -> {
                println("voce escolheu a opção de estoque")
                println("Os produtos que temos em estoques são: $estoqueNome")
            }
            4 -> {
                println("voce escolheu a opção de financeiro")
                println("O valor em caixa é de $saldo")
            }

        }

    }
}
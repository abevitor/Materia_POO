10 - Por conta de que o subtotal depende de duas infos, o preço do produto e a quantidade que foi comprada.
O produto conhece seu preço mas nao sabe quantas quantidades foram colocadas. Por isso quem calcula o subtotal é o itemPedido.

11 - Porque o Pedido possui vários ItemPedido e o total é a soma do subtotal de todos.
O Pedido é responsável por calcular o valor total da compra.

12 - Porque um produto pode exisitr independente de um pedido.
Por exemplo, um mouse existe no sistema mesmo que ninguém tenha comprado ainda.
Além disso, fazer o Produto conhecer Pedido criaria uma responsabilidade desnecessária para a classe.

13 -  Sim, um cliente pode existir sem pedido. Isso indica que o Cliente é independente de um Pedido. Portanto existe sim uma relação entre eles, mas a existência de um não depende do outro.

14 - Sim, um produto pode estar cadastrado no sistema e não estar em nenhum pedido. Isso indica que o produto pode existir independentemente de itemPedido.

15 - Conceitualmente, não muito. O itemPedido representa um produto dentro de uma compra específica. existe justamente para representar um item de um pedido. Mas tecnicamente o código que eu fiz permita criar ItemPedido item = new ItemPedido(produto, 2); sem adiciona-lo em um Pedido. Isso caracteriza uma relação mais forte entre Pedido e ItemPedido.

16 - Um exemplo no projeto é 
Pedido pedido = new Pedido(cliente);

O pedido possui uma ref para Cliente

private Cliente cliente.

isso representa uma associação entre Pedido e Cliente

17 - A principal diferença esta na dependência do ciclo de vida. 
Agregação permite que os objetos podem existir separadamente.
Ou seja um cliente pode existir sem pedido, o conceito do cliente não desaparece caso um pedido deixe de existir.

Composição: o objeto "parte" depende do objeto "todo"
O ItemPedido representa uma parte daquele pedido. Se o pedido for elimiando do sistema, os items que pertenciam a esse pedido exclusivamente deixam de fazer sentido.

18 - CalculadoraDesconto.java
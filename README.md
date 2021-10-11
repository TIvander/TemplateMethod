# TemplateMethod
Atividade escolar utilizando padrão Template Method
Para utilização do padrão, usei como exemplo a criação de cartões de crédito. Inicialmente, os cartões podem ser gerados como "VIP" ou "COMUM", porém um cartão comum pode ganhar status "VIP" caso seu valor em créditos ultrapasse 5000, e um cartão "VIP"
pode ter o status alterado para "COMUM" caso seu saldo em créditos seja reduzido para um valor menor que 5000. No caso de testes, os cartões são instanciados e após a inserção dos valores, é realizado uma validação do seu tipo que alterna entre VIP e Comum, seguindo a regra do valor.

UTILIZANDO MÉTODOS PARA OS EXERCÍCIOS ABAIXO:

*MÉTODOS DE CRIAÇÃO*

1. Calcule as 4 operações básicas: soma, subtração, divisão e multiplicação. Sempre passando 2 valores.

2. A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde ou Boa noite.

3. Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influencia. 
Defina arbitrariamente as faixas que influenciam nos valores.

*MÉTODO DE SOBRECARGA*

1. Utilizando sobrecarga de método, crie uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.

*COMPREENDENDO O RETURN*

Alguns exemplos:

1. O método é uma String, logo seu retorno é uma mensagem > String
    public String getMensagem(){
        return "Olá mundo!";
    }

2. O método é um double, logo seu retorno também é um double
    public double getJuros(){
        return 2.36;
    }

MODELOS QUE IRÃO GERAR ERRO:
3. O método é um int, porém seu retorno está sendo um float
    public int getParcelas(){
        return 1.36f;
    }

4. O método é um void, void não retorna nenhum valor
    public void setIdade(){
        return 10;
    }
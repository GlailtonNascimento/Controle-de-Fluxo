# Projeto: Controle de Fluxo

## Descrição

Este projeto em Java realiza uma contagem incremental entre dois números fornecidos pelo usuário. Ele inclui tratamento de exceções personalizadas e oferece ao usuário a opção de reiniciar o processo em caso de erro. O projeto é uma ferramenta educativa para aprender conceitos fundamentais de controle de fluxo, tratamento de exceções e interações com o usuário em Java.

## Tecnologias Utilizadas

- <span style="color:blue">Java</span>
- <span style="color:green">Controle de Fluxo</span>
- <span style="color:red">Exceções Personalizadas</span>

## Funcionalidades

1. Solicitar dois números inteiros do usuário.
2. Realizar a contagem incremental entre os dois números.
3. Lançar uma exceção personalizada se o primeiro número for maior que o segundo.
4. Perguntar ao usuário se deseja tentar novamente em caso de erro.
5. Perguntar ao usuário se deseja realizar uma nova contagem após uma operação bem-sucedida.

## Estrutura do Código

| Função/Método                  | Descrição                                                                 |
|--------------------------------|---------------------------------------------------------------------------|
| `main(String[] args)`          | Função principal que inicia a execução do programa.                        |
| `contar(int primeiroNumero, int segundoNumero)` | Método responsável por realizar a contagem entre dois números.            |
| `ParametrosInvalidosException` | Classe de exceção personalizada para lidar com parâmetros inválidos.       |
| `Scanner`                      | Importação para permitir entrada de dados do usuário pelo terminal.        |

## Trechos Importantes

### Exceção Personalizada

```java
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
### Lógica de Contagem e Tratamento de Exceções

O método `contar(int primeiroNumero, int segundoNumero)` é responsável por realizar a contagem incremental entre os dois números fornecidos pelo usuário. Antes de iniciar a contagem, ele verifica se o primeiro número é menor que o segundo número. Caso contrário, lança uma exceção `ParametrosInvalidosException`. Esta verificação garante que a contagem seja realizada corretamente.

```java
static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
    if (primeiroNumero >= segundoNumero) {
        throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
    }

    System.out.println("Contando...");
    for (int i = 1; i <= (segundoNumero - primeiroNumero); i++) {
        System.out.println("Imprimindo o número " + i);
    }
    System.out.println("Contagem concluída.");
}






## Conclusão

Este projeto não só cumpre a funcionalidade de contagem, mas também ensina e reforça práticas essenciais de programação em Java, como controle de fluxo e tratamento de exceções, tornando-se um recurso valioso para o aprendizado e prática de programação.


## Conclusão

Este projeto não só cumpre a funcionalidade de contagem, mas também ensina e reforça práticas essenciais de programação em Java, como controle de fluxo e tratamento de exceções, tornando-se um recurso valioso para o aprendizado e prática de programação.

Para mais informações e contato, você pode visitar o [meu perfil do LinkedIn](https://www.linkedin.com/in/glailtonsantannadonascimento-b75413116/).

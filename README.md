# ACADEMIA Capgemini

## DESAFIO DE PROGRAMAÇÃO 02

O desafio têm três Questões de Programação:

- **Questão 1 :**
  
  A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.
  
  Exemplo:
  
  **Entrada:**
  
  arr = [9, 2, 1, 4, 6]
  
  **Saída**:
  
  4

- **Questão 2:**
  
  Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.
  
  Exemplo:
  
  **Entrada:**
  
  n = [1, 5, 3, 4, 2]
  
  **Saída:**
  
  3

- **Questão 3:**

Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

![](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7BT%7D)<=linha<=coluna<=![](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7BT%7D)

- Considere T, como o tamanho do texto.
- Se certifique de que linhas x colunas >= ![](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=T).
- Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.

Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.

Exemplos:

Exemplo 1)

**Entrada:**

s = tenha um bom dia

**Saída:**

taoa eum nmd hbi

Explicação:

Depois de remover os espaços, a string tem 13 caracteres. ![](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7B13%7D) está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:

tenh  
aumb  
omdi  
a

 O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.



## COMO TESTAR CADA QUESTÃO

1. Faça o clone do projeto do GitHub em sua máquina no link:  [GitHub - mig-ramos/desafio-capgemini](https://github.com/mig-ramos/desafio-capgemini)

2. Abrir o projeto MAVEN pelo arquivo POM.xml e baixar as dependências, no caso junit para teste de igualdade das saídas das classes das questões.



#### TEMOS DUAS FORMAS DE TESTAR:

- Com o *framework* **JUnit** ;

- Com a *class* **Main** de cada Questão.



##### *COM O FRAMEWORK JUNIT*

Na figura abaixo, temos as classes de teste:

![](https://github.com/mig-ramos/desafio-capgemini/blob/main/imgs/ClassesTest.png)

Selecionar o teste da questão desejada, escolher JUnit no menu da IDE, conforme figura abaixo:

![](https://github.com/mig-ramos/desafio-capgemini/blob/main/imgs/TesteQuestao1.png)



Como resultado a IDE mostra de forma colorida, no caso é verde, está tudo OK. Vide figura abaixo:

![](C:\Workspaces\ws-java\capgemini-2\desafio2\imgs\testeverde.png)

Ficar atento que o teste foi de igualdade, parte sublinhada da figura. O resultado foi 4 que era o esperado, se alterar o valor para a comparação, o teste vai dar negativo e vermelho, conforme figura abaixo.

![](C:\Workspaces\ws-java\capgemini-2\desafio2\imgs\testevermelho.png)

Estes testes são direcionadas para o tipo de saídas das questões, este foi exemplo, existe possibilidade de comparações para vários tipos de saída: inteiro, string, etc..



##### *COM A CLASSE MAIN DE CADA QUESTÃO*

Na figura abaixo, mostra o procedimento para teste pela própria classe principal de cada questão, no caso esta questão e´a 3:

![](C:\Workspaces\ws-java\capgemini-2\desafio2\imgs\tersteclassequestao.png)



Seleciona a classe principal da questão, escolhendo "rodar" como Java Application, o resultado está na figura abaixo:



![](C:\Workspaces\ws-java\capgemini-2\desafio2\imgs\resultadoclassequestao.png)

Note que nesta classe temos vários prints para o console, facilitando a verificação do funcionamento nas transformação da informação.

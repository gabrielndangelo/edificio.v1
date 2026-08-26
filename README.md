# ☕ Folha de Pagamento — Solar das Palmeiras

Microprojeto desenvolvido em Java para praticar conceitos introdutórios de **Programação Orientada a Objetos (POO)** por meio de um cenário administrativo fictício e realista.

## Contexto

O **Condomínio Residencial Solar das Palmeiras** precisa organizar de forma simples o cálculo da remuneração de seus funcionários.

O sistema permite informar o nome do funcionário, selecionar seu cargo, registrar seu tempo de empresa e gerar uma ficha de pagamento com salário-base, bônus, gratificação, desconto e remuneração final.

## Objetivo do projeto

O principal objetivo deste microprojeto é aplicar conceitos estudados no primeiro bloco de POO do curso de Java, evitando um exercício puramente matemático e simulando uma situação administrativa.

## Funcionamento

O fluxo principal do sistema é:

```text
INÍCIO
↓
Informar nome do funcionário
↓
Selecionar cargo
↓
Definir salário-base
↓
Informar tempo de empresa
↓
Calcular bônus
↓
Calcular gratificação
↓
Calcular desconto
↓
Calcular remuneração final
↓
Exibir folha de pagamento
↓
FIM
```

## Cargos disponíveis

O sistema possui cinco cargos fictícios:

| Cargo                     | Salário-base |
| ------------------------- | -----------: |
| Porteiro                  |  R$ 1.800,00 |
| Auxiliar de Apoio         |  R$ 1.650,00 |
| Zelador                   |  R$ 1.900,00 |
| Assistente Administrativo |  R$ 2.200,00 |
| Síndico                   |  R$ 3.500,00 |

Os salários são armazenados como constantes utilizando `static final`.

Exemplo:

```java
public static final double SALARIO_PORTEIRO = 1800.00;
```

## Bônus por tempo de empresa

O funcionário recebe um bônus de acordo com seu tempo de permanência no condomínio:

| Tempo de empresa | Bônus |
| ---------------- | ----: |
| Menos de 3 anos  |    5% |
| De 3 a 8 anos    |    8% |
| 9 anos ou mais   |   15% |

Essa regra é tratada pelo método:

```java
verAumento()
```

## Gratificação e desconto

Além do bônus por tempo de empresa, o sistema utiliza dois percentuais fixos:

```text
Gratificação: 10%
Desconto: 8%
```

Esses valores também são definidos como constantes:

```java
public static final double GRATIFICACAO = 0.10;
public static final double DESCONTO = 0.08;
```

## Cálculo da remuneração

A remuneração final segue a lógica:

```text
Salário-base
+ Bônus por tempo de empresa
+ Gratificação
- Desconto
= Remuneração final
```

## Exemplo de execução

```text
================================================
EDIFÍCIO SOLAR DAS PALMEIRAS
FOLHA DE PAGAMENTO
================================================
Funcionário: MARCOS SILVA
================================================
Cargo: PORTEIRO
Tempo de Empresa: 2 anos
================================================
Salário-base: R$ 1800,00
Bônus por tempo de Empresa: R$ 90,00
Gratificação: R$ 180,00
Descontos: R$ 144,00
================================================
REMUNERAÇÃO DO FUNCIONÁRIO: R$ 1926,00
```

## Estrutura do projeto

```text
SolarDasPalmeiras
│
├── Main.java
│
└── funcionario
    └── FuncionarioSolarPalmeiras.java
```

### `Main.java`

Responsável principalmente por:

* entrada de dados;
* exibição dos menus;
* seleção do cargo;
* uso do `switch/case`;
* chamada dos métodos;
* exibição da folha de pagamento.

### `FuncionarioSolarPalmeiras.java`

Responsável por:

* atributos do funcionário;
* salários-base;
* constantes;
* cálculo do bônus;
* cálculo da gratificação;
* cálculo do desconto;
* cálculo da remuneração;
* geração da ficha pelo `toString()`.

## Conceitos de Java praticados

Durante o projeto foram utilizados:

* classes e objetos;
* atributos;
* métodos;
* métodos `void`;
* membros estáticos;
* constantes `static final`;
* instanciação de objetos;
* `Scanner`;
* `switch/case`;
* `if / else if / else`;
* operadores aritméticos;
* formatação com `String.format()`;
* sobrescrita do método `toString()`.

## Aprendizados importantes

Durante o desenvolvimento, alguns pontos ajudaram a compreender melhor o funcionamento de Java e POO.

### `static` e `final`

`static` indica que determinado membro pertence à classe e é compartilhado pelos objetos.

`final` impede que o valor seja alterado.

Por isso os salários-base e percentuais fixos foram definidos com:

```java
static final
```

### Métodos e objetos

Os cálculos relacionados a um funcionário específico foram mantidos como métodos de instância.

Exemplo:

```java
funcionario.verAumento();
funcionario.calcularSalarioLiquido();
```

### `toString()`

O método `toString()` foi utilizado para gerar a ficha final do funcionário.

Assim, no programa principal basta utilizar:

```java
System.out.println(funcionario);
```

para exibir os dados formatados.

## Erros encontrados durante o desenvolvimento

Alguns erros ajudaram a consolidar o aprendizado.

### Quantidade de argumentos no `String.format()`

O `toString()` possuía mais marcadores de formatação do que valores fornecidos.

Exemplo:

```text
%.2f
%s
%d
```

Cada marcador precisa possuir um valor correspondente no `String.format()`.

### Cálculo de porcentagens

Inicialmente foi feita uma operação equivalente a:

```java
salarioBruto + 0.10 - 0.08
```

Porém, `0.10` representa o percentual, e não o valor correspondente a 10% do salário.

O cálculo correto precisa utilizar:

```java
salarioBruto * 0.10
```

### Ordem dos cálculos

A gratificação e o desconto não poderiam ser calculados antes da definição do salário-base.

Primeiro o cargo é selecionado e o salário é atribuído.

Depois os métodos realizam os cálculos.

## Testes realizados

Foram utilizados funcionários com diferentes tempos de empresa para verificar todas as faixas de bônus.

Exemplos:

```text
2 anos → bônus de 5%
5 anos → bônus de 8%
12 anos → bônus de 15%
```

Também podem ser testados os valores-limite:

```text
2 anos
3 anos
8 anos
9 anos
```

Isso permite verificar se as estruturas condicionais estão funcionando corretamente.

## Observação

Este projeto não busca reproduzir uma folha de pagamento brasileira real.

As regras de salários, bônus, gratificação e descontos são **fictícias** e foram definidas exclusivamente para fins de aprendizado.

O objetivo é praticar programação e regras de negócio de maneira simples e contextualizada.

## Evolução

Este projeto faz parte da fase de transição dos exercícios básicos de Java para microprojetos utilizando Programação Orientada a Objetos.

A intenção é preservar esta versão como registro do conhecimento atual e, futuramente, comparar com projetos desenvolvidos após o aprendizado de novos conceitos de Java.

## Autor

**Gabriel Dangelo**

Projeto desenvolvido em 2026 durante os estudos de Java e Programação Orientada a Objetos.

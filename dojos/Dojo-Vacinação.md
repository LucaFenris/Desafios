# Dojo Vacinação

## Cenário

Pensando na situação de vacinação contra a Covid-19, o objetivo deste dojo é descobrir quais pessoas de determinada cidade serão vacinadas, a cidade possui um limite de estoque das vacinas, para isso criou algumas regras para selecionar as pessoas que serão vacinadas até receberem novas doses da vacina.

- Apenas pessoas acima ou com de determinada idade poderão ser vacinadas.
  - Exemplo: Somente pessoas acima ou com 45 anos de idade poderão receber a vacina neste dia.
- Deve ser respeitado o limite de vacinas, chamando apenas a quantidade de pessoas igual a quantidade de vacinas, não poderão ser chamadas mais pessoas que a quantidade de vacinas.
- Deverão ser priorizadas as pessoas com a maior idade, ou seja, serão as primeiras a serem chamadas.
- Não precisa existir uma fila ou senhas.
- Caso exista mais vacinas que a quantidade de pessoas na faixa de idade para tomar vacina, deverão ser chamadas as próximas pessoas, respeitando a ordem de idade.
  - Exemplo: O limite da idade é 45 anos, e a quantidade de vacinas é igual a 100, entretanto só existem 90 pessoas com 45 anos ou mais, sendo assim poderão ser chamadas pessoas com menos de 45 anos, entretanto respeitando a idade, da mais velhas para mais nova, até chegar a 100 pessoas(o limite de vacinas).
- Para evitar a aglomeração, a vacinação será em dois locais da cidade, dividindo as pessoas nestes dois locais.
  - Utilize a criatividade para isso. :D
- No final, retorne quais pessoas serão vacinas, e em qual local.

## Dados

Exemplo de dados que devem existir em cada objeto.

### Locais

```json
{
  "localA": {
    "nome": "Posto A",
    "cep": "00.000-000"
  },
  "localB": {
    "nome": "Posto B",
    "cep": "11.111-000"
  }
}
```

### Pessoas

```json
[
  {
    "nome": "Josimar",
    "dataNascimento": "02/12/1970",
    "cep": "00.000-000"
  },
  {
    "nome": "Lucia",
    "dataNascimento": "05/09/1973",
    "cep": "11.111-11"
  }
]
```

### Limite Vacina

```json
{
  "limiteVacina": 10
}
```

### Retorno Pessoas Vacinadas

```json
[
  {
    "nome": "Josimar",
    "vacinado": true,
    "local": "localA"
  },
  {
    "nome": "Lucia",
    "vacinado": true,
    "local": "localA"
  }
]
```

> Os dados estão no formato JSON apenas para melhor visualização, fique a vontade para escolher como trabalhar com os mesmos

## Premissas de aceite

O código deve ser feito seguindo TDD, utilize a melhor organização de pacotes, classes, nomenclaturas, etc. Adicione métricas de coverage, aceite como bom acima de 80%, envie para o sonar, se estiver tudo como A, seu projeto está ótimo.

## Dicas para maior diversão

Faça o projeto em 3 etapas, onde.

1ª Entregue um código funcional, não se preocupe na divisão deste, e organização do código.

2ª Organize o código, deixe o mais legível possível, e limpo. Basicamente, mesmo quem não conhecer a linguagem, iria entender o que o código faz.

3ª Deixe o código o mais performático possível, valide se um *for* ou *sort* estão feitos da forma mais performática.

> Antes de iniciar a codificação, faça um debate com os outros participantes, para definir a melhor estratégia de como será montado o código.

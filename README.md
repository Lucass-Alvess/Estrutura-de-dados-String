
# 📘 Exercícios Java — String e Estruturas de Dados

Este repositório contém uma série de **exercícios práticos em Java**, focados em **manipulação de `String`** e **estruturas de dados**. Eles foram **feitos para estudo**, com o objetivo de ajudar no aprendizado e na melhoria das habilidades de programação em Java.

Os exemplos abordam problemas comuns de lógica, validação de dados, extração de informações e manipulação de strings, sendo ideais para quem busca melhorar sua compreensão em programação.

---

## 📌 Índice

- [📁 Remoção de Caracteres Não Numéricos (CPF)](#-remoção-de-caracteres-não-numéricos-cpf)
- [📅 Extração de Data](#-extração-de-data)
- [📧 Extração de Informações de E-mail](#-extração-de-informações-de-e-mail)
- [🔤 Prefixo Comum Mais Longo](#-prefixo-comum-mais-longo)
- [🔐 Validação de Senhas](#-validação-de-senhas)
- [💳 Detecção de Transações Inválidas](#-detecção-de-transações-inválidas)
- [🔁 Verificação de Anagramas](#-verificação-de-anagramas)

---

## 📁 Remoção de Caracteres Não Numéricos (CPF)

Remove caracteres não numéricos de uma `String`, como pontos e traços, usando:

- Expressões regulares (`replaceAll`)
- Estrutura de repetição com `StringBuilder`

---

## 📅 Extração de Data

Divide uma data do formato `dd/MM/yyyy` usando `split`, converte os valores para inteiros e retorna um array com `[dia, mês, ano]`.

---

## 📧 Extração de Informações de E-mail

- Separa o **usuário** e o **domínio** com `split("@")`
- Usa `endsWith("br")` para verificar se o domínio é brasileiro

---

## 🔤 Prefixo Comum Mais Longo

Dado um array de `String`, retorna o **prefixo comum mais longo** entre elas.

---

## 🔐 Validação de Senhas

Valida senhas com base em:

- Tamanho mínimo (`length`)
- Presença de caracteres especiais
- Letras maiúsculas e minúsculas (`Character.isUpperCase` / `isLowerCase`)
- Alternativa com expressão regular (`matches(regex)`)

---

## 💳 Detecção de Transações Inválidas

Identifica transações inválidas com base em dois critérios:

1. Valor acima de 1000  
2. Mesmo nome realizando transações em **cidades diferentes** com intervalo menor ou igual a **60 minutos**

---

## 🔁 Verificação de Anagramas

Verifica se duas palavras são **anagramas** (mesmas letras, diferentes posições).

---

## ▶️ Como Executar

```bash
javac NomeDaClasse.java
java NomeDaClasse
```

---

## 🧠 Conceitos Envolvidos

- Manipulação de `String`
- Expressões regulares
- Arrays e `String[]`
- `List<String>`
- `StringBuilder`
- Comparações e ordenação
- Laços e estruturas condicionais
- Contagem de frequência de caracteres

---

Esses exercícios foram criados com foco no **estudo e aprimoramento** de habilidades em Java, sendo uma ótima maneira de aprender e praticar conceitos importantes de programação.

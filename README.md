# 📚 Estrutura de Dados - Exercícios com Coleções em Java

Um conjunto de exercícios práticos focados em **Coleções e Funções** para aprender os fundamentos de Estrutura de Dados em Java, desenvolvido para a disciplina de Estrutura de Dados - UNISATC.

---

## 🎯 Objetivo

Este repositório contém soluções de exercícios que exploram:
- ✅ **ArrayList** - Listas dinâmicas
- ✅ **HashMap** - Mapas chave-valor
- ✅ **Streams API** - Processamento funcional de dados
- ✅ **Funções** - Métodos reutilizáveis
- ✅ **Filtros e Transformações** - Processamento de coleções

---

## 📁 Estrutura do Projeto

```
poo/
├── src/
│   ├── AddListaVazia.java          # Adicionar elementos em uma lista
│   ├── SomaLista.java               # Somar valores de uma lista
│   ├── QtdePar.java                 # Filtrar números pares
│   ├── ContaCaractere.java          # Contar caracteres em string
│   └── DicionarioNotas.java         # HashMap com notas de alunos
├── lib/
│   └── stringCounter.jar            # Biblioteca customizada
├── bin/                             # Arquivos compilados
└── README.md
```

---

## 📝 Exercícios

### 1️⃣ **AddListaVazia** - Preenchendo uma Lista
Adiciona 5 nomes fornecidos pelo usuário em uma `ArrayList`.

**Conceitos:** ArrayList, Scanner, Loop, Input/Output

**Como executar:**
```bash
javac src/AddListaVazia.java
java -cp src AddListaVazia
```

**Exemplo:**
```
Digite seu nome: João
Digite seu nome: Maria
Digite seu nome: Pedro
...
Nomes na lista: [João, Maria, Pedro, ...]
```

---

### 2️⃣ **SomaLista** - Somando Elementos
Soma todos os números de uma lista usando Streams API.

**Conceitos:** ArrayList, Streams, map(), sum()

**Como executar:**
```bash
javac src/SomaLista.java
java -cp src SomaLista
```

**Exemplo:**
```
Lista de números: [23, 45, 67, 12]
Soma: 147
```

---

### 3️⃣ **QtdePar** - Filtrando Números Pares
Filtra e retorna apenas os números pares de uma lista.

**Conceitos:** ArrayList, Streams, filter(), Lambda

**Como executar:**
```bash
javac src/QtdePar.java
java -cp src QtdePar
```

**Exemplo:**
```
[2, 4, 6]
```

---

### 4️⃣ **ContaCaractere** - Contando Caracteres
Conta a frequência de cada caractere em uma string usando HashMap.

**Conceitos:** HashMap, String manipulation, Loop

**Como executar:**
```bash
javac src/ContaCaractere.java
java -cp src ContaCaractere
```

**Exemplo:**
```
{ =1, !=1, d=1, u=1, l=1, ,=1, m=1, n=1, o=1}
```

---

### 5️⃣ **DicionarioNotas** - Usando HashMap
Armazena e recupera notas de alunos usando HashMap com ArrayList aninhado.

**Conceitos:** HashMap, ArrayList aninhado, chave-valor

**Como executar:**
```bash
javac src/DicionarioNotas.java
java -cp src DicionarioNotas
```

**Exemplo:**
```
Notas de Nathan: [8.5, 9.0, 5.0]
Primeira nota de Nathan: 8.5
```

---

## 📚 Biblioteca Customizada - stringCounter

Criamos uma biblioteca para operações com strings:

### Métodos disponíveis:
- `contarCaracteres(String texto)` - Conta total de caracteres
- `contarSemEspacos(String texto)` - Conta caracteres sem espaços

### Como compilar a biblioteca:
```bash
cd src
javac StringCounter.java
jar cf ../lib/stringCounter.jar StringCounter.class
```

### Como usar em outro programa:
```java
javac -cp .;../lib/stringCounter.jar MeuPrograma.java
java -cp .;../lib/stringCounter.jar MeuPrograma
```

---

## 🚀 Como Compilar Tudo

```bash
# Compilar todos os arquivos
javac src/*.java

# Ou compilar individualmente
javac src/AddListaVazia.java
javac src/SomaLista.java
javac src/QtdePar.java
javac src/ContaCaractere.java
javac src/DicionarioNotas.java
```

---

## 📖 Conceitos-Chave

### Collections (Coleções)

| Tipo | Uso | Exemplo |
|------|-----|---------|
| **ArrayList** | Lista dinâmica de elementos | `List<Integer> numeros = new ArrayList<>();` |
| **HashMap** | Pares chave-valor | `HashMap<String, Integer> mapa = new HashMap<>();` |

### Streams API

```java
// Filter - Filtrar elementos
lista.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

// Map - Transformar elementos
lista.stream().map(n -> n * 2).collect(Collectors.toList());

// Sum - Somar valores
lista.stream().mapToInt(Integer::intValue).sum();
```

### Lambda Expressions

```java
// Sintaxe: (parâmetros) -> { expressão }
n -> n % 2 == 0  // Retorna true se n é par
```

---

## 💻 Requisitos

- **Java 8+** (para Streams API)
- **JDK** (Java Development Kit)

### Verificar versão:
```bash
java -version
javac -version
```

---

## 📋 Referências

- [Documentação ArrayList - Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- [Documentação HashMap - Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
- [Streams API - Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)

---

## 📌 Notas Importantes

⚠️ **Encoding**: Em alguns sistemas, caracteres acentuados podem aparecer incorretamente. Use:
```bash
-Dfile.encoding=UTF-8
```

✅ **Streams vs For Loops**: Neste projeto usamos Streams por serem mais elegantes e funcionais, mas loops tradicionais também funcionam.

---

## 👨‍💻 Autor

**Nathan** - Exercícios de Estrutura de Dados - 2026

---

## 📄 Licença

Código aberto para fins educacionais.

---

## 🤝 Contribuições

Sinta-se livre para reportar issues e sugerir melhorias!

---

**Desenvolvido com ❤️ para aprender Estrutura de Dados em Java**

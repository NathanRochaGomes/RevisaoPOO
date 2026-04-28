# 📚 Estrutura de Dados - Exercícios com Coleções em Java

Aqui estão as soluções de exercícios focados em **Coleções e Funções** para dominar os fundamentos de Estrutura de Dados em Java. Desenvolvido para a disciplina de Estrutura de Dados da UNISATC.

---

## 🎯 Do que se trata

Mergulhe em soluções que envolvem:
- ✅ **ArrayList** - Listas que crescem com você
- ✅ **HashMap** - Dados organizados por chave e valor
- ✅ **Streams API** - Processamento elegante e funcional
- ✅ **Métodos utilitários** - Reutilização de código
- ✅ **Operações inteligentes** - Filter, map e outras transformações

---

## 📂 Organização

```
poo/
├── src/
│   ├── AddListaVazia.java          → Preenche lista com entrada do usuário
│   ├── SomaLista.java               → Soma números da lista
│   ├── QtdePar.java                 → Extrai apenas números pares
│   ├── ContaCaractere.java          → Frequência de caracteres
│   └── DicionarioNotas.java         → Notas em um mapa
├── bin/                             → Compilados
└── README.md
```

---

## 🔥 Os Exercícios

### 1️⃣ **AddListaVazia** - Alimentando uma Lista
Recebe 5 nomes do usuário e armazena em um `ArrayList`.

→ Tecnologias: ArrayList, Scanner, Loop  
→ Rodando:
```bash
javac src/AddListaVazia.java
java -cp src AddListaVazia
```

→ Saída:
```
Digite seu nome: João
Digite seu nome: Maria
...
Nomes na lista: [João, Maria, ...]
```

---

### 2️⃣ **SomaLista** - Acumulando Valores
Calcula o total de um conjunto de números através da Streams API.

→ Tecnologias: ArrayList, Streams, map(), sum()  
→ Rodando:
```bash
javac src/SomaLista.java
java -cp src SomaLista
```

→ Resultado:
```
Lista de números: [23, 45, 67, 12]
Soma: 147
```

---

### 3️⃣ **QtdePar** - Seleção de Pares
Filtra e isola apenas os números pares.

→ Tecnologias: ArrayList, Streams, filter(), Lambda  
→ Rodando:
```bash
javac src/QtdePar.java
java -cp src QtdePar
```

→ Saída:
```
[2, 4, 6]
```

---

### 4️⃣ **ContaCaractere** - Frequência de Letras
Mapeia cada caractere com quantas vezes aparece na string, usando HashMap.

→ Tecnologias: HashMap, String, Iteration  
→ Rodando:
```bash
javac src/ContaCaractere.java
java -cp src ContaCaractere
```

→ Resultado:
```
{ =1, !=1, d=1, u=1, l=1, ,=1, m=1, n=1, o=1}
```

---

### 5️⃣ **DicionarioNotas** - Mapeando Alunos
Guarda e consulta notas usando HashMap com ArrayList incorporado.

→ Tecnologias: HashMap, ArrayList aninhado, pares chave-valor  
→ Rodando:
```bash
javac src/DicionarioNotas.java
java -cp src DicionarioNotas
```

→ Saída:
```
Notas de Nathan: [8.5, 9.0, 5.0]
Primeira nota de Nathan: 8.5
```

---

##  Compilação Rápida

```bash
# Tudo de uma vez
javac src/*.java

# Uma por uma se preferir
javac src/AddListaVazia.java
javac src/SomaLista.java
javac src/QtdePar.java
javac src/ContaCaractere.java
javac src/DicionarioNotas.java
```

---

## 🧠 Pilares Técnicos

### Collections em Ação

| Tipo | Para quê | Exemplo de uso |
|------|----------|---------|
| **ArrayList** | Armazenar sem limite fixo | `List<Integer> numeros = new ArrayList<>();` |
| **HashMap** | Relação chave-valor | `HashMap<String, Integer> dados = new HashMap<>();` |

### Processamento com Streams

```java
// Peneira com filter
lista.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

// Transforma valores  
lista.stream().map(n -> n * 2).collect(Collectors.toList());

// Agrega em um número
lista.stream().mapToInt(Integer::intValue).sum();
```

### Expressões Lambda

```java
// Sintaxe: (entrada) -> { lógica }
n -> n % 2 == 0  // Verdadeiro se n é par
```

---

## 💻 Pré-requisitos

- **Java 8+** (Streams é essencial)
- **JDK instalado**

### Confirmar setup:
```bash
java -version
javac -version
```

---

## 📚 Para Aprofundar

- [ArrayList na Docs Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- [HashMap na Docs Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
- [Streams API completa](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)

---

## ⚡ Detalhes Importantes

⚠️ **Encoding**: Em alguns sistemas, acentos saem estranhos no console. Adicione:
```bash
-Dfile.encoding=UTF-8
```

✅ **Streams ou FOR?**: Aqui usamos Streams porque são mais limpas, mas FOR loops funcionam também se preferir.

---

## 👨‍💻 Criado por

<<<<<<< HEAD
**Nathan** - Trabalho de Estrutura de Dados - 2024
=======
**Nathan** - Exercícios de Estrutura de Dados - 2026
>>>>>>> 7a807cb2a60ad721f088dbd0e8ac54aa402994e1

---

## 📄 Uso Livre

Este código é público e pode ser usado para fins de estudo.

---

## 🤟 Feedback

Achou algo errado? Quer sugerir melhorias? Abre uma issue!

---

**Feito com ❤️ enquanto aprende Estrutura de Dados em Java**

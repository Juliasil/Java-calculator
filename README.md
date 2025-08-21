```markdown
 🧮  Java Calculator

Este é um projeto simples de Calculadora em Java utilizando Maven e JUnit 5 para testes automatizados.  
Ele implementa operações matemáticas básicas: soma, subtração, multiplicação e divisão, incluindo tratamento para divisão por zero.



 📂 Estrutura do Projeto

JAVA_PROJECTCALCULATOR/
├── src/
│ ├── main/java/dev/aguil/Calculator.java
│ └── test/java/dev/aguil/CalculatorTest.java
├── pom.xml
└── .gitignore




 ⚙️ Tecnologias Utilizadas
- Java 17
- Maven
- JUnit 5



 ▶️ Como Executar

1. Clone este repositório:
   
   git clone https://github.com/Juliasil/Java-calculatorr.git
   cd Calculator
````

2. Compile o projeto:

   ```bash
   mvn clean install
   ```

3. Rode os testes:

   ```bash
   mvn test
   ```

---

## 📘 Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Soma: " + Calculator.sum(5, 3));
        System.out.println("Subtração: " + Calculator.subtract(10, 4));
        System.out.println("Multiplicação: " + Calculator.Multiply(6, 2));
        System.out.println("Divisão: " + Calculator.Divide(10, 2));
    }
}
```

Saída:

```
Soma: 8
Subtração: 6
Multiplicação: 12
Divisão: 5
```

---

## ✅ Testes Automatizados

Os testes estão implementados no arquivo:

```
src/test/java/dev/aguil/CalculatorTest.java
```

Exemplo de teste:

```java
@Test
void MustAddTwoNumbers() {
    assertEquals(2, Calculator.sum(1,1));
    assertEquals(5, Calculator.sum(3,2));
    assertEquals(10, Calculator.sum(5,5));
}
```

---

## 👩‍💻 Autor

Desenvolvido por **Juliana Aguilar** 



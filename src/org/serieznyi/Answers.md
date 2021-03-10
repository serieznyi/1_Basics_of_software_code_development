# Ответы на вопросы

1) Java-язык программирования — непосредственно язык программирования, на котором пишут Java программы.

Java-платформа - экосистема языка Java включающая в себя сам язык и его производные, 
компиляторы в байт-код, JVM, библиотеки для разработки под разные платформы.

Java-платформа - то что исполняет Java программы. JVM + Java API

---

2) Java файл ДОЛЖЕН содержать только один публичный класс. 
   Данный класс должен иметь имя аналогичное имени файла. 
   Из чего следует что название Java файла неразрывно связано с названием Java класса. 

---

3) JVM (Java Virtual Machine) - виртуальная машина Java и сердце экосистемы Java. 
   Является программой, которая непосредственно исполняет скомпилированные Java программы написанные программистом.
   
   JRE (Java Runtime Environment) - исполняемое окружение Java. 
   Это минимальный набор Java компонентов, который позволяет запустить Java программу. 
   Включает в себя JVM и библиотеку Java классов. 
   
   JDK (Java Development Kit) - набор разработчика Java. 
   Включает в себя все, что необходимо для разработки на языке Java. 
   Состоит из JRE, компилятора, документации к базовой библиотеке Java и прочие вспомогательные утилиты.

---

4) В переменные окружения необходимо прописать путь к JDK для того, что бы операционная система могла 
   вызвать компоненты Java экосистемы по короткому имени (java, javac, ...). 
   Это связано с тем, что в операционной системе Java может быть установлена в разных местах. 
   Переменные окружения нивелируют проблему поиска исполняемых файлов Java.
   
   Перед запуском Java программы ее необходимо скомпилировать. 
   Для этого необходимо перейти в директорию проекта и вызвать компилятор с указанным именем класса. 
   Так же может понадобится указать компилятору, где находятся классы дополнительных библиотек, которые 
   были использованы в коде с помощью ключа `-classpath`
   
   ```bash
   javac ClassFile.java
   ```
   
   Далее нужно вызвать java и передать ей название main класса проекта

   ```bash
   java ClassFile.java
   ```
   
   Чаще всего всю сложность сборки берут на себя системы сборки (Ant, Maven, Gradle) или IDE

---

5) Модификаторы доступа в Java можно указать как у классов, так и членов класса (методы, свойства)

   Модификаторы доступа позволяют "жонглировать" доступом к разным частям класса в пределах Java программы. 

   У класса доступны следующие модификаторы доступа:
      - package visible - модификатор по умолчанию. Говорит о том, что данный класс будет доступен только в пределах своего пакета.
      - private - делает класс доступным только в пределах его файла. В частности позволяет сделать реализацию класса в файле интерфейса и
        скрыть ее от посторонних глаз.
      - public - делает класс доступным из любого места программы. Позволяет сделать класс частью публичного интерфейса.
   
   Членам класса доступны следующие модификаторы:
      - package visible - модификатор по умолчанию. Члены класса доступны в пределах пакета класса, в котором они объявлены.
      - private - член класса доступен только внутри своего класса.
      - public - делает члены класса доступными везде. Чаще всего применяется к константам или методам интерфейса. 
      - protected - методы класса доступны классам наследникам и классам пакета в котором объявлен класс.  

---

6) Java пакеты позволяют группировать классы программы в логические группы. 
   На диске Java пакет представлен в виде вложенных директорий. 
   Пакет `org.serieznyi` имеет следующий путь в файловой системе `./org/serieznyi/`.
   
   Для создания пакета необходимо разместить ваш класс в соответствующей директории проекта и указать в нем 
   название пакета с использованием специального слова `package`
   
   Название каждой части пакета равно названию одной из директорий файла класса

---

7) Для импорта конкретного класса необходимо использовать следующую сигнатуру

`import class_full_path;` 

где class_full_path - полный путь к классу.  

Например 

`import java.util.Observer`

Так же можно импортировать все классы конкретного пакета с помощью следующей команды.

`import java.util.*`

По умолчанию импортируются классы из пакета `java.lang`. Данный пакет содержит основные классы языка.

Импорт всех классов пакета `java.util.*` импортирует только классы самого пакета. Вложенные пакеты и их классы не импортируются.
   
---

8) Объект — сущность обладающая заданным состоянием и поведением. 

Ссылка на объект — блок памяти хранящий указатель на место памяти, где непосредственно хранится объект. 
На один объект может указывать множество ссылок.

---

9) В Java существуют следующие типы данных.

`boolean` - логический тип

Целочисленные типы
`byte` - 1 байта 
`short` - 2 байта
`integer` - 4 байт
`long` - 8 байт
`char` - 2 байта. Используется для хранения символов.

Числа с плавающей точкой
`float` - 4 байта
`double` - 8 байт

Сигнатура создания переменной примитивного типа и одновременная инициализация ее начальным значением.

```
тип_переменой идентификатор_переменной = значение переменной;
```

Например 

```java
int varA = 1;
boolean allOk = false;
long varB = 1235L;
```

При передаче переменных примитивного типа как параметров метода по значению. То есть переменные копируются.

---

10) 

Целочисленные типы
`byte` - 1 байта
`short` - 2 байта
`integer` - 4 байт
`long` - 8 байт
`char` - 2 байта.

Числа с плавающей точкой типы
`float` - 4 байта
`double` - 8 байт

Размер примитивных типов не зависит от разрядности системы. 

Приведение типов позволяет сохранять значения типа `A` в переменную типа `B`.

Например когда мы суммируем переменные двух разных типов — тип результата будет равен большему из используемых типов.  
Это необходимо, что бы исключить потерю данных при сложении.
Тип `boolean` не поддерживает привидение.

---

11) Неявное привидение производится автоматически. Такой тип привидения доступен, если гарантируется что при операции
мы не потеряем данные.
    
Например приведение более узкого типа данных к более широкому (char -> int, byte -> short, short -> int, int -> long, float -> double)

Примеры: 
```java
long longVar = 123 + 1L;
int intVar = 'a';
```

Явное приведение используется в том случае, если при приведении мы можем потерять часть данных.
То есть при приведении широко типа данных к узкому (long -> int, double -> float, int -> short)
По сути используя явное приведение мы тем самым говорим компилятору, что берем ответственность за потерю данных на себя.

```java
int intVar = 1234;
short shortVar = (short) intVar;
```

---

12) Литералы — это константы, которые мы присваиваем переменным.
Например такие 
    
```
int
'a'
12.1
1L
-1
234F
```

Существуют следующие литералы:

Целочисленные типа int - `12, -1, 12_123`
Целочисленные типа long - `12L, -1L, 12_123L`
Число с плавающей точкой типа double - `12.1, -1.1, -12_123`
Число с плавающей точкой типа float - `12.1F, -1.1F`
Логические - `false, true`
Символьные - `'a', 'b'`
Строки - `"привет"`

Так же поддерживаются литералы в иных системах исчисления

Двоичная - `0b1100`
Восьмеричная - `011`
Шестнадцатеричная - `0xFF`

---

13) При осуществлении арифметических операций над примитивными типами необходимо обращать внимание 
на тип переменной в которую будет сохранен результат, что бы избежать потери данных.
Так же следует следить за тем, что бы не произошло переполнение типа.
    
---

14) Класс оболочка — это классы одноименные с примитивными типами данных. Они оборачивают примитивную переменную 
    и позволяют работать с ней как с объектом. Это дает возможность передавать переменную по ссылке, использовать 
    вспомогательные методы.
    
   Объект оболочка внутри себя хранит примитивное значение как константу. Это значит что внутренне состояние класса 
   оболочки никогда не меняется. 
   Так же все методы классов оболочек не изменяют его внутреннее состояние, а просто порождают новые объекты или примитивы.
   
15) Примитивный тип данных передается по значению. Это значит что каждый раз, как мы сохраняем значение переменной в 
    другую переменную — создается новая копия переменной. Этот процесс сопровождается выделением памяти. 
    
   Ссылочный тип так же занимает память, но при сохранении его в другую переменную — создается не новый объект, а 
   новая ссылка на тот же объект.
   Это позволяет иметь множество ссылок на один объект, что в свою очередь экономит память.
   
   При передаче примитивного типа в качестве аргумента метода так же копируются. Тем самым разрывается связь между 
   переменной переданной в качестве аргумента, и переменной которую мы получили внутри метода.
   
   Ссылочные типы передаются по ссылке, что ведет к тому, что переданная и полученная переменные - это одна и та же переменная.
   
---

16) Автоупаковка — автоматическое преобразование примитивного типа в экземпляр класса-оболочки.
    Такое происходит, например, при передаче примитивного значения в качестве аргумента метода,
    который ожидает экземпляр класса-оболочки. Или при присвоении примитива переменной типа класса-оболочки.
    
   ```Integer a = 1;```
   
   Автораспаковка — процесс обратный автоупаковке
   
   ```
   int a = Integer.valueOf(1);
   ```
---

17) 

Арифметические операции

`+` - сложение
`-` - вычитание
`*` - умножение
`/` - деление
`%` - остаток от деления
`++` - инкремент
`--` - декремент

Сравнения 

`==` - равно. Позволяет сравнить две переменные или ссылки на объекты
`!=` - не равно
`>` - больше
`<` - меньше
`>=` - больше или равно
`<=` - меньше или равно

Логические

Позволяют строить сложные логические цепочки

`&` - И
`|` - ИЛИ
`!` - отрицание
`&&` - укороченное И
`||` - укороченное ИЛИ

Если операции имеют одинаковый приоритет, то порядок их выполнения будет соответствовать 
их ассоциативности (слева на право или справа на лево).

Но лучше явно задать порядок выполнения операций с помощью скобок.

---

18) 

Для получения более точного результата вычисления числ с плавающей точкой рекомендуется использовать 
класс `java.math.BigDecimal`

При работе с числами с плавающей точкой мы можем сравнить значение переменной `float` или `double` с константами 
    `Float.Nan, Double.Nan` что бы выяснить являются ли они не числом.
    Так же у нас есть константы `Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY` и аналогичные для Double, что 
    бы проверить хранит ли переменная бесконечное значение.
    
---
    
19) Статический импорт позволяет импортировать в файл класса конкретные статические методы или свойства другого класса.
В некоторых случаях это позволяет сократить код и сделать его более лаконичным
    
```java 
import static java.lang.System.out;

out.println("Короче);

```

---

20) 

Оператор `if` позволяет создать ответвление основной логики. 

```
int age = 17;

if (age >= 18) { // Если возраст больше или равен 18
   sellAlchogol(); // ПРодать алкоголь
} else {
   deny(); // отказать
}
```

Оператор `switch` позволяет обработать несколько схожих по сути ситуаций

int dayNumber = 3;

switch (weekDayNumber) {
   case 1:
   case 2:
   case 3:
   case 4:
   case 5: {
      suffer();
      break;
   }
   case 6:
   case 7: {
      drinkBeer();
      break;
   }
   default: {
      throw new IllegalArgumentException("What the hell are you?!");
   }
}

`do-while` - цикл, первая итерация которого всегда выполняется

```java

int a = 1;

do {
   a++;
   
   System.out.println(a);
} while (a < 10);

```

`while` - цикл который выполняется только если условие истинно

```java
int a = 1;

while (a < 10) {
   a++;
   
   System.out.println(a);
}
```

`for` - цикл который выполняется заданное количество раз

```java
for (int i = 1; i <= 12; i++) {
   System.out.println("Month number: " + i);
}
```

`for-each` - цикл, которых проходит по всем элементам коллекции

```java
List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

for (Integer integer : integers) {
   System.out.println(integer);
}
```

---

21) Оператор instanceof проверяет соответствие типа ссылки на объект типу указаному у оператора.
Если тип совпадает - возвращает true, иначе - false.
Если в качестве левого аргумента будет передан null - оператор вернет false.
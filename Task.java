// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task {

    public static void main(String[] args) throws Exception {

        NoteBook notebook1 = new NoteBook("ASUS VivoBook M101DA-BQ1255T", 8, 256, "Windows", "gray", 15.6,
                "AMD Ryzen 3 3250U 2.6 ГГц");
        NoteBook notebook2 = new NoteBook("HP", 4, 1000, "FreeDOS", "gray", 15.6,
                "AMD Athlon Silver 3050U 2.3 ГГц");
        NoteBook notebook3 = new NoteBook("Apple MacBook Air 12", 8, 256, "MacOS", "gray", 13.3,
                "Apple M1 8 core 3.2 ГГц");
        NoteBook notebook4 = new NoteBook("Apple MacBook Air A2344", 8, 256, "MacOS", "black", 13.3,
                "Apple M1 8 core 3.2 ГГц");
        NoteBook notebook5 = new NoteBook("Samsung Galaxy book NP450", 8, 256, "Windows", "gray", 15.6,
                "Intel Core i5 1135G7 2.4 ГГц");

        Set<NoteBook> setNoteBook = new HashSet<NoteBook>();
        setNoteBook.add(notebook1);
        setNoteBook.add(notebook2);
        setNoteBook.add(notebook3);
        setNoteBook.add(notebook4);
        setNoteBook.add(notebook5);

        NoteBook Filter = new NoteBook();
        System.out.println(Filter.newFilter(setNoteBook));

      

    }

}

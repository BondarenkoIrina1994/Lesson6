import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NoteBook {

    private String name;
    private int ram;
    private int hdd;
    private String os;
    private String colour;
    private double diagonal;
    private String processor;

    public NoteBook(String name, int ram, int hdd, String os, String colour, double diagonal, String processor) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
        this.processor = processor;
    }

    public NoteBook() {
    }

    @Override
    public String toString() {
        return String.format(
                "Название: %s \n ОЗУ: %d Гб \n Объем HDD: %d Гб \n ОС: %s \n Цвет: %s \n Диагональ: %.1f \n Процессор: %s",
                this.name, this.ram, this.hdd, this.os, this.colour, this.diagonal, this.processor);
    }

    public Set<NoteBook> newFilter(Set<NoteBook> notebook) {
        Scanner sc = new Scanner(System.in);
        Set<NoteBook> listNotebook = new HashSet<>(notebook);
        System.out.println("Укажите критерий фильтрации ноутбуков" +
                "\n1.Объем оперативной памяти \n2.Объем HDD\n3.Операционная система\n4.Цвет \n5.Диагональ \n6.Процессор");
        String userRequest = sc.nextLine();

        for (int i = 0; i < userRequest.length(); i++) {
            if (Character.getNumericValue(userRequest.charAt(i)) == 1) {
                System.out.println("1. Укажите минимальный объем оперативной памяти: \nВ наличии :4,8");
                int ram = sc.nextInt();
                for (NoteBook notebk : notebook) {
                    if (ram > notebk.ram) {
                        listNotebook.remove(notebk);

                    }

                }
            }

            if (Character.getNumericValue(userRequest.charAt(i)) == 2) {
                System.out.println("2.Укажите минимальный объем HDD:\nВ наличии :256,1000 Гб");
                int hdd = sc.nextInt();
                for (NoteBook notebk : notebook) {
                    if (notebk.hdd < hdd) {
                        listNotebook.remove(notebk);
                    }
                }
            }

            if (Character.getNumericValue(userRequest.charAt(i)) == 3) {
                System.out.println("3.Выберите операционную систему: \n1.Windows 2. FreeDOS 3.MacOS");
                int userOs = sc.nextInt();

                if (userOs == 1) {
                    for (NoteBook notebk : notebook) {
                        if (notebk.os != "Windows") {
                            listNotebook.remove(notebk);
                        }
                    }
                }
                if (userOs == 2) {
                    for (NoteBook notebk : notebook) {
                        if (notebk.os != "FreeDOS") {
                            listNotebook.remove(notebk);
                        }
                    }
                }
                if (userOs == 3) {
                    for (NoteBook notebk : notebook) {
                        if (notebk.os != "MacOS") {
                            listNotebook.remove(notebk);
                        }
                    }
                }
            }

            if (Character.getNumericValue(userRequest.charAt(i)) == 4) {
                System.out.println("Выберите цвет ноутбука:\n1.black 2.gray ");
                int col = sc.nextInt();
                if (col == 1) {
                    for (NoteBook notebk : notebook) {
                        if (notebk.colour != "black") {
                            listNotebook.remove(notebk);
                        }
                    }
                } else {
                    for (NoteBook notebk : notebook) {
                        if (notebk.colour != "gray") {
                            listNotebook.remove(notebk);
                        }
                    }
                }
            }

            if (Character.getNumericValue(userRequest.charAt(i)) == 5) {
                System.out.println("Укажите минимальную диагональ:\nВ наличии :13.3,15.6");
                double diag = sc.nextDouble();
                for (NoteBook notebk : notebook) {
                    if (notebk.diagonal < diag) {
                        listNotebook.remove(notebk);
                    }
                }
            }

            if (Character.getNumericValue(userRequest.charAt(i)) == 6) {
                System.out.println(
                        "Выберите процессор:\n1.AMD Ryzen 3 3250U 2.6 ГГц 2.AMD Athlon Silver 3050U 2.3 ГГц 3. Apple M1 8 core 3.2 ГГц 4. Apple M1 8 core 3.2 ГГц 5.Intel Core i5 1135G7 2.4 ГГц");
                int proc = sc.nextInt();
                if (proc == 1) {
                    for (NoteBook notebk : notebook) {
                        if (notebk.processor != "AMD Ryzen 3 3250U 2.6 ГГц") {
                            listNotebook.remove(notebk);
                        }
                    }
                }
                if (proc == 2) {
                    for (NoteBook notebk : notebook) {
                        if (notebk.processor != "AMD Athlon Silver 3050U 2.3 ГГц") {
                            listNotebook.remove(notebk);
                        }
                    }
                }
                if (proc == 3) {
                    for (NoteBook notebk : notebook) {
                        if (notebk.processor != "Apple M1 8 core 3.2 ГГц") {
                            listNotebook.remove(notebk);
                        }
                    }
                }

                if (proc == 4) {
                    for (NoteBook notebk : notebook) {
                        if (notebk.processor != "Apple M1 8 core 3.2 ГГц") {
                            listNotebook.remove(notebk);
                        }
                    }
                }
                if (proc == 5) {
                    for (NoteBook notebk : notebook) {
                        if (notebk.processor != "Intel Core i5 1135G7 2.4 ГГц") {
                            listNotebook.remove(notebk);
                        }
                    }
                }

            }
        }

        sc.close();
        return listNotebook;
    }

}
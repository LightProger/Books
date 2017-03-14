package head.first.java;

public class BooksTestDrive {

     static class Books {
        // Переменные
        String title;
        String author;

        // Метод печати
         public void print() {
             System.out.print("Название книги: " + title);
             System.out.println(", Автор: " + author);
         }
     }

    public static void main(String[] args) {
        // Создаем массив книг
        Books[] myBooks = new Books[3];

        // Создаем объекты - книги
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        // Описываем элементы массива
        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гедсби";
        myBooks[2].title = "Сборник рецептов по Java";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        // С помощью цикла передаем массив в метод печати
        int x = 0;
        while (x < 3) {
            myBooks[x].print();
            x += 1;
        }
    }
}



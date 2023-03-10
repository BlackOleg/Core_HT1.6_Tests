package ru.netology.olegivanov;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Valter Scott", "Moon under river", 450);
        System.out.println(book1);
        book1.inUse=true;
        System.out.println(book1);
        book1.checkInUse();
        Book book2 = new Book("Антон Чехов", "Вишнёвый сад", 450);
        System.out.println(book2);
        book2.checkInUse();
    }
}
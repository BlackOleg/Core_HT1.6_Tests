package ru.netology.olegivanov;

public class Book {
    protected String author;
    protected String title;
    protected int pages;
    protected boolean inUse;
    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public Book(){
    }
    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.inUse = false;
    }

    public boolean isBig() {
        return pages > 100;
    }

    public String checkInUse() {
        String s = (this.inUse) ? "Книга недоступна" : "Книга доступна";
        System.out.println(s);
        return s;
    }

    @Override
    public String toString() {
        String busy = "Вы можете взять эту книгу";
        if (inUse) {
            busy = "Эта книга в использовании. Подождите пожалуйста";
        }
        return "Автор: " + author + ", Название: " + title + ", Кол-во страниц: " + pages + " \n" + busy + "\n";
    }
}

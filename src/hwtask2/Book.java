package hwtask2;

public class Book {
    private Title title;
    private Author author;
    private Content content;

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }


    void show() {
        System.out.println("Book: ");
        title.show();
        author.show();
        content.show();

    }
}
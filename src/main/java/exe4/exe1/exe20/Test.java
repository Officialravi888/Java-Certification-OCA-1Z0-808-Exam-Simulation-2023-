package exe4.exe1.exe20;

class Document {
    int pages;
    Document(int pages) {
        this.pages = pages;
    }
}

class Word extends Document {
    String type;
    Word(String type) {
        super(20); //default pages
        /*INSERT-1*/
        this.type=type;
    }

    Word(int pages, String type) {
        this(type);
        /*INSERT-2*/
        super.pages = pages;
    }
}

public class Test {
    public static void main(String[] args) {
        Word obj = new Word(25, "TEXT");
        System.out.println(obj.type + "," + obj.pages);
    }
}
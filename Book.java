//Nomes : Leandro Pereira dos Santos CB:3005372
// Renan Josué Silva de Matos CB:3007162
public class Book {
    private String name;
    private Author authors[];
    private double price;
    private int qty = 0;

    public Book(String name, Author authors[], double price){
        this.name = name;
        this.authors = authors;
        this.price = price;

    }

    public Book(String name, Author authors[], double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;

    }

    public String getName(){
        return this.name;
    }

    public Author getAuthors(){
        return this.authors[0];
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        String Allauthors = "";
        for(int i = 0; i < authors.length; i++ ) {
            Allauthors = Allauthors.concat(authors[i].toString());
            if (i != authors.length -1 ){
                Allauthors = Allauthors.concat(",");
            }
        }
        return "Book[name="+ this.name +",authors{" + Allauthors + "},price=" + this.price + ",qty=" + this.qty;
    }
    public String getAuthorNames(){
        String Allauthors = "";
        for(int i = 0; i < authors.length; i++ ) {
            Allauthors = Allauthors.concat(authors[i].getName());
            if (i != authors.length -1 ){
                Allauthors = Allauthors.concat(",");
            }
        }
        return Allauthors;
    }



}

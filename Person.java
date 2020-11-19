//Nomes : Leandro Pereira dos Santos CB:3005372
// Renan Josué Silva de Matos
public class Person {
    private String name;
    private String adress;

    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    public String getName(){
        return this.name;
    }

    public String getAdress(){
        return this.adress;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public String toString(){
        return "Person[name=" + this.name + ",adress=" + this.adress + "]";
    }
}

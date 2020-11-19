//Nomes : Leandro Pereira dos Santos CB:3005372
// Renan Josué Silva de Matos CB:3007162
public class Test03 {
    public static void main(String[] args) {

        // PERSON CLASS TESTS
        Person pessoa = new Person("Carlos", "Estrada distante");
        System.out.println(pessoa); // toString();
        pessoa.setAdress("Estrada proxima");
        System.out.println(pessoa);

        // STUDENT CLASS TESTS
        Student aluno = new Student("Leandro", "Rua da casa", "ADS", 2020, 20.4);
        System.out.println(aluno); // toString();
        System.out.println(aluno.getProgram()); 
        System.out.println(aluno.getYear());
        System.out.println(aluno.getFee());
        aluno.setProgram("Turismo");
        aluno.setYear(2021);
        aluno.setFee(2.3);
        System.out.println(aluno); // toString();
        System.out.println(aluno.getProgram()); 
        System.out.println(aluno.getYear());
        System.out.println(aluno.getFee());

        // STAFF CLASS TESTS
        Staff prof = new Staff("Tuller", "Avenida asfaltada", "Federal", 3520.42);
        System.out.println(prof); // toString();
        System.out.println(prof.getAdress());
        System.out.println(prof.getSchool());
        System.out.println(prof.getPay());
        prof.setAdress("Avenida sem asfalto");
        prof.setSchool("ETEC");
        prof.setPay(2930.32);
        System.out.println(prof); // toString();
        System.out.println(prof.getAdress());
        System.out.println(prof.getSchool());
        System.out.println(prof.getPay());

    }
}

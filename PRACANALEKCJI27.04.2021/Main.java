import java.io.FileWriter;

class Main {
    public static void main(String[]args){
    testSaveToFile();

    }

    //Testowanie poprawnosci pobierania danych z klawiatury
    private static void testReadFromKeyboard(){
        ReadFromKeyboard rfk = new ReadFromKeyboard();
        ToDo td = rfk.readOneToDo();
        System.out.println(td);
    }

    //Testowanie popranwosci napisania obiektu ToDo
    private static void test(){
        ToDo td1 = new ToDo("Pierwsza","To jest pierwsza notatka");
        ToDo td2 = new ToDo("Dwa","Druga notatka z autorem","adams");

        System.out.println(td1);
        System.out.println(td2);
    }

    private static void testSaveToFile(){
        FileUtils fw = new FileUtils();
        fw.saveToFile("Pierszy zapis","CZY SIE UDA");
    }
}
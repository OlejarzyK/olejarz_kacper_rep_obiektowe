import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

/*
    * Save ToDo to filename alltodo.csv like:
    * title;content;author;add_date
    * @param ToDo - out note

     */
class FileUtils{
    public void saveToFile(ToDo td){
        try{
            File f = new File("alltodo.csv");
            FileWriter fw = new FileWriter(f,true);
            String title = td.getTitle();
            fw.write(td.getTitle()+";"+td.getContent()+";"+td.getAuthor()+";"+td.getAdd_Date()+"\n");
            fw.close();
        }
        catch (IOException ex){
            System.out.println("UPS!"+ ex.toString());


        }


    }
    public ArrayList<ToDo> readFromFile(){
        ArrayList<ToDo> list = new ArrayList<>();
        try {
            File f = new File("alltodo.csv");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()){
                String temp = sc.nextLine();
                String [] ttemp = temp.split(";");
                ToDo td = new ToDo(ttemp[0],ttemp[1],ttemp[2]);
                for(int i =0;i<ttemp.length;i++){
                    System.out.println(ttemp[i]);
                }
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("UPS!" + ex.toString());
        }

        return list;
    }


}
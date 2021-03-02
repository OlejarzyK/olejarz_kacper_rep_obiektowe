public class ZadanieTablic {
    public static void main(String[]args){
        Tablicadwuwymiarowa();
    }
    private static void Tablicadwuwymiarowa(){
        int[][] tablica = new int[2][2];
        tablica[0][0] = 1;
        tablica[0][1] = 2;
        tablica[0][2] = 3;
        for(int i=0;i<tablica.length;i++){
        for(int j=0;j<tablica.length;j++){
        System.out.println(tablica[i][j]);
 }
        }
    }
}

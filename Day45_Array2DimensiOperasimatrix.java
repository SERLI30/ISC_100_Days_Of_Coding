
package day45_array2dimensi.operasimatrix;

public class Day45_Array2DimensiOperasimatrix {

    public static void main(String[] args) {
        String[][] memberBTS = {
            {"RM","JIN","SUGA"},
            {"J-HOPE","JIMIN","BTS"},
            {"TAEHYUNG","JUNGKOOK","BTS"}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(memberBTS[i][j] + " ");

            }
            System.out.println();
        }
    }
    
}

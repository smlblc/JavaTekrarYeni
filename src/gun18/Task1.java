package gun18;

public class Task1 {
    // Create 2D array
    // in first row put names
    // in second row put surnames
    // Hint:
    // String[][] namesAndSurnames

    public static void main(String[] args) {
        //part 1. create 2D array with names and surnames;
        String[][] fullname = {
                {"John", "Cameron", "Susan"},
                {"Travolta", "Mcmillan", "Boyle"},
        };
        //part 2. print name and surname, without loop
        //ex: John Travolta
        //    Cameron Mcmillan
        //    Susan Boyle
        System.out.println( "Part 2 -------------------------------" );
        System.out.println( fullname[0][0] + " " + fullname[1][0] );
        System.out.println( fullname[0][1] + " " + fullname[1][1] );
        System.out.println( fullname[0][2] + " " + fullname[1][2] );

        //part 3  print name and surname, with one loop only
        //ex: John Travolta
        //    Cameron Mcmillan
        //    Susan Boyle
        System.out.println( "\nPart 3 -------------------------------" );
        for(int i = 0; i < fullname[0].length; i++) {
            System.out.println( fullname[0][i] + " " + fullname[1][i] );
        }

        //part 4  print name and surname, with two loop only
        //ex: John Travolta
        //    Cameron Mcmillan
        //    Susan Boyle
//        System.out.println( fullname[0][0] + " " + fullname[1][0] );
//        System.out.println( fullname[0][1] + " " + fullname[1][1] );
//        System.out.println( fullname[0][2] + " " + fullname[1][2] );

        System.out.println("Part 4 ----------------------------");
        for(int i = 0; i < 3; i++) { // i sutun  outer loop (ilk loop sutun cunku yurdan asagiya yadirmak istiyoruz.)
            for(int j = 0; j < 2; j++) { // j satir
                System.out.print( fullname[j][i] + " " );
            }
            System.out.println();
        }

//        for (int i = 0; i < 2; i++) { // i satir olsun (***NOTE: eger boyle yadirisak ilk once 3 ismi sonra da 3 soyismi yazdirir.)
//            for (int j = 0; j < 3; j++) { // j sutun olsun
//                System.out.println(fullname[i][j]);
//            }
//            System.out.println(); // her bir ismi bir satira yazdirmak icin
//        }



    }
}

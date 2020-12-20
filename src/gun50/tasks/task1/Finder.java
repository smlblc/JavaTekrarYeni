package gun50.tasks.task1;

import day50.tasks.task1.files.*;

public class Finder {

    public static void main(String[] args) {
        TxtFile txt = new TxtFile();
        PowerPointFile ppt = new PowerPointFile();
        DMGFile dmg = new DMGFile();
        EXEFile exe = new EXEFile();
//
        workWithFile(txt);
        workWithFile(ppt);
//        workWithFile(dmg);
//        workWithFile(exe);
    }

    public static void workWithFile(ReadFile file) {
        System.out.println();
        System.out.println(file.open());
        System.out.println(file.read());

        System.out.println(file.save());
        System.out.println(file.close());
    }

}

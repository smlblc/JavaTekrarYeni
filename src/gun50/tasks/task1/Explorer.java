package gun50.tasks.task1;

import day50.tasks.task1.files.*;

import java.util.ArrayList;
import java.util.List;

public class Explorer {

    public static void main(String[] args) {
        List<ReadFile> files = new ArrayList<>();
        files.add(new TxtFile());
        files.add(new PowerPointFile());
        files.add(new PowerPointFile());
        files.add(new DMGFile());
        files.add(new EXEFile());


        for(ReadFile file : files) {
            // how to check instance
            if(file instanceof PowerPointFile) {
                PowerPointFile ppt = (PowerPointFile) file; //(double)100
                System.out.println("ppt slide: " + ppt.showSlides());
            } else if(file instanceof EXEFile) {
                EXEFile exe = (EXEFile) file;
                System.out.println("exe: " + exe.run());
            }

        }

    }

    public static void downcasting() {
        ReadFile readFilePPT = new PowerPointFile();
//        System.out.println("readFilePPT slide: " + readFilePPT.showSlides());


        //if we have reference as parent, and want to access to child method
        //showSlides

        //Down casting
        PowerPointFile ppt = (PowerPointFile) readFilePPT; //(double) 100
        System.out.println("ppt slide: " + ppt.showSlides());
    }
}

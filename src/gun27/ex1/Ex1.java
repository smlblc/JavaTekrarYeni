package gun27.ex1;

public class Ex1 {

    public static void main(String[] args) {
        Student samil = new Student();
        samil.name = "Samil";
        // 1. way of creating and assigning oxfordSchool to samil
        samil.schoolInfo = new School();
        samil.schoolInfo.name = "Techno Study";
        samil.schoolInfo.address = "Getty 600";

        // 2. way of creating and assigning oxfordSchool to samil
        School oxfordSchool = new School();
        oxfordSchool.name = "Oxford";
        oxfordSchool.address = "Oxford St. 91";

        samil.schoolInfo = oxfordSchool;
    }

}

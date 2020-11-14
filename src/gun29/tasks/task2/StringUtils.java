package gun29.tasks.task2;

/*
***Part 4***
create class StringUtils and add static method named isBlank(String str)
which checks if string is null or empty
str = null
str = ""
str = "         "
 */
public class StringUtils {

    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty(); // || str.isEmpty() ;
    }

}

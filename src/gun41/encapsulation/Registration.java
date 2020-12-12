package gun41.encapsulation;

public class Registration {

    public static void main(String[] args) {
        User user = new User();
        //user.id = 10; instance field id is private, cannot assign value like this
//        user.setId(10);
//        user.setUsername("techno@study");
//        user.setPassword("190520");

        //user.password = "2321312";


        user = new User(5, "dos@techno", "1352345");


        System.out.println("id: " + user.getId());
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        System.out.println("active: " + user.isActive());
        System.out.println("certificate: " + user.hasCertificate());


    }
}

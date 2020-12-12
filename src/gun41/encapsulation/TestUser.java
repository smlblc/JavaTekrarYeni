package gun41.encapsulation;

import org.junit.Assert;
import org.junit.Test;

public class TestUser {

    @Test
    public void testPassword() {
        User user = new User(10, "tuesday@techno", "123qwe");

        Assert.assertEquals("123qwe", user.getPassword());
    }


}

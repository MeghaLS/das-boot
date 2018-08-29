import com.boot.controller.HomeController;
import org.junit.Test;
import org.junit.Assert;
public class AppTest {
    @Test
    public void testApp() {
        HomeController hc = new HomeController();
        String result = hc.home();
        Assert.assertEquals(result, "Das boot, reporting for duty!");
    }
}

package TestNG;
import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;
public class TestNGIntro {

    @Test(priority =  1)
    public void test1(){
        System.out.println("test1");
    }

    @Test(priority =  3)
    public void test2(){
        System.out.println("test2");
    }

    @Test(priority =  3)
    public void test3(){
        System.out.println("test3");
    }

}

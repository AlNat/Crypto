import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by @author AlNat on 10.09.2016.
 * Licensed by Apache License, Version 2.0
 */
public class MorzeTest {

    Morze morze;

    @Test(timeOut = 100)
    @BeforeTest
    public void initTest() throws Exception {
        morze = new Morze();
    }

    @Test(timeOut = 100)
    public void TestGetMorze() throws Exception {
        morze = new Morze();
        Assert.assertEquals (".-", morze.GetMorze('а') );
        Assert.assertEquals ("-.", morze.GetMorze('н'));
        Assert.assertEquals ("-.", morze.GetMorze('Н'));
    }

    @Test(timeOut = 100)
    public void TestGetSymbol() throws Exception {
        morze = new Morze();
        Assert.assertEquals ('a', morze.GetSymbol(".-") );
        Assert.assertEquals ('н', morze.GetSymbol("-."));
    }

}
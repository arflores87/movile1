package testClean;

import activity.calculadora.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class CalculadoraTest {
    MainActivity calculatorActivity = new MainActivity();

    @Test
    public void verifyAddNumber() throws MalformedURLException {

        calculatorActivity.fiveButton.click();
        calculatorActivity.addButton.click();
        calculatorActivity.twoButton.click();
        calculatorActivity.equalButton.click();

        // Verificacion
        String actualResult= calculatorActivity.resultLabel.getText();;
        String expectedResult="7";
        Assert.assertEquals("ERROR ! La suma es incorrecta",expectedResult,actualResult);
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}

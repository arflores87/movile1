package activity.calculadora;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class MainActivity {

    public Button fiveButton;
    public Button twoButton;
    public Button addButton;
    public Button equalButton;
    public Label resultLabel;

    public MainActivity(){
        fiveButton= new Button(By.id("com.android.calculator2:id/digit_5"));
        twoButton= new Button(By.id("com.android.calculator2:id/digit_2"));
        addButton= new Button(By.id("com.android.calculator2:id/op_add"));
        equalButton= new Button(By.id("com.android.calculator2:id/eq"));
        resultLabel= new Label(By.id("com.android.calculator2:id/formula"));
    }
}

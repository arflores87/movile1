package activity.notepad;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addNoteButton;
    public Button addUpdate;
    //com.vrproductiveapps.whendo:id/fab
    public MainActivity(){
        addNoteButton= new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        addUpdate = new Button(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    }

    public boolean isDisplayedTitle(String nameTitle){
        String locator="//android.widget.TextView[@text='"+nameTitle+"']";
        Label title = new Label(By.xpath(locator));
        return title.isDisplayed();
    }

}

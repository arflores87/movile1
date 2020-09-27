package activity.notepad;

import appiumControl.Button;
import org.openqa.selenium.By;

public class DeleteDialog {
    public Button deleteButton;
    public DeleteDialog(){
        deleteButton = new Button(By.id("android:id/button1"));
    }
}

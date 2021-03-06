package eloki.provider.impl.mouseRecording;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;

public class MouseClickEvent implements MouseEvent {

    @Override
    public void executeJs(WebDriver driver) {

    }

    @Override
    public void buildActions(PointerInput pointerInput, Actions actions) {
        actions.tick(pointerInput.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        actions.tick(pointerInput.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
    }
}

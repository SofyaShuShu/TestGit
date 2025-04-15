import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

тут были внесены изменения...

import java.util.List;//все, что далее - новое
By answerListButton = By.className("accordion__button");

public int getAnswerList() {
    List<WebElement> questionsList = driver.findElements(qestions);
    return questionsList.size();
}

public WebElement getAnswer(int i) {
    List<WebElement> questions = driver.findElements(qestions);

    // кликам на нужной строке
    questions.get(i).click();

    // получаем строку с ответом
    return questions.get(i).findElement(answers);
}
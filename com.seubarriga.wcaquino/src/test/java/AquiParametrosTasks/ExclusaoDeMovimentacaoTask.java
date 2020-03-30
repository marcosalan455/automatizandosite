package AquiParametrosTasks;

import AquiElementosAppObjects.ExclusaoDeMovimentacaoAppObject;
import org.openqa.selenium.WebDriver;

public class ExclusaoDeMovimentacaoTask {

    private WebDriver driver;

    private ExclusaoDeMovimentacaoAppObject exclusaoDeMovimentacaoAppObject;

    public ExclusaoDeMovimentacaoTask(WebDriver driver) {
        this.driver = driver;
        this.exclusaoDeMovimentacaoAppObject = new ExclusaoDeMovimentacaoAppObject(driver);
    }

    public void excluirMovimentacao() {
        exclusaoDeMovimentacaoAppObject.acessarMenuResumoMensal().click();
        exclusaoDeMovimentacaoAppObject.excluirResumoMensal().click();
    }
}

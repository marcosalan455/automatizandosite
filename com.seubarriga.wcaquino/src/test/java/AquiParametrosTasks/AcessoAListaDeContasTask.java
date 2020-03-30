package AquiParametrosTasks;

import AquiElementosAppObjects.AcessoAListaDeContasAppObject;
import org.openqa.selenium.WebDriver;

public class AcessoAListaDeContasTask {

    private WebDriver driver;

    private AcessoAListaDeContasAppObject acessoAListaDeContasAppObject;

    public AcessoAListaDeContasTask(WebDriver driver) {
        this.driver = driver;
        this.acessoAListaDeContasAppObject = new AcessoAListaDeContasAppObject(driver);
    }

    public void editarContasExistentes() {
        acessoAListaDeContasAppObject.acessarMenuDropdown().click();
        acessoAListaDeContasAppObject.escolherListarContas().click();
        acessoAListaDeContasAppObject.ClicarBotaoDeCriacaoDeMovimentacao().click();
    }
}

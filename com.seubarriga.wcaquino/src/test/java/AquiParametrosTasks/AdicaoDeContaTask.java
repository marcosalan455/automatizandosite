package AquiParametrosTasks;

import AquiElementosAppObjects.AdicaoDeContaAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AdicaoDeContaTask {

    private WebDriver driver;

    private AdicaoDeContaAppObject telaDeAdicaoDeContaAppObject;

    public AdicaoDeContaTask(WebDriver driver) {
        this.driver = driver;
        this.telaDeAdicaoDeContaAppObject
                 = new AdicaoDeContaAppObject(driver);
    }

    public void adicionarConta() {
        telaDeAdicaoDeContaAppObject.AdicionarNovaContaCampoTestField().sendKeys("teste");
        telaDeAdicaoDeContaAppObject.ClicarBotaoDeSalvarConta().click();

        String atual = telaDeAdicaoDeContaAppObject.SelecionarMensagemDeSucesso().getText();
        String expected = "Conta adicionada com sucesso!";
        System.out.println(atual);
        Assertions.assertEquals(expected, atual);

        telaDeAdicaoDeContaAppObject.RetornarAPaginaInicialClicandoEmHome().click();

    }

}


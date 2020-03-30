package AquiParametrosTasks;

import AquiElementosAppObjects.TelaInicialAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class TelaInicialTask {

    private WebDriver driver;

    private TelaInicialAppObject telaInicialAppObject;

    public TelaInicialTask(WebDriver driver) {
        this.driver = driver;
        this.telaInicialAppObject = new TelaInicialAppObject(driver);
    }

    public void selecionarMensagemDeSucessoEClicarEmAdicaoDeConta() {
        String atual = telaInicialAppObject.SelecionarMensagemDeBoasVindas().getText();
        String expected = "Bem vindo, marcos alan!";
        System.out.println(atual);
        Assertions.assertEquals(expected, atual);

        telaInicialAppObject.abrirMenudropdown().click();
        telaInicialAppObject.adicionarConta().click();
    }
}

package AquiParametrosTasks;

import AquiElementosAppObjects.RespostaDaCriacaoDeMovimentacaoAppObject;
import AquiElementosAppObjects.SelecaoDeContasEExcluirAtualFinalizandoTestAppObject;
import com.sun.org.apache.xerces.internal.impl.xs.util.XSInputSource;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class SelecaoDeContasEExcluirAtualFinalizandoTestTask {

    private WebDriver driver;

    private SelecaoDeContasEExcluirAtualFinalizandoTestAppObject selecaoDeContasEExcluirAtualFinalizandoTestAppObject;

    public SelecaoDeContasEExcluirAtualFinalizandoTestTask(WebDriver driver) {
        this.driver = driver;
        this.selecaoDeContasEExcluirAtualFinalizandoTestAppObject = new SelecaoDeContasEExcluirAtualFinalizandoTestAppObject(driver);
    }

    public void concluirTestExcluindoContaAtiva() {
        selecaoDeContasEExcluirAtualFinalizandoTestAppObject.AcessarMenuDropdown().click();
        selecaoDeContasEExcluirAtualFinalizandoTestAppObject.acessarListaDeContas().click();
        selecaoDeContasEExcluirAtualFinalizandoTestAppObject.excluirContaAtiva().click();

        String atual = selecaoDeContasEExcluirAtualFinalizandoTestAppObject.VerificarMensagemDeContaRemovida().getText();
        String expected = "Conta removida com sucesso!";
        System.out.println(atual);
        Assertions.assertEquals(expected, atual);

        selecaoDeContasEExcluirAtualFinalizandoTestAppObject.deslogarDoSite().click();


    }

}

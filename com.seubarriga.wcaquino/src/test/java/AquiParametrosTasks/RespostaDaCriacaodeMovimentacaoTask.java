package AquiParametrosTasks;

import AquiElementosAppObjects.RespostaDaCriacaoDeMovimentacaoAppObject;
import AquiElementosAppObjects.TelaDeCriacaoDeMovimentacaoAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class RespostaDaCriacaodeMovimentacaoTask {

    private WebDriver driver;

    private RespostaDaCriacaoDeMovimentacaoAppObject respostaDaCriacaoDeMovimentacaoAppObject;

    public RespostaDaCriacaodeMovimentacaoTask(WebDriver driver) {
        this.driver = driver;
        this.respostaDaCriacaoDeMovimentacaoAppObject = new RespostaDaCriacaoDeMovimentacaoAppObject(driver);
    }

    public void selecionarMensagemDeSucessoERetornarPaginaInicial() {
        String atual = respostaDaCriacaoDeMovimentacaoAppObject.SelecionarMensagemDeSucessoDaMovimentacao().getText();
        String expected = "Movimentação adicionada com sucesso!";
        System.out.println(atual);
        Assertions.assertEquals(expected, atual);

        //respostaDaCriacaoDeMovimentacaoAppObject.RetornarPaginaInicialClicandoEmHome().click();
    }
}

package AquiParametrosTasks;

import AquiElementosAppObjects.TelaDeCriacaoDeMovimentacaoAppObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriacaoDeMovimentacaoTask {

    private WebDriver driver;

    private TelaDeCriacaoDeMovimentacaoAppObject telaDeCriacaoDeMovimentacaoAppObject;

    public CriacaoDeMovimentacaoTask(WebDriver driver) {
        this.driver = driver;
        this.telaDeCriacaoDeMovimentacaoAppObject = new TelaDeCriacaoDeMovimentacaoAppObject(driver);
    }

    public void selecionarParametrosDeMovimentacao() {
        telaDeCriacaoDeMovimentacaoAppObject.escolherNoMenuTipoDeMovimentacao().click();
        telaDeCriacaoDeMovimentacaoAppObject.selecionarReceitaComoTipoDaMovimentacao().click();
        telaDeCriacaoDeMovimentacaoAppObject.EscolherDataDeTransacaoTestField().sendKeys("27/03/2020");
        telaDeCriacaoDeMovimentacaoAppObject.EscolherDataDePagamentoTestField().sendKeys("27/03/2020");
        telaDeCriacaoDeMovimentacaoAppObject.escreverDescricaoCampoTestField().sendKeys("Estou com dinheiro na mão e vou pagar toda fatura a vista.");
        telaDeCriacaoDeMovimentacaoAppObject.EscreverNomeDoInteressadoCampoTestField().sendKeys("marcos");
        telaDeCriacaoDeMovimentacaoAppObject.digitarValorASerPagoTestField().sendKeys("1500");
        telaDeCriacaoDeMovimentacaoAppObject.selecionarBotaoDePagoCasoJáTenhaSido().click();
        telaDeCriacaoDeMovimentacaoAppObject.clicarBotaoSalvarMovimentacao().click();
    }

}


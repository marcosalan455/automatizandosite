package AquiElementosAppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaDeCriacaoDeMovimentacaoAppObject {

    private WebDriver driver;

    public TelaDeCriacaoDeMovimentacaoAppObject(WebDriver driver) {
this.driver = driver;
    }

    public WebElement escolherNoMenuTipoDeMovimentacao() {
        return driver.findElement(By.id("tipo"));
        }

        public WebElement selecionarReceitaComoTipoDaMovimentacao() {
        return driver.findElement(By.cssSelector("option[value='REC']"));
        }

        public WebElement EscolherDataDeTransacaoTestField() {
        return driver.findElement(By.id("data_transacao"));
        }

        public WebElement EscolherDataDePagamentoTestField() {
        return driver.findElement(By.id("data_pagamento"));
        }

        public WebElement escreverDescricaoCampoTestField() {
        return driver.findElement(By.id("descricao"));
        }

        public WebElement EscreverNomeDoInteressadoCampoTestField() {
        return driver.findElement(By.id("interessado"));
        }

        public WebElement digitarValorASerPagoTestField() {
        return driver.findElement(By.id("valor"));
        }

        public WebElement selecionarBotaoDePagoCasoJáTenhaSido() {
        return driver.findElement(By.id("status_pago"));
        }

        public WebElement clicarBotaoSalvarMovimentacao() {
        return driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary']"));
        }

    public WebElement RetornarPaginaInicialClicandoEmHome() {
        return  driver.findElement(By.cssSelector("a[href='/']"));
    }

}


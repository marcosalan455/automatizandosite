package execucaotestcases;

import AquiParametrosTasks.*;
import frameworks.utils.WaitElementFw;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExecutaTestCase extends WaitElementFw {

    private WebDriver driver;

    private LoginTask loginTask;

    private TelaInicialTask telaInicialTask;

    private AdicaoDeContaTask adicaoDeContaTask;

    private AcessoAListaDeContasTask acessoAListaDeContasTask;

    private CriacaoDeMovimentacaoTask criacaoDeMovimentacaoTask;

    private RespostaDaCriacaodeMovimentacaoTask respostaDaCriacaodeMovimentacaoTask;

    private ExclusaoDeMovimentacaoTask exclusaoDeMovimentacaoTask;

    private SelecaoDeContasEExcluirAtualFinalizandoTestTask selecaoDeContasEExcluirAtualFinalizandoTestTask;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://seubarriga.wcaquino.me/login");
        this.loginTask = new LoginTask(driver);
        this.telaInicialTask = new TelaInicialTask(driver);
        this.adicaoDeContaTask = new AdicaoDeContaTask(driver);
        this.acessoAListaDeContasTask = new AcessoAListaDeContasTask(driver);
        this.criacaoDeMovimentacaoTask = new CriacaoDeMovimentacaoTask(driver);
        this.respostaDaCriacaodeMovimentacaoTask = new RespostaDaCriacaodeMovimentacaoTask(driver);
        this.exclusaoDeMovimentacaoTask = new ExclusaoDeMovimentacaoTask(driver);
        this.selecaoDeContasEExcluirAtualFinalizandoTestTask = new SelecaoDeContasEExcluirAtualFinalizandoTestTask(driver);
    }

    @Test
    public void ExecutarTest() {
        loginTask.chamarElementoAccessACount();
        telaInicialTask.selecionarMensagemDeSucessoEClicarEmAdicaoDeConta();
        adicaoDeContaTask.adicionarConta();
        acessoAListaDeContasTask.editarContasExistentes();
        criacaoDeMovimentacaoTask.selecionarParametrosDeMovimentacao();
        respostaDaCriacaodeMovimentacaoTask.selecionarMensagemDeSucessoERetornarPaginaInicial();
        exclusaoDeMovimentacaoTask.excluirMovimentacao();
        selecaoDeContasEExcluirAtualFinalizandoTestTask.concluirTestExcluindoContaAtiva();
    }

    @AfterEach
    public void concluirTest() {
         //driver.quit();
    }

}


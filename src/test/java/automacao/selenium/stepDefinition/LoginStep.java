package automacao.selenium.stepDefinition;

import automacao.selenium.page.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.io.IOException;


public class LoginStep {

    private LoginPage page = new LoginPage();
    //private Hooks baseTest = new Hooks();

    @Dado("que estou na home do google")
    public void que_estou_na_home_do_google() throws IOException {
        page.acessarPage("https://www.google.com");
    }

    @Quando("preencho o texto {string} para pesquisa")
    public void preencho_o_texto_para_pesquisa(String texto) throws IOException {
        page.digitarPesquisa(texto);
    }

    @E("clico no botao pesquisar")
    public void clico_no_botao_pesquisar() throws IOException {
        page.clicarBotaoPesquisa();
    }

    @Entao("visualizo o resultado da pesquisa")
    public void visualizo_o_resultado_da_pesquisa() {

    }

   /*@After
    public void finalizar() {
        baseTest.tearDown();
    }*/
}

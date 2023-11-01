package automacao.selenium.stepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import config.DriverChoice;
import config.DriverFactoryChrome;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;

public class Hooks {

    @After()
    public void tearDown() throws IOException {
        gerarScreenShot();
        //DriverFactoryChrome.killDriver();
        DriverChoice.escolhaKillDriver();
    }

    public void gerarScreenShot() throws IOException {
        DateTimeFormatter dadaHoraFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm.ss");
        String dataHora = dadaHoraFormat.format(LocalDateTime.now());

        File imagem = ((TakesScreenshot) DriverChoice.escolhaDoDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(imagem, new File("src/main/resources/evidencias/"+dataHora+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void esperar(long tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

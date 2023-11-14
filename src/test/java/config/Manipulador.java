package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Manipulador {

    public static String  navegador;

    public static Properties getProp(String propertiesPath) throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(propertiesPath);
        props.load(file);
        return props;
    }

    /*public static void  main(String args[]) throws IOException {
        Properties prop = getProp();
        navegador = prop.getProperty("prop.server.navegador");

        System.out.println("navegador = " + navegador);
    }*/
}
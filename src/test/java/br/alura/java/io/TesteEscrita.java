package br.alura.java.io;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args)  throws IOException {

        //fluxo de saída com Arquivo

        OutputStream fos = new FileOutputStream("MavenExplicacao2.txt");
        Writer usw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(usw);

        bw.write("1 - Criamos um projeto Maven");
        bw.newLine();
        bw.newLine();
        bw.write("- Maven é um gerenciador de dependencias do Java, ele controla as dependencias externas (bibliotecas)");

        bw.close();

    }
}

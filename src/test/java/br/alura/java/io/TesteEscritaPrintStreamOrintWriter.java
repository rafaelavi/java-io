package br.alura.java.io;

import java.io.*;

public class TesteEscritaPrintStreamOrintWriter {

    public static void main(String[] args)  throws IOException {

        //fluxo de saída com Arquivo

//        OutputStream fos = new FileOutputStream("MavenExplicacao2.txt");
//        Writer usw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(usw);

        //BufferedWriter bw = new BufferedWriter(new FileWriter("MavenExplicacao2.txt"));
        //PrintStream ps = new PrintStream(new File("MavenExplicacao2.txt"));
        PrintWriter ps = new PrintWriter("MavenExplicacao2.txt");

        ps.println("1 - Criamos um projeto Maven");
        ps.println();
        ps.println("- Maven é um gerenciador de dependencias do Java, ele controla as dependencias externas (bibliotecas)");

        ps.close();

    }
}

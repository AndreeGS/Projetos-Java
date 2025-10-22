package app;

import factory.ProxyFactory;
import proxy.ProxyImg;

public class Program {

	public static void main(String[] args) {
		
		ProxyImg img = new ProxyFactory().crieUmaInstancia(true, "arquivo.img");

        System.out.println("Proxy criado, ainda não carregou a imagem.");     
        
        img.exibirInfos();
        img.exibir();	
        img.getArquivo();
		
//        Scanner sc = new Scanner(System.in);
//        ProxyLog proxyLog = new ProxyLog();
//
//        System.out.println("Informe o componente da pesquisa: ");
//        String componente = sc.nextLine();
//
//        proxyLog.addLog(componente);
//
//        System.out.println("\nVisualizando logs registrados:");
//        List<String> logs = proxyLog.getLogs();
//
//        for (String log : logs) {
//            System.out.println("→ " + log);
//        }
//
//		
//		sc.close();
	}

}

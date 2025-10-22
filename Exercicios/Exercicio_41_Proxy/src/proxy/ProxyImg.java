package proxy;

public class ProxyImg {
    private String arquivo;
    private ProxyImgReal imagemReal;

    public ProxyImg(String arquivo) {
        this.arquivo = arquivo;
    }
    
    public void exibirInfos() {
    	System.out.println("Infos da foto...");
    }

    public void exibir() {
        if (imagemReal == null) {
            imagemReal = new ProxyImgReal(arquivo);
        }

        imagemReal.exibir();
    }
    
    public String getArquivo() {
    	return this.arquivo;
    }
    
    public ProxyImgReal getImagemReal() {
    	return this.imagemReal;
    }
}

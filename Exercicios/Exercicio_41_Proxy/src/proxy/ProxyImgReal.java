package proxy;

public class ProxyImgReal extends ProxyImg {

    public ProxyImgReal(String arquivo) {
        super(arquivo);
        carregarDoDisco();
    }

    private void carregarDoDisco() {
        System.out.println("Carregando imagem do arquivo: " + super.getArquivo());
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo imagem ProxyReal: " + super.getArquivo());
    }
}

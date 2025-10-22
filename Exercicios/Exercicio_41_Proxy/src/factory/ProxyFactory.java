package factory;

import proxy.ProxyImg;
import proxy.ProxyImgReal;

public class ProxyFactory {

	public ProxyFactory() {};
	
	public ProxyImg crieUmaInstancia(Boolean vaiCarregar, String arquivo) {
	    if (vaiCarregar) {
	        return new ProxyImgReal(arquivo);
	    } else {
	        return new ProxyImg(arquivo);  
	    }
	}
}

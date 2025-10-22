package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyLog {
	
    private List<String> logs;

    public ProxyLog() {
        this.logs = new ArrayList<>();
    }

    public void addLog(String logString) {
    	if (logString.equals("Carro")) {
    		throw new RuntimeException("Você não tem permissão");
    	}
    	
        logs.add(logString);
    }

    public List<String> getLogs() {
        return logs;
    }
}

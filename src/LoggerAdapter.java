// Adaptador para permitir que OldLogger seja usado como ILogger
public class LoggerAdapter implements ILogger {
    private OldLogger oldLogger;

    public LoggerAdapter(OldLogger oldLogger) {
        this.oldLogger = oldLogger;
    }

    @Override
    public void log(String message) {
        // Adapta a chamada do método da interface ILogger para o método da classe
        // OldLogger
        oldLogger.writeLog(message);
        System.out.println("Log adaptado");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Criar uma intância do sistema logging antigo
        OldLogger oldLogger = new OldLogger();
        // Cria uma adaptador que permite usar o OldLogger com a nova inerface ILogger
        ILogger logger = new LoggerAdapter(oldLogger);
        // Usar o logger adaptado
        logger.log("Esta é uma mensagem de log");
    }
}

## Padrão Adapter em Java – Exemplo de Logger
Este projeto demonstra o uso do padrão Adapter para integrar uma classe de logging antiga (OldLogger) com um novo sistema baseado na interface ILogger.

## 📌 Como Funciona?
A interface ILogger define um método moderno de logging (log).
A classe OldLogger representa um sistema de logging legado, que usa writeLog.
A classe LoggerAdapter atua como um adaptador, convertendo chamadas de ILogger.log() para OldLogger.writeLog(), permitindo a reutilização do código antigo.
A classe App executa o programa e demonstra o uso do adaptador.

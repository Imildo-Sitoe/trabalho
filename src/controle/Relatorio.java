package controle;

/**
 *
 * @author Imildo Sitoe
 */
public class Relatorio {
    
    
/**
 * Metodo que que gera relatorio do banco
 */
    public String gerarRelatorio(Imprimivel i) {
        return i.mostrarDados();
    }
}

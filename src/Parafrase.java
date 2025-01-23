import java.util.Random;

public class Parafrase {
    public static void main(String[] args) {
        
        String[] listaUmPalavras = {"07/24" , "várias camadas", "30.000 pés", "todos ganham", "front-end", "baseado na web", "caminho crítico", "dinâmico", "primeira vez", "inteligente", "seis sigmas", "difundido"};

        String[] listaDoisPalavras = {"habilitado" , "adesivo", "valor agregado", "orientado", "central", "distribuído", "agrupado", "solidificado", "independente da máquina", "posicionado", "em rede", "dedicado"};

        String[] listaTresPalavras = {"processo" , "ponto máximo", "solução", "arquitetura", "habilitação no núcleo", "estratégia", "portal", "espaço", "visão", "missão", "paradigma", "cooperativo"};

        Random rand = new Random();

        int aleatorio1 = rand.nextInt(13);
        int aleatorio2 = rand.nextInt(13);
        int aleatorio3 = rand.nextInt(13);

        String frase = listaUmPalavras[aleatorio1] + " " + listaDoisPalavras[aleatorio2] + " " + listaTresPalavras[aleatorio3];

        System.out.println("precisamos de " + frase);

    }
}

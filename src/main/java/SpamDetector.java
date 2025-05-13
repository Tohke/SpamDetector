/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author JoãoFranciscoPatelli
 */

public class SpamDetector {
    public static void main(String[] args) {
        LerArquivo leitor = new LerArquivo();

        String caminho = "C:\\Users\\Public\\Desktop\\Email.txt"; 
        String conteudo = leitor.lerArquivo(caminho);


        System.out.println("Pontuação final (inteira): " + peso);

        int peso = Verificar(conteudo);

        if (peso > 70) {
            System.out.println("Este e-mail é fortemente considerado SPAM.");
        } 
        else if (peso >= 31 && peso <= 70) {
            System.out.println("Este e-mail é potêncialmente considerado SPAM.");
        }
        else if (peso >= 5 && peso <31){
            System.out.println("Este e-mail é fracamente considerado SPAM.");
        }
        else{
            System.out.println("Este e-mail não é considerado SPAM");
        }
    }

    public int Verificar(conteudo){
        String[][] matriz = {
            {"oferta", "0.9"},
            {"grátis", "0.85"},
            {"promoção", "0.8"},
            {"compre", "0.75"},
            {"dinheiro", "0.7"},
            {"urgente", "0.6"}
        };

        double peso = 0.0;
        String conteudoLower = conteudo.toLowerCase();

        for (int i = 0; i < matriz.length; i++) {
            String palavra = matriz[i][0];
            String pesoString = matriz[i][1];

            double pesoDouble = Double.parseDouble(pesoString);
            int pesoInt = (int)(pesoDouble * 10);

            if (conteudoLower.contains(palavra)) {
                peso += pesoInt;
            }
            return pesoInt;
        }
    } 
}

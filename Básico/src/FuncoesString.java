public class FuncoesString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG";

        //converter todas as letras para minusculas
        String s01 = original.toLowerCase();
        //converter todas as letras para maiusculas
        String s02 = original.toUpperCase();
        //elimita os espacos em branco
        String s03 = original.trim();
        //substring a partir da posicao 2 em diante
        String s04 = original.substring(2);
        //substring a partir da posicao 2 ate o 9
        String s05 = original.substring(2, 9);
        //troca uma coisa por outra
        String s06 = original.replace('a','x');
        //troca uma coisa por outra na substring
        String s07 = original.replace("abc","xy");
        //retorna a posicao do caracter especificado
        int i = original.indexOf("bc");
        //retorna a posicao da ultima ocorrencia do bc
        int j = original.lastIndexOf("bc");

        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);
        System.out.println(s07);
        System.out.println(i);
        System.out.println(j);
    }
}

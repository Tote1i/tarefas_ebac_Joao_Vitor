import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        // classe que vc deseja analisar
        Class<?> classe = ClasseAnnotation.class;

        // todas as anotações da classe
        Annotation[] annotations = classe.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof Tabela) {
                Tabela tabelaAnnotation = (Tabela) annotation;
                String nomeDaTabela = tabelaAnnotation.nome();
                System.out.println("Nome da tabela: " + nomeDaTabela);
            }
        }
    }
}

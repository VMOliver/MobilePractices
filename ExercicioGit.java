import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
 * Validação de Nome de Usuário Codeland

 * Faça a função CodelandUsernameValidation(str) receber o parâmetro str
 * passado e determinar se a string é um nome de usuário válido de acordo
 * com as seguintes regras:

 * 1. O nome de usuário deve ter entre 4 e 25 caracteres.
 * 2. Deve começar obrigatoriamente com uma letra.
 * 3. Pode conter apenas letras, números e o caractere sublinhado (underscore).
 * 4. Não pode terminar com um caractere sublinhado (underscore).

 * Se o nome de usuário for válido, seu programa deve retornar a string "true",
 * caso contrário, deve retornar a string "false".
 */
public class ExercicioGit {
    public static String CodelandUsernameValidationRegex(String str) {
        // Definimos a expressão regular baseada nas regras
        String regex = "^[a-zA-Z]\\w{2,23}[a-zA-Z0-9]$";

        // Compilamos a expressão
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        // Retornamos se a string faz o "match" (encaixa) perfeitamente no padrão
        return matcher.matches() ? "false" : "true";
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(CodelandUsernameValidationRegex(sc.next()));
    }
}
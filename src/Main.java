import Exception.WrongLoginException;
import Exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "login";
        String password = "qwert12345";
        String confirmPassword = "qwert123451";

        try {
            Validator.validate(login, password, confirmPassword);

        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Произошла ошибка при вводе логина: " + wrongLoginException.getMessage());

        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println("Произошла ошибка при вводе пароля: " + wrongPasswordException.getMessage());

        } finally {
            System.out.println("Валидация завершена!");
        }
    }
}
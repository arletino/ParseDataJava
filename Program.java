package ParseDataJava;



import ParseDataJava.Controller.Controller;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();    
        String intro = """
                Введите ФИО, дата рождения(dd.mm.yyyy), номер телефона(только 11 цифр без знаков),
                    пол(m или f), через пробел, порядок не важен :)
                """;
        controller.writeOnConsole(intro);
        controller.readDataOnConsole();
        controller.getPerson();
    }
}

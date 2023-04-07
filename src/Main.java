import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        String input;
        String title = "Расшифровка бинарного кода ";
        input = JOptionPane.showInputDialog(null,"Введите бинарный код", title,JOptionPane.QUESTION_MESSAGE);
        if (input==null){
            System.exit(0);
        }
        int num = UsingWhileDemo.decoder(input);
        String text = "Вы ввели бинарный код" + input;
        text+="\nКод соответсвтвует числу: " + num;
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);



    }
}
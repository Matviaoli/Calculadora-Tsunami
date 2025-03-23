import javax.swing.JOptionPane;
public class CalculadoraTsunami {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, somatop = 0;
        String pipoca, pacoca;
        boolean False = false;
        do {
            try {

                pipoca = JOptionPane.showInputDialog("Digite um número: ");
                pacoca = JOptionPane.showInputDialog("Digite outro número: ");

                num1 = Integer.parseInt(pipoca);
                num2 = Integer.parseInt(pacoca);
                somatop = num1 + num2;
                False = false;
                if((num1== 77 && num2== 33)||(num1== 33 && num2== 77)){
                    somatop = 100;
                }
            } catch (Exception e){

                False = true;
                JOptionPane.showMessageDialog(null, "Seu incompetente, eu pedi um número!", "Pode não man", JOptionPane.ERROR_MESSAGE);
            }

        }while (False);

        JOptionPane.showMessageDialog(null, "A soma top é = "+somatop, "Soma Top", JOptionPane.PLAIN_MESSAGE);


    }
}
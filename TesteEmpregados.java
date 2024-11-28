package ExemploTesteEmpresa;

import javax.swing.JOptionPane;

public class TesteEmpregados {
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica("Maria", "Alice", "147.587.785-10");
        JOptionPane.showMessageDialog(null, pessoa.dados());

        Desempregado desempregado = new Desempregado("Marcos", "Silva", "789.123.456-44", 1100.0);
        JOptionPane.showMessageDialog(null, desempregado.dados());

        Empregado empregado = new Empregado("Nicolas", "Teixera", "147.258.369-00", 2800.0);
        JOptionPane.showMessageDialog(null, empregado.dados());

        Mensalista mensalista = new Mensalista("Daniela", "Pires", "175.886.669-17", 4000.0);
        JOptionPane.showMessageDialog(null, mensalista.dados());

        Horista horista = new Horista("Felipe", "Prado", "169.456.789-47", 24.0, 250);
        JOptionPane.showMessageDialog(null, horista.dados());

        Tarifeiro tarefeiro = new Tarifeiro("Mirela", "Gomes", "400.289.221-33", 19.0, 10);
        JOptionPane.showMessageDialog(null, tarefeiro.dados());

        Vendedor vendedor = new Vendedor("Anderson", "Rodrigues", "177.845.555-99", 1900.0, 50.0, 6);
        JOptionPane.showMessageDialog(null, vendedor.dados());
    }
}
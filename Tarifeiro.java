package ExemploTesteEmpresa;

public class Tarifeiro extends Empregado {
    private double valorPorTarefa;
    private int tarefasConcluidas;
    public Tarifeiro() {
        super();
        this.valorPorTarefa = 0.0;
        this.tarefasConcluidas = 0;
    }

    public Tarifeiro(String nome, String sobrenome, String cpf, double valorPorTarefa, int tarefasConcluidas) {
        super(nome, sobrenome, cpf, valorPorTarefa * tarefasConcluidas);
        this.valorPorTarefa = valorPorTarefa;
        this.tarefasConcluidas = tarefasConcluidas;
    }

    public double getValorPorTarefa() {
        return valorPorTarefa;
    }

    public int getTarefasConcluidas() {
        return tarefasConcluidas;
    }

    public void setValorPorTarefa(double valorPorTarefa) {
        this.valorPorTarefa = valorPorTarefa;
        setSalario(valorPorTarefa * this.tarefasConcluidas);
    }

    public void setTarefasConcluidas(int tarefasConcluidas) {
        this.tarefasConcluidas = tarefasConcluidas;
        setSalario(this.valorPorTarefa * tarefasConcluidas);
    }

    @Override
    public String dados() {
        return super.dados() + ", Valor por Tarefa: R$" + valorPorTarefa + ", Tarefas Concluídas: " + tarefasConcluidas;
    }
}
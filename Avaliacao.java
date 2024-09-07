// Classe Avaliacao
public class Avaliacao {
    private CriterioAvaliacao criterio;
    private double nota;

    // Construtor
    public Avaliacao(CriterioAvaliacao criterio, double nota) {
        this.setCriterio(criterio); // Verifica e define o critério
        this.setNota(nota); // Verifica e define a nota
    }

    public CriterioAvaliacao getCriterio() {
        return criterio;
    }

    // Setter com verificação
    public void setCriterio(CriterioAvaliacao criterio) {
        if (criterio == null) {
            throw new IllegalArgumentException("Critério de avaliação não pode ser nulo.");
        }
        this.criterio = criterio;
    }

    public double getNota() {
        return nota;
    }

    // Setter com verificação
    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
        }
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Avaliacao [criterio=" + criterio + ", nota=" + nota + "]";
    }
}
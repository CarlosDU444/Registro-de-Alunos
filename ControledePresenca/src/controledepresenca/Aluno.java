
package controledepresenca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<LocalDate> datasPresenca;

    public Aluno(String nome) {
        this.nome = nome;
        this.datasPresenca = new ArrayList<>();
    }

    public void registrarPresenca() {
        LocalDate hoje = LocalDate.now();
        if (!datasPresenca.contains(hoje)) {
            datasPresenca.add(hoje);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getPresencas() {
        return datasPresenca.size();
    }

    public ArrayList<LocalDate> getDatasPresenca() {
        return datasPresenca;
    }
}

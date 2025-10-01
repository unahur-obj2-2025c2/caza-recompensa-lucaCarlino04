package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import ar.edu.unahur.obj2.Cazadores.Cazador;
import ar.edu.unahur.obj2.Profugos.Profugo;

public class Agencia {
    private static Agencia instance;
    private List<Cazador> cazadores = new ArrayList<>();

    private Agencia() {}
    
    public static Agencia getInstance() {
        return instance;
    }

    public void agregarCazador(Cazador c) {
        cazadores.add(c);
    }

    public List<Profugo> todosLosProfugosCapturados() {
        return cazadores.stream().flatMap(c -> c.getProfugosCapturados().stream()).toList();
    }

    public Optional<Profugo> profugoMasHabilCapturado() {
        return todosLosProfugosCapturados().stream().max(Comparator.comparingInt(Profugo::getHabilidad));
    }
}

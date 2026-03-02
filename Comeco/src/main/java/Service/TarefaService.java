package Service;

import Model.Tarefa;
import Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    // Buscar todas as tarefas
    public List<Tarefa> buscarTodas() {
        return tarefaRepository.findAll();
    }

    // Buscar tarefa por ID
    public Optional<Tarefa> buscarPorId(Long id) { // OPTIONAL = é uma garantia de que se o dado solicitado não existir,
        return tarefaRepository.findById(id);      // o codigo não irá quebrar
    }

    // Salvar nova tarefa
    public Tarefa salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    // Marcar tarefa como concluída
    public Tarefa marcarComoConcluida(Long id) {
        Optional<Tarefa> opcional = tarefaRepository.findById(id);

        if (opcional.isPresent()) {
            Tarefa tarefa = opcional.get();
            tarefa.setConcluida(true);
            return tarefaRepository.save(tarefa);
        }

        return null;
    }

    // Deletar tarefa
    public void deletar(Long id) {
        tarefaRepository.deleteById(id);
    }
}
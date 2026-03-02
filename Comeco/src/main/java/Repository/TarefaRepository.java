package Repository;

import Model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // PRONTO! Não precisa mais nada! ESTOU HERDANDO DO JPA REPOSITORY TODAS AS FUNÇÕES PARA A CLASSE TAREFA REPOSITORY
}


//// Salvar tarefa
//tarefaRepository.save(tarefa);
//
//// Buscar todas as tarefas
//List<Tarefa> todas = tarefaRepository.findAll();
//
//// Buscar tarefa por ID
//Optional<Tarefa> tarefa = tarefaRepository.findById(1L);
//
//// Deletar tarefa
//tarefaRepository.deleteById(1L);
//
//// Contar quantas tarefas existem
//long total = tarefaRepository.count();
//
//// Verificar se existe
//boolean existe = tarefaRepository.existsById(1L);
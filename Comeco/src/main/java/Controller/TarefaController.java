package Controller;


import Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;
}


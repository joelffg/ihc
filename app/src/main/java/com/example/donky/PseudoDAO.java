package com.example.donky;

import com.example.donky.dto.TarefaDTO;

import java.util.ArrayList;
import java.util.List;

import static com.example.donky.dto.TarefaDTO.TarefaBuilder.tarefa;

public class PseudoDAO {
    List<TarefaDTO> tarefaDTOS;

    private final String URL_BASE = "http://joelffg.pythonanywhere.com/";

    public PseudoDAO() {
        tarefaDTOS = new ArrayList<>();

        // Biblioteca do CCET
        List<TarefaDTO> tarefaList = new ArrayList<>();
        tarefaList.add(tarefa()
                .withId(1)
                .withName("Tarefa 1")
                .build());
        tarefaList.add(tarefa()
                .withId(2)
                .withName("Tarefa 2")
                .build());
    }
}

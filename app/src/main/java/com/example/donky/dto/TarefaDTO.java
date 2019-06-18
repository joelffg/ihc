package com.example.donky.dto;

import java.io.Serializable;

public class TarefaDTO implements Serializable {
    private long id;
    private String name;

    private TarefaDTO(TarefaBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static class TarefaBuilder {
        private long id;
        private String name;

        public static TarefaBuilder tarefa() {
            return new TarefaBuilder();
        }

        public TarefaBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public TarefaBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public TarefaDTO build() {
            return new TarefaDTO(this);
        }
    }
}


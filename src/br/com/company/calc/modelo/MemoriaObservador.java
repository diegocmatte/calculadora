package br.com.company.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

    public void valorAlterado(String novoValor);
}

package br.com.alura.screenmacht1.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

}

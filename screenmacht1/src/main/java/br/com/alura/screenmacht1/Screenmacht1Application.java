package br.com.alura.screenmacht1;

import br.com.alura.screenmacht1.model.DadosSerie;
import br.com.alura.screenmacht1.service.ConsumoApi;
import br.com.alura.screenmacht1.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Screenmacht1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Screenmacht1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);



	}
}

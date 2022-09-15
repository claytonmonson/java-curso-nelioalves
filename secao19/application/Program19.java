package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> election = new TreeMap<>();

		final String path = "C:\\temp\\in_eleicao.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] campos = line.split(",");
				String candidato = campos[0];
				Integer votos = Integer.parseInt(campos[1]);
				
				if(election.containsKey(candidato)) {
					int votosTotal = election.get(candidato);
					election.put(candidato, votos + votosTotal);
				} else {
					election.put(candidato, votos);
				}
					
				line = br.readLine();
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		for(String key : election.keySet()) {
			System.out.println("Candidato: " + key + " - Votos: " +  election.get(key));
		}
		sc.close();

	}
}

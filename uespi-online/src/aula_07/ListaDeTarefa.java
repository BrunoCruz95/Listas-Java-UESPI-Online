package aula_07;

public class ListaDeTarefa {

	Tarefa[] tarefas = new Tarefa[10];
	int indiceUltimaTarefa = -1;

	public boolean valida(String umaDescricao) {
		return umaDescricao.matches("([a-zA-Z]{2,}\\s)+([a-zA-Z]{2,}|[a-zA-Z]{2,}\\s)");
	}

	public boolean adiciona(Tarefa nova) {
		if (valida(nova.getDescricao())) {
			if (indiceUltimaTarefa < 9) {
				indiceUltimaTarefa++;
				tarefas[indiceUltimaTarefa] = nova;
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	public Tarefa getUltimaTarefa() {
		return tarefas[indiceUltimaTarefa];
	}
}

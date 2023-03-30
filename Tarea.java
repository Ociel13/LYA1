public class Tarea{
	public void Analizar() {
		System.out.println("Escribe tu codigo: ");
		Scaner data = new data(System.in);
		String entrada = data.nextLine();
		Pattern pattern = pattern.compile ("[^a-zA-Z0-9z\\.\\=\\,\\;\\=\\;=\\<\\>\\==\\<=\\>=\\+\\-\\*\\/\\(\\)']+");
		HashMap<String, Integer> identificadores = new HashMap<String,Integer>();
		Mathcher mather = pattern.matcher(lista);
		String lista = str_Sample;
		String str_Sample= " ";
			identificadores.put(".",1);
			identificadores.put("conts",2);
			identificadores.put("id",3);
			identificadores.put("=",4);
			identificadores.put("num",5);
			identificadores.put(",",6);
			identificadores.put(";",7);
			identificadores.put("var",8);
			identificadores.put("proced",9);
			identificadores.put("begin",10);
			identificadores.put("end",11);
			identificadores.put("write",12);
			identificadores.put("read",13);
			identificadores.put("call",14);
			identificadores.put("if",15);
			identificadores.put("then",16);
			identificadores.put("while",17);
			identificadores.put("do",18);
			identificadores.put("for",19);
			identificadores.put("to",20);
			identificadores.put("dto",21);
			identificadores.put("==",22);
			identificadores.put("!=",23);
			identificadores.put("<",24);
			identificadores.put(">",25);
			identificadores.put("<=",26);
			identificadores.put(">=",27);
			identificadores.put("+",28);
			identificadores.put("-",29);
			identificadores.put("*",30);
			identificadores.put("/",31);
			identificadores.put("(",32);
			identificadores.put(")",33);
		for(int i = 0; i<lista.length; i++){
			if (identificadores.containsKeys(lista[i])){
				System.out.println (lista[i]+ "Numero de indetificador: "+indetificador.get(lista[i]+"\n"));
			}
		}

	}
}
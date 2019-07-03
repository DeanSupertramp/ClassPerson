public class ClasseMain {
	public static void main(String[] args) {
		
		ClassePersona andrea = new ClassePersona();
		
		int occhi = andrea.occhi;
		int naso = andrea.naso;
		int dita = andrea.dita;
		System.out.println("Andrea ha " + occhi + " occhi, " + naso + " naso e " + dita +" dita per mano");

		ClassePersona gianmarco = new ClassePersona();
		gianmarco.occhi = 4;
		gianmarco.naso = 77;
		gianmarco.dita = 1;
		System.out.println("Gianmarco invece ha " + gianmarco.occhi + " occhi, " + gianmarco.naso + " naso e " + gianmarco.dita +" dita per mano");
		System.out.println("ricordo però che Andrea ha " + occhi + " occhi, " + naso + " naso e " + dita +" dita per mano");

	}
}

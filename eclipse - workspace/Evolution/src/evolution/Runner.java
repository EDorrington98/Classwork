package evolution;

public class Runner {
	public static void main(String[] args) {
		Snake kobe = new Snake();
		kobe.bite();
		kobe.getLength();
		RattleSnake leBron = new RattleSnake();
		leBron.bite();
		leBron.rattle();
		RattleSnake james = new RattleSnake();
		BlackMamba tyler = new BlackMamba();
		Snake a = (Snake) james;
		Snake b = (Snake) tyler;
		a.bite();
		b.bite();
		RattleSnake stillJames = (RattleSnake) a;
		BlackMamba notJames = (BlackMamba) b;
		stillJames.bite();
		notJames.bite();
		
		
	}
}

package work5.extdesign;

public abstract class Hero {
	private String name;
	private int level;
	private double exp;

	private IAttackable attackBehavior;
	private IDefendable defendBehavior;
	private IMovable moveBehavior;

	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}

	public void setAttackBehavior(IAttackable attackBehavior) {
		this.attackBehavior = attackBehavior;
	}

	public void attack() {
		if (attackBehavior != null) {
			System.out.print(name + " ");
			this.attackBehavior.attack();
		} else {
			System.out.println(name + " 尚未設定攻擊行為！");
		}
	}
	
	public void setDefendBehavior(IDefendable defendBehavior) {
		this.defendBehavior = defendBehavior;
	}
	
	public void defend() {
		if(defendBehavior != null) {
			System.out.print(name + " ");
			this.defendBehavior.defend();
		}else {
			System.out.println(name + " 尚未設定防禦行為！");
		}
	}

	public void setMoveBehavior(IMovable moveBehavior) {
		this.moveBehavior = moveBehavior;
	}
	
	public void move() {
		if(moveBehavior != null) {
			System.out.print(name + " ");
			this.moveBehavior.move();
		}else {
			System.out.println(name + " 尚未設定移動行為！");
		}
	}
	
}

package work5.extdesign;

public abstract class Hero {
	private String name;
	private int level;
	private double exp;

	private IAttackable attackBehavior;

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

}

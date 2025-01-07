package work5.extdesign;

public class RoleGameTest {
	public static void main(String[] args) {
		Hero hero1 = new Swordsman("Aragorn", 10, 50);
		Hero hero2 = new Archer("Legolas", 10, 90);
		Hero hero3 = new Mage("Gandalf", 50, 0);
		Hero hero4 = new Thief("Bilbo", 50, 0);
		
		hero1.setAttackBehavior(new AttackSlash());
		hero1.setDefendBehavior(new DefendShielBlock());
		hero1.setMoveBehavior(new Walk());
		
		hero2.setAttackBehavior(new AttackRainOfArrows());
		hero2.setDefendBehavior(new DefendDodge());
		hero2.setMoveBehavior(new Leap());
		
		hero3.setAttackBehavior(new AttackFireball());
		hero3.setDefendBehavior(new DefendMagicShield());
		hero3.setMoveBehavior(new Teleport());
		
		hero4.setAttackBehavior(new AttackAmbush());
		hero4.setDefendBehavior(new DefendSmokeBomb());
		hero4.setMoveBehavior(new Run());
		
		hero1.attack();
		hero1.defend();
		hero1.move();
		
		hero2.attack();
		hero2.defend();
		hero2.move();
		
		hero3.attack();
		hero3.defend();
		hero3.move();
		
		hero4.attack();
		hero4.defend();
		hero4.move();
		System.out.println("=================================");
		Hero[] hero = new Hero[4];
		hero[0] = new Swordsman("Arthur", 20, 45);
		hero[1] = new Archer("Katniss", 15, 2);
		hero[2] = new Mage("Merlin", 45, 0);
		hero[3] = new Thief("Lupin", 40, 50);
		
		hero[0].setAttackBehavior(new AttackCharge());
		hero[0].setDefendBehavior(new DefendShielBlock());
		hero[0].setMoveBehavior(new Run());
		
		hero[1].setAttackBehavior(new AttackShoot());
		hero[1].setDefendBehavior(new DefendDodge());
		hero[1].setMoveBehavior(new Walk());
		
		hero[2].setAttackBehavior(new AttackIceBlast());
		hero[2].setDefendBehavior(new DefendMagicShield());
		hero[2].setMoveBehavior(new Teleport());
		
		hero[3].setAttackBehavior(new AttackBackstab());
		hero[3].setDefendBehavior(new DefendSmokeBomb());
		hero[3].setMoveBehavior(new Walk());
		
		for(int i = 0; i <hero.length; i++) {
			hero[i].attack();
			hero[i].defend();
			hero[i].move();
		}
	}
}

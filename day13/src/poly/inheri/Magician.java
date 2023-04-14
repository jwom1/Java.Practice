package poly.inheri;

public class Magician {

	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Magician(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 2;
		this.def = 0;
		this.exp = 0;
	}
	
	public void showStatus() {
		System.out.println("---------------------");
		System.out.println("아이디 : " + id);		
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + atk);
		System.out.println("방어력 : " + def);
		System.out.println("경험치 : " + exp);	
		System.out.println("---------------------");
	}
	
	
	public void hunt(Monster monster) {
		if(monster.isInactive()) {
			showMonsteralreadyDeadMessage(monster.getName());
			return;
		}
		
		if(monster.isInactiveAfterNextAttack(this.atk)) {
				monster.setAfterAttackedHp(this.atk);
				gainMonsterExp(monster.getExp());
				showMonsterDeadAttackMessage(monster.getName());
			}else {
				monster.setAfterAttackedHp(this.atk);
				setcounterAttack(monster.getAtk());
				showMonsterNotDeadMessage(monster.getName());
			}
	}
	
	
	
	public void castFireball(Monster monster) {
		if(monster.isInactive()) {
			showMonsteralreadyDeadMessage(monster.getName());
			return;
		}
		
		if(monster.isInactiveAfterNextAttack(this.atk*2)) {
				monster.setAfterAttackedHp(this.atk*2);
				gainMonsterExp(monster.getExp());
				showMonsterDeadAttackMessage(monster.getName());
			}else {
				monster.setAfterAttackedHp(this.atk*2);
				setcounterAttack(monster.getAtk());
				showMonsterNotDeadMessage(monster.getName());	
			  }
	}
	
	
//------------------------------------------------------------//
	
	public void gainMonsterExp(int monsterExp) {
		this.exp += monsterExp;
	}
	
	public void setcounterAttack(int monsterAtk) {
		if(monsterAtk>0 && (monsterAtk-this.def)<1) {
			this.hp -= 1;
		}else if(monsterAtk == 0) {
			return;
		}else {
			this.hp -= (monsterAtk - this.def);
		}	
	}
	
	public void showMonsteralreadyDeadMessage(String monsterName) {
		System.out.println(monsterName + "은(는) 이미 죽은 몬스터입니다.");
	}
	
	public void showMonsterDeadAttackMessage(String monsterName) {
		System.out.println(monsterName + "을(를) 처치했습니다.");
	}
	
	public void showMonsterNotDeadMessage(String monsterName) {
		System.out.println(monsterName + "을(를) 처치하지 못했습니다.");
		System.out.println(monsterName + "이(가) 반격하였습니다.");
	}
	
	//-------------------------------------------------------------//
	
	
	
	
}

package poly.noinheri;

public class Pig {

	private int hp;
	private int atk;
	private int def;

	public void Pig() {
		this.hp = 10;
		this.atk = 2;
		this.def = 0;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	public boolean isPigActive() {
		return hp > 0 ? true : false;
	}
	
	// 공격받은 뒤에 살아있는지 죽었는지 체크
	public boolean isAttackedPigActive(int userAtk) {
		return (hp - userAtk) > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);
	}
	
	
}

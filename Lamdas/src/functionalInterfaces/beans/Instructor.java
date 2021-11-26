package functionalInterfaces.beans;

public class Instructor {

	private String name;
	private String skill;
	private float exp;
	private boolean online;
	



	public Instructor(String name, String skill, float exp, boolean online) {
		super();
		this.name = name;
		this.skill = skill;
		this.exp = exp;
		this.online = online;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public float getExp() {
		return exp;
	}

	public void setExp(float exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", skill=" + skill + ", exp=" + exp + ", online=" + online + "]";
	}

}

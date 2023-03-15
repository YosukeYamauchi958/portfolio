package entity;

/**
 * traineeテーブルのエンティティ
 */
public class Trainee {
	/** ID */
	private int id;

	/** 名前 */
	private String name;

	/** 年齢 */
	private int age;

	/** 性別 */
	private String sex;

	/** 単元ID */
	private int unitId;

	/** 会社ID */
	private int coId;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex セットする sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return unitId
	 */
	public int getUnitId() {
		return unitId;
	}

	/**
	 * @param unitId セットする unitId
	 */
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	/**
	 * @return coId
	 */
	public int getCoId() {
		return coId;
	}

	/**
	 * @param coId セットする coId
	 */
	public void setCoId(int coId) {
		this.coId = coId;
	}

}

package application;

import javafx.scene.layout.VBox;

public class Koma extends VBox {
	String teacher;
	String kamoku;
	String kyoushitu;

	private int teacherId;
	private int kamokuId;
	private int kyousituId;

	private int jigen;
	private int youbi;

	public Koma(int teacherId, String teacher, int kamokuId,String kamoku, int kyousituId, String kyoushitu) {
		super();
		this.teacher = teacher;
		this.kamoku = kamoku;
		this.kyoushitu = kyoushitu;
		this.teacherId = teacherId;
		this.kamokuId = kamokuId;
		this.kyousituId = kyousituId;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getKamoku() {
		return kamoku;
	}

	public void setKamoku(String kamoku) {
		this.kamoku = kamoku;
	}

	public String getKyoushitu() {
		return kyoushitu;
	}

	public void setKyoushitu(String kyoushitu) {
		this.kyoushitu = kyoushitu;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getKamokuId() {
		return kamokuId;
	}

	public void setKamokuId(int kamokuId) {
		this.kamokuId = kamokuId;
	}

	public int getKyousituId() {
		return kyousituId;
	}

	public void setKyousituId(int kyousituId) {
		this.kyousituId = kyousituId;
	}

	public int getJigen() {
		return jigen;
	}

	public void setJigen(int jigen) {
		this.jigen = jigen;
	}

	public int getYoubi() {
		return youbi;
	}

	public void setYoubi(int youbi) {
		this.youbi = youbi;
	}




}
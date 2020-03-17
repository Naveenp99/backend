package com.bdlabz.fundoo.Dto;

public class NoteDto {

	private String title;
	private String take_a_note;
	private String color;
	private boolean pin;
	private boolean archive;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTake_a_note() {
		return take_a_note;
	}
	public void setTake_a_note(String take_a_note) {
		this.take_a_note = take_a_note;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPin() {
		return pin;
	}
	public void setPin(boolean pin) {
		this.pin = pin;
	}
	public boolean isArchive() {
		return archive;
	}
	public void setArchive(boolean archive) {
		this.archive = archive;
	}
	@Override
	public String toString() {
		return "NoteDto [title=" + title + ", take_a_note=" + take_a_note + ", color=" + color + ", pin=" + pin
				+ ", archive=" + archive + "]";
	}
	
	
}

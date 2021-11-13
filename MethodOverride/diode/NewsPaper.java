package com.xwork.diode;

public class NewsPaper {
	private String name;
	private String lang;
	private int since;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Override";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {

			return false;
		}
		if (obj instanceof NewsPaper) {
			NewsPaper news = (NewsPaper) obj;
			String lan = news.getLang();
			String name = news.getName();

			if (this.lang.equals(lan) && this.name.equals(name)) {
				System.out.println("Type is matched");
				return true;

			}

			else {

				System.err.println("Mismatch");
			}

		}

		return false;
	}

}

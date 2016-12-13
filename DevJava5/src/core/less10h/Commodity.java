package core.less10h;

public class Commodity {

	private String name;
	private int weigh;
	private int volume;
	private int price;

	public Commodity(String name, int weigh, int volume, int price) {
		this.name = name;
		this.weigh = weigh;
		this.volume = volume;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeigh() {
		return weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Comodity [name=" + name + ", weigh=" + weigh + ", volume=" + volume + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + volume;
		result = prime * result + weigh;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (volume != other.volume)
			return false;
		if (weigh != other.weigh)
			return false;
		return true;
	}

}

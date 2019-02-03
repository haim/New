package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class HashCodeveEquals {
	
	private String isim;
	private int id;

	public HashCodeveEquals(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}

	@Override
	public String toString() {
		return "|||| ID: " + id + " İsim :" + isim + " |||";

	}
/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((isim == null) ? 0 : isim.hashCode());
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
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		if (isim == null) {
			if (other.isim != null)
				return false;
		} else if (!isim.equals(other.isim))
			return false;
		return true;
	}
*/


	public static void main(String[] args) {

		Set<Player> player_list = new HashSet<Player>();

		Player player1 = new Player("Mustafa", 1);
		Player player2 = new Player("Mehmet", 10);
		Player player3 = new Player("Emre", 6);
		Player player4 = new Player("Mustafa", 1);

		player_list.add(player1);
		player_list.add(player2);
		player_list.add(player3);
		player_list.add(player4);
		
		for (Player p : player_list) {
			System.out.println(p);
		}

	
	}
}

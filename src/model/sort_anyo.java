package model;

import java.util.Comparator;

public class sort_anyo implements Comparator<Multimedia> {

	@Override
	public int compare(Multimedia o1, Multimedia o2) {
		int comp = 0;
		if (o1 != null && o2 != null) {
			comp = o1.getAnoE().compareTo(o2.getAnoE());
		}
		return comp;
	}

}

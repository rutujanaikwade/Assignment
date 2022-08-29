package Finzly.Homework.Assignment;
import java.util.Comparator;

public class AssignmentThree implements Comparator<CurrencyPair> {

		@Override
		public int compare(CurrencyPair C1, CurrencyPair C2) {
			
			return C1.getLastUpdatedTime().compareTo(C2.getLastUpdatedTime());
		}

	}


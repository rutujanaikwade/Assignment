package Finzly.Homework.Assignment;

public class CurrencyPair implements Comparable<CurrencyPair>  {
	
	 String Ccy1;
	 String Ccy2;
	 String Spotdays;
	 String WeekendDays;
	 String Precision;
	 String LastUpdatedTime;
//	 String Currency ;
	

	public CurrencyPair(String ccy1, String ccy2, String values, String weekendDays, String values2,
			String values3) {
		super();
		Ccy1 = ccy1;
		Ccy2 = ccy2;
		Spotdays = values;
		WeekendDays = weekendDays;
		Precision = values2;
		LastUpdatedTime = values3;
	}


	public String getCcy1() {
		return Ccy1;
	}


	public void setCcy1(String ccy1) {
		Ccy1 = ccy1;
	}


	public String getCcy2() {
		return Ccy2;
	}


	public void setCcy2(String ccy2) {
		Ccy2 = ccy2;
	}


	public String getSpotdays() {
		return Spotdays;
	}


	public void setSpotdays(String spotdays) {
		Spotdays = spotdays;
	}


	public String getWeekendDays() {
		return WeekendDays;
	}


	public void setWeekendDays(String weekendDays) {
		WeekendDays = weekendDays;
	}


	public String getPrecision() {
		return Precision;
	}


	public void setPrecision(String precision) {
		Precision = precision;
	}


	public String getLastUpdatedTime() {
		return LastUpdatedTime;
	}


	public void setLastUpdatedTime(String lastUpdatedTime) {
		LastUpdatedTime = lastUpdatedTime;
	}
//	public String getCurrency() {
//		return Currency;
//	}
//
//
//	public void setCurrency(String currency) {
//		Currency = currency;
//	}


	@Override
	public String toString() {
		return "CurrencyPair [Ccy1=" + Ccy1 + ", Ccy2=" + Ccy2 + ", Spotdays=" + Spotdays + ", WeekendDays="
				+ WeekendDays + ", Precision=" + Precision + ", LastUpdatedTime=" + LastUpdatedTime +"]";
	}

	

	@Override
	public int compareTo(CurrencyPair o) {
		
		return (Ccy1+ Ccy2).compareTo(o.Ccy1+o.Ccy2);
	}
	

}

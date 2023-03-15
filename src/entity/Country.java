package entity;

public class Country {

	private int id;
	private String county;
	private String capital;
	private int population;
	private int area;
	private double density;

	public int getId(){ return id; }
	public void setId(int id){ this.id = id; }

	public String getCountry(){ return county; }
	public void setCountry(String country){ this.county = country; }

	public String getCapital(){ return capital; }
	public void setCapital(String capital){ this.capital = capital; }

	public int getPopulation(){ return population; }
	public void setPopulation(int population){ this.population = population; }

	public int getArea(){ return area; }
	public void setArea(int area){ this.area = area; }

	public double getDensity(){ return density; }
	public void setDensity(Double density){ this.density = density; }

}

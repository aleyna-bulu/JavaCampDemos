package oopIntro;

public class Category {
	private int id;
	private String name;
	
	public Category(){
		}
	
 public Category(int id, String name) {
		super();
		//parametresiz constructorı çalıştırıyor bu süper
		this.id = id;
		this.name = name;
	}

public int getId() {
	return this.id;
}
 
 public void setId(int id) {
	 this.id=id;
	 
 }
 
 public String getName() {
	 //okuma yapacağım için parametre yok
	 return this.name+"!";
 }
   public void setName(String name) {
	   this.name=name;
   }
 
}

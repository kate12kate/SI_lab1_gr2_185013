class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades;

	//TODO constructor
	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}
	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}
	public double getAverage() {
		//TODO
		return  grades.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
	}

	public int ECTSCredits() {
		//TODO
		int count = (int) grades.stream().filter(s->s>5).count();
		int kredit=count*6;
		return kredit;
	}
}


 class Faculty {
	String name;
	List<Student> list;

	public Faculty(String name) {
		this.name = name;
		this.list=new ArrayList<>();

	}
	public void add(Student student){
		list.add(student);

	}
	public  void remove(Student student){
		list.remove(student);

	}
	public double avg(){
		return list.stream().mapToDouble(s->s.getAverage()).average().getAsDouble();
	}
}
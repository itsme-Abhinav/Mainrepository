class superDepartment
{
	
	private String todayswork ;
	private String Workdeadline ;
	private String departmentName = "Super Department";
	
	
	public String departmentName()
	{
		return this.departmentName;
	}
	
	public String getTodaysWork()
	{ 
		this.todayswork = "No Work as of now";
		return todayswork;
	}
	
	
	public String getWorkdeadline()
	{ 
		this.Workdeadline = "Nil";
		return this.Workdeadline;
	}
	
	
	public void istodayaholiday()
	{ 
		System.out.println ("today is not a holiday");
	}
	
}

class AdminDepartment extends superDepartment
{
	
	private String todayswork;
	private String Workdeadline ;
    private String departmentName = "Admin Department";
	
	
	public String departmentName()
	{
		return  this.departmentName;
	}
	
	public String getTodaysWork()
	{ 
		this.todayswork = "complete your documents submission";
		return this.todayswork;
	}

	
	public String getWorkdeadline()
	{ 
		this.Workdeadline = "complete by EOD";
		return this.Workdeadline;
    }
	
}

class HrDepartment extends superDepartment 
{

	private String todayswork = "Fill today’s timesheet and mark your attendance";
	private String workdeadline = "Complete by EOD";
    private String departmentName = "Hr Department";
	
	
	public String departmentName()
	{
		return  this.departmentName;
	 }
	
	public String getTodaysWork()
	{ 
		return this.todayswork;
	}
	
	public String getWorkdeadline()
	{ 
		return this.workdeadline;
	}
	
	public void doActivity()
	{ 
		System.out.println ("team lunch");
	}
}

class TechDepartment extends superDepartment
{
	
	private String todayswork = "Complete coding of module 1";
	private String workdeadline = "Complete by EOD";
    private String departmentName = "Tech Department";
	
	
	public String departmentName()
	{
		return  this.departmentName;
	 
	}
	
	public String getTodayswork()
	{ 
		return this.todayswork;
	}
	
	public String getWorkdeadline()
	{ 
		return this.workdeadline;
	}
	
	public void getTechStackInformation()
	{ 
		System.out.println ("core Java");
	}	
}

public class assesment{
	public static void main(String[] args) {
		
		AdminDepartment dept = new AdminDepartment();
		//
		//
		System.out.println("welcome to " + dept.departmentName());
		System.out.println(dept.getTodaysWork());
		System.out.println (dept.getWorkdeadline());
		dept.istodayaholiday();
	
		System.out.println ("");
		
		//second function output
		HrDepartment hd = new HrDepartment();
		System.out.println("welcome to " + hd.departmentName());
		System.out.println(hd.getTodaysWork());
		System.out.println (hd.getWorkdeadline());
		hd.istodayaholiday();
		
		System.out.println ("");
		
		//third function output
		TechDepartment tec = new TechDepartment();
		System.out.println("welcome to " + tec.departmentName());
		System.out.println(tec.getTodayswork());
		System.out.println (tec.getWorkdeadline());
		tec.getTechStackInformation();
		tec.istodayaholiday();
	}
}



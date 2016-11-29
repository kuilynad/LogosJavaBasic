package core.less4h;

public class WorkerMonth implements Salary {
	private final int salaryMonth;

	public WorkerMonth(int salaryMonth) {
		this.salaryMonth = salaryMonth;
	}

	@Override
	public int getSalary(int salaryMonth) {
		return salaryMonth;
	}
}

package core.less4h;

public class WorkerHour implements Salary {
	private final int SalaryHour;

	public WorkerHour(int SalaryHour) {
		this.SalaryHour = SalaryHour;
	}

	@Override
	public int getSalary(int numHours) {
		return SalaryHour * numHours;
	}
}

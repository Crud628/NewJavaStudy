package Day11;

public class Test_obj {
	private String foo;
	private String bar;
	@Override
	public String toString() {
		return "Test_obj [foo=" + foo + ", bar=" + bar + "]";
	}
	public String getFoo() {
		return foo;
	}
	public void setFoo(String foo) {
		this.foo = foo;
	}
	public String getBar() {
		return bar;
	}
	public void setBar(String bar) {
		this.bar = bar;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bar == null) ? 0 : bar.hashCode());
		result = prime * result + ((foo == null) ? 0 : foo.hashCode());
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
		Test_obj other = (Test_obj) obj;
		if (bar == null) {
			if (other.bar != null)
				return false;
		} else if (!bar.equals(other.bar))
			return false;
		if (foo == null) {
			if (other.foo != null)
				return false;
		} else if (!foo.equals(other.foo))
			return false;
		return true;
	}
	public Test_obj(String foo, String bar) {
		super();
		this.foo = foo;
		this.bar = bar;
	}
	public Test_obj() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

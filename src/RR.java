public class RR {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("zwk");
		Student student1 = student;
		student1.setName("zd");
		System.out.println(student.getName());
		int n = 5;
		System.out.println(fun(n));
	}

	static int fun(int m) {
		int i, k;
		for (i = m + 1; ; i++) {
			/**********ERROR**********/
			for (k = 2; k <i; k++)
			/**********ERROR**********/
				if (i % k == 0) break;
			/**********ERROR**********/
			if (i!=2&&i==k)
			/**********ERROR**********/
				return i;
		}
	}
}

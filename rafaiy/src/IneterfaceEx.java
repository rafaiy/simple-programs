

class i1{
	interface  IneterfaceEx {
	abstract public void m1();
	void m2();
	void m3();
	}
	}
	interface  IneterfaceEx2 {
	abstract public void m4();
	void m5();


	}

	class child implements i1.IneterfaceEx,IneterfaceEx2
	{
		public void m1()
		{
			System.out.println("M1");
		}
		public void m2()
		{
			System.out.println("M2");
		}
		public void m3()
		{
			System.out.println("M3");
		}
		public void m4()
		{
			System.out.println("M4");
		}
		public void m5()
		{
			System.out.println("M5");
		}
	}

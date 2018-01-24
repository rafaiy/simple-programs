

abstract class AbstractCLass {
	
	abstract public void m1();
	abstract public void m2();
	public void m3()
	{
		System.out.println("M3 Abstract Class method");
	}

	}
	class childclass extends AbstractCLass
	{
		public void m1()
		{
			System.out.println("M1 Method Definition");
		}
		public void m2()
		{
			System.out.println("M2 Method Definition");
		}
	}
	class childclass2 extends AbstractCLass
	{
		public void m1()
		{
			System.out.println("M1 Child Method Definition");
		}
		public void m2()
		{
			System.out.println("M2 Child Method Definition");
		}
	}
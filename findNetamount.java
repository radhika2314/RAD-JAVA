package main;

public class netamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pcl= 5;
		int pen= 10;
		int book= 50;
		float tprice= 2*pcl+6*pen+book;
		double dprice= tprice-0.1*tprice;
		double fprice= dprice+0.05*dprice;
		System.out.println(" Net amount paid by john = " +fprice);
				
	}

}

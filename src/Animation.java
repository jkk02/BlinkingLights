
public class Animation {

	String name;
	//int col=3;
	//int row=3;

	public Jannik(String name){
	  this.name=name;
	}

	public void janniksAnimation(){
	  animation0();
	  animation();
	  animation2();
	  animation3();
	}

	public void animation0(){
		  int i=15;
		  for (int col= 3; col>=1; col--){
		        for(int row=3; row>=1;row--){
		        lightMatrix.getLight(col, row).setColor(new Color (i));
		        lightMatrix.getLight(col,row).sendCurrentColor();
		        delay (1000);

		    }
		  }
		} 
	
	public void animation(){
	  int i=19;
	  for (int col= 3; col>=1; col--){
	        for(int row=3; row>=1;row--){
	        lightMatrix.getLight(col, row).setColor(new Color (i));
	        lightMatrix.getLight(col,row).sendCurrentColor();
	        delay (1000);

	    }
	  }
	} 

	public void animation2(){
		  int i=21;
		  for (int col= 3; col>=1; col--){
		        
		        lightMatrix.getLight(col,2).setColor(new Color (i));
		        lightMatrix.getLight(col,2).sendCurrentColor();
		        delay (1000);

		    }
		  }    
	
	public void animation3(){
		  int i=20;
		  for (int col= 3; col>=1; col--){
		       
		        lightMatrix.getLight(col,2).setColor(new Color (i));
		        lightMatrix.getLight(col,2).sendCurrentColor();
		        delay (1000);

    	  }
		}
	
	public void animation4(){
		  int i=20;
		  for (int col= 3; col>=1; col--){
		        for(int row=3; row>=1;row--){
		        lightMatrix.getLight(col, row).setColor(new Color (i));
		        lightMatrix.getLight(col,row).sendCurrentColor();
		        delay (1000);

		    }
		  }
		}


	}
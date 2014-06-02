
public class surviveGame {
	private int matrix[][];
	private int width;
	private int height;
	public surviveGame(int[][] matrix, int w, int h){
		this.matrix = matrix;
		this.width = w;
		this.height = h;
	}
	
	boolean isLive(boolean imLive, int numOfNei){
		if(imLive){
			if(numOfNei==2||numOfNei==3)
				return true;
			
		}else{
			if(numOfNei==3)
				return true;
		}
		return false;
	}
	
	int countN(int x, int y){
		int num=0;
		if(x-1>=0){
			num += matrix[x-1][y];
			if(y-1>=0)
				num += matrix[x-1][y-1];
			if(y+1<=this.width-1)
				num += matrix[x-1][y+1];
		}
		if(y-1>=0)
			num += matrix[x][y-1];
		if(y+1<=this.width-1)	
			num += matrix[x][y+1];
		if(x+1<=this.height-1){
			num += matrix[x+1][y];
			if(y-1>=0)
				num += matrix[x+1][y-1];
			if(y+1<=this.width-1)
				num += matrix[x+1][y+1];
		}	
		return num;
	}

	int[][] nextG(){
		int next[][] = new int [this.height][this.width];
		for(int i=0; i<this.height;i++){
			for(int j=0; j<this.width; j++){
				int n = countN(i,j);
				boolean nowstate = false;
				if(this.matrix[i][j]==1){
					nowstate = true;
				}
				boolean nextstate = this.isLive(nowstate, n);
				if(nextstate)
					next[i][j] = 1;
				else 
					next[i][j] = 0;
				
			}
		}
			
		return next;
	}

}

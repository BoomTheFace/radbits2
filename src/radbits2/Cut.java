package radbits2;


public class Cut {
	public float depth;
	public float radius;
	public float sin_of_min_angle;
	public float error;
	
	public void setDepth(float newValue){
		depth = newValue;
	}
	
	public void setRadius(float newValue){
		radius = newValue;
	}
	
	public void setError(float newValue){
		error = newValue;
	}
	public void getSinOfMinAngle(){
		sin_of_min_angle = (float) (1/Math.sqrt(1+8*(error/radius)*(Math.pow(radius,2)/Math.pow(depth,2))));
	}

}

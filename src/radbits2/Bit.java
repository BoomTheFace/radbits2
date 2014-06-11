package radbits2;

public class Bit {
	public float radius;
	public float angle;
	public float sin_of_angle;
	
	public void setRadius(float newValue){
		radius = newValue;
	}
	public void setAngle(float newValue){
		angle = newValue;
	}
	public void setSinOfAngle(float newValue){
		sin_of_angle = newValue;
	}
	public void getRadius(float cut_depth, float cut_radius, float sin_of_angle){
		radius = cut_radius * ((2+(cut_depth/cut_radius)*((1/Math.pow(sin_of_angle, 2))-1)/(2/sin_of_angle))
	}

}

package radbits2;

public class Calculations {
	public static float sin_of_min_angle(float radius, float depth, float error) {
		float sin_of_min_angle;
		sin_of_min_angle = (float) (1 / Math.sqrt(1 + 8 * (error / radius)
				* (Math.pow(radius, 2) / Math.pow(depth, 2))));
		return sin_of_min_angle;
	}

	public static float bit_radius(float depth, float cut_radius,
			float sin_of_min_angle) {

		float bit_radius;
		bit_radius = (float) (cut_radius * ((depth / cut_radius)
				* ((1 / Math.pow(sin_of_min_angle, 2)) - 1) / (2 / sin_of_min_angle)));
		return bit_radius;

	}

	public static float angle(float depth, float cut_radius, float bit_radius) {
		float angle;
		angle = (float) ((depth / cut_radius) / (1 - Math
				.sqrt(1 - 2 * (cut_radius * depth / Math.pow(bit_radius, 2)))));
		return angle;
	}

}

package problemSolving.interviewQuestions.arrays.medium;

public class SquareRootProblem {

	public static void main(String[] args) {
		
		double number = 36;
		
		double temSolution = FindSquareRootOfInteger(number);
		System.out.println("Square root is: " + morePrecisionRoot(number, 3, temSolution));
	}

	private static double FindSquareRootOfInteger(double key) {
		
		double s = 0, e = key, mid = s + (e-s)/2;
		double ans = 0;
		while(s <= e) {
			
			double square = mid * mid;
			
			if(square == key) {
				return mid;
			}
			
			else if(square < key) {
				ans = mid;
				s = mid + 1;
			}
			
			else {
				e = mid - 1;
			}
			
			mid = s + (e-s)/2;
		}
		
		
		return ans;
	}
	
	static double morePrecisionRoot(double key, int precision, double integerSolution) {
		
		double factor = 1;
		double ans = integerSolution;
		
		for(int i = 0; i < precision; i++) {
			factor/=10;
			
			for(double j = ans; j*j<key; j=j+factor) {
				ans = j;
			}
		}
		
		return ans;
	}
	
}


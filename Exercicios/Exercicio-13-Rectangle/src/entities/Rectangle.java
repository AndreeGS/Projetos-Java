package entities;

public class Rectangle {
	
	public double Width;
	public double Height;
	
	public double CalcArea() {
		return Width * Height;
	}
	
	public double CalcDiagonal() {
		return Math.sqrt((Height * Height) + (Width * Width));
	}
	
	public double CalcPerimetro() {
		return 2 * (Width + Height);
	}
	
	public String ToString() {
        return String.format("\nArea: %.2f\nDiagonal: %.2f\nPerimetro: %.2f", CalcArea(), CalcDiagonal(), CalcPerimetro());
	}
}

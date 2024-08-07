package bt_Inheritance;

public class SinhVienIT extends SinhVien{
    private double scoreJava;
    private double scoreHTML;

    //constructor
    public SinhVienIT(double scoreJava, double scoreHTML) {
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    @Override
    public double getScore() {
       return (this.scoreJava * 2 + this.scoreHTML)/3;
    }
}

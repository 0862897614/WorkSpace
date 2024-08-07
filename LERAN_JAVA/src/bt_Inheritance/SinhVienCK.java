package bt_Inheritance;

public class SinhVienCK extends SinhVien{
    private double scoreCNC;
    private double scorePLC;
    
    public SinhVienCK(double scoreCNC, double scorePLC) {
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    
    public double getScoreCNC() {
        return scoreCNC;
    }
    
    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }
    
    public double getScorePLC() {
        return scorePLC;
    }
    
    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }
    
    @Override // ghi de
    public double getScore() {
        return (this.scoreCNC + this.scorePLC)/2;
    }
   
}

package inheritance;

public class SVCK extends SV{
    private String skill;

    public SVCK(String skill, String id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    void tinhDiem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tinhDiem'");
    }
    
}
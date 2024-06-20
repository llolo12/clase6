public class cls_Estudiante  extends cls_Persona2
{
    private int beca;
    private String correoEs;

    public cls_Estudiante()
    {

    }

    public cls_Estudiante(int beca, String correoEs)
    {
        this.beca = beca;
        this.correoEs = correoEs;
    }

    public int getBeca()
    {
        return beca;
    }

    public void setBeca(int beca)
    {
        this.beca = beca;
    }

    public String getCorreoEs()
    {
        return correoEs;
    }

    public void setCorreoEs(String correoEs)
    {
        this.correoEs = correoEs;
    }

}

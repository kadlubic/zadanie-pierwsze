package ozdobnik;

public class OzdobnikWykrzykniki implements IOzdobnik {

    @Override
    public String ozdob(String s) {
        return "!!!!!" + s + "!!!!!";
    }
}

package writer;

import ozdobnik.IOzdobnik;
import ozdobnik.OzdobnikGwiazdki;
import ozdobnik.OzdobnikWykrzykniki;

public class NiceWriter implements IWriter {

    public void setOzdobnik(IOzdobnik ozdobnik) {
        this.ozdobnik = ozdobnik;
    }

    IOzdobnik ozdobnik;
    @Override
    public void writer(String s) {
//        OzdobnikGwiazdki ozdobnik1 = new OzdobnikGwiazdki();
//        System.out.println(ozdobnik1.ozdob(s));


        OzdobnikWykrzykniki ozdobnik1 = new OzdobnikWykrzykniki();
        System.out.println(ozdobnik1.ozdob(s));

        //System.out.println("***** " + s + " *****");
    }
};
package ozdobnik;

public class Ozdobnik implements IOzdobnik{

    char ch_l;
    char ch_p;
    int quantity;

    public void setCh_l(char ch_l) {
        this.ch_l = ch_l;
    }

    public void setCh_p(char ch_p) {
        this.ch_p = ch_p;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String ozdob(String s) {
        String str ="";
        for(int i = 0; i<quantity; i++)
            str +=ch_l;
        str+= " " + s + " ";
        for(int i=0; i< quantity; i++)
            str +=ch_p;
        return str;
    }
}


public enum schwarz
{

    Z2(2), 
    Z4(4), 
    Z6(6), 
    Z8(8), 
    Z10(10),
    Z11(11), 
    Z13(13), 
    Z15(15), 
    Z17(17), 
    Z20(20),
    Z22(22), 
    Z24(24), 
    Z26(26), 
    Z28(28), 
    Z29(29),
    Z31(31), 
    Z33(33), 
    Z35(35);


    
    private final int eZahl;

    schwarz(int zahl) {
        eZahl = zahl;
    }

    public int getZahl() {
        return eZahl;
    }
    
}

public enum rot
{
    Z1(1), 
    Z3(3), 
    Z5(5), 
    Z7(7), 
    Z9(9),
    Z12(12), 
    Z14(14), 
    Z16(16), 
    Z18(18), 
    Z19(19),
    Z21(21), 
    Z23(23), 
    Z25(25), 
    Z27(27), 
    Z30(30),
    Z32(32), 
    Z34(34), 
    Z36(36);

    private final int eZahl;

    rot(int zahl) {
        eZahl = zahl;
    }

    public int getZahl() {
        return eZahl;
    }
}

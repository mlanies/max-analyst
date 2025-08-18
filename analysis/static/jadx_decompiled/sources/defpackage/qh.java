package defpackage;

/* loaded from: classes2.dex */
public abstract class qh {
    public static final yb9 a = nh.a;
    public static final boolean b;
    public static final fj c;

    static {
        Boolean boolA1;
        String property = System.getProperty("animoji.debug", "false");
        b = (property == null || (boolA1 = w9e.a1(property)) == null) ? false : boolA1.booleanValue();
        c = new fj();
        tu0.r(3, new m(5));
    }
}

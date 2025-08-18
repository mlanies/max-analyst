package defpackage;

/* loaded from: classes.dex */
public final class z80 implements my9 {
    public static final z80 a = new z80();
    public static final kf5 b = new kf5("eventsDroppedCount", au1.o(au1.n(pob.class, new jy(1))));
    public static final kf5 c = new kf5("reason", au1.o(au1.n(pob.class, new jy(3))));

    @Override // defpackage.m05
    public final void a(Object obj, Object obj2) {
        ss7 ss7Var = (ss7) obj;
        ny9 ny9Var = (ny9) obj2;
        ny9Var.e(b, ss7Var.a);
        ny9Var.a(c, ss7Var.b);
    }
}

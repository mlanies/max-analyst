package defpackage;

/* loaded from: classes2.dex */
public final class ctc {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;

    public ctc(long j, String str, fs8 fs8Var, String str2) {
        this.a = fs8Var.Z;
        ng4 ng4Var = fs8Var.D0;
        this.b = ng4Var != null ? ng4Var.a : System.currentTimeMillis();
        this.c = fs8Var.X == wx8.o;
        Object objI0 = x53.i0(fs8Var.s0);
        String str3 = null;
        tva tvaVar = objI0 instanceof tva ? (tva) objI0 : null;
        if (tvaVar != null) {
            String str4 = tvaVar.x0;
            str3 = str4 == null ? tvaVar.o : str4;
        }
        this.d = str3;
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class iu extends gle {
    public boolean c;
    public long o;

    public iu(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("success")) {
            this.c = lz7.H(gy8Var);
        } else if (str.equals("updateTime")) {
            this.o = lz7.M(gy8Var, 0L);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response{success=" + this.c + ", updateTime=" + this.o + "}";
    }
}

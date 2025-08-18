package defpackage;

/* loaded from: classes2.dex */
public final class qf9 extends gle {
    public wz c;

    public qf9(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("attachments")) {
            this.c = wz.a(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{attaches=" + this.c + "}";
    }
}

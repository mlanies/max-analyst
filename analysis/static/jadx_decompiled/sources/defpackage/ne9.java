package defpackage;

/* loaded from: classes2.dex */
public final class ne9 extends gle {
    public fx8 c;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        if (tpa.f(str, "reactionInfo")) {
            this.c = ote.F(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return String.valueOf(this.c);
    }
}

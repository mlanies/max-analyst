package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class fk2 extends gle {
    public ArrayList c;
    public long o;

    public fk2(gy8 gy8Var) {
        super(gy8Var);
        this.o = -1L;
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = gy8Var.w0();
            return;
        }
        if (!str.equals("members")) {
            gy8Var.z();
            return;
        }
        int iG = lz7.G(gy8Var);
        this.c = new ArrayList();
        for (int i = 0; i < iG; i++) {
            this.c.add(dk2.a(gy8Var));
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{members=" + s5c.o(this.c) + ", marker=" + this.o + "}";
    }
}

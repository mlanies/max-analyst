package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class if9 extends gle {
    public int X;
    public List c;
    public long o;

    public if9(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "marker":
                this.o = lz7.M(gy8Var, 0L);
                break;
            case "result":
                this.c = wz.f(gy8Var);
                break;
            case "total":
                this.X = lz7.L(gy8Var);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{result=" + s5c.o(this.c) + ", marker=" + this.o + ", total=" + this.X + "}";
    }
}

package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class st2 extends gle {
    public List c;
    public long o;

    public st2(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = gy8Var.w0();
        } else if (str.equals("chats")) {
            this.c = wz.b(gy8Var);
        } else {
            gy8Var.z();
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        return "marker=" + this.o + ", chats=" + s5c.o(this.c);
    }
}

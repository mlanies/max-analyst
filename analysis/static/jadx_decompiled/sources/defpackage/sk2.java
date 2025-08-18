package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class sk2 extends gle {
    public List X;
    public f52 c;
    public fs8 o;

    public sk2(gy8 gy8Var) {
        super(gy8Var);
        if (this.X == null) {
            this.X = Collections.emptyList();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        int i;
        ArrayList arrayList;
        str.getClass();
        switch (str) {
            case "deletedMessageIds":
                if (gy8Var.n().a() == 7) {
                    arrayList = new ArrayList();
                    int iS0 = gy8Var.s0();
                    for (i = 0; i < iS0; i++) {
                        arrayList.add(Long.valueOf(lz7.M(gy8Var, 0L)));
                    }
                } else {
                    gy8Var.z();
                    arrayList = null;
                }
                this.X = arrayList;
                break;
            case "chat":
                this.c = f52.a(gy8Var);
                break;
            case "message":
                this.o = tpa.z(gy8Var);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        f52 f52Var = this.c;
        fs8 fs8Var = this.o;
        int iO = s5c.o(this.X);
        StringBuilder sb = new StringBuilder("{chat=");
        sb.append(f52Var);
        sb.append(", message=");
        sb.append(fs8Var);
        sb.append(", deletedMessageIds=");
        return zr6.j(sb, iO, "}");
    }
}

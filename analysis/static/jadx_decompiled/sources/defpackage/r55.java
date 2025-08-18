package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class r55 implements Enumeration {
    public final /* synthetic */ int a;
    public int b;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                int i = this.b;
                g65[] g65VarArr = u55.c;
                if (i < 4) {
                    break;
                }
                break;
            default:
                int i2 = this.b;
                g65[] g65VarArr2 = u55.c;
                if (i2 < 4) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.a) {
            case 0:
                HashMap map = new HashMap();
                for (g65 g65Var : u55.d[this.b]) {
                    map.put(g65Var.b, g65Var);
                }
                this.b++;
                return map;
            default:
                this.b++;
                return new HashMap();
        }
    }
}

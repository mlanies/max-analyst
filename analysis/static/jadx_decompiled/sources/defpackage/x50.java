package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class x50 {
    public boolean a;
    public boolean b;
    public boolean c;

    public x50(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public y50 a() {
        if (this.a || !(this.b || this.c)) {
            return new y50(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public void b(List list) {
        if ((this.a || this.b || this.c) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((xf4) it.next()).a();
            }
        }
    }
}

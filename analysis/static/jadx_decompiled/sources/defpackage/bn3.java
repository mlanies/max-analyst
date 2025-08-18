package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class bn3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public bn3(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
    }

    public final void a(ym3 ym3Var, long[] jArr, long j) {
        ((el3) this.b.getValue()).s(ym3Var.c(), jArr);
        List listC = ym3Var.c();
        xs xsVar = new xs(0);
        Iterator it = ((ArrayList) listC).iterator();
        while (it.hasNext()) {
            xsVar.add(Long.valueOf(((wm3) it.next()).a));
        }
        for (long j2 : jArr) {
            xsVar.add(Long.valueOf(j2));
        }
        if (xsVar.isEmpty()) {
            return;
        }
        ((r47) this.c.getValue()).a(xsVar);
        ((av0) this.a.getValue()).c(new ps3(j, xsVar));
    }
}

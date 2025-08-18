package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class mk6 implements lk6 {
    public final je7 a;
    public final LinkedHashSet b = new LinkedHashSet();
    public boolean c;
    public jk6 d;

    public mk6(je7 je7Var) {
        this.a = je7Var;
    }

    public final void a(jk6 jk6Var) {
        this.d = jk6Var;
        Iterator it = this.b.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            boolean zP = ((ht8) ((kk6) it.next())).P(jk6Var, new vw(2, this, mk6.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 23));
            if (!z2) {
                z2 = zP;
            }
        }
        if (jk6Var != null && !z2) {
            z = true;
        }
        this.c = z;
    }
}

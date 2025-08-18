package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class pu6 {
    public static final je7 d = tu0.r(1, new fh5(17));
    public int a;
    public List b;
    public final pb4 c = new pb4();

    public pu6() {
        a();
    }

    public final void a() {
        this.a = this.c.a;
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a = Math.max(this.a, ((nu6) it.next()).b());
            }
        }
    }
}

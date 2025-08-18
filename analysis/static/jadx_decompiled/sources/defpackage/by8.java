package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class by8 {
    public final e52 a;
    public final es8 b;
    public final je7 c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public by8(e52 e52Var, es8 es8Var, khe kheVar) {
        this.a = e52Var;
        this.b = es8Var;
        this.c = kheVar;
    }

    public final Layout a() {
        return (Layout) this.c.getValue();
    }

    public final void b(Layout layout) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            dy8 dy8Var = (dy8) ((ay8) it.next());
            dy8Var.getClass();
            if (Looper.getMainLooper().isCurrentThread()) {
                dy8Var.setLayout(this);
            } else {
                Handler handler = dy8Var.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new h76(dy8Var, 12, this));
                } else {
                    dy8Var.post(new i76(dy8Var, 10, this));
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by8)) {
            return false;
        }
        by8 by8Var = (by8) obj;
        if (a() != by8Var.a()) {
            return false;
        }
        e52 e52Var = this.a;
        Long lValueOf = e52Var != null ? Long.valueOf(e52Var.a) : null;
        e52 e52Var2 = by8Var.a;
        return tpa.f(lValueOf, e52Var2 != null ? Long.valueOf(e52Var2.a) : null) && this.b.a.b == by8Var.b.a.b;
    }

    public final int hashCode() {
        e52 e52Var = this.a;
        Long lValueOf = e52Var != null ? Long.valueOf(e52Var.a) : null;
        return a().hashCode() + h4f.m((lValueOf != null ? lValueOf.hashCode() : 0) * 31, 31, this.b.a.b);
    }
}

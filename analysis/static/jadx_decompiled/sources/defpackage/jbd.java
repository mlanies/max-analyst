package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class jbd implements hbd, mh3 {
    public static final /* synthetic */ int j = 0;
    public final je7 a;
    public final o45 b;
    public final je7 c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final ml0 e = new ml0(null);
    public final String[] f = {"no_net", "disconnected", "connected", "logged_in"};
    public final String[] g = {"disconnected", "connected", "logged_in"};
    public volatile int h = 0;
    public volatile int i = 0;

    public jbd(je7 je7Var, o45 o45Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = o45Var;
        this.c = je7Var2;
        ((gh3) je7Var.getValue()).c(new ibd(this));
        hm9.m("jbd", "ctor, %s", toString());
    }

    public final void a(gbd gbdVar) {
        if (gbdVar == null) {
            return;
        }
        this.d.add(gbdVar);
        gbdVar.c(this.h);
    }

    public final void b() {
        if (((gh3) this.a.getValue()).f()) {
            int i = this.i;
            if (i == 0) {
                this.h = 1;
            } else if (i == 1) {
                this.h = 2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Unknown connection status=" + this.i);
                }
                this.h = 3;
            }
        } else {
            this.h = 0;
        }
        hm9.m("jbd", "updateState, %s", toString());
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((gbd) it.next()).c(this.h);
        }
        this.e.e(Integer.valueOf(this.h));
    }

    public final String toString() {
        return "SessionStateInfoImpl@" + Integer.toHexString(hashCode()) + "(connStatus=" + this.g[this.i] + ") -> " + this.f[this.h];
    }
}

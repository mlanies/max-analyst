package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ir7 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final hr7 e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final long o;
    public final long p;
    public final long q;
    public final boolean r;

    public ir7(gr7 gr7Var) {
        this.a = gr7Var.a;
        this.b = gr7Var.b;
        this.c = gr7Var.c;
        this.d = gr7Var.d;
        this.e = gr7Var.e;
        this.f = gr7Var.f;
        this.g = gr7Var.g;
        this.h = gr7Var.h;
        this.i = gr7Var.i;
        this.j = gr7Var.j;
        this.k = gr7Var.k;
        this.l = gr7Var.l;
        this.m = gr7Var.m;
        this.n = gr7Var.n;
        this.o = gr7Var.o;
        this.p = gr7Var.p;
        this.q = gr7Var.q;
        this.r = gr7Var.r;
    }

    public final e08 a(ArrayList arrayList) {
        e08 e08Var;
        long j = this.h;
        if (j != -1) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e08Var = (e08) it.next();
                if (e08Var.c == j) {
                    break;
                }
            }
            e08Var = null;
        } else {
            e08Var = null;
        }
        return (e08Var == null && arrayList.size() == 1) ? (e08) arrayList.get(0) : e08Var;
    }
}

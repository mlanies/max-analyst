package defpackage;

/* loaded from: classes2.dex */
public final class xg9 {
    public final wg9 b;
    public l20 c;
    public long d;
    public boolean e;
    public boolean f;
    public final f40 a = (f40) ((y8a) vl.b()).getAccessor().c(f40.class);
    public boolean g = true;

    public xg9(wg9 wg9Var) {
        this.b = wg9Var;
    }

    public final void a() {
        l20 l20Var;
        if (this.g) {
            long j = this.d;
            if (j == 0 || (l20Var = this.c) == null) {
                return;
            }
            if (l20Var.c()) {
                l20Var.j.getClass();
            }
            this.c = l20Var;
            this.d = j;
            boolean z = false;
            this.g = false;
            f40 f40Var = this.a;
            if (f40Var.c.p(j)) {
                boolean z2 = this.f;
                uh9 uh9Var = f40Var.c;
                if (!z2 && uh9Var.p(0L) && uh9Var.y) {
                    this.b.g();
                    return;
                }
                if (uh9Var.p(0L) && uh9Var.x) {
                    z = true;
                }
                if (z) {
                    this.f = true;
                    if (this.e) {
                        return;
                    }
                    uh9Var.o();
                    return;
                }
                if ((uh9Var.p(this.d) && uh9Var.w) || (uh9Var.p(0L) && uh9Var.y)) {
                    this.f = true;
                }
            }
        }
    }
}

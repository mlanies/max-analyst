package defpackage;

/* loaded from: classes.dex */
public final class gvc implements eu6 {
    public final eu6 a;
    public final Object b = new Object();
    public boolean c;
    public wu1 d;

    public gvc(eu6 eu6Var) {
        this.a = eu6Var;
    }

    @Override // defpackage.eu6
    public final void a(long j, wu1 wu1Var) {
        e5f e5fVar;
        synchronized (this.b) {
            this.c = true;
            this.d = wu1Var;
        }
        eu6 eu6Var = this.a;
        if (eu6Var != null) {
            eu6Var.a(j, new wu1(1, this));
            e5fVar = e5f.a;
        } else {
            e5fVar = null;
        }
        if (e5fVar == null) {
            c();
        }
    }

    public final void b() {
        eu6 eu6Var;
        synchronized (this.b) {
            try {
                if (this.c && (eu6Var = this.a) != null) {
                    eu6Var.clear();
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                wu1 wu1Var = this.d;
                if (wu1Var != null) {
                    wu1Var.a();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.eu6
    public final void clear() {
        b();
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class q75 implements q4b {
    public q75 a;
    public q75 b;

    @Override // defpackage.q4b
    public final void a(int i, Object obj) {
        if (i == 7) {
            this.a = (q75) obj;
        } else if (i == 8) {
            this.b = (q75) obj;
        } else {
            if (i != 10000) {
                return;
            }
            au1.r(obj);
        }
    }

    public final void b(long j, float[] fArr) {
        q75 q75Var = this.b;
        if (q75Var != null) {
            q75Var.b(j, fArr);
        }
    }

    public final void c() {
        q75 q75Var = this.b;
        if (q75Var != null) {
            q75Var.c();
        }
    }

    public final void d(long j, long j2) {
        q75 q75Var = this.a;
        if (q75Var != null) {
            q75Var.d(j, j2);
        }
    }
}

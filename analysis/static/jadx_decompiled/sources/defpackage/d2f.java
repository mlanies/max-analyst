package defpackage;

/* loaded from: classes.dex */
public final class d2f extends z1f {
    public final /* synthetic */ int a = 1;
    public e2f b;

    public /* synthetic */ d2f() {
    }

    @Override // defpackage.z1f, defpackage.v1f
    public void a(w1f w1fVar) {
        switch (this.a) {
            case 1:
                e2f e2fVar = this.b;
                if (!e2fVar.U0) {
                    e2fVar.O();
                    e2fVar.U0 = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.z1f, defpackage.v1f
    public void c(w1f w1fVar) {
        switch (this.a) {
            case 1:
                e2f e2fVar = this.b;
                int i = e2fVar.T0 - 1;
                e2fVar.T0 = i;
                if (i == 0) {
                    e2fVar.U0 = false;
                    e2fVar.n();
                }
                w1fVar.D(this);
                break;
        }
    }

    @Override // defpackage.z1f, defpackage.v1f
    public void g(w1f w1fVar) {
        switch (this.a) {
            case 0:
                e2f e2fVar = this.b;
                e2fVar.R0.remove(w1fVar);
                if (!e2fVar.w()) {
                    e2fVar.A(e2fVar, hme.o, false);
                    e2fVar.E0 = true;
                    e2fVar.A(e2fVar, hme.c, false);
                    break;
                }
                break;
        }
    }

    public d2f(e2f e2fVar) {
        this.b = e2fVar;
    }
}

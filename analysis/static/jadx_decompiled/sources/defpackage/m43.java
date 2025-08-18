package defpackage;

/* loaded from: classes.dex */
public final class m43 extends g0 {
    public final fcd h;
    public final thc i;
    public final /* synthetic */ int j;

    public m43(dab dabVar, fcd fcdVar, b47 b47Var, int i) {
        this.j = i;
        this.h = fcdVar;
        this.i = b47Var;
        f46.I();
        this.a = fcdVar.Y;
        f46.I();
        b47Var.c(fcdVar);
        f46.I();
        dabVar.a(new f3(0, this), fcdVar);
    }

    @Override // defpackage.g0
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        if (h()) {
            return true;
        }
        thc thcVar = this.i;
        fcd fcdVar = this.h;
        thcVar.h(fcdVar);
        fcdVar.e();
        return true;
    }

    @Override // defpackage.g0
    public void b(Object obj) {
        switch (this.j) {
            case 0:
                o43.S((o43) obj);
                break;
        }
    }

    @Override // defpackage.g0
    public Object e() {
        switch (this.j) {
            case 0:
                return o43.o((o43) super.e());
            default:
                return super.e();
        }
    }

    public void o(Object obj, int i, eab eabVar) {
        switch (this.j) {
            case 0:
                p(o43.o((o43) obj), i, eabVar);
                break;
            default:
                p(obj, i, eabVar);
                break;
        }
    }

    public final void p(Object obj, int i, eab eabVar) {
        boolean zA = fi0.a(i);
        if (l(obj, zA, ((oj0) eabVar).Y) && zA) {
            this.i.g(this.h);
        }
    }
}

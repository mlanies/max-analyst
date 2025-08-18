package defpackage;

/* loaded from: classes2.dex */
public final class hea extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ iea o;

    /* JADX WARN: Illegal instructions before constructor call */
    public hea(iea ieaVar, int i) {
        this.c = i;
        switch (i) {
            case 1:
                fea feaVar = fea.a;
                this.o = ieaVar;
                super(9, feaVar);
                break;
            default:
                gea geaVar = gea.a;
                this.o = ieaVar;
                super(9, geaVar);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    this.o.c();
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    this.o.b();
                    break;
                }
                break;
        }
    }
}

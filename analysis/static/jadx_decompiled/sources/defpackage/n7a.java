package defpackage;

/* loaded from: classes2.dex */
public final class n7a extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ o7a o;

    /* JADX WARN: Illegal instructions before constructor call */
    public n7a(o7a o7aVar, int i) {
        this.c = i;
        switch (i) {
            case 1:
                g7a g7aVar = g7a.a;
                this.o = o7aVar;
                super(9, g7aVar);
                break;
            case 2:
                this.o = o7aVar;
                super(9, (Object) null);
                break;
            default:
                h7a h7aVar = h7a.b;
                this.o = o7aVar;
                super(9, h7aVar);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    this.o.invalidate();
                    break;
                }
                break;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    this.o.invalidate();
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    this.o.invalidate();
                    break;
                }
                break;
        }
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class zc5 implements kde {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zc5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.kde
    public final Object get() {
        switch (this.a) {
            case 0:
                dd5 dd5Var = (dd5) this.c;
                dd5Var.getClass();
                return dd5Var.a(new yc5(dd5Var, this.b, 0));
            default:
                hd5 hd5Var = (hd5) this.c;
                hd5Var.getClass();
                xrd xrdVar = new xrd();
                hd5Var.f.put(Long.valueOf(((k4a) hd5Var.a).e(4, this.b)), xrdVar);
                return xrdVar;
        }
    }
}

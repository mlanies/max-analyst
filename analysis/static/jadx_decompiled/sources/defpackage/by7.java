package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class by7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy7 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ by7(cy7 cy7Var, Object obj, int i) {
        this.a = i;
        this.b = cy7Var;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*av0*/.c(this.c);
                break;
            case 1:
                cy7 cy7Var = this.b;
                cy7Var.getClass();
                try {
                    super/*av0*/.d(this.c);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                cy7 cy7Var2 = this.b;
                cy7Var2.getClass();
                try {
                    super/*av0*/.f(this.c);
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}

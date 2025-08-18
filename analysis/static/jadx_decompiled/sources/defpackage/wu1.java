package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wu1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((lq1) this.b).b(null);
                return;
            default:
                gvc gvcVar = (gvc) this.b;
                synchronized (gvcVar.b) {
                    gvcVar.c();
                }
                return;
        }
    }
}

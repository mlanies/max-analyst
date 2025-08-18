package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class qz1 implements mq1 {
    public final /* synthetic */ sz1 a;

    public void a() {
        sz1 sz1Var = this.a;
        synchronized (sz1Var.a) {
            try {
                if (sz1Var.i == 5) {
                    sz1Var.k(sz1Var.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        String str;
        sz1 sz1Var = this.a;
        synchronized (sz1Var.a) {
            c54.p("Release completer expected to be null", sz1Var.k == null);
            sz1Var.k = lq1Var;
            str = "Release[session=" + sz1Var + "]";
        }
        return str;
    }
}

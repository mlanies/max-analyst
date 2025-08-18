package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class es7 implements m56 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ je7 b;

    public /* synthetic */ es7(je7 je7Var) {
        this.b = je7Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                hm9.p("LogController", "Failed to store event", th);
                ((cba) ((o45) this.b.getValue())).c(th, true);
                return e5f.a;
            default:
                return Boolean.valueOf(((el3) this.b.getValue()).m(((Long) obj).longValue()));
        }
    }

    public /* synthetic */ es7(js7 js7Var, je7 je7Var) {
        this.b = je7Var;
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class yhc {
    public final fc0 a;
    public final vje b;
    public final oq1 c;
    public final oq1 d;
    public lq1 e;
    public lq1 f;
    public boolean g = false;
    public boolean h = false;
    public bm7 i;

    public yhc(fc0 fc0Var, vje vjeVar) {
        this.a = fc0Var;
        this.b = vjeVar;
        final int i = 0;
        this.c = f8.g(new mq1(this) { // from class: xhc
            public final /* synthetic */ yhc b;

            {
                this.b = this;
            }

            @Override // defpackage.mq1
            public final String q(lq1 lq1Var) {
                switch (i) {
                    case 0:
                        this.b.e = lq1Var;
                        return "CaptureCompleteFuture";
                    default:
                        this.b.f = lq1Var;
                        return "RequestCompleteFuture";
                }
            }
        });
        final int i2 = 1;
        this.d = f8.g(new mq1(this) { // from class: xhc
            public final /* synthetic */ yhc b;

            {
                this.b = this;
            }

            @Override // defpackage.mq1
            public final String q(lq1 lq1Var) {
                switch (i2) {
                    case 0:
                        this.b.e = lq1Var;
                        return "CaptureCompleteFuture";
                    default:
                        this.b.f = lq1Var;
                        return "RequestCompleteFuture";
                }
            }
        });
    }

    public final void a() {
        c54.p("The callback can only complete once.", !this.d.b.isDone());
        this.f.b(null);
    }
}

package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class qj extends e0 implements ox3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: Illegal instructions before constructor call */
    public qj(rj rjVar) {
        qx7 qx7Var = qx7.c;
        this.b = rjVar;
        super(qx7Var);
    }

    @Override // defpackage.ox3
    public final void g(lx3 lx3Var, Throwable th) {
        switch (this.a) {
            case 0:
                if (!(th instanceof CancellationException)) {
                    hm9.p(((rj) this.b).a, "Can't invalidate chats and messages cache", th);
                    break;
                }
                break;
            case 1:
                bx bxVar = (bx) this.b;
                yx4 yx4Var = bxVar.c;
                if (yx4Var != null) {
                    yx4Var.b("failed " + lx3Var + " with " + th + " @" + System.identityHashCode(bxVar));
                }
                bxVar.g.g(lx3Var, th);
                break;
            case 2:
                if (!(th instanceof CancellationException)) {
                    hm9.p(((gw2) this.b).J0, "Exception when search chats/messages", th);
                    break;
                }
                break;
            case 3:
                ((cba) ((o45) ((je7) this.b).getValue())).c(th, true);
                break;
            case 4:
                if (!(th instanceof CancellationException)) {
                    hm9.p(((gy4) this.b).c, "Exception while loading emoji sprite", th);
                    break;
                }
                break;
            case 5:
                ((cba) ((o45) this.b)).c(th, false);
                break;
            case 6:
                if (!(th instanceof CancellationException)) {
                    hm9.p(((pp7) this.b).b, "Can't load frames", th);
                    break;
                }
                break;
            case 7:
                if (!(th instanceof CancellationException)) {
                    ((cba) ((jva) this.b).c).c(th, false);
                    break;
                }
                break;
            default:
                if (!(th instanceof CancellationException)) {
                    hm9.p(((rff) this.b).f, "Fetch video. Exception", th);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qj(bx bxVar) {
        qx7 qx7Var = qx7.c;
        this.b = bxVar;
        super(qx7Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qj(gw2 gw2Var) {
        qx7 qx7Var = qx7.c;
        this.b = gw2Var;
        super(qx7Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qj(gy4 gy4Var) {
        qx7 qx7Var = qx7.c;
        this.b = gy4Var;
        super(qx7Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qj(o45 o45Var) {
        qx7 qx7Var = qx7.c;
        this.b = o45Var;
        super(qx7Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qj(pp7 pp7Var) {
        qx7 qx7Var = qx7.c;
        this.b = pp7Var;
        super(qx7Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qj(jva jvaVar) {
        qx7 qx7Var = qx7.c;
        this.b = jvaVar;
        super(qx7Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qj(khe kheVar) {
        qx7 qx7Var = qx7.c;
        this.b = kheVar;
        super(qx7Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qj(rff rffVar) {
        qx7 qx7Var = qx7.c;
        this.b = rffVar;
        super(qx7Var);
    }
}

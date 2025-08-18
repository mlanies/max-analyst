package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class ile implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;

    public /* synthetic */ ile(int i, je7 je7Var) {
        this.a = i;
        this.b = je7Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new f55((ScheduledExecutorService) ((iba) this.b.getValue()).l.getValue(), true);
            case 1:
                return new f55((ScheduledExecutorService) ((iba) this.b.getValue()).m.getValue(), true);
            case 2:
                iba ibaVar = (iba) this.b.getValue();
                return new f55(ibaVar.h(ibaVar.f(0, "upload", 2, 5), "upload"), true);
            case 3:
                iba ibaVar2 = (iba) this.b.getValue();
                return new f55(ibaVar2.h(ibaVar2.f(0, "media-transform", 2, 5), "media-transform"), true);
            case 4:
                iba ibaVar3 = (iba) this.b.getValue();
                return ibaVar3.i(ibaVar3.b().a(5, "srvc-rqst"), "srvc-rqst");
            case 5:
                return ((iba) this.b.getValue()).g();
            case 6:
                return ((ct0) this.b.getValue()).a(16384);
            case 7:
                return new c9f((jlc) this.b.getValue());
            default:
                v4 v4Var = ((ysf) this.b.getValue()).a;
                return new qxf(v4Var.d(av0.class), v4Var.d(kke.class));
        }
    }
}

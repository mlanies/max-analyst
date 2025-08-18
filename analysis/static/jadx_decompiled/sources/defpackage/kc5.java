package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class kc5 implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc5 b;

    public /* synthetic */ kc5(sc5 sc5Var, int i) {
        this.a = i;
        this.b = sc5Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        sc5 sc5Var = this.b;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                sc5Var.getClass();
                hm9.m("sc5", "onNotifUpdated: updated ids: %s", list);
                sc5Var.Z.e(list);
                break;
            case 1:
                List list2 = (List) obj;
                sc5Var.getClass();
                hm9.m("sc5", "on next favorite ids from obs: %s", list2);
                sc5Var.Z.e(list2);
                break;
            case 2:
            default:
                xc5 xc5Var = (xc5) obj;
                sc5Var.getClass();
                long j = xc5Var.b;
                if (j != 0) {
                    hm9.m("sc5", "loadFromMarker: new marker in response=%d", Long.valueOf(j));
                    sc5Var.c(xc5Var.b);
                    break;
                }
                break;
            case 3:
                List list3 = (List) obj;
                sc5Var.getClass();
                hm9.m("sc5", "on next favorite sticker sets: %s", list3);
                sc5Var.s0.e(list3);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((a4e) this.b.b.getValue()).c((List) obj);
            case 3:
            default:
                return new qa3(((wc5) this.b.a.getValue()).a(), 2, new z72(13, (List) obj));
            case 4:
                sc5 sc5Var = this.b;
                sc5Var.getClass();
                return new sa3(1, new p00(sc5Var, 3, (Long) obj));
        }
    }
}

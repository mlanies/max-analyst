package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class kd5 implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ md5 b;

    public /* synthetic */ kd5(md5 md5Var, int i) {
        this.a = i;
        this.b = md5Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        md5 md5Var = this.b;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                md5Var.getClass();
                hm9.m("md5", "onNotifUpdated: updated ids: %s", list);
                md5Var.i.e(list);
                break;
            case 1:
                List list2 = (List) obj;
                md5Var.getClass();
                hm9.m("md5", "on next favorite sticker ids from obs: %s", list2);
                md5Var.i.e(list2);
                break;
            case 2:
            default:
                md5Var.getClass();
                long j = ((gd5) obj).b;
                if (j != 0) {
                    md5Var.b(j);
                    break;
                }
                break;
            case 3:
                List list3 = (List) obj;
                md5Var.getClass();
                hm9.m("md5", "on next favorite sticker: %s", list3);
                md5Var.j.e(list3);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((o2e) this.b.b.get()).b((List) obj);
            case 3:
            default:
                return new qa3(((hc5) this.b.a.get()).a(), 2, new z72(7, (List) obj));
            case 4:
                md5 md5Var = this.b;
                md5Var.getClass();
                return new sa3(1, new p00(md5Var, 4, (Long) obj));
        }
    }
}

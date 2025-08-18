package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class x3e implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4e b;

    public /* synthetic */ x3e(a4e a4eVar, int i) {
        this.a = i;
        this.b = a4eVar;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) throws InterruptedException {
        List list = (List) obj;
        c4e c4eVar = this.b.a;
        c4eVar.getClass();
        nd7.U(new qa3(new e0a(qy9.j(list), new m2e(22), 3).v(), 2, new z3e(c4eVar, 1)).l(), ft.e, new z72(26, list), new ic5(6, list));
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return a4e.e((n3e) obj);
            default:
                q3e q3eVar = (q3e) obj;
                a4e a4eVar = this.b;
                a4eVar.getClass();
                return ((o2e) a4eVar.b).b(q3eVar.h).h(new ypc(a4eVar, 6, q3eVar));
        }
    }
}

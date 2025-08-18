package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class z3e implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4e b;

    public /* synthetic */ z3e(c4e c4eVar, int i) {
        this.a = i;
        this.b = c4eVar;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public final Object mo131apply(Object obj) {
        List list = (List) obj;
        switch (this.a) {
            case 0:
                c4e c4eVar = this.b;
                c4eVar.getClass();
                return new qa3(new e0a(qy9.j(list), new m2e(22), 3).v(), 2, new z3e(c4eVar, 1));
            default:
                return new qa3(this.b.a.n().h(new m2e(21)), 2, new z72(27, list));
        }
    }
}

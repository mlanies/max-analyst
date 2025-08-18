package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class doe implements b66, b7b {
    public final /* synthetic */ eoe a;
    public final /* synthetic */ List b;

    public /* synthetic */ doe(eoe eoeVar, List list) {
        this.a = eoeVar;
        this.b = list;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        eoe eoeVar = this.a;
        eoeVar.getClass();
        if (!((Boolean) obj).booleanValue()) {
            return wa3.a;
        }
        doe doeVar = new doe(eoeVar, this.b);
        xpb xpbVar = eoeVar.c;
        xpbVar.getClass();
        return new m0a(new ty9(xpbVar, doeVar, 3));
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        this.a.getClass();
        List list = this.b;
        return !((Boolean) new rqd(new q1a(2, new u24(r3, 7, list)), new z72(28, list), 2).h(new hme(5)).e()).booleanValue();
    }
}

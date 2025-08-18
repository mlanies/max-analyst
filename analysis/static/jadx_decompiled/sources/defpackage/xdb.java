package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xdb extends ffe implements a66 {
    public final /* synthetic */ feb X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdb(feb febVar, Continuation continuation) {
        super(2, continuation);
        this.X = febVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xdb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xdb(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = feb.G0;
        feb febVar = this.X;
        long jT = ((hyc) ((q33) febVar.x0.getValue())).t();
        long j = febVar.c;
        e5f e5fVar = e5f.a;
        if (jT == j) {
            pnf.o(febVar.C0, new kdb(new eqe(vea.g1), null));
            return e5fVar;
        }
        gfb.c.getClass();
        pnf.o(febVar.B0, new c64(":profile?id=" + j + "&type=contact"));
        return e5fVar;
    }
}

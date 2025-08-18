package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ydb extends ffe implements a66 {
    public final /* synthetic */ feb X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydb(feb febVar, Continuation continuation) {
        super(2, continuation);
        this.X = febVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ydb ydbVar = (ydb) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ydbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ydb(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = feb.G0;
        feb febVar = this.X;
        e52 e52VarS = febVar.s();
        long j = febVar.c;
        boolean z = false;
        if (e52VarS != null && e52VarS.Y(j)) {
            z = true;
        }
        if (((hyc) ((q33) febVar.x0.getValue())).t() != j && !z) {
            pnf.o(febVar.C0, new kdb(new eqe(vea.h1), new Integer(rea.b)));
        }
        return e5f.a;
    }
}

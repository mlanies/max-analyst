package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ocd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ add Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocd(add addVar, Continuation continuation) {
        super(2, continuation);
        this.Y = addVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ocd ocdVar = (ocd) n((ygb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ocdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ocd ocdVar = new ocd(this.Y, continuation);
        ocdVar.X = obj;
        return ocdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ygb ygbVar = (ygb) this.X;
        if (ygbVar instanceof ygb) {
            Long l = ygbVar.a;
            add addVar = this.Y;
            long j = addVar.G0.get();
            jqe jqeVar = ygbVar.b;
            s35 s35Var = addVar.z0;
            if (l != null && l.longValue() == j) {
                j47.T(addVar.a, ((w9a) addVar.r()).a(), null, new tcd(addVar, null), 2);
                pnf.o(s35Var, new ahd(jqeVar, Integer.valueOf(woc.I)));
            } else if (l == null) {
                pnf.o(s35Var, new ahd(jqeVar, Integer.valueOf(woc.I)));
            }
        }
        return e5f.a;
    }
}

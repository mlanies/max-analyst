package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dsd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ esd Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsd(esd esdVar, Continuation continuation) {
        super(2, continuation);
        this.Y = esdVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dsd dsdVar = (dsd) n((b00) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        dsdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dsd dsdVar = new dsd(this.Y, continuation);
        dsdVar.X = obj;
        return dsdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        esd.e(this.Y, (b00) this.X);
        return e5f.a;
    }
}

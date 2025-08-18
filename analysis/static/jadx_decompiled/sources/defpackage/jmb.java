package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jmb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cnb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmb(cnb cnbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = cnbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jmb jmbVar = (jmb) n((mab) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jmbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jmb jmbVar = new jmb(this.Y, continuation);
        jmbVar.X = obj;
        return jmbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        mab mabVar = (mab) this.X;
        cnb cnbVar = this.Y;
        cnbVar.M0.setValue(mabVar.a);
        cnbVar.I0.setValue(mabVar.b);
        cnbVar.K0.setValue(mabVar.c);
        return e5f.a;
    }
}

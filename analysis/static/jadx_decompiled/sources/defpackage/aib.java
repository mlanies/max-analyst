package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aib extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jib Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aib(jib jibVar, Continuation continuation) {
        super(2, continuation);
        this.Y = jibVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        aib aibVar = (aib) n((chb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        aibVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        aib aibVar = new aib(this.Y, continuation);
        aibVar.X = obj;
        return aibVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        chb chbVar = (chb) this.X;
        if (chbVar instanceof ahb) {
            Long l = ((ahb) chbVar).a;
            jib jibVar = this.Y;
            long j = jibVar.w0.get();
            if (l != null && l.longValue() == j) {
                pnf.o(jibVar.C0, new ohb(woc.z, new eqe(yea.Y0)));
            }
        }
        return e5f.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wxa extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ eya Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxa(Object obj, Continuation continuation, eya eyaVar) {
        super(2, continuation);
        this.X = obj;
        this.Y = eyaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wxa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wxa(this.X, continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        kzc kzcVar = (kzc) this.X;
        int i = kzcVar.a;
        eya eyaVar = this.Y;
        return i == 4 ? ((tya) eyaVar.u0.getValue()).a(kzcVar.X, true) : eya.q(eyaVar, ((vu2) eyaVar.t0.getValue()).a(kzcVar.o));
    }
}

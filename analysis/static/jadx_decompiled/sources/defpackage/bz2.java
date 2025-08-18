package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bz2 extends ffe implements a66 {
    public final /* synthetic */ jz2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz2(jz2 jz2Var, Continuation continuation) {
        super(2, continuation);
        this.X = jz2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bz2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bz2(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int i = jz2.Y;
        p82 p82VarL = this.X.l();
        p82VarL.getClass();
        return (e52) p82VarL.e0("create-saved-messages", new b82(p82VarL, 0));
    }
}

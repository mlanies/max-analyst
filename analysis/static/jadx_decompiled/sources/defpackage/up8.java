package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class up8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ xp8 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up8(Object obj, Continuation continuation, xp8 xp8Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = xp8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((up8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new up8(this.X, continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        e52 e52Var = (e52) this.X;
        if (!e52Var.M()) {
            throw new IllegalArgumentException("Only dialogs are supported".toString());
        }
        uj3 uj3VarL = e52Var.l();
        if (uj3VarL != null) {
            return ((tya) this.Y.e.getValue()).a(uj3VarL, false);
        }
        throw new IllegalArgumentException("Dialog contact is not found".toString());
    }
}

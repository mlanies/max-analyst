package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sp8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ tya Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp8(Object obj, Continuation continuation, tya tyaVar) {
        super(2, continuation);
        this.X = obj;
        this.Y = tyaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sp8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sp8(this.X, continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return this.Y.a((uj3) this.X, false);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final class y4a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zaa Y;
    public final /* synthetic */ OneMeApplication Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4a(zaa zaaVar, OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.Y = zaaVar;
        this.Z = oneMeApplication;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((y4a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new y4a(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            return e5f.a;
        }
        od2.a0(obj);
        this.X = 1;
        this.Y.a(this.Z, this);
        return tx3Var;
    }
}

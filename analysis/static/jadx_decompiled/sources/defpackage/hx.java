package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hx extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ix Y;
    public final /* synthetic */ Collection Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(ix ixVar, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.Y = ixVar;
        this.Z = collection;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hx) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hx(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ix ixVar = this.Y;
            r79 r79Var = (r79) ((je7) ixVar.k).getValue();
            this.X = 1;
            vlc vlcVar = r79Var.a;
            Object objT0 = j47.t0(((w9a) vlcVar.c()).b(), new olc(vlcVar, ixVar.a, this.Z, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}

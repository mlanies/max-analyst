package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class olc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vlc Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ Collection s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olc(vlc vlcVar, long j, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.Y = vlcVar;
        this.Z = j;
        this.s0 = collection;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((olc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new olc(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            t19 t19VarD = this.Y.d();
            List listD0 = x53.D0(this.s0);
            this.X = 1;
            t19VarD.getClass();
            if (ote.j(t19VarD.a, new rp4(t19VarD, listD0, this.Z, 1), this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}

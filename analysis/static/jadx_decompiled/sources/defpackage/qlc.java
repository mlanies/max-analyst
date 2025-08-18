package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qlc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vlc Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlc(vlc vlcVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = vlcVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qlc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qlc(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        vlc vlcVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            t19 t19VarD = vlcVar.d();
            this.X = 1;
            t19VarD.getClass();
            xlc xlcVarA = xlc.a(1, "SELECT * FROM messages WHERE id = ?");
            xlcVarA.j(1, this.Z);
            obj = ote.i(t19VarD.a, new CancellationSignal(), new r19(t19VarD, xlcVarA, 0), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return (cu8) obj;
            }
            od2.a0(obj);
        }
        ru8 ru8Var = (ru8) obj;
        if (ru8Var == null) {
            return null;
        }
        this.X = 2;
        obj = vlcVar.h(ru8Var, this);
        if (obj == tx3Var) {
            return tx3Var;
        }
        return (cu8) obj;
    }
}

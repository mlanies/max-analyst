package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* loaded from: classes2.dex */
public final class sie extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xie Y;
    public final /* synthetic */ SystemServicesManager$PushTokenGeneratedListener Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sie(xie xieVar, SystemServicesManager$PushTokenGeneratedListener systemServicesManager$PushTokenGeneratedListener, Continuation continuation) {
        super(2, continuation);
        this.Y = xieVar;
        this.Z = systemServicesManager$PushTokenGeneratedListener;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sie) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sie(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (this.Y.e(this.Z, this) == tx3Var) {
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

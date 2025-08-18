package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vj5 extends hu3 {
    public wve X;
    public w6f Y;
    public AsynchronousFileChannel Z;
    public yj5 o;
    public a66 s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ yj5 u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj5(yj5 yj5Var, Continuation continuation) {
        super(continuation);
        this.u0 = yj5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return yj5.a(this.u0, null, null, null, null, this);
    }
}

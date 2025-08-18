package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sj5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AtomicBoolean Y;
    public final /* synthetic */ yj5 Z;
    public final /* synthetic */ AsynchronousFileChannel s0;
    public final /* synthetic */ AtomicReference t0;
    public final /* synthetic */ iab u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj5(AtomicBoolean atomicBoolean, yj5 yj5Var, AsynchronousFileChannel asynchronousFileChannel, AtomicReference atomicReference, iab iabVar, Continuation continuation) {
        super(2, continuation);
        this.Y = atomicBoolean;
        this.Z = yj5Var;
        this.s0 = asynchronousFileChannel;
        this.t0 = atomicReference;
        this.u0 = iabVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sj5) n((wve) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sj5 sj5Var = new sj5(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
        sj5Var.X = obj;
        return sj5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wve wveVar = (wve) this.X;
        boolean z = this.Y.get();
        e5f e5fVar = e5f.a;
        if (!z) {
            return e5fVar;
        }
        yj5 yj5Var = this.Z;
        j47.T(yj5Var.q, yj5Var.p, null, new rj5(yj5Var, wveVar, this.s0, this.Y, this.t0, this.u0, null), 2);
        return e5fVar;
    }
}

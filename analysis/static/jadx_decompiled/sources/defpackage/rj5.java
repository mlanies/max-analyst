package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rj5 extends ffe implements a66 {
    public Object X;
    public long Y;
    public int Z;
    public final /* synthetic */ yj5 s0;
    public final /* synthetic */ wve t0;
    public final /* synthetic */ AsynchronousFileChannel u0;
    public final /* synthetic */ AtomicBoolean v0;
    public final /* synthetic */ AtomicReference w0;
    public final /* synthetic */ iab x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj5(yj5 yj5Var, wve wveVar, AsynchronousFileChannel asynchronousFileChannel, AtomicBoolean atomicBoolean, AtomicReference atomicReference, iab iabVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = yj5Var;
        this.t0 = wveVar;
        this.u0 = asynchronousFileChannel;
        this.v0 = atomicBoolean;
        this.w0 = atomicReference;
        this.x0 = iabVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rj5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rj5(this.s0, this.t0, this.u0, this.v0, this.w0, this.x0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0123 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj5.o(java.lang.Object):java.lang.Object");
    }
}

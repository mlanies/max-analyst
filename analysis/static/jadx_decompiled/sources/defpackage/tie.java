package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* loaded from: classes2.dex */
public final class tie extends hu3 {
    public SystemServicesManager$PushTokenGeneratedListener X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xie Z;
    public xie o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tie(xie xieVar, Continuation continuation) {
        super(continuation);
        this.Z = xieVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.e(null, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vzf extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zzf Y;
    public int Z;
    public zzf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzf(zzf zzfVar, Continuation continuation) {
        super(continuation);
        this.Y = zzfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return zzf.r(this.Y, null, this);
    }
}

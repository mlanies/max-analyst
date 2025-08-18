package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uzf extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zzf Y;
    public int Z;
    public w97 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzf(zzf zzfVar, Continuation continuation) {
        super(continuation);
        this.Y = zzfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return zzf.q(this.Y, null, this);
    }
}

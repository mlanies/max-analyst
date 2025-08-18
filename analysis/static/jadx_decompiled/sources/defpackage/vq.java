package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vq extends hu3 {
    public int X;
    public on5 Y;
    public final /* synthetic */ zb Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(zb zbVar, Continuation continuation) {
        super(continuation);
        this.Z = zbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gp5 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zb Y;
    public int Z;
    public zb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp5(zb zbVar, Continuation continuation) {
        super(continuation);
        this.Y = zbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}

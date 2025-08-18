package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yp5 extends hu3 {
    public /* synthetic */ Object X;
    public int Y;
    public final /* synthetic */ zp5 Z;
    public zp5 o;
    public Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp5(zp5 zp5Var, Continuation continuation) {
        super(continuation);
        this.Z = zp5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}

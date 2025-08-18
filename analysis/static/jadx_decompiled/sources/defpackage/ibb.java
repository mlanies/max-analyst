package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ibb extends hu3 {
    public pz7 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pz7 Z;
    public pz7 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibb(pz7 pz7Var, Continuation continuation) {
        super(continuation);
        this.Z = pz7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(this);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k44 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ o44 Y;
    public int Z;
    public o44 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k44(o44 o44Var, Continuation continuation) {
        super(continuation);
        this.Y = o44Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return o44.a(this.Y, null, this);
    }
}

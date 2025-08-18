package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zzd extends hu3 {
    public final /* synthetic */ o69 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(o69 o69Var, Continuation continuation) {
        super(continuation);
        this.X = o69Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b(0, this);
    }
}

package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wn3 extends hu3 {
    public List X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ yn3 Z;
    public yn3 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn3(yn3 yn3Var, Continuation continuation) {
        super(continuation);
        this.Z = yn3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return yn3.d(this.Z, this);
    }
}

package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wo8 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bp8 Y;
    public int Z;
    public List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo8(bp8 bp8Var, Continuation continuation) {
        super(continuation);
        this.Y = bp8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return bp8.q(null, this.Y, null, this);
    }
}

package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bg2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ eg2 Y;
    public int Z;
    public ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg2(eg2 eg2Var, Continuation continuation) {
        super(continuation);
        this.Y = eg2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(0, 0L, 0L, this);
    }
}

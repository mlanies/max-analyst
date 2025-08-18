package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ep5 extends hu3 {
    public int X;
    public final /* synthetic */ ac Y;
    public ac Z;
    public /* synthetic */ Object o;
    public on5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep5(ac acVar, Continuation continuation) {
        super(continuation);
        this.Y = acVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d(null, this);
    }
}

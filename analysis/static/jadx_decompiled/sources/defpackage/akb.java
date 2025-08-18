package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class akb extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bkb Y;
    public int Z;
    public bkb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akb(bkb bkbVar, Continuation continuation) {
        super(continuation);
        this.Y = bkbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.r(this);
    }
}

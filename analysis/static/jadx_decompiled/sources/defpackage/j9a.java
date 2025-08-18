package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j9a extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ m9a Y;
    public int Z;
    public zy7 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9a(m9a m9aVar, Continuation continuation) {
        super(continuation);
        this.Y = m9aVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}

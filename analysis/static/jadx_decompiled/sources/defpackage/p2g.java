package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p2g extends hu3 {
    public o2g X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ s2g Z;
    public s2g o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2g(s2g s2gVar, Continuation continuation) {
        super(continuation);
        this.Z = s2gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(null, null, this);
    }
}

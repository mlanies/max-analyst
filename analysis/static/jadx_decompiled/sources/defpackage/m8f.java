package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m8f extends hu3 {
    public aj9 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n8f Z;
    public n8f o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8f(n8f n8fVar, Continuation continuation) {
        super(continuation);
        this.Z = n8fVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.h(this);
    }
}

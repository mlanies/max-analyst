package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nb extends hu3 {
    public Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pb Z;
    public pb o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(pb pbVar, Continuation continuation) {
        super(continuation);
        this.Z = pbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return pb.a(this.Z, this);
    }
}

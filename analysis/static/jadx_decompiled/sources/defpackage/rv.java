package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rv extends hu3 {
    public List X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bx Z;
    public bx o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(bx bxVar, Continuation continuation) {
        super(continuation);
        this.Z = bxVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.m(null, this);
    }
}

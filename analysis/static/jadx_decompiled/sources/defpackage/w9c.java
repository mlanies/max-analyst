package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w9c extends hu3 {
    public List X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ x9c Z;
    public x9c o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9c(x9c x9cVar, Continuation continuation) {
        super(continuation);
        this.Z = x9cVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.c(null, this);
    }
}

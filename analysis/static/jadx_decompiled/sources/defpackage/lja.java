package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lja extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sja Y;
    public int Z;
    public Iterator o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lja(sja sjaVar, Continuation continuation) {
        super(continuation);
        this.Y = sjaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(null, null, this);
    }
}

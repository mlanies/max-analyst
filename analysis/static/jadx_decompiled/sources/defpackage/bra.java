package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bra extends hu3 {
    public long A0;
    public int X;
    public tqa Y;
    public final /* synthetic */ tqa Z;
    public /* synthetic */ Object o;
    public on5 s0;
    public ig1 t0;
    public List u0;
    public pqa v0;
    public Object w0;
    public Object x0;
    public Iterator y0;
    public us z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bra(tqa tqaVar, Continuation continuation) {
        super(continuation);
        this.Z = tqaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}

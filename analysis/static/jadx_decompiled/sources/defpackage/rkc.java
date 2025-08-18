package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rkc extends hu3 {
    public Collection X;
    public Object Y;
    public qa2 Z;
    public alc o;
    public Iterator s0;
    public int t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ alc v0;
    public int w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkc(alc alcVar, Continuation continuation) {
        super(continuation);
        this.v0 = alcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.u0 = obj;
        this.w0 |= Integer.MIN_VALUE;
        return alc.f(this.v0, null, null, this);
    }
}

package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rja extends hu3 {
    public Iterator X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ sja Z;
    public sja o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rja(sja sjaVar, Continuation continuation) {
        super(continuation);
        this.Z = sjaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.k(null, null, this);
    }
}

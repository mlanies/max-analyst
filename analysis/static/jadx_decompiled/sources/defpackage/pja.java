package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pja extends hu3 {
    public IOException X;
    public kja Y;
    public File Z;
    public sja o;
    public Iterator s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ sja u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pja(sja sjaVar, Continuation continuation) {
        super(continuation);
        this.u0 = sjaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return this.u0.h(null, null, null, null, this);
    }
}

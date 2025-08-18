package defpackage;

import javax.net.ssl.SSLEngine;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vve extends hu3 {
    public Object X;
    public Object Y;
    public SSLEngine Z;
    public Object o;
    public wve s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ wve u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vve(wve wveVar, Continuation continuation) {
        super(continuation);
        this.u0 = wveVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return this.u0.b(null, this);
    }
}

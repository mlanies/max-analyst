package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xv2 extends hu3 {
    public int X;
    public vv2 Y;
    public final /* synthetic */ vv2 Z;
    public /* synthetic */ Object o;
    public on5 s0;
    public List t0;
    public List u0;
    public Collection v0;
    public Iterator w0;
    public Collection x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv2(vv2 vv2Var, Continuation continuation) {
        super(continuation);
        this.Z = vv2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}

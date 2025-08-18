package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class au7 extends hu3 {
    public /* synthetic */ Object A0;
    public final /* synthetic */ cu7 B0;
    public int C0;
    public Iterator X;
    public e52 Y;
    public g92 Z;
    public cu7 o;
    public es8 s0;
    public es8 t0;
    public Iterator u0;
    public fs8 v0;
    public mec w0;
    public mec x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au7(cu7 cu7Var, Continuation continuation) {
        super(continuation);
        this.B0 = cu7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.A0 = obj;
        this.C0 |= Integer.MIN_VALUE;
        return this.B0.u(null, this);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vo7 extends hu3 {
    public List X;
    public LinkedHashMap Y;
    public Iterator Z;
    public yo7 o;
    public e52 s0;
    public boolean t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ yo7 v0;
    public int w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo7(yo7 yo7Var, Continuation continuation) {
        super(continuation);
        this.v0 = yo7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.u0 = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.v0.p(null, this);
    }
}

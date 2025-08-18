package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mja extends hu3 {
    public File X;
    public cfe Y;
    public File Z;
    public Object o;
    public Object s0;
    public kja t0;
    public boolean u0;
    public /* synthetic */ Object v0;
    public final /* synthetic */ sja w0;
    public int x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mja(sja sjaVar, Continuation continuation) {
        super(continuation);
        this.w0 = sjaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.v0 = obj;
        this.x0 |= Integer.MIN_VALUE;
        return this.w0.a(null, null, null, null, false, this);
    }
}

package defpackage;

import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cve extends hu3 {
    public ByteBuffer X;
    public tve Y;
    public /* synthetic */ Object Z;
    public tve o;
    public final /* synthetic */ tve s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cve(tve tveVar, Continuation continuation) {
        super(continuation);
        this.s0 = tveVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.a(null, this);
    }
}

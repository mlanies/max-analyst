package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ctd extends ijc implements a66 {
    public int X;
    public int Y;
    public /* synthetic */ Object Z;
    public Object c;
    public Iterator o;
    public final /* synthetic */ int s0;
    public final /* synthetic */ int t0;
    public final /* synthetic */ Iterator u0;
    public final /* synthetic */ boolean v0;
    public final /* synthetic */ boolean w0 = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctd(int i, int i2, Iterator it, boolean z, Continuation continuation) {
        super(2, continuation);
        this.s0 = i;
        this.t0 = i2;
        this.u0 = it;
        this.v0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ctd) n((f6d) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ctd ctdVar = new ctd(this.s0, this.t0, this.u0, this.v0, continuation);
        ctdVar.Z = obj;
        return ctdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0158  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctd.o(java.lang.Object):java.lang.Object");
    }
}

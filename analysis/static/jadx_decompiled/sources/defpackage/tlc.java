package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tlc extends ffe implements a66 {
    public final /* synthetic */ boolean A0;
    public vlc X;
    public Collection Y;
    public Iterator Z;
    public Collection s0;
    public int t0;
    public final /* synthetic */ mg4 u0;
    public final /* synthetic */ vlc v0;
    public final /* synthetic */ long w0;
    public final /* synthetic */ long x0;
    public final /* synthetic */ long y0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlc(mg4 mg4Var, vlc vlcVar, long j, long j2, long j3, int i, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u0 = mg4Var;
        this.v0 = vlcVar;
        this.w0 = j;
        this.x0 = j2;
        this.y0 = j3;
        this.z0 = i;
        this.A0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tlc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new tlc(this.u0, this.v0, this.w0, this.x0, this.y0, this.z0, this.A0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0156 -> B:38:0x0158). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlc.o(java.lang.Object):java.lang.Object");
    }
}

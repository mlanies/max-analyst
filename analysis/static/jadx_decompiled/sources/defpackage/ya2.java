package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ya2 extends ffe implements a66 {
    public boolean X;
    public zb2 Y;
    public String Z;
    public Collection s0;
    public Iterator t0;
    public Collection u0;
    public int v0;
    public final /* synthetic */ List w0;
    public final /* synthetic */ zb2 x0;
    public final /* synthetic */ boolean y0;
    public final /* synthetic */ String z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya2(List list, zb2 zb2Var, boolean z, String str, Continuation continuation) {
        super(2, continuation);
        this.w0 = list;
        this.x0 = zb2Var;
        this.y0 = z;
        this.z0 = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ya2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ya2(this.w0, this.x0, this.y0, this.z0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0098 -> B:23:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a2 -> B:25:0x00a6). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya2.o(java.lang.Object):java.lang.Object");
    }
}

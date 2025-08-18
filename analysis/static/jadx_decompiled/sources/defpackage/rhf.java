package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rhf extends ffe implements a66 {
    public vhf X;
    public Object Y;
    public List Z;
    public long s0;
    public int t0;
    public final /* synthetic */ vhf u0;
    public final /* synthetic */ List v0;
    public final /* synthetic */ List w0;
    public final /* synthetic */ long x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhf(vhf vhfVar, List list, ArrayList arrayList, long j, Continuation continuation) {
        super(2, continuation);
        this.u0 = vhfVar;
        this.v0 = list;
        this.w0 = arrayList;
        this.x0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rhf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rhf(this.u0, this.v0, (ArrayList) this.w0, this.x0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
    
        r1 = r9.g;
        r10 = defpackage.hm9.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
    
        if (r10 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010a, code lost:
    
        if (r10.c() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010c, code lost:
    
        r10.d(defpackage.us7.X, r1, "Fetching video messages was completed successful", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0113, code lost:
    
        r1 = r9.j;
        r18.X = r6;
        r18.Y = r3;
        r18.Z = null;
        r18.s0 = r7;
        r18.t0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0124, code lost:
    
        if (r1.a(r4, r18) != r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0126, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0171 A[EDGE_INSN: B:109:0x0171->B:87:0x0171 BREAK  A[LOOP:1: B:58:0x00ed->B:111:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9 A[Catch: CancellationException -> 0x0023, all -> 0x00e6, TryCatch #4 {all -> 0x00e6, blocks: (B:50:0x00d5, B:52:0x00db, B:57:0x00e9, B:58:0x00ed, B:60:0x00f3, B:62:0x00ff, B:68:0x0113, B:65:0x0106, B:67:0x010c), top: B:97:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3 A[Catch: CancellationException -> 0x0023, all -> 0x00e6, TryCatch #4 {all -> 0x00e6, blocks: (B:50:0x00d5, B:52:0x00db, B:57:0x00e9, B:58:0x00ed, B:60:0x00f3, B:62:0x00ff, B:68:0x0113, B:65:0x0106, B:67:0x010c), top: B:97:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d A[LOOP:0: B:84:0x0157->B:86:0x015d, LOOP_END] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhf.o(java.lang.Object):java.lang.Object");
    }
}

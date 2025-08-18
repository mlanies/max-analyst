package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class x63 extends ffe implements a66 {
    public e32 X;
    public byte[] Y;
    public int Z;
    public int s0;
    public int t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ mn5[] v0;
    public final /* synthetic */ k56 w0;
    public final /* synthetic */ c66 x0;
    public final /* synthetic */ on5 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x63(on5 on5Var, k56 k56Var, c66 c66Var, Continuation continuation, mn5[] mn5VarArr) {
        super(2, continuation);
        this.v0 = mn5VarArr;
        this.w0 = k56Var;
        this.x0 = c66Var;
        this.y0 = on5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x63) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        c66 c66Var = this.x0;
        x63 x63Var = new x63(this.y0, this.w0, c66Var, continuation, this.v0);
        x63Var.u0 = obj;
        return x63Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
    
        if (r9 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
    
        r12 = (java.lang.Object[]) r20.w0.invoke();
        r13 = r20.y0;
        r14 = r20.x0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        if (r12 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
    
        r20.u0 = r10;
        r20.X = r11;
        r20.Y = r2;
        r20.Z = r9;
        r20.s0 = r7;
        r20.t0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        if (r14.invoke(r13, r10, r20) != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0104, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
    
        defpackage.ys.X(0, 0, 14, r10, r12);
        r20.u0 = r10;
        r20.X = r11;
        r20.Y = r2;
        r20.Z = r9;
        r20.s0 = r7;
        r20.t0 = 3;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        if (r14.invoke(r13, r12, r20) != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (r9 != 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:40:0x00e2, B:34:0x00d0], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[LOOP:0: B:29:0x00be->B:52:?, LOOP_START, PHI: r9 r13
      0x00be: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:27:0x00bb, B:52:?] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r13v5 yz6) = (r13v4 yz6), (r13v12 yz6) binds: [B:27:0x00bb, B:52:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2, types: [zt0] */
    /* JADX WARN: Type inference failed for: r11v3, types: [e32, p8c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [e32, p8c] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [e32] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0102 -> B:19:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x011b -> B:49:0x011e). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x63.o(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;

/* loaded from: classes2.dex */
public final class wve {
    public final int a;
    public volatile boolean b;
    public final je7 d;
    public final je7 e;
    public tve g;
    public AsynchronousSocketChannel h;
    public final khe i;
    public final khe j;
    public final aj9 c = bj9.a();
    public final String f = wve.class.getName();

    public wve(khe kheVar, je7 je7Var, int i) {
        this.a = i;
        this.d = kheVar;
        this.e = je7Var;
        this.i = new khe(new zja(je7Var, 29, this));
        this.j = new khe(new ile(6, je7Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.uve
            if (r0 == 0) goto L13
            r0 = r5
            uve r0 = (defpackage.uve) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            uve r0 = new uve
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            wve r4 = r0.o
            defpackage.od2.a0(r5)     // Catch: java.lang.Throwable -> L29
            goto L45
        L29:
            r5 = move-exception
            goto L69
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.od2.a0(r5)
            tve r5 = r4.g     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L45
            r0.o = r4     // Catch: java.lang.Throwable -> L29
            r0.Z = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r5.e(r0)     // Catch: java.lang.Throwable -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            r5 = 0
            r4.b = r5     // Catch: java.lang.Throwable -> L29
            je7 r5 = r4.e
            java.lang.Object r5 = r5.getValue()
            ct0 r5 = (defpackage.ct0) r5
            java.nio.ByteBuffer r0 = r4.c()
            r5.b(r0)
            je7 r5 = r4.e
            java.lang.Object r5 = r5.getValue()
            ct0 r5 = (defpackage.ct0) r5
            java.nio.ByteBuffer r4 = r4.d()
            r5.b(r4)
            e5f r4 = defpackage.e5f.a
            return r4
        L69:
            je7 r0 = r4.e
            java.lang.Object r0 = r0.getValue()
            ct0 r0 = (defpackage.ct0) r0
            java.nio.ByteBuffer r1 = r4.c()
            r0.b(r1)
            je7 r0 = r4.e
            java.lang.Object r0 = r0.getValue()
            ct0 r0 = (defpackage.ct0) r0
            java.nio.ByteBuffer r4 = r4.d()
            r0.b(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wve.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4 A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:44:0x00ec, B:46:0x00f4, B:75:0x0172, B:76:0x017b), top: B:89:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130 A[Catch: all -> 0x013f, Exception -> 0x0142, TRY_LEAVE, TryCatch #7 {Exception -> 0x0142, blocks: (B:53:0x0124, B:55:0x0130, B:62:0x0144, B:63:0x014d), top: B:101:0x0124, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144 A[Catch: all -> 0x013f, Exception -> 0x0142, TRY_ENTER, TryCatch #7 {Exception -> 0x0142, blocks: (B:53:0x0124, B:55:0x0130, B:62:0x0144, B:63:0x014d), top: B:101:0x0124, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172 A[Catch: all -> 0x0170, TRY_ENTER, TryCatch #0 {all -> 0x0170, blocks: (B:44:0x00ec, B:46:0x00f4, B:75:0x0172, B:76:0x017b), top: B:89:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018a A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #4 {all -> 0x018d, blocks: (B:80:0x0186, B:82:0x018a), top: B:95:0x0186 }] */
    /* JADX WARN: Type inference failed for: r1v14, types: [tve] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aj9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.Continuation, vve] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, kotlin.coroutines.Continuation r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wve.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ByteBuffer c() {
        return (ByteBuffer) this.i.getValue();
    }

    public final ByteBuffer d() {
        return (ByteBuffer) this.j.getValue();
    }

    public final Object e(ByteBuffer byteBuffer, hu3 hu3Var) {
        tve tveVar = this.g;
        if (tveVar != null) {
            return tveVar.n(new sv0(byteBuffer), hu3Var);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}

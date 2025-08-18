package defpackage;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sja implements efe {
    public static final Pattern e = Pattern.compile("^bytes \\*/([0-9]+)");
    public static final Pattern f = Pattern.compile(".*filename=\".*\\.(\\w+)\".*");
    public final w0f a;
    public final je7 b;
    public final String c = sja.class.getName();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public sja(je7 je7Var, w0f w0fVar) {
        this.a = w0fVar;
        this.b = je7Var;
    }

    public static String e(yic yicVar) {
        String strA = yic.a(yicVar, "Content-Disposition");
        if (strA != null && strA.length() != 0) {
            Matcher matcher = f.matcher(strA);
            if (matcher.matches()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static File f(File file, String str) {
        if (file != null) {
            return new File(file.getParent(), rh4.j(file.getName(), "_part_", str));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0209  */
    @Override // defpackage.efe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r19, java.io.File r20, defpackage.cfe r21, java.lang.String r22, boolean r23, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.a(java.lang.String, java.io.File, cfe, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.efe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.io.File r8, java.lang.String r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.lja
            if (r0 == 0) goto L13
            r0 = r10
            lja r0 = (defpackage.lja) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            lja r0 = new lja
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r7 = r0.o
            defpackage.od2.a0(r10)
            goto L7f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.od2.a0(r10)
            java.util.concurrent.ConcurrentHashMap r10 = r7.d
            java.io.File r8 = f(r8, r9)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.Object r8 = r10.get(r8)
            kja r8 = (defpackage.kja) r8
            java.lang.String r7 = r7.c
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L4b
            goto L72
        L4b:
            boolean r2 = r10.c()
            if (r2 == 0) goto L72
            us7 r2 = defpackage.us7.X
            if (r8 == 0) goto L57
            r4 = r3
            goto L58
        L57:
            r4 = 0
        L58:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "File download. Cancel download, attachId:"
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r9 = ", task exist:"
            r5.append(r9)
            r5.append(r4)
            java.lang.String r9 = r5.toString()
            r4 = 0
            r10.d(r2, r7, r9, r4)
        L72:
            if (r8 == 0) goto L98
            b8c r7 = r8.a
            r7.d()
            java.util.concurrent.CopyOnWriteArrayList r7 = r8.b
            java.util.Iterator r7 = r7.iterator()
        L7f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L98
            java.lang.Object r8 = r7.next()
            cfe r8 = (defpackage.cfe) r8
            if (r8 == 0) goto L7f
            r0.o = r7
            r0.Z = r3
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L7f
            return r1
        L98:
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.b(java.io.File, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.efe
    public final Object c(File file, String str, Continuation continuation) {
        String absolutePath = f(file, str).getAbsolutePath();
        kja kjaVar = (kja) this.d.get(absolutePath);
        String str2 = this.c;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str2, "File download. Silent cancel download, attachId:" + str + ", task exist:" + (kjaVar != null), null);
        }
        if (kjaVar != null) {
            kjaVar.a.d();
            j(kjaVar, absolutePath);
        }
        return e5f.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de A[Catch: all -> 0x010c, TryCatch #4 {all -> 0x010c, blocks: (B:51:0x0104, B:47:0x00de, B:54:0x010f, B:45:0x00ce), top: B:80:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f A[Catch: all -> 0x010c, TRY_LEAVE, TryCatch #4 {all -> 0x010c, blocks: (B:51:0x0104, B:47:0x00de, B:54:0x010f, B:45:0x00ce), top: B:80:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0103 -> B:51:0x0104). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.io.File r20, java.io.File r21, java.lang.String r22, kotlin.coroutines.Continuation r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.d(java.io.File, java.io.File, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:149)|128|129|147|130|(1:132)(4:133|134|156|(1:124))) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0254, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x01f6 -> B:100:0x01cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0247 -> B:134:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x0258 -> B:124:0x0228). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.i8c r19, long r20, java.io.File r22, defpackage.yic r23, defpackage.kja r24, java.io.File r25, boolean r26, kotlin.coroutines.Continuation r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.g(i8c, long, java.io.File, yic, kja, java.io.File, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #2 {all -> 0x00d6, blocks: (B:28:0x0084, B:30:0x008a, B:49:0x00ce), top: B:67:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c0 -> B:47:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00ce -> B:28:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.io.IOException r9, defpackage.mhc r10, defpackage.kja r11, java.io.File r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.h(java.io.IOException, mhc, kja, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:181:0x0458 -> B:402:0x0326). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:0x0518 -> B:376:0x052a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:267:0x061f -> B:268:0x0625). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:351:0x0736 -> B:358:0x0748). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:357:0x0741 -> B:358:0x0748). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:359:0x074c -> B:358:0x0748). Please report as a decompilation issue!!! */
    public final java.lang.Object i(defpackage.yic r34, defpackage.kja r35, java.io.File r36, java.io.File r37, boolean r38, kotlin.coroutines.Continuation r39) {
        /*
            Method dump skipped, instructions count: 1914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.i(yic, kja, java.io.File, java.io.File, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void j(kja kjaVar, String str) {
        kjaVar.b.clear();
        this.d.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005f -> B:19:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.kja r6, java.io.File r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.rja
            if (r0 == 0) goto L13
            r0 = r8
            rja r0 = (defpackage.rja) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            rja r0 = new rja
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.Iterator r5 = r0.X
            sja r6 = r0.o
            defpackage.od2.a0(r8)     // Catch: java.lang.Throwable -> L2b
            goto L44
        L2b:
            r7 = move-exception
            goto L5f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.od2.a0(r8)
            r7.delete()
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.b
            java.util.Iterator r6 = r6.iterator()
            r4 = r6
            r6 = r5
            r5 = r4
        L44:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L67
            java.lang.Object r7 = r5.next()
            cfe r7 = (defpackage.cfe) r7
            if (r7 == 0) goto L44
            r0.o = r6     // Catch: java.lang.Throwable -> L2b
            r0.X = r5     // Catch: java.lang.Throwable -> L2b
            r0.s0 = r3     // Catch: java.lang.Throwable -> L2b
            e5f r7 = r7.b()     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L44
            return r1
        L5f:
            java.lang.String r8 = r6.c
            java.lang.String r2 = "File download. Failed to notify listener on url expired"
            defpackage.hm9.p(r8, r2, r7)
            goto L44
        L67:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sja.k(kja, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

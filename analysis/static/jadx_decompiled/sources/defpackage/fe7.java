package defpackage;

/* loaded from: classes2.dex */
public final class fe7 {
    public final o45 a;
    public final khe c;
    public final fd7 d;
    public final String b = fe7.class.getName();
    public final ThreadLocal e = ThreadLocal.withInitial(new tj(1));

    public fe7(kke kkeVar, o45 o45Var) {
        this.a = o45Var;
        this.c = new khe(new ly2(kkeVar, 1));
        this.d = new fd7(o45Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:9)(1:11)|10|12|(1:23)(2:14|(5:16|(2:18|(1:20))|30|25|29)(2:21|22))|24|30|25|29) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        defpackage.hm9.l0(r14.b, "could not warm layout", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout a(java.lang.CharSequence r15, android.text.TextPaint r16, int r17, int r18, boolean r19, android.text.TextUtils.TruncateAt r20) {
        /*
            r14 = this;
            r10 = r14
            r0 = r15
            r9 = r16
            int r1 = r15.length()
            r2 = 0
            if (r1 != 0) goto Lc
            goto L1c
        Lc:
            char r1 = r15.charAt(r2)
            r3 = 1424(0x590, float:1.995E-42)
            if (r3 > r1) goto L1c
            r3 = 1792(0x700, float:2.511E-42)
            if (r1 >= r3) goto L1c
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L1a:
            r11 = r1
            goto L1f
        L1c:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L1a
        L1f:
            int r1 = r15.length()
            float r1 = r9.measureText(r15, r2, r1)
            int r12 = defpackage.tu0.G(r1)
            java.lang.ThreadLocal r1 = r10.e
            java.lang.Object r2 = r1.get()
            android.text.BoringLayout$Metrics r2 = (android.text.BoringLayout.Metrics) r2
            android.text.BoringLayout$Metrics r2 = android.text.BoringLayout.isBoring(r15, r9, r2)
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L74
            android.text.BoringLayout$Metrics r2 = (android.text.BoringLayout.Metrics) r2
            int r2 = r2.width
            r13 = r17
            if (r2 > r13) goto L82
            java.lang.Object r1 = r1.get()
            r7 = r1
            android.text.BoringLayout$Metrics r7 = (android.text.BoringLayout.Metrics) r7
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r8 = 0
            r1 = r15
            r2 = r16
            r3 = r12
            r4 = r11
            android.text.BoringLayout r1 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8)
            int r2 = r1.getHeight()
            if (r2 != 0) goto L94
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r12
            r5 = r17
            r6 = r11
            r7 = r19
            r8 = r20
            r9 = r18
            android.text.StaticLayout r1 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L94
        L74:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L80:
            r13 = r17
        L82:
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r12
            r5 = r17
            r6 = r11
            r7 = r19
            r8 = r20
            r9 = r18
            android.text.StaticLayout r1 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
        L94:
            khe r0 = r10.c     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lac
            be6 r0 = (defpackage.be6) r0     // Catch: java.lang.Throwable -> Lac
            r0.getClass()     // Catch: java.lang.Throwable -> Lac
            ae6 r2 = new ae6     // Catch: java.lang.Throwable -> Lac
            r3 = 0
            r2.<init>(r1, r0, r3)     // Catch: java.lang.Throwable -> Lac
            sx3 r0 = r0.a     // Catch: java.lang.Throwable -> Lac
            r4 = 3
            defpackage.j47.T(r0, r3, r3, r2, r4)     // Catch: java.lang.Throwable -> Lac
            goto Lb4
        Lac:
            r0 = move-exception
            java.lang.String r2 = r10.b
            java.lang.String r3 = "could not warm layout"
            defpackage.hm9.l0(r2, r3, r0)
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe7.a(java.lang.CharSequence, android.text.TextPaint, int, int, boolean, android.text.TextUtils$TruncateAt):android.text.Layout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151 A[PHI: r2
      0x0151: PHI (r2v7 android.text.StaticLayout) = 
      (r2v6 android.text.StaticLayout)
      (r2v13 android.text.StaticLayout)
      (r2v6 android.text.StaticLayout)
      (r2v6 android.text.StaticLayout)
     binds: [B:33:0x00bb, B:41:0x00fa, B:61:0x0158, B:62:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [njc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.StaticLayout c(java.lang.CharSequence r18, android.text.TextPaint r19, int r20, int r21, android.text.Layout.Alignment r22, boolean r23, android.text.TextUtils.TruncateAt r24, int r25) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe7.c(java.lang.CharSequence, android.text.TextPaint, int, int, android.text.Layout$Alignment, boolean, android.text.TextUtils$TruncateAt, int):android.text.StaticLayout");
    }
}

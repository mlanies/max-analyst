package defpackage;

/* loaded from: classes.dex */
public final class q9e extends l0f {
    @Override // defpackage.l0f
    public final byte N() {
        int iT = T();
        String str = (String) this.c;
        if (iT >= str.length() || iT == -1) {
            return (byte) 10;
        }
        this.b = iT;
        return s5c.k(str.charAt(iT));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        r9.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        return r0;
     */
    @Override // defpackage.l0f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int T() {
        /*
            r9 = this;
            int r0 = r9.b
            r1 = -1
            if (r0 != r1) goto L6
            return r0
        L6:
            java.lang.Object r2 = r9.c
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.length()
            if (r0 >= r3) goto L69
            char r3 = r2.charAt(r0)
            r4 = 32
            if (r3 == r4) goto L66
            r4 = 10
            if (r3 == r4) goto L66
            r5 = 13
            if (r3 == r5) goto L66
            r5 = 9
            if (r3 != r5) goto L25
            goto L66
        L25:
            r5 = 47
            if (r3 != r5) goto L69
            int r3 = r0 + 1
            int r6 = r2.length()
            if (r3 >= r6) goto L69
            char r3 = r2.charAt(r3)
            r6 = 42
            r7 = 4
            r8 = 0
            if (r3 == r6) goto L4b
            if (r3 == r5) goto L3e
            goto L69
        L3e:
            int r0 = r0 + 2
            int r0 = defpackage.w9e.z0(r2, r4, r0, r8, r7)
            if (r0 != r1) goto L66
            int r0 = r2.length()
            goto L6
        L4b:
            int r0 = r0 + 2
        */
        //  java.lang.String r3 = "*/"
        /*
            int r0 = defpackage.w9e.A0(r2, r3, r0, r8, r7)
            if (r0 == r1) goto L58
            int r0 = r0 + 2
            goto L6
        L58:
            int r0 = r2.length()
            r9.b = r0
            r0 = 6
        */
        //  java.lang.String r1 = "Expected end of the block comment: \"*/\", but had EOF instead"
        /*
            r2 = 0
            defpackage.l0f.u(r9, r1, r8, r2, r0)
            throw r2
        L66:
            int r0 = r0 + 1
            goto L6
        L69:
            r9.b = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q9e.T():int");
    }

    @Override // defpackage.l0f
    public final boolean i() {
        char cCharAt;
        int iT = T();
        String str = (String) this.c;
        return (iT >= str.length() || iT == -1 || (cCharAt = str.charAt(iT)) == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
    }

    @Override // defpackage.l0f
    public final byte l() {
        int iT = T();
        String str = (String) this.c;
        if (iT >= str.length() || iT == -1) {
            return (byte) 10;
        }
        this.b = iT + 1;
        return s5c.k(str.charAt(iT));
    }

    @Override // defpackage.l0f
    public final void m(char c) {
        int iT = T();
        String str = (String) this.c;
        if (iT >= str.length() || iT == -1) {
            this.b = -1;
            W(c);
            throw null;
        }
        char cCharAt = str.charAt(iT);
        this.b = iT + 1;
        if (cCharAt == c) {
            return;
        }
        W(c);
        throw null;
    }
}

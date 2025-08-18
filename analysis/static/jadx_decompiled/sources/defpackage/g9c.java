package defpackage;

/* loaded from: classes2.dex */
public final class g9c {
    public final long a;
    public final f9c b;
    public final String c;

    public g9c(long j, f9c f9cVar, String str) {
        this.a = j;
        this.b = f9cVar;
        this.c = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:38|(2:40|(4:42|(3:135|48|49)|37|146)(4:62|(0)(7:65|131|66|(2:67|(2:69|(2:151|71)(1:152))(2:150|72))|73|(1:75)|76)|37|146))(2:88|(4:103|133|104|147))|129|90|37|146) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0180, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0181, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0153, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0154, code lost:
    
        defpackage.hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", r0);
        r0 = defpackage.u7d.a.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0164, code lost:
    
        ((defpackage.r4a) r0.next()).getClass();
        defpackage.r4a.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0171, code lost:
    
        r0 = defpackage.au1.s(defpackage.k7d.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0177, code lost:
    
        if (r0 != 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0179, code lost:
    
        if (r0 != 1) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.g9c a(defpackage.gy8 r16) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g9c.a(gy8):g9c");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9c)) {
            return false;
        }
        g9c g9cVar = (g9c) obj;
        return this.a == g9cVar.a && this.b == g9cVar.b && tpa.f(this.c, g9cVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentEmojiItem(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", value=");
        return zr6.l(sb, this.c, ")");
    }
}

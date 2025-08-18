package defpackage;

/* loaded from: classes2.dex */
public final class spa {
    public static final spa f;
    public final b2b a;
    public final int b;
    public final zud c;
    public final Long d;
    public final us e;

    static {
        b2b b2bVar = null;
        f = new spa(b2bVar, 0, null, null, null, 31);
    }

    public spa(b2b b2bVar, int i, zud zudVar, Long l, us usVar) {
        this.a = b2bVar;
        this.b = i;
        this.c = zudVar;
        this.d = l;
        this.e = usVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.spa
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            spa r5 = (defpackage.spa) r5
            b2b r1 = r5.a
            b2b r3 = r4.a
            if (r3 == r1) goto L13
            return r2
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            zud r1 = r4.c
            zud r3 = r5.c
            if (r1 == r3) goto L21
            return r2
        L21:
            java.lang.Long r1 = r4.d
            java.lang.Long r3 = r5.d
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L2c
            return r2
        L2c:
            us r4 = r4.e
            us r5 = r5.e
            if (r4 != 0) goto L38
            if (r5 != 0) goto L36
            r4 = r0
            goto L3f
        L36:
            r4 = r2
            goto L3f
        L38:
            if (r5 != 0) goto L3b
            goto L36
        L3b:
            boolean r4 = r4.equals(r5)
        L3f:
            if (r4 != 0) goto L42
            return r2
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spa.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        b2b b2bVar = this.a;
        int iHashCode = (b2bVar == null ? 0 : b2bVar.hashCode()) * 31;
        int i = this.b;
        int iS = (iHashCode + (i == 0 ? 0 : au1.s(i))) * 31;
        zud zudVar = this.c;
        int iHashCode2 = (iS + (zudVar == null ? 0 : zudVar.hashCode())) * 31;
        Long l = this.d;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        us usVar = this.e;
        return iHashCode3 + (usVar != null ? usVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        us usVar = this.e;
        if (usVar == null) {
            str = "null";
        } else {
            str = "ReasonMeta(meta=" + usVar + ")";
        }
        StringBuilder sb = new StringBuilder("Params(pipType=");
        sb.append(this.a);
        sb.append(", navReason=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PIP_CLOSE" : "FOLDER_CHANGE" : "LINK" : "PUSH_NOTIFICATION");
        sb.append(", sourceType=");
        sb.append(this.c);
        sb.append(", sourceId=");
        sb.append(this.d);
        sb.append(", reasonMeta=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ spa(b2b b2bVar, int i, zud zudVar, Long l, us usVar, int i2) {
        this((i2 & 1) != 0 ? null : b2bVar, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : zudVar, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : usVar);
    }
}

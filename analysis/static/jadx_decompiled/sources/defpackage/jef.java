package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class jef implements Serializable {
    public final List X;
    public final byte Y;
    public final String a;
    public final long b;
    public final String c;
    public final int o;

    public jef(String str, long j, String str2, int i, List list, byte b) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.o = i;
        this.X = list;
        this.Y = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.jef a(defpackage.gy8 r22) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jef.a(gy8):jef");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{conversationId='");
        sb.append(this.a);
        sb.append("', startedAt=");
        sb.append(this.b);
        sb.append(", joinLink=");
        sb.append(this.c);
        sb.append(", approxParticipantCount=");
        sb.append(this.o);
        sb.append(", previewParticipantIds=");
        sb.append(this.X);
        sb.append(", type=");
        return zr6.j(sb, this.Y, "}");
    }
}

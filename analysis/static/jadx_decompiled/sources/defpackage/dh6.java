package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class dh6 implements Serializable {
    public final String X;
    public final String Y;
    public final boolean Z;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final boolean s0;
    public final int t0;
    public final eh6 u0;

    public dh6(long j, boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, int i, eh6 eh6Var) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.o = z3;
        this.X = str;
        this.Y = str2;
        this.Z = z4;
        this.s0 = z5;
        this.t0 = i;
        this.u0 = eh6Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dh6 a(defpackage.gy8 r24) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh6.a(gy8):dh6");
    }

    public final String toString() {
        String str;
        int i = this.t0;
        if (i == 1) {
            str = "DISABLED";
        } else if (i == 2) {
            str = "MEMBERS";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "ALL";
        }
        String string = this.u0.toString();
        StringBuilder sb = new StringBuilder("{groupId=");
        sb.append(this.a);
        sb.append(", isAnswered=");
        sb.append(this.b);
        sb.append(", isModerator=");
        sb.append(this.c);
        sb.append(", isImportant=");
        sb.append(this.o);
        sb.append(", name=");
        sb.append(this.X);
        sb.append(", baseIconUrl=");
        sb.append(this.Y);
        sb.append(", isCustomTitle=");
        sb.append(this.Z);
        sb.append(", isMember=");
        sb.append(this.s0);
        sb.append(", messagingPermissions=");
        sb.append(str);
        sb.append(", groupOptions=");
        return zr6.l(sb, string, "}");
    }
}

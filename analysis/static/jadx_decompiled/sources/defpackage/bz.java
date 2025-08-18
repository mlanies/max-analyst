package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class bz implements Serializable {
    public final b10 a;
    public final boolean b;
    public final boolean c;

    public bz(b10 b10Var, boolean z, boolean z2) {
        this.a = b10Var;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:1044:0x1402  */
    /* JADX WARN: Removed duplicated region for block: B:1047:0x140d  */
    /* JADX WARN: Removed duplicated region for block: B:1178:0x0e4d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x09c5 A[PHI: r145
      0x09c5: PHI (r145v107 int) = 
      (r145v99 int)
      (r145v100 int)
      (r145v101 int)
      (r145v102 int)
      (r145v103 int)
      (r145v104 int)
      (r145v105 int)
      (r145v108 int)
     binds: [B:666:0x0a18, B:662:0x0a0b, B:658:0x09fe, B:654:0x09f1, B:650:0x09e6, B:646:0x09db, B:642:0x09d0, B:639:0x09c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0b7d A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0bbf A[PHI: r137
      0x0bbf: PHI (r137v24 int) = 
      (r137v13 int)
      (r137v14 int)
      (r137v15 int)
      (r137v16 int)
      (r137v17 int)
      (r137v18 int)
      (r137v19 int)
      (r137v20 int)
      (r137v21 int)
      (r137v22 int)
      (r137v25 int)
     binds: [B:764:0x0c46, B:760:0x0c39, B:756:0x0c2c, B:752:0x0c1f, B:748:0x0c12, B:744:0x0c05, B:740:0x0bf8, B:736:0x0be9, B:732:0x0bdb, B:728:0x0bcb, B:725:0x0bbd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:802:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:877:0x0e46 A[LOOP:15: B:859:0x0e1b->B:877:0x0e46, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:929:0x104a  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x1054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bz b(defpackage.gy8 r159) {
        /*
            Method dump skipped, instructions count: 7358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz.b(gy8):bz");
    }

    public HashMap a() {
        HashMap map = new HashMap();
        map.put("_type", this.a.a);
        return map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attach{type=");
        sb.append(this.a);
        sb.append(", deleted=");
        sb.append(this.b);
        sb.append(", sensitive=");
        return au1.j(sb, this.c, "}");
    }
}

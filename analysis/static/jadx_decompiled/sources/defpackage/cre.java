package defpackage;

import android.text.Spannable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class cre {
    public static final Pattern a = Pattern.compile("#(?i)([\\p{L}0-9_]+)");

    public static void a(Spannable spannable, lk7 lk7Var, boolean z, int i) {
        ui0 ui0Var = new ui0(spannable, lk7Var, i, 13);
        if (lk7Var == lk7.o) {
            c(spannable.toString(), b(lk7Var, z), ura.b, false, ui0Var);
            return;
        }
        String string = spannable.toString();
        Pattern patternB = b(lk7Var, z);
        Pattern pattern = ura.a;
        c(string, patternB, null, false, ui0Var);
    }

    public static Pattern b(lk7 lk7Var, boolean z) {
        int iOrdinal = lk7Var.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? bre.a : bre.a : z ? bre.e : bre.c : a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.CharSequence r6, java.util.regex.Pattern r7, java.util.regex.Pattern r8, boolean r9, defpackage.qj3 r10) {
        /*
            java.util.regex.Pattern r0 = defpackage.ura.a
            java.util.regex.Matcher r1 = r7.matcher(r6)
        L6:
            boolean r2 = r1.find()
            if (r2 == 0) goto Ldd
            java.util.regex.Matcher r2 = r0.matcher(r6)
        L10:
            boolean r3 = r2.find()
            if (r3 == 0) goto L53
            int r3 = r1.start()
            int r4 = r2.start()
            if (r3 < r4) goto L2a
            int r3 = r1.end()
            int r4 = r2.end()
            if (r3 <= r4) goto L6
        L2a:
            int r3 = r1.end()
            int r4 = r2.end()
            if (r3 > r4) goto L3e
            int r3 = r1.end()
            int r4 = r2.start()
            if (r3 >= r4) goto L6
        L3e:
            int r3 = r1.start()
            int r4 = r2.end()
            if (r3 > r4) goto L10
            int r3 = r1.end()
            int r4 = r2.end()
            if (r3 < r4) goto L10
            goto L6
        L53:
            if (r9 != 0) goto L8a
            java.util.regex.Pattern r2 = defpackage.bre.a
            if (r7 == r2) goto L5a
            goto L8a
        L5a:
            java.util.regex.Pattern r2 = defpackage.bre.e
            java.util.regex.Matcher r2 = r2.matcher(r6)
        L60:
            boolean r3 = r2.find()
            if (r3 == 0) goto L8a
            int r3 = r1.start()
            int r4 = r2.start()
            if (r3 < r4) goto L8a
            int r3 = r1.end()
            int r4 = r2.end()
            if (r3 > r4) goto L8a
            java.lang.String r3 = r2.group()
            java.lang.String r4 = r1.group()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L60
            goto L6
        L8a:
            if (r8 != 0) goto L8d
            goto Lbb
        L8d:
            java.util.regex.Matcher r2 = r8.matcher(r6)
        L91:
            boolean r3 = r2.find()
            if (r3 == 0) goto Lbb
            int r3 = r1.start()
            int r4 = r2.start()
            if (r3 < r4) goto Lbb
            int r3 = r1.end()
            int r4 = r2.end()
            if (r3 > r4) goto Lbb
            java.lang.String r3 = r2.group()
            java.lang.String r4 = r1.group()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L91
            goto L6
        Lbb:
            yqe r2 = new yqe     // Catch: java.lang.Throwable -> Ld1
            int r3 = r1.start()     // Catch: java.lang.Throwable -> Ld1
            int r4 = r1.end()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = r1.group()     // Catch: java.lang.Throwable -> Ld1
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> Ld1
            r10.accept(r2)     // Catch: java.lang.Throwable -> Ld1
            goto L6
        Ld1:
            r2 = move-exception
            java.lang.String r3 = "cre"
            java.lang.String r4 = r2.getMessage()
            defpackage.hm9.p(r3, r4, r2)
            goto L6
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cre.c(java.lang.CharSequence, java.util.regex.Pattern, java.util.regex.Pattern, boolean, qj3):void");
    }
}

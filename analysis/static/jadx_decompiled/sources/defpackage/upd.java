package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class upd extends dx0 {
    public static final Pattern Z = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern s0 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern t0 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[PHI: r2
      0x009d: PHI (r2v16 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0093, B:22:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.upd b(java.io.File r16, long r17, defpackage.x99 r19) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upd.b(java.io.File, long, x99):upd");
    }

    public static File c(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder(60);
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        sb.append(j2);
        sb.append(".v3.exo");
        return new File(file, sb.toString());
    }
}

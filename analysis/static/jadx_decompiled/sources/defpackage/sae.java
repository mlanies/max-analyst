package defpackage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class sae extends fqd {
    public final StringBuilder x0 = new StringBuilder();
    public final ArrayList y0 = new ArrayList();
    public static final Pattern z0 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern A0 = Pattern.compile("\\{\\\\.*?\\}");

    public static long g(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0279, code lost:
    
        return new defpackage.wva((defpackage.xz3[]) r1.toArray(new defpackage.xz3[r4]), 9, java.util.Arrays.copyOf(r2, r5));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0173  */
    @Override // defpackage.fqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.abe a(int r30, byte[] r31, boolean r32) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sae.a(int, byte[], boolean):abe");
    }
}

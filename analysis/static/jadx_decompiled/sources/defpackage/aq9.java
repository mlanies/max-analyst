package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class aq9 {
    static {
        Arrays.sort("AOUIEАОУЫИЭЕЮЯЁ".toCharArray());
    }

    public static boolean a(StringBuilder sb, int i, char c) {
        int i2 = i + 1;
        return i2 < sb.length() && sb.charAt(i2) == c;
    }
}

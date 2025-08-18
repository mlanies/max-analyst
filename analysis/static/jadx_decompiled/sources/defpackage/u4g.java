package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class u4g {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(yaf yafVar) {
        String strI = yafVar.i();
        return strI != null && strI.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = maf.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }

    public static void d(yaf yafVar) throws ParserException {
        int i = yafVar.b;
        if (a(yafVar)) {
            return;
        }
        yafVar.H(i);
        String strValueOf = String.valueOf(yafVar.i());
        throw ParserException.a(null, strValueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(strValueOf) : new String("Expected WEBVTT. Got "));
    }
}

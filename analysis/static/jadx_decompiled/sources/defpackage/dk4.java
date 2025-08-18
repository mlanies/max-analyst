package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class dk4 {
    public static final HashMap a;
    public static final Pattern b;

    static {
        HashMap map = new HashMap();
        ms2.i(0, map, "px", 1, "dip");
        ms2.i(1, map, "dp", 2, "sp");
        ms2.i(3, map, "pt", 4, "in");
        map.put("mm", 5);
        a = map;
        b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");
    }

    public static float a(Context context, String str) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            throw new NumberFormatException();
        }
        float fFloatValue = Float.valueOf(matcher.group(1)).floatValue();
        Integer num = (Integer) a.get(matcher.group(3).toLowerCase(Locale.ROOT));
        if (num != null) {
            return TypedValue.applyDimension(num.intValue(), fFloatValue, displayMetrics);
        }
        throw new NumberFormatException();
    }
}

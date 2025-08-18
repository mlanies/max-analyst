package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class tf9 implements yua {
    public static final Pattern b = Pattern.compile("^[\\p{L}\\p{N}]+$");
    public final String a;

    public tf9(String str) {
        this.a = str.concat("_");
    }

    public final String a(Object obj) {
        String string = obj.toString();
        if (!b.matcher(string).matches()) {
            throw new IllegalArgumentException(wg0.i("Invalid key: ", string));
        }
        return this.a + obj;
    }
}

package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class qec implements Serializable {
    public final Pattern a;

    public qec(Pattern pattern) {
        this.a = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        return this.a.matcher(charSequence).matches();
    }

    public final String b(String str, CharSequence charSequence) {
        return this.a.matcher(charSequence).replaceAll(str);
    }

    public final String toString() {
        return this.a.toString();
    }

    public qec(String str) {
        this(Pattern.compile(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qec(String str, int i) {
        int i2;
        switch (2) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 8;
                break;
            case 3:
                i2 = 16;
                break;
            case 4:
                i2 = 1;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 32;
                break;
            case 7:
                i2 = 128;
                break;
            default:
                throw null;
        }
        this(Pattern.compile(str, (i2 & 2) != 0 ? i2 | 64 : i2));
    }
}

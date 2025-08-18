package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class oh3 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final Bundle e;

    static {
        int i2 = oaf.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
    }

    public oh3(String str, int i2, Bundle bundle) {
        this(1004001300, 6, str, i2, new Bundle(bundle));
    }

    public static oh3 a(Bundle bundle) {
        int i2 = bundle.getInt(f, 0);
        int i3 = bundle.getInt(j, 0);
        String string = bundle.getString(g);
        string.getClass();
        String str = h;
        fm9.f(bundle.containsKey(str));
        int i4 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new oh3(i2, i3, string, i4, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.c);
        bundle.putInt(h, this.d);
        bundle.putBundle(i, this.e);
        bundle.putInt(j, this.b);
        return bundle;
    }

    public oh3(int i2, int i3, String str, int i4, Bundle bundle) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = i4;
        this.e = bundle;
    }
}

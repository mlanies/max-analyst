package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y9d {
    public static final ffc d = zw6.n(40010);
    public static final ffc e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        c54.n(7, objArr);
        e = zw6.h(7, objArr);
        int i = oaf.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public y9d(int i) {
        fm9.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i != 0);
        this.a = i;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public static y9d a(Bundle bundle) {
        int i = bundle.getInt(f, 0);
        if (i != 0) {
            return new y9d(i);
        }
        String string = bundle.getString(g);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new y9d(string, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.b);
        bundle.putBundle(h, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y9d)) {
            return false;
        }
        y9d y9dVar = (y9d) obj;
        return this.a == y9dVar.a && TextUtils.equals(this.b, y9dVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.a)});
    }

    public y9d(String str, Bundle bundle) {
        this.a = 0;
        str.getClass();
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}

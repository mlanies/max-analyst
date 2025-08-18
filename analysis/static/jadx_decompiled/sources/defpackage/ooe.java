package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ooe implements nk {
    public static final ooe b = new ooe(null);
    public final String a;

    public /* synthetic */ ooe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ooe) {
            return s36.l(this.a, ((ooe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yi8 {
    public final String a;
    public final int b;
    public final int c;

    public yi8(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi8)) {
            return false;
        }
        yi8 yi8Var = (yi8) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || yi8Var.b < 0) ? TextUtils.equals(str, yi8Var.a) && i == yi8Var.c : TextUtils.equals(str, yi8Var.a) && i2 == yi8Var.b && i == yi8Var.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}

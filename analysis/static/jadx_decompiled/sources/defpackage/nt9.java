package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class nt9 {
    public final Bundle a;
    public IconCompat b;
    public final vfc[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final CharSequence i;
    public final PendingIntent j;
    public final boolean k;

    public nt9(int i, String str, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.d(null, "", i) : null, str, pendingIntent);
    }

    public final IconCompat a() {
        int i;
        if (this.b == null && (i = this.h) != 0) {
            this.b = IconCompat.d(null, "", i);
        }
        return this.b;
    }

    public nt9(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
    }

    public nt9(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, vfc[] vfcVarArr, vfc[] vfcVarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i2 = iconCompat.a;
            if ((i2 == -1 ? es6.c(iconCompat.b) : i2) == 2) {
                this.h = iconCompat.e();
            }
        }
        this.i = bu9.c(charSequence);
        this.j = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = vfcVarArr;
        this.d = z;
        this.f = i;
        this.e = z2;
        this.g = z3;
        this.k = z4;
    }
}

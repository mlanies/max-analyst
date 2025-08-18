package defpackage;

import android.media.AudioAttributes;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class g30 implements su0 {
    public static final g30 Z = new g30(0, 0, 1, 1, 0);
    public final int X;
    public AudioAttributes Y;
    public final int a;
    public final int b;
    public final int c;
    public final int o;

    public g30(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = i4;
        this.X = i5;
    }

    public final AudioAttributes a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.Y == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i = maf.a;
            if (i >= 29) {
                c30.a(usage, this.o);
            }
            if (i >= 32) {
                e30.a(usage, this.X);
            }
            this.Y = usage.build();
        }
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g30.class != obj.getClass()) {
            return false;
        }
        g30 g30Var = (g30) obj;
        return this.a == g30Var.a && this.b == g30Var.b && this.c == g30Var.c && this.o == g30Var.o && this.X == g30Var.X;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.o) * 31) + this.X;
    }
}

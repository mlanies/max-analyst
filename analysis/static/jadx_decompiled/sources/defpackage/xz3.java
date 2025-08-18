package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class xz3 implements su0 {
    public static final xz3 C0 = new xz3("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    public static final yv3 D0 = new yv3(7);
    public final int A0;
    public final float B0;
    public final float X;
    public final int Y;
    public final int Z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap o;
    public final float s0;
    public final int t0;
    public final float u0;
    public final float v0;
    public final boolean w0;
    public final int x0;
    public final int y0;
    public final float z0;

    public xz3(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            np8.d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.o = bitmap;
        this.X = f;
        this.Y = i;
        this.Z = i2;
        this.s0 = f2;
        this.t0 = i3;
        this.u0 = f4;
        this.v0 = f5;
        this.w0 = z;
        this.x0 = i5;
        this.y0 = i4;
        this.z0 = f3;
        this.A0 = i6;
        this.B0 = f6;
    }

    public final vz3 a() {
        vz3 vz3Var = new vz3();
        vz3Var.a = this.a;
        vz3Var.b = this.o;
        vz3Var.c = this.b;
        vz3Var.d = this.c;
        vz3Var.e = this.X;
        vz3Var.f = this.Y;
        vz3Var.g = this.Z;
        vz3Var.h = this.s0;
        vz3Var.i = this.t0;
        vz3Var.j = this.y0;
        vz3Var.k = this.z0;
        vz3Var.l = this.u0;
        vz3Var.m = this.v0;
        vz3Var.n = this.w0;
        vz3Var.o = this.x0;
        vz3Var.p = this.A0;
        vz3Var.q = this.B0;
        return vz3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xz3.class != obj.getClass()) {
            return false;
        }
        xz3 xz3Var = (xz3) obj;
        if (TextUtils.equals(this.a, xz3Var.a) && this.b == xz3Var.b && this.c == xz3Var.c) {
            Bitmap bitmap = xz3Var.o;
            Bitmap bitmap2 = this.o;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.X == xz3Var.X && this.Y == xz3Var.Y && this.Z == xz3Var.Z && this.s0 == xz3Var.s0 && this.t0 == xz3Var.t0 && this.u0 == xz3Var.u0 && this.v0 == xz3Var.v0 && this.w0 == xz3Var.w0 && this.x0 == xz3Var.x0 && this.y0 == xz3Var.y0 && this.z0 == xz3Var.z0 && this.A0 == xz3Var.A0 && this.B0 == xz3Var.B0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.o, Float.valueOf(this.X), Integer.valueOf(this.Y), Integer.valueOf(this.Z), Float.valueOf(this.s0), Integer.valueOf(this.t0), Float.valueOf(this.u0), Float.valueOf(this.v0), Boolean.valueOf(this.w0), Integer.valueOf(this.x0), Integer.valueOf(this.y0), Float.valueOf(this.z0), Integer.valueOf(this.A0), Float.valueOf(this.B0)});
    }
}

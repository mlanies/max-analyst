package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes.dex */
public final class cb0 {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public cb0(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z, boolean z2) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.a = uuid;
        this.b = i;
        this.c = i2;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.e = size;
        this.f = i3;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cb0)) {
            return false;
        }
        cb0 cb0Var = (cb0) obj;
        return this.a.equals(cb0Var.a) && this.b == cb0Var.b && this.c == cb0Var.c && this.d.equals(cb0Var.d) && this.e.equals(cb0Var.e) && this.f == cb0Var.f && this.g == cb0Var.g && this.h == cb0Var.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.a);
        sb.append(", getTargets=");
        sb.append(this.b);
        sb.append(", getFormat=");
        sb.append(this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        sb.append(this.g);
        sb.append(", shouldRespectInputCropRect=");
        return au1.j(sb, this.h, "}");
    }
}

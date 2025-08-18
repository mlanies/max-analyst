package defpackage;

import android.media.MediaFormat;
import android.util.Size;

/* loaded from: classes.dex */
public final class ic0 implements q05 {
    public final String a;
    public final int b;
    public final bue c;
    public final Size d;
    public final int e;
    public final jc0 f;
    public final int g;
    public final int h;
    public final int i;

    public ic0(String str, int i, bue bueVar, Size size, int i2, jc0 jc0Var, int i3, int i4, int i5) {
        this.a = str;
        this.b = i;
        this.c = bueVar;
        this.d = size;
        this.e = i2;
        this.f = jc0Var;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public static qp4 d() {
        qp4 qp4Var = new qp4();
        qp4Var.b = -1;
        qp4Var.s0 = 1;
        qp4Var.X = 2130708361;
        qp4Var.Y = jc0.d;
        return qp4Var;
    }

    @Override // defpackage.q05
    public final String a() {
        return this.a;
    }

    @Override // defpackage.q05
    public final MediaFormat b() {
        Size size = this.d;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.a, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.e);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.i);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.g);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.h);
        int i = this.b;
        if (i != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", i);
        }
        jc0 jc0Var = this.f;
        int i2 = jc0Var.a;
        if (i2 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", i2);
        }
        int i3 = jc0Var.b;
        if (i3 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", i3);
        }
        int i4 = jc0Var.c;
        if (i4 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", i4);
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override // defpackage.q05
    public final bue c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ic0)) {
            return false;
        }
        ic0 ic0Var = (ic0) obj;
        return this.a.equals(ic0Var.a) && this.b == ic0Var.b && this.c.equals(ic0Var.c) && this.d.equals(ic0Var.d) && this.e == ic0Var.e && this.f.equals(ic0Var.f) && this.g == ic0Var.g && this.h == ic0Var.h && this.i == ic0Var.i;
    }

    public final int hashCode() {
        return this.i ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", frameRate=");
        sb.append(this.g);
        sb.append(", IFrameInterval=");
        sb.append(this.h);
        sb.append(", bitrate=");
        return zr6.j(sb, this.i, "}");
    }
}

package defpackage;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class m90 implements q05 {
    public final String a;
    public final int b;
    public final bue c;
    public final int d;
    public final int e;
    public final int f;

    public m90(String str, int i, bue bueVar, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = bueVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // defpackage.q05
    public final String a() {
        return this.a;
    }

    @Override // defpackage.q05
    public final MediaFormat b() {
        String str = this.a;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, this.e, this.f);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.d);
        int i = this.b;
        if (i != -1) {
            if (str.equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", i);
            } else {
                mediaFormatCreateAudioFormat.setInteger("profile", i);
            }
        }
        return mediaFormatCreateAudioFormat;
    }

    @Override // defpackage.q05
    public final bue c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m90)) {
            return false;
        }
        m90 m90Var = (m90) obj;
        return this.a.equals(m90Var.a) && this.b == m90Var.b && this.c.equals(m90Var.c) && this.d == m90Var.d && this.e == m90Var.e && this.f == m90Var.f;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", sampleRate=");
        sb.append(this.e);
        sb.append(", channelCount=");
        return zr6.j(sb, this.f, "}");
    }
}

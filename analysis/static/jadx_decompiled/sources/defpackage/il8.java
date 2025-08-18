package defpackage;

import android.net.Uri;
import android.text.format.DateFormat;
import one.me.sdk.media.transformer.MediaTransformException;

/* loaded from: classes2.dex */
public final class il8 extends kl8 {
    public final MediaTransformException e;

    public il8(long j, long j2, el8 el8Var, Object obj, MediaTransformException mediaTransformException) {
        super(j, j2, el8Var, obj);
        this.e = mediaTransformException;
    }

    public final String toString() {
        String string;
        qy5[] qy5VarArr;
        qy5[] qy5VarArr2;
        qy5[] qy5VarArr3;
        ra8 ra8Var = (ra8) ((ll8) this.d).b.get();
        float f = (r1.a - this.a) / 1000.0f;
        if (ra8Var == null || (string = Boolean.valueOf(ra8Var.b).toString()) == null) {
            string = "?";
        }
        Object objValueOf = null;
        if (ra8Var != null) {
            if ((ra8Var.a != -9223372036854775807L ? ra8Var : null) != null) {
                objValueOf = Float.valueOf(r8.a / 1000000.0f);
            }
        }
        Object objValueOf2 = (ra8Var == null || (qy5VarArr3 = ra8Var.c) == null) ? "?" : Integer.valueOf(qy5VarArr3.length);
        Object objValueOf3 = (ra8Var == null || (qy5VarArr2 = ra8Var.d) == null) ? "?" : Integer.valueOf(qy5VarArr2.length);
        Object objValueOf4 = (ra8Var == null || (qy5VarArr = ra8Var.e) == null) ? "?" : Integer.valueOf(qy5VarArr.length);
        el8 el8Var = this.c;
        Uri uri = el8Var.b;
        Object obj = objValueOf != null ? objValueOf : "?";
        String str = el8Var.c;
        boolean z = el8Var.j;
        boolean z2 = el8Var.k;
        boolean z3 = el8Var.i;
        int i = el8Var.d;
        int i2 = el8Var.e;
        float f2 = el8Var.f / 1000000.0f;
        float f3 = el8Var.g;
        float f4 = el8Var.h;
        long j = this.a;
        long j2 = this.b;
        String str2 = "[" + ((Object) DateFormat.format("yyyy-MM-dd kk:mm:ss", j)) + ", " + ((Object) DateFormat.format("yyyy-MM-dd kk:mm:ss", j2)) + "]";
        return x9e.b0("\n            MediaTransformResult.Failure(\n              in={\n                  uri=" + uri + "\n                  MediaInfo(\n                      took=" + f + " s\n                      duration=" + obj + " s\n                      hdr=" + string + "\n                      video_tracks=" + objValueOf2 + "\n                      audio_tracks=" + objValueOf3 + "\n                      other_tracks=" + objValueOf4 + "\n                  )\n              }\n              out=" + str + "\n              request={\n                  settings={\n                      hdr_allowed=" + z + "\n                      hevc_allowed=" + z2 + "\n                      ping_delay=500 ms\n                      stuck_delay=300000 ms\n                  }\n                  mute=" + z3 + "\n                  video_size=" + i + "x" + i2 + "\n                  video_bitrate=" + f2 + " Mbps\n                  position_range=[" + f3 + ", " + f4 + "]\n              }\n              took=" + ((Object) str2) + ", " + ((this.b - this.a) / 1000.0f) + " s\n              error=" + this.e + "\n            )\n        ");
    }
}

package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class u35 implements gd {
    public static final NumberFormat o;
    public final kue a = new kue();
    public final hue b = new hue();
    public final long c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        o = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String a(a70 a70Var) {
        return a70Var.a + "," + a70Var.c + "," + a70Var.b + "," + a70Var.d + "," + a70Var.e + "," + a70Var.f;
    }

    public static String d(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return o.format(j / 1000.0f);
    }

    @Override // defpackage.gd
    public final void A(fd fdVar, p3b p3bVar, p3b p3bVar2, int i) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [mediaItem=");
        sb.append(p3bVar.b);
        sb.append(", period=");
        sb.append(p3bVar.e);
        sb.append(", pos=");
        sb.append(p3bVar.f);
        int i2 = p3bVar.h;
        if (i2 != -1) {
            sb.append(", contentPos=");
            sb.append(p3bVar.g);
            sb.append(", adGroup=");
            sb.append(i2);
            sb.append(", ad=");
            sb.append(p3bVar.i);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(p3bVar2.b);
        sb.append(", period=");
        sb.append(p3bVar2.e);
        sb.append(", pos=");
        sb.append(p3bVar2.f);
        int i3 = p3bVar2.h;
        if (i3 != -1) {
            sb.append(", contentPos=");
            sb.append(p3bVar2.g);
            sb.append(", adGroup=");
            sb.append(i3);
            sb.append(", ad=");
            sb.append(p3bVar2.i);
        }
        sb.append("]");
        f(fdVar, "positionDiscontinuity", sb.toString());
    }

    @Override // defpackage.gd
    public final void A0(fd fdVar, p0f p0fVar) {
        f99 f99Var;
        z04.t("tracks [" + c(fdVar));
        zw6 zw6VarA = p0fVar.a();
        for (int i = 0; i < zw6VarA.size(); i++) {
            o0f o0fVar = (o0f) zw6VarA.get(i);
            z04.t("  group [");
            for (int i2 = 0; i2 < o0fVar.a; i2++) {
                String str = o0fVar.g(i2) ? "[X]" : "[ ]";
                z04.t("    " + str + " Track:" + i2 + ", " + qy5.e(o0fVar.c(i2)) + ", supported=" + oaf.z(o0fVar.d(i2)));
            }
            z04.t("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < zw6VarA.size(); i3++) {
            o0f o0fVar2 = (o0f) zw6VarA.get(i3);
            for (int i4 = 0; !z && i4 < o0fVar2.a; i4++) {
                if (o0fVar2.g(i4) && (f99Var = o0fVar2.c(i4).k) != null && f99Var.d() > 0) {
                    z04.t("  Metadata [");
                    g(f99Var, "    ");
                    z04.t("  ]");
                    z = true;
                }
            }
        }
        z04.t("]");
    }

    @Override // defpackage.gd
    public final void B(fd fdVar, c3b c3bVar) {
        f(fdVar, "playbackParameters", c3bVar.toString());
    }

    @Override // defpackage.gd
    public final void B0(fd fdVar, Exception exc) {
        z04.u(b(fdVar, "internalError", "drmSessionManagerError", exc));
    }

    @Override // defpackage.gd
    public final void C(fd fdVar, String str) {
        f(fdVar, "audioDecoderInitialized", str);
    }

    @Override // defpackage.gd
    public final void C0(fd fdVar, int i) {
        f(fdVar, "playbackSuppressionReason", i != 0 ? i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    @Override // defpackage.gd
    public final void D(fd fdVar, f99 f99Var) {
        z04.t("metadata [" + c(fdVar));
        g(f99Var, "  ");
        z04.t("]");
    }

    @Override // defpackage.gd
    public final void D0(fd fdVar) {
        e(fdVar, "drmKeysRestored");
    }

    @Override // defpackage.gd
    public final void E(fd fdVar, int i) {
        f(fdVar, "state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    @Override // defpackage.gd
    public final void E0(fd fdVar, pc8 pc8Var) {
        f(fdVar, "upstreamDiscarded", qy5.e((qy5) pc8Var.g));
    }

    @Override // defpackage.gd
    public final void F(fd fdVar, int i) {
        f(fdVar, "droppedFrames", Integer.toString(i));
    }

    @Override // defpackage.gd
    public final void H(fd fdVar, qy5 qy5Var) {
        f(fdVar, "audioInputFormat", qy5.e(qy5Var));
    }

    @Override // defpackage.gd
    public final void I(fd fdVar, int i, int i2) {
        f(fdVar, "surfaceSize", i + ", " + i2);
    }

    @Override // defpackage.gd
    public final void J(fd fdVar, n54 n54Var) {
        e(fdVar, "videoDisabled");
    }

    @Override // defpackage.gd
    public final void K(fd fdVar, int i) {
        f(fdVar, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // defpackage.gd
    public final void L(fd fdVar, int i, long j) {
    }

    @Override // defpackage.gd
    public final void M(fd fdVar, h30 h30Var) {
        f(fdVar, "audioAttributes", h30Var.a + "," + h30Var.b + "," + h30Var.c + "," + h30Var.d);
    }

    @Override // defpackage.gd
    public final void P(fd fdVar, a70 a70Var) {
        f(fdVar, "audioTrackInit", a(a70Var));
    }

    @Override // defpackage.gd
    public final void Q(fd fdVar) {
        e(fdVar, "videoEnabled");
    }

    @Override // defpackage.gd
    public final void R(fd fdVar, pc8 pc8Var, IOException iOException, boolean z) {
        z04.u(b(fdVar, "internalError", "loadError", iOException));
    }

    @Override // defpackage.gd
    public final void T(fd fdVar, jlf jlfVar) {
        f(fdVar, "videoSize", jlfVar.a + ", " + jlfVar.b);
    }

    @Override // defpackage.gd
    public final void U(fd fdVar, int i) {
        mue mueVar = fdVar.b;
        int i2 = mueVar.i();
        int iP = mueVar.p();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(c(fdVar));
        sb.append(", periodCount=");
        sb.append(i2);
        sb.append(", windowCount=");
        sb.append(iP);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        z04.t(sb.toString());
        for (int i3 = 0; i3 < Math.min(i2, 3); i3++) {
            hue hueVar = this.b;
            mueVar.g(i3, hueVar, false);
            z04.t("  period [" + d(oaf.h0(hueVar.d)) + "]");
        }
        if (i2 > 3) {
            z04.t("  ...");
        }
        for (int i4 = 0; i4 < Math.min(iP, 3); i4++) {
            kue kueVar = this.a;
            mueVar.o(i4, kueVar);
            z04.t("  window [" + d(oaf.h0(kueVar.m)) + ", seekable=" + kueVar.h + ", dynamic=" + kueVar.i + "]");
        }
        if (iP > 3) {
            z04.t("  ...");
        }
        z04.t("]");
    }

    @Override // defpackage.gd
    public final void V(fd fdVar, qy5 qy5Var) {
        f(fdVar, "videoInputFormat", qy5.e(qy5Var));
    }

    @Override // defpackage.gd
    public final void W(fd fdVar, pc8 pc8Var) {
        f(fdVar, "downstreamFormat", qy5.e((qy5) pc8Var.g));
    }

    @Override // defpackage.gd
    public final void Z(fd fdVar, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(c(fdVar));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        z04.t(sb.toString());
    }

    public final String b(fd fdVar, String str, String str2, Throwable th) {
        StringBuilder sbO = rh4.o(str, " [");
        sbO.append(c(fdVar));
        String string = sbO.toString();
        if (th instanceof PlaybackException) {
            StringBuilder sbO2 = rh4.o(string, ", errorCode=");
            sbO2.append(((PlaybackException) th).b());
            string = sbO2.toString();
        }
        if (str2 != null) {
            string = rh4.j(string, ", ", str2);
        }
        String strI = z04.I(th);
        if (!TextUtils.isEmpty(strI)) {
            StringBuilder sbO3 = rh4.o(string, "\n  ");
            sbO3.append(strI.replace("\n", "\n  "));
            sbO3.append('\n');
            string = sbO3.toString();
        }
        return au1.g(string, "]");
    }

    public final String c(fd fdVar) {
        String string = "window=" + fdVar.c;
        yj8 yj8Var = fdVar.d;
        if (yj8Var != null) {
            StringBuilder sbO = rh4.o(string, ", period=");
            sbO.append(fdVar.b.b(yj8Var.a));
            string = sbO.toString();
            if (yj8Var.b()) {
                StringBuilder sbO2 = rh4.o(string, ", adGroup=");
                sbO2.append(yj8Var.b);
                StringBuilder sbO3 = rh4.o(sbO2.toString(), ", ad=");
                sbO3.append(yj8Var.c);
                string = sbO3.toString();
            }
        }
        return "eventTime=" + d(fdVar.a - this.c) + ", mediaPos=" + d(fdVar.e) + ", " + string;
    }

    public final void e(fd fdVar, String str) {
        z04.t(b(fdVar, str, null, null));
    }

    @Override // defpackage.gd
    public final void e0(fd fdVar, Object obj, long j) {
        f(fdVar, "renderedFirstFrame", String.valueOf(obj));
    }

    public final void f(fd fdVar, String str, String str2) {
        z04.t(b(fdVar, str, str2, null));
    }

    public final void g(f99 f99Var, String str) {
        for (int i = 0; i < f99Var.a.length; i++) {
            StringBuilder sbL = au1.l(str);
            sbL.append(f99Var.a[i]);
            z04.t(sbL.toString());
        }
    }

    @Override // defpackage.gd
    public final void g0(fd fdVar, String str) {
        f(fdVar, "videoDecoderReleased", str);
    }

    @Override // defpackage.gd
    public final void h0(fd fdVar, a70 a70Var) {
        f(fdVar, "audioTrackReleased", a(a70Var));
    }

    @Override // defpackage.gd
    public final void j0(fd fdVar) {
        e(fdVar, "audioEnabled");
    }

    @Override // defpackage.gd
    public final void k0(fd fdVar, int i) {
        f(fdVar, "drmSessionAcquired", "state=" + i);
    }

    @Override // defpackage.gd
    public final void l0(fd fdVar) {
        e(fdVar, "audioDisabled");
    }

    @Override // defpackage.gd
    public final void m0(fd fdVar, PlaybackException playbackException) {
        z04.u(b(fdVar, "playerFailed", null, playbackException));
    }

    @Override // defpackage.gd
    public final void n0(fd fdVar, float f) {
        f(fdVar, "volume", Float.toString(f));
    }

    @Override // defpackage.gd
    public final void o0(fd fdVar, int i, long j, long j2) {
        z04.u(b(fdVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, null));
    }

    @Override // defpackage.gd
    public final void r(fd fdVar, boolean z) {
        f(fdVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // defpackage.gd
    public final void s(fd fdVar) {
        e(fdVar, "drmKeysLoaded");
    }

    @Override // defpackage.gd
    public final void t(fd fdVar, boolean z) {
        f(fdVar, "isPlaying", Boolean.toString(z));
    }

    @Override // defpackage.gd
    public final void v0(fd fdVar) {
        e(fdVar, "drmSessionReleased");
    }

    @Override // defpackage.gd
    public final void w(fd fdVar) {
        e(fdVar, "drmKeysRemoved");
    }

    @Override // defpackage.gd
    public final void w0(fd fdVar, String str) {
        f(fdVar, "videoDecoderInitialized", str);
    }

    @Override // defpackage.gd
    public final void x(fd fdVar, String str) {
        f(fdVar, "audioDecoderReleased", str);
    }

    @Override // defpackage.gd
    public final void y0(fd fdVar, boolean z) {
        f(fdVar, "loading", Boolean.toString(z));
    }

    @Override // defpackage.gd
    public final void z(fd fdVar, boolean z) {
        f(fdVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // defpackage.gd
    public final void z0(fd fdVar, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        f(fdVar, "playWhenReady", sb.toString());
    }
}

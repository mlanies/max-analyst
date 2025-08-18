package defpackage;

import android.graphics.Path;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public class vu4 implements l30, kx3, s43, nr8, jm0, f7b, za7, j88, z0a, kz3, p2a {
    public static vu4 Y;
    public static final vu4 a = new vu4();
    public static final /* synthetic */ vu4 b = new vu4();
    public static final vu4 c = new vu4();
    public static final vu4 o = new vu4();
    public static final vu4 X = new vu4();

    public static o43 l(o43 o43Var) {
        try {
            if (o43.n0(o43Var) && (o43Var.e0() instanceof CloseableStaticBitmap)) {
                return ((CloseableStaticBitmap) o43Var.e0()).cloneUnderlyingBitmapReference();
            }
            o43.S(o43Var);
            return null;
        } finally {
            o43.S(o43Var);
        }
    }

    public static Path q(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static reb s(String str) {
        v25 v25Var = reb.Y;
        v25Var.getClass();
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            reb rebVar = (reb) u1Var.next();
            if (tpa.f(rebVar.a, str)) {
                return rebVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.j88, defpackage.k88
    public MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.jm0, defpackage.km0
    public long b(long j) {
        return j;
    }

    @Override // defpackage.nr8
    public void c(wq8 wq8Var, boolean z) {
    }

    @Override // defpackage.z0a
    public c1a call() {
        return new g1a(16);
    }

    @Override // defpackage.j88, defpackage.k88
    public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.j88, defpackage.k88
    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.p2a
    /* renamed from: f */
    public v1d mo47f() {
        return new wd0(-9223372036854775807L);
    }

    @Override // defpackage.j88, defpackage.k88
    public int g() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.j88, defpackage.k88
    public boolean h() {
        return false;
    }

    @Override // defpackage.p2a
    public void i(long j) {
    }

    @Override // defpackage.p2a
    public long j(sa4 sa4Var) {
        return -1L;
    }

    @Override // defpackage.f7b
    public CharSequence k(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return editTextPreference.a.getString(y1c.not_set);
    }

    public j47 m(oy5 oy5Var) {
        int i = 1;
        int i2 = 0;
        String str = oy5Var.w0;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new wo(i2);
                case "application/x-icy":
                    return new rs6();
                case "application/id3":
                    return new at6(null);
                case "application/x-emsg":
                    return new wo(i);
                case "application/x-scte35":
                    return new vvd();
            }
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    public boolean n() {
        return this instanceof f08;
    }

    @Override // defpackage.nr8
    public boolean o(wq8 wq8Var) {
        return false;
    }

    public void p(float f, float f2, float f3, pjd pjdVar) {
        pjdVar.c(f, 0.0f);
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) {
        db7Var.z();
        return null;
    }

    public boolean r(oy5 oy5Var) {
        String str = oy5Var.w0;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.s43
    public gle w(gy8 gy8Var) {
        int iN;
        String strP;
        long jM;
        if (!gy8Var.m()) {
            return null;
        }
        try {
            iN = lz7.N(gy8Var);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int iS = au1.s(k7d.a);
            if (iS != 0) {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iN = 0;
        }
        Long lValueOf = null;
        String strP2 = null;
        for (int i = 0; i < iN; i++) {
            try {
                strP = lz7.P(gy8Var);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int iS2 = au1.s(k7d.a);
                if (iS2 != 0) {
                    if (iS2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = null;
            }
            if (strP != null) {
                try {
                    if (strP.equals("botId")) {
                        try {
                            jM = lz7.M(gy8Var, 0L);
                        } catch (Throwable th3) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                            Iterator it3 = u7d.a.iterator();
                            while (it3.hasNext()) {
                                ((r4a) it3.next()).getClass();
                                r4a.a(th3);
                            }
                            int iS3 = au1.s(k7d.a);
                            if (iS3 != 0) {
                                if (iS3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th3;
                            }
                            jM = -1;
                        }
                        lValueOf = Long.valueOf(jM);
                    } else if (strP.equals("startParams")) {
                        try {
                            strP2 = lz7.P(gy8Var);
                        } catch (Throwable th4) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = u7d.a.iterator();
                            while (it4.hasNext()) {
                                ((r4a) it4.next()).getClass();
                                r4a.a(th4);
                            }
                            int iS4 = au1.s(k7d.a);
                            if (iS4 != 0) {
                                if (iS4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th4;
                            }
                            strP2 = null;
                        }
                    } else {
                        try {
                            gy8Var.z();
                        } catch (Throwable th5) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                            Iterator it5 = u7d.a.iterator();
                            while (it5.hasNext()) {
                                ((r4a) it5.next()).getClass();
                                r4a.a(th5);
                            }
                            int iS5 = au1.s(k7d.a);
                            if (iS5 != 0) {
                                if (iS5 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                        Iterator it6 = u7d.a.iterator();
                        while (it6.hasNext()) {
                            ((r4a) it6.next()).getClass();
                            r4a.a(th6);
                        }
                        int iS6 = au1.s(k7d.a);
                        if (iS6 != 0) {
                            if (iS6 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                        Iterator it7 = u7d.a.iterator();
                        while (it7.hasNext()) {
                            ((r4a) it7.next()).getClass();
                            r4a.a(th7);
                        }
                        int iS7 = au1.s(k7d.a);
                        if (iS7 != 0) {
                            if (iS7 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th7;
                        }
                    }
                }
            }
        }
        return new k95(strP2, lValueOf);
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.media.Rating;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.Spannable;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.api.http.NoHttpApiEndpointException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class y8 implements xl7, ws3, JavaAudioDeviceModule.AudioRecordStateCallback, JavaAudioDeviceModule.AudioRecordErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback, JavaAudioDeviceModule.AudioTrackErrorCallback, qj3, vp6, bn4, ah9, isf, a04, lde, w2e {
    public Object a;

    public /* synthetic */ y8(Object obj) {
        this.a = obj;
    }

    public void A(long j, String str) {
        Integer num = (Integer) hd8.c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(zr6.i("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.a).putLong(str, j);
    }

    public void B(String str, h5c h5cVar) {
        Object obj;
        Integer num = (Integer) hd8.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(zr6.i("The ", str, " key cannot be used to put a Rating"));
        }
        if (h5cVar.c == null) {
            boolean zC = h5cVar.c();
            int i = h5cVar.a;
            if (zC) {
                boolean z = false;
                float f = h5cVar.b;
                switch (i) {
                    case 1:
                        if (i == 1) {
                            z = f == 1.0f;
                        }
                        h5cVar.c = Rating.newHeartRating(z);
                        break;
                    case 2:
                        if (i == 2) {
                            z = f == 1.0f;
                        }
                        h5cVar.c = Rating.newThumbRating(z);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        h5cVar.c = Rating.newStarRating(i, h5cVar.b());
                        break;
                    case 6:
                        if (i != 6 || !h5cVar.c()) {
                            f = -1.0f;
                        }
                        h5cVar.c = Rating.newPercentageRating(f);
                        break;
                    default:
                        obj = null;
                        break;
                }
            } else {
                h5cVar.c = Rating.newUnratedRating(i);
            }
            obj = h5cVar.c;
        } else {
            obj = h5cVar.c;
        }
        ((Bundle) this.a).putParcelable(str, (Parcelable) obj);
    }

    public void C(String str, String str2) {
        Integer num = (Integer) hd8.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(zr6.i("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.a).putCharSequence(str, str2);
    }

    public void D(String str, CharSequence charSequence) {
        Integer num = (Integer) hd8.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(zr6.i("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.a).putCharSequence(str, charSequence);
    }

    public int E(int i) {
        int i2;
        cvd cvdVar;
        cvd[] cvdVarArr = (cvd[]) this.a;
        int length = cvdVarArr.length - 1;
        int i3 = 0;
        while (i3 <= length && (cvdVar = cvdVarArr[(i2 = (i3 + length) >>> 1)]) != null) {
            int i4 = cvdVar.b;
            int i5 = cvdVar.a;
            if (i >= i5 && i < i4) {
                return i2;
            }
            if (i4 <= i) {
                i3 = i2 + 1;
            } else if (i5 > i) {
                length = i2 - 1;
            }
        }
        return -1;
    }

    public void F() {
        b08 b08Var = (b08) this.a;
        b08Var.getClass();
        try {
            jfg jfgVar = (jfg) b08Var.a;
            jfgVar.H0(jfgVar.G0(), 1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void G(sn0 sn0Var) {
        lfg lfgVar = ((b08) this.a).a;
        rxd rxdVar = sn0Var.a;
        try {
            if (rxdVar == null) {
                jfg jfgVar = (jfg) lfgVar;
                Parcel parcelG0 = jfgVar.G0();
                agg.c(parcelG0, null);
                jfgVar.H0(parcelG0, 18);
            } else {
                xr6 xr6Var = (xr6) rxdVar.b;
                jfg jfgVar2 = (jfg) lfgVar;
                Parcel parcelG02 = jfgVar2.G0();
                agg.c(parcelG02, xr6Var);
                jfgVar2.H0(parcelG02, 18);
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void H(Long l) {
        b08 b08Var = (b08) this.a;
        b08Var.getClass();
        try {
            lfg lfgVar = b08Var.a;
            oy9 oy9Var = new oy9(l);
            jfg jfgVar = (jfg) lfgVar;
            Parcel parcelG0 = jfgVar.G0();
            agg.c(parcelG0, oy9Var);
            jfgVar.H0(parcelG0, 29);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void I() {
        b08 b08Var = (b08) this.a;
        b08Var.getClass();
        try {
            jfg jfgVar = (jfg) b08Var.a;
            Parcel parcelG0 = jfgVar.G0();
            int i = agg.a;
            parcelG0.writeInt(1);
            jfgVar.H0(parcelG0, 14);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // defpackage.xl7
    public void a(int i, int i2) {
        ((hdc) this.a).n(i, i2);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        ss2 ss2Var = (ss2) obj;
        s12 s12Var = (s12) this.a;
        s12Var.getClass();
        if (ss2Var.c != null) {
            s12Var.b().W(s12Var.o, v82.b);
            e8d e8dVar = s12Var.a;
            if (e8dVar == null) {
                e8dVar = null;
            }
            iy2 iy2Var = (iy2) e8dVar.J.getValue();
            ((jz2) iy2Var).l().c0(Collections.singletonList(ss2Var.c));
        }
        av0 av0VarT = s12Var.t();
        long j = s12Var.b;
        av0VarT.c(new ts2(j));
        s12Var.s().d(j);
    }

    @Override // defpackage.bn4
    public void b() {
        wk9 wk9Var = ((oj9) this.a).u0;
        if (wk9Var != null) {
            wk9Var.n(new fj0(18));
        }
    }

    @Override // defpackage.a04
    public long c(long j) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((b04) arrayList.get(0)).b) {
            return ((b04) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            b04 b04Var = (b04) arrayList.get(i);
            if (j < b04Var.b) {
                long j2 = ((b04) arrayList.get(i - 1)).d;
                long j3 = b04Var.b;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= j3) ? j3 : j2;
            }
        }
        long j4 = ((b04) mqd.m(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // defpackage.a04
    public void clear() {
        ((ArrayList) this.a).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // defpackage.a04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(defpackage.b04 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            defpackage.fm9.f(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.lang.Object r9 = r9.a
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r3 = r9.size()
            int r3 = r3 - r6
        L2d:
            if (r3 < 0) goto L50
            java.lang.Object r4 = r9.get(r3)
            b04 r4 = (defpackage.b04) r4
            long r7 = r4.b
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L40
            int r3 = r3 + r6
            r9.add(r3, r10)
            return r2
        L40:
            java.lang.Object r4 = r9.get(r3)
            b04 r4 = (defpackage.b04) r4
            long r7 = r4.b
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L4d
            r2 = r5
        L4d:
            int r3 = r3 + (-1)
            goto L2d
        L50:
            r9.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y8.d(b04, long):boolean");
    }

    @Override // defpackage.xl7
    public void e(int i, int i2) {
        ((hdc) this.a).p(i, i2);
    }

    @Override // defpackage.bn4
    public void f(int i) {
        oj9 oj9Var = (oj9) this.a;
        oj9Var.o.c = 0;
        oj9.Z1(oj9Var, false, i * 10);
    }

    @Override // defpackage.w2e
    public void g(z2e z2eVar) {
        ((m4e) this.a).Y.a(z2eVar);
    }

    @Override // defpackage.lde
    public Object get() {
        return Boolean.valueOf(((jp) ((hp) ((v4) this.a).c(hp.class))).u());
    }

    @Override // defpackage.ah9
    public void h() {
        ((z3b) this.a).b();
    }

    @Override // defpackage.a04
    public zw6 i(long j) {
        int iX = x(j);
        if (iX == 0) {
            ls5 ls5Var = zw6.b;
            return ffc.X;
        }
        b04 b04Var = (b04) ((ArrayList) this.a).get(iX - 1);
        long j2 = b04Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return b04Var.a;
        }
        ls5 ls5Var2 = zw6.b;
        return ffc.X;
    }

    @Override // defpackage.ah9
    public void j() {
        ((z3b) this.a).b();
    }

    @Override // defpackage.w2e
    public void k(z2e z2eVar) {
        cc8 cc8Var = (cc8) ((m4e) this.a).Y.a.b.getValue();
        cc8Var.getClass();
        zb8 zb8Var = new zb8(z2eVar.a);
        s35 s35Var = cc8Var.X;
        pnf.o(s35Var, zb8Var);
        pnf.o(s35Var, yb8.a);
    }

    @Override // defpackage.ah9
    public void l() {
        ((z3b) this.a).b();
    }

    @Override // defpackage.xl7
    public void m(int i, int i2) {
        ((hdc) this.a).a.f(i, i2);
    }

    @Override // defpackage.a04
    public long n(long j) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty() || j < ((b04) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((b04) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                b04 b04Var = (b04) arrayList.get(i - 1);
                long j3 = b04Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? b04Var.b : j3;
            }
        }
        b04 b04Var2 = (b04) mqd.m(arrayList);
        long j4 = b04Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? b04Var2.b : j4;
    }

    @Override // defpackage.xl7
    public void o(int i, int i2, Object obj) {
        ((hdc) this.a).o(i, i2, obj);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordError(String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio record error: " + str);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordInitError(String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio record init error: " + str);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public void onWebRtcAudioRecordStart() {
        ((a4c) this.a).log("AudioRecordCallback", "Audio record did start");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio record start error: [" + audioRecordStartErrorCode + "] " + str);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public void onWebRtcAudioRecordStop() {
        ((a4c) this.a).log("AudioRecordCallback", "Audio record did stop");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackError(String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio track error: " + str);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackInitError(String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio track init error: " + str);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public void onWebRtcAudioTrackStart() {
        ((a4c) this.a).log("AudioRecordCallback", "Audio track did start");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        ((a4c) this.a).log("AudioRecordCallback", "Audio track start error: [" + audioTrackStartErrorCode + "] " + str);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public void onWebRtcAudioTrackStop() {
        ((a4c) this.a).log("AudioRecordCallback", "Audio track did stop");
    }

    @Override // defpackage.vp6
    public Uri p(String str) {
        str.getClass();
        if (str.equals("api")) {
            return ((a95) this.a).c().a();
        }
        throw new NoHttpApiEndpointException(str);
    }

    @Override // defpackage.ah9
    public void q() {
        ((z3b) this.a).b();
    }

    @Override // defpackage.ah9
    public void r() {
        ((z3b) this.a).b();
    }

    @Override // defpackage.ah9
    public void s() {
        ((z3b) this.a).b();
    }

    @Override // defpackage.ah9
    public void t() {
        ((z3b) this.a).b();
    }

    @Override // defpackage.a04
    public void u(long j) {
        int iX = x(j);
        if (iX > 0) {
            ((ArrayList) this.a).subList(0, iX).clear();
        }
    }

    public hi5 v() {
        jo7 jo7Var = (jo7) this.a;
        String strG = ((Long) jo7Var.a) == null ? " fileSizeLimit" : "";
        if (((Long) jo7Var.b) == null) {
            strG = strG.concat(" durationLimitMillis");
        }
        if (((File) jo7Var.c) == null) {
            strG = au1.g(strG, " file");
        }
        if (strG.isEmpty()) {
            return new hi5(new ma0(((Long) jo7Var.a).longValue(), ((Long) jo7Var.b).longValue(), (File) jo7Var.c));
        }
        throw new IllegalStateException("Missing required properties:".concat(strG));
    }

    public String w(bq0 bq0Var, wm3 wm3Var) {
        if (wm3Var != null) {
            if (((j92) this.a) != j92.a) {
                return rh4.j(bre.c(wm3Var.w0), " /", bq0Var.b);
            }
        }
        return wg0.i("/", bq0Var.b);
    }

    public int x(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((b04) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    public void y() {
        long j;
        x14 x14Var = (x14) this.a;
        synchronized (nu0.A0) {
            try {
                j = nu0.B0 ? nu0.C0 : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        x14Var.L = j;
        x14Var.s(true);
    }

    public void z(String str, Bitmap bitmap) {
        Integer num = (Integer) hd8.c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(zr6.i("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.a).putParcelable(str, bitmap);
    }

    public y8(xr6 xr6Var) {
        fp3.n(xr6Var);
        this.a = xr6Var;
    }

    public y8(Spannable spannable) {
        Object[] spans;
        try {
            spans = spannable.getSpans(0, spannable.length(), ey4.class);
        } catch (Throwable unused) {
            spans = null;
        }
        ey4[] ey4VarArr = (ey4[]) (spans == null ? new ey4[0] : spans);
        this.a = new cvd[ey4VarArr.length];
        int length = ey4VarArr.length;
        for (int i = 0; i < length; i++) {
            ((cvd[]) this.a)[i] = new cvd(spannable.getSpanStart(ey4VarArr[i]), spannable.getSpanEnd(ey4VarArr[i]));
        }
        Arrays.sort((cvd[]) this.a);
    }

    public y8(int i) {
        switch (i) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                this.a = null;
                break;
            case 19:
                this.a = new Bundle();
                break;
            case 25:
                this.a = new ArrayList();
                break;
            case 27:
                this.a = new khe(new xid(4));
                break;
            default:
                this.a = Handler.createAsync(Looper.getMainLooper());
                break;
        }
    }

    public y8(File file) {
        jo7 jo7Var = new jo7();
        jo7Var.a = 0L;
        jo7Var.b = 0L;
        c54.o(file, "File can't be null.");
        this.a = jo7Var;
        jo7Var.c = file;
    }
}

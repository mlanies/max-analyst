package defpackage;

import android.content.ClipData;
import android.graphics.PointF;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContentInfo;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLSocket;
import org.apache.http.util.LangUtils;
import org.webrtc.CameraVideoCapturer;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* loaded from: classes.dex */
public final class wd6 implements eg4, lv, vg1, x85, qj3, at3, do7, a76, mq1, nq8, n99, ihb, CameraVideoCapturer.CameraEventsHandler, lxd {
    public static volatile wd6 c;
    public static final int[] o = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ wd6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static wd6 w(ce3 ce3Var) {
        wd6 wd6Var = new wd6(7);
        ce3Var.e(new f9(wd6Var, 17, ce3Var));
        return wd6Var;
    }

    public void A(sg8 sg8Var, zf8 zf8Var, ArrayList arrayList) {
        ah8 ah8Var = (ah8) this.b;
        if (sg8Var != ah8Var.u || zf8Var == null) {
            if (sg8Var == ah8Var.s) {
                if (zf8Var != null) {
                    ah8Var.m(ah8Var.r, zf8Var);
                }
                ah8Var.r.n(arrayList);
                return;
            }
            return;
        }
        ch8 ch8Var = ah8Var.t.a;
        String strC = zf8Var.c();
        dh8 dh8Var = new dh8(ch8Var, strC, ah8Var.b(ch8Var, strC));
        dh8Var.i(zf8Var);
        if (ah8Var.r == dh8Var) {
            return;
        }
        sg8 sg8Var2 = ah8Var.u;
        dh8 dh8Var2 = ah8Var.t;
        bh8 bh8Var = ah8Var.z;
        if (bh8Var != null) {
            if (!bh8Var.i && !bh8Var.j) {
                bh8Var.j = true;
                tg8 tg8Var = bh8Var.a;
                if (tg8Var != null) {
                    tg8Var.h(0);
                    tg8Var.d();
                }
            }
            ah8Var.z = null;
        }
        bh8 bh8Var2 = new bh8(ah8Var, dh8Var, sg8Var2, 3, dh8Var2, arrayList);
        ah8Var.z = bh8Var2;
        bh8Var2.a();
        ah8Var.t = null;
        ah8Var.u = null;
    }

    public f99 B(sa4 sa4Var, ys6 ys6Var) throws EOFException, InterruptedIOException {
        wpa wpaVar = (wpa) this.b;
        f99 f99VarX = null;
        int i = 0;
        while (true) {
            try {
                sa4Var.q(wpaVar.a, 0, 10, false);
                wpaVar.G(0);
                if (wpaVar.x() != 4801587) {
                    break;
                }
                wpaVar.H(3);
                int iT = wpaVar.t();
                int i2 = iT + 10;
                if (f99VarX == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(wpaVar.a, 0, bArr, 0, 10);
                    sa4Var.q(bArr, 10, iT, false);
                    f99VarX = new bt6(ys6Var).X(i2, bArr);
                } else {
                    sa4Var.b(iT, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        sa4Var.Y = 0;
        sa4Var.b(i, false);
        return f99VarX;
    }

    @Override // defpackage.do7
    public b11 C(go7 go7Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        bqa bqaVar = (bqa) go7Var;
        y14 y14Var = (y14) this.b;
        y14Var.getClass();
        long j3 = bqaVar.a;
        Uri uri = bqaVar.o.c;
        yn7 yn7Var = new yn7(j2);
        y14Var.m.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i2 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        b11 b11Var = jMin == -9223372036854775807L ? vq7.Z : new b11(jMin, 0, 5, false);
        y14Var.q.C(yn7Var, bqaVar.c, iOException, !b11Var.a());
        return b11Var;
    }

    public void D(int i, long j, long j2) throws ParserException {
        d28 d28Var = (d28) this.b;
        fm9.l(d28Var.o1);
        if (i == 160) {
            d28Var.d1 = false;
            d28Var.e1 = 0L;
            return;
        }
        if (i != 174) {
            if (i == 187) {
                d28Var.R0 = false;
                return;
            }
            if (i == 19899) {
                d28Var.J0 = -1;
                d28Var.K0 = -1L;
                return;
            }
            if (i == 20533) {
                d28Var.b(i);
                d28Var.H0.h = true;
                return;
            }
            if (i == 21968) {
                d28Var.b(i);
                d28Var.H0.y = true;
                return;
            }
            if (i == 408125543) {
                long j3 = d28Var.D0;
                if (j3 != -1 && j3 != j) {
                    throw ParserException.a(null, "Multiple Segment elements not supported");
                }
                d28Var.D0 = j;
                d28Var.C0 = j2;
                return;
            }
            if (i == 475249515) {
                d28Var.P0 = new nv7(1);
                d28Var.Q0 = new nv7(1);
                return;
            } else {
                if (i == 524531317 && !d28Var.I0) {
                    if (d28Var.o && d28Var.M0 != -1) {
                        d28Var.L0 = true;
                        return;
                    } else {
                        d28Var.o1.J(new wd0(d28Var.G0));
                        d28Var.I0 = true;
                        return;
                    }
                }
                return;
            }
        }
        b28 b28Var = new b28();
        b28Var.m = -1;
        b28Var.n = -1;
        b28Var.o = -1;
        b28Var.p = -1;
        b28Var.q = -1;
        b28Var.r = 0;
        b28Var.s = -1;
        b28Var.t = 0.0f;
        b28Var.u = 0.0f;
        b28Var.v = 0.0f;
        b28Var.w = null;
        b28Var.x = -1;
        b28Var.y = false;
        b28Var.z = -1;
        b28Var.A = -1;
        b28Var.B = -1;
        b28Var.C = 1000;
        b28Var.D = 200;
        b28Var.E = -1.0f;
        b28Var.F = -1.0f;
        b28Var.G = -1.0f;
        b28Var.H = -1.0f;
        b28Var.I = -1.0f;
        b28Var.J = -1.0f;
        b28Var.K = -1.0f;
        b28Var.L = -1.0f;
        b28Var.M = -1.0f;
        b28Var.N = -1.0f;
        b28Var.P = 1;
        b28Var.Q = -1;
        b28Var.R = 8000;
        b28Var.S = 0L;
        b28Var.T = 0L;
        b28Var.W = true;
        b28Var.X = "eng";
        d28Var.H0 = b28Var;
    }

    @Override // defpackage.x85
    public vh9 F() {
        throw null;
    }

    @Override // defpackage.lxd
    public kxd Q() {
        return (b46) this.b;
    }

    @Override // defpackage.vg1
    public void T(float f, float f2) {
        bc7[] bc7VarArr = xg1.x0;
        PointF pointF = ((xg1) this.b).s0;
        pointF.x = f;
        pointF.y = f2;
    }

    @Override // defpackage.a76
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                List list = (List) obj;
                zb2 zb2Var = (zb2) this.b;
                x77 x77Var = zb2Var.I0;
                if (x77Var != null) {
                    x77Var.cancel(null);
                }
                zb2Var.J0.set(true);
                zb2Var.I0 = j47.T(zb2Var.Z, (nx3) zb2Var.b.getValue(), null, new nb2(list, zb2Var, null), 2);
                break;
            default:
                hm9.p(((s8d) this.b).X, "Error while runAfterDelay", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.eg4
    public boolean b(SSLSocket sSLSocket) {
        return eae.o0(sSLSocket.getClass().getName(), ((String) this.b) + '.', false);
    }

    @Override // defpackage.at3
    public ClipData c() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        boolean z = th instanceof MediaCodec.CodecException;
        re6 re6Var = (re6) this.b;
        if (!z) {
            ((d15) re6Var.b).b(0, th.getMessage(), th);
            return;
        }
        d15 d15Var = (d15) re6Var.b;
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
        d15Var.getClass();
        d15Var.b(1, codecException.getMessage(), codecException);
    }

    @Override // defpackage.n99
    public long e() {
        return ((ByteBuffer) this.b).position();
    }

    @Override // defpackage.ihb
    public void f(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    @Override // defpackage.at3
    public Uri g() {
        return ((ContentInfo) this.b).getLinkUri();
    }

    @Override // defpackage.at3
    public Bundle getExtras() {
        return ((ContentInfo) this.b).getExtras();
    }

    @Override // defpackage.at3
    public int getFlags() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.nq8
    public void h(Object obj) {
        ((pq9) this.b).getClass();
    }

    @Override // defpackage.lv
    public e5f h0(long j, List list) {
        boolean zIsEmpty = list.isEmpty();
        e5f e5fVar = e5f.a;
        if (zIsEmpty) {
            return e5fVar;
        }
        ((bx) this.b).B();
        ((bx) this.b).o(j, list, true, false);
        return e5fVar;
    }

    @Override // defpackage.nq8
    public void i(Object obj) {
        ((pq9) this.b).getClass();
    }

    @Override // defpackage.n99
    public int j() {
        return ((ByteBuffer) this.b).getInt();
    }

    @Override // defpackage.n99
    public void k(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // defpackage.eg4
    public oud l(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new de(superclass);
    }

    @Override // defpackage.do7
    public void m(go7 go7Var, long j, long j2, boolean z) {
        ((y14) this.b).w((bqa) go7Var, j, j2);
    }

    @Override // defpackage.nq8
    public void n(Object obj) {
        ((pq9) this.b).getClass();
    }

    @Override // defpackage.n99
    public long o() {
        return ((ByteBuffer) this.b).getInt() & 4294967295L;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraClosed() {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraDisconnected() {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraError(String str) {
        ((a4c) this.b).reportException("OKRTCSvcFactory", wg0.i("onCameraError(): ", str), new RuntimeException(wg0.i("Camera error: ", str)));
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraFreezed(String str) {
        ((a4c) this.b).log("OKRTCSvcFactory", "onCameraFreezed(): " + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String str) {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onFirstFrameAvailable() {
    }

    @Override // defpackage.at3
    public ContentInfo p() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        b76 b76Var = (b76) this.b;
        c54.p("The result can only set once!", b76Var.b == null);
        b76Var.b = lq1Var;
        return "FutureChain[" + b76Var + "]";
    }

    @Override // defpackage.at3
    public int r() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.n99
    public int readUnsignedShort() {
        return ((ByteBuffer) this.b).getShort() & 65535;
    }

    public void s(int i, boolean z) {
        rm5 rm5Var = (rm5) this.b;
        if (z) {
            rm5Var.a(i);
        } else {
            rm5Var.getClass();
        }
    }

    public void t(int i, int i2, sa4 sa4Var) throws ParserException {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        d28 d28Var = (d28) this.b;
        SparseArray sparseArray = d28Var.c;
        int i7 = 4;
        int i8 = 0;
        int i9 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (d28Var.T0 != 2) {
                    return;
                }
                b28 b28Var = (b28) sparseArray.get(d28Var.Z0);
                if (d28Var.c1 != 4 || !"V_VP9".equals(b28Var.b)) {
                    sa4Var.z(i2);
                    return;
                }
                wpa wpaVar = d28Var.A0;
                wpaVar.D(i2);
                sa4Var.h(wpaVar.a, 0, i2, false);
                return;
            }
            if (i == 16877) {
                d28Var.b(i);
                b28 b28Var2 = d28Var.H0;
                int i10 = b28Var2.g;
                if (i10 != 1685485123 && i10 != 1685480259) {
                    sa4Var.z(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                b28Var2.O = bArr;
                sa4Var.h(bArr, 0, i2, false);
                return;
            }
            if (i == 16981) {
                d28Var.b(i);
                b28 b28Var3 = d28Var.H0;
                byte[] bArr2 = new byte[i2];
                b28Var3.i = bArr2;
                sa4Var.h(bArr2, 0, i2, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                sa4Var.h(bArr3, 0, i2, false);
                d28Var.b(i);
                d28Var.H0.j = new wze(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                wpa wpaVar2 = d28Var.v0;
                Arrays.fill(wpaVar2.a, (byte) 0);
                sa4Var.h(wpaVar2.a, 4 - i2, i2, false);
                wpaVar2.G(0);
                d28Var.J0 = (int) wpaVar2.w();
                return;
            }
            if (i == 25506) {
                d28Var.b(i);
                b28 b28Var4 = d28Var.H0;
                byte[] bArr4 = new byte[i2];
                b28Var4.k = bArr4;
                sa4Var.h(bArr4, 0, i2, false);
                return;
            }
            if (i != 30322) {
                throw ParserException.a(null, "Unexpected id: " + i);
            }
            d28Var.b(i);
            b28 b28Var5 = d28Var.H0;
            byte[] bArr5 = new byte[i2];
            b28Var5.w = bArr5;
            sa4Var.h(bArr5, 0, i2, false);
            return;
        }
        int i11 = d28Var.T0;
        wpa wpaVar3 = d28Var.t0;
        if (i11 == 0) {
            yaf yafVar = d28Var.b;
            d28Var.Z0 = (int) yafVar.C(sa4Var, false, true, 8);
            d28Var.a1 = yafVar.c;
            d28Var.V0 = -9223372036854775807L;
            d28Var.T0 = 1;
            wpaVar3.D(0);
        }
        b28 b28Var6 = (b28) sparseArray.get(d28Var.Z0);
        if (b28Var6 == null) {
            sa4Var.z(i2 - d28Var.a1);
            d28Var.T0 = 0;
            return;
        }
        b28Var6.Y.getClass();
        if (d28Var.T0 == 1) {
            d28Var.f(sa4Var, 3);
            int i12 = (wpaVar3.a[2] & 6) >> 1;
            if (i12 == 0) {
                d28Var.X0 = 1;
                int[] iArr = d28Var.Y0;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                d28Var.Y0 = iArr;
                iArr[0] = (i2 - d28Var.a1) - 3;
            } else {
                d28Var.f(sa4Var, 4);
                int i13 = (wpaVar3.a[3] & 255) + 1;
                d28Var.X0 = i13;
                int[] iArr2 = d28Var.Y0;
                if (iArr2 == null) {
                    iArr2 = new int[i13];
                } else if (iArr2.length < i13) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i13)];
                }
                d28Var.Y0 = iArr2;
                if (i12 == 2) {
                    int i14 = (i2 - d28Var.a1) - 4;
                    int i15 = d28Var.X0;
                    Arrays.fill(iArr2, 0, i15, i14 / i15);
                } else {
                    if (i12 != 1) {
                        if (i12 != 3) {
                            throw ParserException.a(null, "Unexpected lacing value: " + i12);
                        }
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            int i18 = d28Var.X0 - i9;
                            if (i16 >= i18) {
                                d28Var.Y0[i18] = ((i2 - d28Var.a1) - i7) - i17;
                                break;
                            }
                            d28Var.Y0[i16] = i8;
                            int i19 = i7 + 1;
                            d28Var.f(sa4Var, i19);
                            if (wpaVar3.a[i7] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i20 = i8;
                            int i21 = 8;
                            while (true) {
                                if (i20 >= i21) {
                                    j = 0;
                                    i7 = i19;
                                    break;
                                }
                                int i22 = i9 << (7 - i20);
                                if ((wpaVar3.a[i7] & i22) != 0) {
                                    int i23 = i19 + i20;
                                    d28Var.f(sa4Var, i23);
                                    j = wpaVar3.a[i7] & 255 & (~i22);
                                    while (i19 < i23) {
                                        j = (j << 8) | (wpaVar3.a[i19] & 255);
                                        i19++;
                                        i23 = i23;
                                    }
                                    int i24 = i23;
                                    if (i16 > 0) {
                                        j -= (1 << ((i20 * 7) + 6)) - 1;
                                    }
                                    i7 = i24;
                                } else {
                                    i20++;
                                    i21 = 8;
                                    i9 = 1;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i25 = (int) j;
                            int[] iArr3 = d28Var.Y0;
                            if (i16 != 0) {
                                i25 += iArr3[i16 - 1];
                            }
                            iArr3[i16] = i25;
                            i17 += i25;
                            i16++;
                            i8 = 0;
                            i9 = 1;
                        }
                        throw ParserException.a(null, "EBML lacing sample size out of range.");
                    }
                    int i26 = 0;
                    int i27 = 0;
                    while (true) {
                        i4 = d28Var.X0 - 1;
                        if (i26 >= i4) {
                            break;
                        }
                        d28Var.Y0[i26] = 0;
                        while (true) {
                            i5 = i7 + 1;
                            d28Var.f(sa4Var, i5);
                            int i28 = wpaVar3.a[i7] & 255;
                            int[] iArr4 = d28Var.Y0;
                            i6 = iArr4[i26] + i28;
                            iArr4[i26] = i6;
                            if (i28 != 255) {
                                break;
                            } else {
                                i7 = i5;
                            }
                        }
                        i27 += i6;
                        i26++;
                        i7 = i5;
                    }
                    d28Var.Y0[i4] = ((i2 - d28Var.a1) - i7) - i27;
                }
            }
            byte[] bArr6 = wpaVar3.a;
            d28Var.U0 = d28Var.i((bArr6[1] & 255) | (bArr6[0] << 8)) + d28Var.O0;
            d28Var.b1 = (b28Var6.d == 2 || (i == 163 && (wpaVar3.a[2] & 128) == 128)) ? 1 : 0;
            d28Var.T0 = 2;
            d28Var.W0 = 0;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i == i3) {
            while (true) {
                int i29 = d28Var.W0;
                if (i29 >= d28Var.X0) {
                    d28Var.T0 = 0;
                    return;
                } else {
                    d28Var.c(b28Var6, d28Var.U0 + ((d28Var.W0 * b28Var6.e) / 1000), d28Var.b1, d28Var.j(sa4Var, b28Var6, d28Var.Y0[i29], false), 0);
                    d28Var.W0++;
                }
            }
        } else {
            while (true) {
                int i30 = d28Var.W0;
                if (i30 >= d28Var.X0) {
                    return;
                }
                int[] iArr5 = d28Var.Y0;
                iArr5[i30] = d28Var.j(sa4Var, b28Var6, iArr5[i30], true);
                d28Var.W0++;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public re6 u() {
        return new re6(8, wma.a((mi9) this.b));
    }

    @Override // defpackage.do7
    public void v(go7 go7Var, long j, long j2) {
        bqa bqaVar = (bqa) go7Var;
        y14 y14Var = (y14) this.b;
        y14Var.getClass();
        long j3 = bqaVar.a;
        Uri uri = bqaVar.o.c;
        yn7 yn7Var = new yn7(j2);
        y14Var.m.getClass();
        y14Var.q.z(yn7Var, bqaVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        i14 i14Var = (i14) bqaVar.Y;
        i14 i14Var2 = y14Var.H;
        int size = i14Var2 == null ? 0 : i14Var2.m.size();
        long j4 = i14Var.b(0).b;
        int i = 0;
        while (i < size && y14Var.H.b(i).b < j4) {
            i++;
        }
        if (i14Var.d) {
            if (size - i > i14Var.m.size()) {
                z04.c0("Loaded out of sync manifest");
            } else {
                long j5 = y14Var.N;
                if (j5 == -9223372036854775807L || i14Var.h * 1000 > j5) {
                    y14Var.M = 0;
                } else {
                    z04.c0("Loaded stale dynamic manifest: " + i14Var.h + ", " + y14Var.N);
                }
            }
            int i2 = y14Var.M;
            y14Var.M = i2 + 1;
            if (i2 < y14Var.m.p(bqaVar.c)) {
                y14Var.D.postDelayed(y14Var.v, Math.min((y14Var.M - 1) * 1000, 5000));
                return;
            } else {
                y14Var.C = new DashManifestStaleException();
                return;
            }
        }
        y14Var.H = i14Var;
        y14Var.I = i14Var.d & y14Var.I;
        y14Var.J = j - j2;
        y14Var.K = j;
        y14Var.O += i;
        synchronized (y14Var.t) {
            try {
                if (bqaVar.b.a == y14Var.F) {
                    Uri uri2 = y14Var.H.k;
                    if (uri2 == null) {
                        uri2 = bqaVar.o.c;
                    }
                    y14Var.F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i14 i14Var3 = y14Var.H;
        if (!i14Var3.d || y14Var.L != -9223372036854775807L) {
            y14Var.y(true);
            return;
        }
        bdb bdbVar = i14Var3.i;
        if (bdbVar == null) {
            y14Var.v();
            return;
        }
        String str = (String) bdbVar.b;
        if (oaf.a(str, "urn:mpeg:dash:utc:direct:2014") || oaf.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                y14Var.L = oaf.V((String) bdbVar.c) - y14Var.K;
                y14Var.y(true);
                return;
            } catch (ParserException e) {
                y14Var.x(e);
                return;
            }
        }
        if (oaf.a(str, "urn:mpeg:dash:utc:http-iso:2014") || oaf.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            bqa bqaVar2 = new bqa(y14Var.z, Uri.parse((String) bdbVar.c), 5, new w14());
            y14Var.q.F(new yn7(bqaVar2.a, bqaVar2.b, y14Var.A.v(bqaVar2, new w4d(11, y14Var), 1)), bqaVar2.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (oaf.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || oaf.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            bqa bqaVar3 = new bqa(y14Var.z, Uri.parse((String) bdbVar.c), 5, new oz7());
            y14Var.q.F(new yn7(bqaVar3.a, bqaVar3.b, y14Var.A.v(bqaVar3, new w4d(11, y14Var), 1)), bqaVar3.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (oaf.a(str, "urn:mpeg:dash:utc:ntp:2014") || oaf.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            y14Var.v();
        } else {
            y14Var.x(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public void x(int i, long j) throws ParserException {
        d28 d28Var = (d28) this.b;
        d28Var.getClass();
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                d28Var.b(i);
                d28Var.H0.d = (int) j;
                return;
            case 136:
                d28Var.b(i);
                d28Var.H0.W = j == 1;
                return;
            case 155:
                d28Var.V0 = d28Var.i(j);
                return;
            case 159:
                d28Var.b(i);
                d28Var.H0.P = (int) j;
                return;
            case 176:
                d28Var.b(i);
                d28Var.H0.m = (int) j;
                return;
            case 179:
                d28Var.a(i);
                d28Var.P0.a(d28Var.i(j));
                return;
            case 186:
                d28Var.b(i);
                d28Var.H0.n = (int) j;
                return;
            case 215:
                d28Var.b(i);
                d28Var.H0.c = (int) j;
                return;
            case 231:
                d28Var.O0 = d28Var.i(j);
                return;
            case 238:
                d28Var.c1 = (int) j;
                return;
            case 241:
                if (d28Var.R0) {
                    return;
                }
                d28Var.a(i);
                d28Var.Q0.a(j);
                d28Var.R0 = true;
                return;
            case 251:
                d28Var.d1 = true;
                return;
            case 16871:
                d28Var.b(i);
                d28Var.H0.g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                d28Var.K0 = j + d28Var.D0;
                return;
            case 21432:
                int i2 = (int) j;
                d28Var.b(i);
                if (i2 == 0) {
                    d28Var.H0.x = 0;
                    return;
                }
                if (i2 == 1) {
                    d28Var.H0.x = 2;
                    return;
                } else if (i2 == 3) {
                    d28Var.H0.x = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    d28Var.H0.x = 3;
                    return;
                }
            case 21680:
                d28Var.b(i);
                d28Var.H0.p = (int) j;
                return;
            case 21682:
                d28Var.b(i);
                d28Var.H0.r = (int) j;
                return;
            case 21690:
                d28Var.b(i);
                d28Var.H0.q = (int) j;
                return;
            case 21930:
                d28Var.b(i);
                d28Var.H0.V = j == 1;
                return;
            case 21938:
                d28Var.b(i);
                b28 b28Var = d28Var.H0;
                b28Var.y = true;
                b28Var.o = (int) j;
                return;
            case 21998:
                d28Var.b(i);
                d28Var.H0.f = (int) j;
                return;
            case 22186:
                d28Var.b(i);
                d28Var.H0.S = j;
                return;
            case 22203:
                d28Var.b(i);
                d28Var.H0.T = j;
                return;
            case 25188:
                d28Var.b(i);
                d28Var.H0.Q = (int) j;
                return;
            case 30114:
                d28Var.e1 = j;
                return;
            case 30321:
                d28Var.b(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    d28Var.H0.s = 0;
                    return;
                }
                if (i3 == 1) {
                    d28Var.H0.s = 1;
                    return;
                } else if (i3 == 2) {
                    d28Var.H0.s = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    d28Var.H0.s = 3;
                    return;
                }
            case 2352003:
                d28Var.b(i);
                d28Var.H0.e = (int) j;
                return;
            case 2807729:
                d28Var.E0 = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        d28Var.b(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            d28Var.H0.B = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            d28Var.H0.B = 1;
                            return;
                        }
                    case 21946:
                        d28Var.b(i);
                        int i5 = i63.i((int) j);
                        if (i5 != -1) {
                            d28Var.H0.A = i5;
                            return;
                        }
                        return;
                    case 21947:
                        d28Var.b(i);
                        d28Var.H0.y = true;
                        int iH = i63.h((int) j);
                        if (iH != -1) {
                            d28Var.H0.z = iH;
                            return;
                        }
                        return;
                    case 21948:
                        d28Var.b(i);
                        d28Var.H0.C = (int) j;
                        return;
                    case 21949:
                        d28Var.b(i);
                        d28Var.H0.D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void y() {
        hm9.p(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontFailed", null);
        ((LoadEmojiFontWorker) this.b).state = new rn7();
    }

    @Override // defpackage.vg1
    public PointF z() {
        return ((xg1) this.b).s0;
    }

    public /* synthetic */ wd6(int i, boolean z) {
        this.a = i;
    }

    public wd6(yxc yxcVar) {
        this.a = 9;
        this.b = new sy4(9, yxcVar);
    }

    public wd6(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new rm5(1);
                break;
            case 2:
                this.b = "com.google.android.gms.org.conscrypt";
                break;
            case 4:
                this.b = new CopyOnWriteArrayList();
                break;
            case 7:
                this.b = mi9.b();
                break;
            case 13:
                this.b = (SmallDisplaySizeQuirk) zi4.a.e(SmallDisplaySizeQuirk.class);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                this.b = new wpa(10);
                break;
            case 25:
                this.b = new LinkedHashSet();
                break;
            case 28:
                this.b = new b46();
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public wd6(ByteBuffer byteBuffer) {
        this.a = 22;
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public wd6(ContentInfo contentInfo) {
        this.a = 10;
        contentInfo.getClass();
        this.b = m30.m(contentInfo);
    }
}

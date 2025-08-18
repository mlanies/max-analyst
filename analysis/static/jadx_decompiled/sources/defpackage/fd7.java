package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.util.Size;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.recyclerview.widget.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import org.apache.http.util.LangUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes2.dex */
public final class fd7 implements lv, ri0, a76, ckf, oy1, lo7, pr7, JavaAudioDeviceModule.AudioRecordSampleHook, xha, hmf, a24 {
    public Object a;

    public /* synthetic */ fd7(Object obj) {
        this.a = obj;
    }

    public static fd7 H(wpa wpaVar) {
        String str;
        wpaVar.H(2);
        int iU = wpaVar.u();
        int i = iU >> 1;
        int iU2 = ((wpaVar.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iU2 >= 10 ? "." : ".0");
        sb.append(iU2);
        return new fd7(sb.toString());
    }

    public static eb0 K(qa0 qa0Var) throws ImageCaptureException {
        eb0 eb0Var = qa0Var.a;
        ov6 ov6Var = (ov6) eb0Var.a;
        Rect rect = eb0Var.e;
        try {
            byte[] bArrH0 = f46.h0(ov6Var, rect, qa0Var.b, eb0Var.f);
            try {
                p55 p55Var = new p55(new c65(new ByteArrayInputStream(bArrH0)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                RectF rectF = e1f.a;
                Matrix matrix = new Matrix(eb0Var.g);
                matrix.postTranslate(-rect.left, -rect.top);
                return new eb0(bArrH0, p55Var, 256, size, rect2, eb0Var.f, matrix, eb0Var.h);
            } catch (IOException e) {
                throw new ImageCaptureException("Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil$CodecFailedException e2) {
            throw new ImageCaptureException("Failed to encode the image to JPEG.", e2);
        }
    }

    @Override // defpackage.a24
    public boolean A() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.text.StaticLayout B(java.lang.CharSequence r19, android.text.TextPaint r20, int r21, android.text.Layout.Alignment r22, boolean r23, android.text.TextUtils.TruncateAt r24, int r25) {
        /*
            r18 = this;
            r1 = r19
            r0 = r18
            java.lang.Object r0 = r0.a
            r2 = r0
            o45 r2 = (defpackage.o45) r2
            java.lang.String r3 = "fd7"
            r4 = 0
            r15 = r1
            r16 = r4
        Lf:
            int r0 = r15.length()     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.IndexOutOfBoundsException -> L46
            if (r16 == 0) goto L18
            r6 = r0
            r7 = r4
            goto L1a
        L18:
            r7 = r0
            r6 = r4
        L1a:
            if (r16 == 0) goto L27
            zoe r0 = defpackage.bpe.e     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.IndexOutOfBoundsException -> L23
            goto L29
        L1f:
            r0 = move-exception
            r17 = r15
            goto L4a
        L23:
            r0 = move-exception
            r5 = r15
            goto L9a
        L27:
            zoe r0 = defpackage.bpe.c     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.IndexOutOfBoundsException -> L46
        L29:
            r5 = r15
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r21
            r14 = r25
            r17 = r15
            r15 = r0
            android.text.StaticLayout r0 = defpackage.oag.w(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.IllegalArgumentException -> L40 java.lang.IndexOutOfBoundsException -> L42
            return r0
        L40:
            r0 = move-exception
            goto L4a
        L42:
            r0 = move-exception
        L43:
            r5 = r17
            goto L9a
        L46:
            r0 = move-exception
            r17 = r15
            goto L43
        L4a:
            java.lang.String r5 = "seems we work with RTL text"
            defpackage.hm9.p(r3, r5, r0)
            java.lang.String r5 = r0.getMessage()
            if (r5 != 0) goto L57
            java.lang.String r5 = ""
        L57:
            if (r16 != 0) goto L86
            java.lang.String r6 = "fromIndex"
            boolean r6 = defpackage.w9e.p0(r5, r6, r4)
            if (r6 == 0) goto L86
            java.lang.String r6 = "toIndex"
            boolean r5 = defpackage.w9e.p0(r5, r6, r4)
            if (r5 == 0) goto L86
            if (r2 == 0) goto L81
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r5 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "check range exception: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r0)
            defpackage.o45.b(r2, r5)
        L81:
            r16 = 1
            r15 = r17
            goto Lf
        L86:
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r2 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "unknown: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L9a:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 != 0) goto Lbf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Hit bug #35412, retrying with Spannables removed: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            defpackage.hm9.p(r3, r6, r0)
            if (r2 == 0) goto Lb9
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r7 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            r7.<init>(r6, r0)
            defpackage.o45.b(r2, r7)
        Lb9:
            java.lang.String r15 = r5.toString()
            goto Lf
        Lbf:
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r2 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "strange: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd7.B(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, boolean, android.text.TextUtils$TruncateAt, int):android.text.StaticLayout");
    }

    @Override // defpackage.a24
    public long C() {
        return 0L;
    }

    @Override // defpackage.a24
    public long D(long j) {
        return 1L;
    }

    @Override // defpackage.a24
    public long E(long j, long j2) {
        return 1L;
    }

    public o43 F(int i) {
        return ((wn0) ((te) this.a).b).f(i);
    }

    public void G(String str) {
        hm9.k(((e3) this.a).e, str);
    }

    @Override // defpackage.xha
    public void I(yha yhaVar) {
        ((ulb) ((amb) this.a)).b.invoke(yhaVar);
    }

    public eb0 J(qa0 qa0Var, int i) {
        byte[] bArrCopyOfRange;
        byte b;
        eb0 eb0Var = qa0Var.a;
        ov6 ov6Var = (ov6) eb0Var.a;
        int i2 = 0;
        if (((IncorrectJpegMetadataQuirk) ((qqd) this.a).b) == null) {
            ByteBuffer byteBufferT = ov6Var.v()[0].t();
            bArrCopyOfRange = new byte[byteBufferT.capacity()];
            byteBufferT.rewind();
            byteBufferT.get(bArrCopyOfRange);
        } else {
            ByteBuffer byteBufferT2 = ov6Var.v()[0].t();
            int iCapacity = byteBufferT2.capacity();
            byte[] bArr = new byte[iCapacity];
            byteBufferT2.rewind();
            byteBufferT2.get(bArr);
            int i3 = 2;
            for (int i4 = 2; i4 + 4 <= iCapacity && (b = bArr[i4]) == -1; i4 += (((bArr[i4 + 2] & 255) << 8) | (bArr[i4 + 3] & 255)) + 2) {
                if (b == -1 && bArr[i4 + 1] == -38) {
                    break;
                }
            }
            while (true) {
                int i5 = i3 + 1;
                if (i5 > iCapacity) {
                    i2 = -1;
                    break;
                }
                if (bArr[i3] == -1 && bArr[i5] == -40) {
                    i2 = i3;
                    break;
                }
                i3 = i5;
            }
            bArrCopyOfRange = i2 != -1 ? Arrays.copyOfRange(bArr, i2, byteBufferT2.limit()) : bArr;
        }
        byte[] bArr2 = bArrCopyOfRange;
        p55 p55Var = eb0Var.b;
        Objects.requireNonNull(p55Var);
        return new eb0(bArr2, p55Var, i, eb0Var.d, eb0Var.e, eb0Var.f, eb0Var.g, eb0Var.h);
    }

    public void L(Object obj) {
        boolean z = obj instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.a;
        if (!z) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }

    public oq1 M(Object obj) {
        kq0.e();
        return f8.g(new y98(this, 19, obj));
    }

    @Override // defpackage.a76
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.a24
    public long b(long j) {
        return 0L;
    }

    @Override // defpackage.lo7
    public void c() throws IOException {
        y14 y14Var = (y14) this.a;
        y14Var.A.c();
        DashManifestStaleException dashManifestStaleException = y14Var.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        synchronized (((sz1) this.a).a) {
            try {
                ((sz1) this.a).d.p();
                int iS = au1.s(((sz1) this.a).i);
                if ((iS == 3 || iS == 5 || iS == 6) && !(th instanceof CancellationException)) {
                    sz1 sz1Var = (sz1) this.a;
                    int i = sz1Var.i;
                    sz1Var.d();
                }
            } finally {
            }
        }
    }

    @Override // defpackage.ckf
    public void e() {
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        if (ChatMediaViewerScreen.v0(chatMediaViewerScreen)) {
            chatMediaViewerScreen.E0(true);
            yk8 yk8Var = chatMediaViewerScreen.A0;
            if (yk8Var != null) {
                yk8Var.b(5);
            }
        }
    }

    @Override // defpackage.pr7
    public void f() {
        try {
            ((qj3) this.a).accept(Boolean.TRUE);
        } catch (Throwable th) {
            hm9.p("nr7", "checkLocationSettingsAndPermissions", th);
        }
    }

    @Override // defpackage.pr7
    public void g(Exception exc) {
        try {
            ((qj3) this.a).accept(Boolean.FALSE);
        } catch (Throwable th) {
            hm9.p("nr7", "checkLocationSettingsAndPermissions", th);
        }
    }

    @Override // defpackage.ckf
    public void h() {
        yk8 yk8Var;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (!ChatMediaViewerScreen.v0(chatMediaViewerScreen) || (yk8Var = chatMediaViewerScreen.A0) == null) {
            return;
        }
        yk8Var.b(2);
    }

    @Override // defpackage.lv
    public e5f h0(long j, List list) {
        ((ua3) ((ta3) this.a)).makeCompleting$kotlinx_coroutines_core(list);
        return e5f.a;
    }

    @Override // defpackage.ckf
    public void i() {
        yk8 yk8Var;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        if (chatMediaViewerScreen.B0().b() && ChatMediaViewerScreen.v0(chatMediaViewerScreen) && (yk8Var = chatMediaViewerScreen.A0) != null) {
            yk8Var.b(3);
        }
    }

    @Override // defpackage.a24
    public long j(long j, long j2) {
        return j2;
    }

    @Override // defpackage.a24
    public long k(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.hmf
    public int l(View view) {
        pdc pdcVar = (pdc) view.getLayoutParams();
        ((a) this.a).getClass();
        return a.B(view) - ((ViewGroup.MarginLayoutParams) pdcVar).leftMargin;
    }

    @Override // defpackage.a24
    public long m(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.a24
    /* renamed from: n */
    public r4c mo7n(long j) {
        return (r4c) this.a;
    }

    @Override // defpackage.ckf
    public void o() {
        yk8 yk8Var;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (!ChatMediaViewerScreen.v0(chatMediaViewerScreen) || (yk8Var = chatMediaViewerScreen.A0) == null) {
            return;
        }
        yk8Var.b(2);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordSampleHook
    public void onWebRtcAudioRecordSamplesReady(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        uoa soaVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i == 2) {
            soaVar = new soa(i5 >> 1, i4, 0, bArr);
        } else if (i == 3) {
            soaVar = new soa(i5, i4, 1, bArr);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(wg0.g(i, "Audio format ", " is not supported. Please, use PCM 8 bit / 16 bit / float"));
            }
            soaVar = new toa(bArr, i4, i5);
        }
        Iterator it = ((CopyOnWriteArraySet) this.a).iterator();
        while (it.hasNext()) {
            tag tagVar = (tag) it.next();
            if (tagVar.c < jElapsedRealtime) {
                tagVar.c = tagVar.b + jElapsedRealtime;
                tagVar.a.onSample(i, i2, i3, soaVar);
            }
        }
    }

    @Override // defpackage.hmf
    public int p() {
        return ((a) this.a).J();
    }

    @Override // defpackage.oy1
    public void q(Typeface typeface) {
        s53 s53Var = (s53) this.a;
        if (s53Var.m(typeface)) {
            s53Var.i(false);
        }
    }

    @Override // defpackage.hmf
    public int r() {
        a aVar = (a) this.a;
        return aVar.n - aVar.K();
    }

    @Override // defpackage.ri0
    public void s(ph3 ph3Var) {
        boolean z = ph3Var.b == 0;
        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) this.a;
        if (z) {
            aVar.k(null, aVar.H0);
            return;
        }
        gpf gpfVar = aVar.z0;
        if (gpfVar != null) {
            ((he6) gpfVar.a).k(ph3Var);
        }
    }

    @Override // defpackage.hmf
    public View t(int i) {
        return ((a) this.a).v(i);
    }

    @Override // defpackage.a24
    public long v(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.hmf
    public int w(View view) {
        pdc pdcVar = (pdc) view.getLayoutParams();
        ((a) this.a).getClass();
        return a.E(view) + ((ViewGroup.MarginLayoutParams) pdcVar).rightMargin;
    }

    @Override // defpackage.ckf
    public void x() {
        yk8 yk8Var;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (!ChatMediaViewerScreen.v0(chatMediaViewerScreen) || (yk8Var = chatMediaViewerScreen.A0) == null) {
            return;
        }
        yk8Var.b(2);
    }

    @Override // defpackage.ckf
    public void y(boolean z) {
        yk8 yk8Var;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        if (!ChatMediaViewerScreen.v0(chatMediaViewerScreen) || (yk8Var = chatMediaViewerScreen.A0) == null) {
            return;
        }
        yk8Var.b(z ? 3 : 2);
    }

    @Override // defpackage.ckf
    public void y0() {
        yk8 yk8Var;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        if (!ChatMediaViewerScreen.v0(chatMediaViewerScreen) || (yk8Var = chatMediaViewerScreen.A0) == null) {
            return;
        }
        yk8Var.b(4);
    }

    public Object z(Object obj) throws Exception {
        eb0 eb0VarK;
        qa0 qa0Var = (qa0) obj;
        eb0 eb0Var = qa0Var.a;
        try {
            int i = eb0Var.c;
            Object obj2 = eb0Var.a;
            if (i == 35) {
                eb0VarK = K(qa0Var);
            } else {
                if (i != 256 && i != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + i);
                }
                eb0VarK = J(qa0Var, i);
            }
            ((ov6) obj2).close();
            return eb0VarK;
        } catch (Throwable th) {
            ((ov6) eb0Var.a).close();
            throw th;
        }
    }

    public fd7(bj6 bj6Var, int i) {
        switch (i) {
            case LangUtils.HASH_SEED /* 17 */:
                this.a = new qqd(bj6Var);
                break;
            default:
                this.a = (CaptureSessionOnClosedNotCalledQuirk) bj6Var.e(CaptureSessionOnClosedNotCalledQuirk.class);
                break;
        }
    }

    public fd7(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }
}

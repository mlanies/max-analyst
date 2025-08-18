package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.media3.transformer.ExportException;
import androidx.work.WorkRequest;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* loaded from: classes2.dex */
public final class qqd implements nr8, ah9, pic, l71, a76, q78, qj3, e8, hwa, z66, do7, w2e, ebe {
    public final /* synthetic */ int a;
    public Object b;

    public qqd(int i, byte b) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new HashMap();
                break;
            case LangUtils.HASH_SEED /* 17 */:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
            case 26:
                this.b = new b46();
                break;
            case 29:
                this.b = dp3.c;
                break;
        }
    }

    public void A(Object obj, String str) {
        HashMap map = (HashMap) this.b;
        if (obj == null) {
            map.put(str, null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
            map.put(str, obj);
            return;
        }
        int i = 0;
        if (cls == boolean[].class) {
            boolean[] zArr = (boolean[]) obj;
            d24 d24Var = d24.b;
            Boolean[] boolArr = new Boolean[zArr.length];
            while (i < zArr.length) {
                boolArr[i] = Boolean.valueOf(zArr[i]);
                i++;
            }
            map.put(str, boolArr);
            return;
        }
        if (cls == byte[].class) {
            byte[] bArr = (byte[]) obj;
            d24 d24Var2 = d24.b;
            Byte[] bArr2 = new Byte[bArr.length];
            while (i < bArr.length) {
                bArr2[i] = Byte.valueOf(bArr[i]);
                i++;
            }
            map.put(str, bArr2);
            return;
        }
        if (cls == int[].class) {
            int[] iArr = (int[]) obj;
            d24 d24Var3 = d24.b;
            Integer[] numArr = new Integer[iArr.length];
            while (i < iArr.length) {
                numArr[i] = Integer.valueOf(iArr[i]);
                i++;
            }
            map.put(str, numArr);
            return;
        }
        if (cls == long[].class) {
            long[] jArr = (long[]) obj;
            d24 d24Var4 = d24.b;
            Long[] lArr = new Long[jArr.length];
            while (i < jArr.length) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            map.put(str, lArr);
            return;
        }
        if (cls == float[].class) {
            float[] fArr = (float[]) obj;
            d24 d24Var5 = d24.b;
            Float[] fArr2 = new Float[fArr.length];
            while (i < fArr.length) {
                fArr2[i] = Float.valueOf(fArr[i]);
                i++;
            }
            map.put(str, fArr2);
            return;
        }
        if (cls != double[].class) {
            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
        }
        double[] dArr = (double[]) obj;
        d24 d24Var6 = d24.b;
        Double[] dArr2 = new Double[dArr.length];
        while (i < dArr.length) {
            dArr2[i] = Double.valueOf(dArr[i]);
            i++;
        }
        map.put(str, dArr2);
    }

    public void B(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            A(entry.getValue(), (String) entry.getKey());
        }
    }

    @Override // defpackage.do7
    public b11 C(go7 go7Var, long j, long j2, IOException iOException, int i) {
        bkg bkgVar = (bkg) this.b;
        if (bkgVar != null) {
            ((y14) bkgVar.b).x(iOException);
        }
        return vq7.Y;
    }

    public void D(String str, boolean z) {
        ((HashMap) this.b).put(str, Boolean.valueOf(z));
    }

    public void E(long j, String str) {
        ((HashMap) this.b).put(str, Long.valueOf(j));
    }

    public void F(String str, String str2) {
        ((HashMap) this.b).put(str, str2);
    }

    public Iterator G() {
        return ((Iterable) this.b).iterator();
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        qy5 qy5Var;
        switch (this.a) {
            case 7:
                ys5 ys5Var = (ys5) obj;
                if (ys5Var != null) {
                    ((lw1) this.b).w.i(Integer.valueOf(ys5Var.a ? 2 : 3));
                    break;
                }
                break;
            default:
                Bitmap bitmap = (Bitmap) obj;
                ((xt6) this.b).h = 50;
                ny5 ny5Var = new ny5();
                ny5Var.t = bitmap.getHeight();
                ny5Var.s = bitmap.getWidth();
                ny5Var.m = ia9.l("image/raw");
                ny5Var.z = i63.i;
                qy5 qy5Var2 = new qy5(ny5Var);
                if (((xt6) this.b).a && oaf.a >= 34 && bitmap.hasGainmap()) {
                    ny5 ny5VarA = qy5Var2.a();
                    ny5VarA.m = ia9.l("image/jpeg_r");
                    qy5Var = new qy5(ny5VarA);
                } else {
                    qy5Var = qy5Var2;
                }
                try {
                    ((xt6) this.b).d.g(2, qy5Var2);
                    ((xt6) this.b).e.submit(new v05(this, bitmap, qy5Var, 8));
                    break;
                } catch (RuntimeException e) {
                    ((xt6) this.b).d.d(ExportException.a(e, 1000));
                }
                break;
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        List<lp4> list = (List) obj;
        mp4 mp4Var = (mp4) this.b;
        mp4Var.getClass();
        hm9.n(mp4.g, zr6.h(list.size(), "startUploads: count = "));
        for (lp4 lp4Var : list) {
            bc7 bc7Var = mp4.f[1];
            dg5 dg5Var = (dg5) mp4Var.c.get();
            dg5Var.getClass();
            StringBuilder sb = new StringBuilder("UploadDraftMediaWorker/");
            ep4 ep4Var = lp4Var.a;
            sb.append(ep4Var.a);
            sb.append(":");
            String str = ep4Var.b;
            sb.append(str);
            String string = sb.toString();
            qla qlaVar = (qla) ((qla) ((qla) new qla(UploadDraftMediaWorker.class).setConstraints(new kj3(2, false, false, false, false, -1L, -1L, x53.H0(new LinkedHashSet())))).setExpedited(jna.a)).setBackoffCriteria(mf0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
            HashMap map = new HashMap();
            map.put("workName", string);
            map.put(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(ep4Var.a));
            map.put("attachLocalId", str);
            map.put("draft.path", lp4Var.b);
            map.put("draft.lastModified", Long.valueOf(lp4Var.c));
            map.put("draft.uploadType", h4f.r(lp4Var.d));
            ref refVar = lp4Var.e;
            if (refVar != null) {
                map.put("draft.videoConvertOptions", true);
                map.put("draft.videoConvertOptions.quality", refVar.a.name());
                map.put("draft.videoConvertOptions.startTrimPosition", Float.valueOf(refVar.b));
                map.put("draft.videoConvertOptions.endTrimPosition", Float.valueOf(refVar.c));
                map.put("draft.videoConvertOptions.mute", Boolean.valueOf(refVar.d));
            }
            d24 d24Var = new d24(map);
            d24.f(d24Var);
            rla rlaVar = (rla) ((qla) qlaVar.setInputData(d24Var)).build();
            dg5Var.a.b(string, h65.b, rlaVar, false).l();
        }
    }

    @Override // defpackage.hwa
    public void b() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr = GifViewerWidget.u0;
                GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
                gifViewerWidget.r0().B(gifViewerWidget.n0(), gifViewerWidget.m0());
                break;
            default:
                bc7[] bc7VarArr2 = PhotoViewerWidget.X;
                PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.b;
                photoViewerWidget.p0().B(photoViewerWidget.n0(), photoViewerWidget.m0());
                break;
        }
    }

    @Override // defpackage.nr8
    public void c(wq8 wq8Var, boolean z) {
        if (wq8Var instanceof qae) {
            ((qae) wq8Var).K0.k().c(false);
        }
        nr8 nr8Var = ((e7) this.b).X;
        if (nr8Var != null) {
            nr8Var.c(wq8Var, z);
        }
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        switch (this.a) {
            case 7:
                if (!(th instanceof CameraControl$OperationCanceledException)) {
                    ((lw1) this.b).w.i(4);
                    break;
                }
                break;
            default:
                ((xt6) this.b).d.d(ExportException.a(th, 2000));
                break;
        }
    }

    @Override // defpackage.pic
    public void e(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            ((qn0) this.b).a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }

    @Override // defpackage.hwa
    public void f() {
        jwa jwaVar;
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr = GifViewerWidget.u0;
                Object targetController = ((GifViewerWidget) this.b).getTargetController();
                jwaVar = targetController instanceof jwa ? (jwa) targetController : null;
                if (jwaVar != null) {
                    ((ChatMediaViewerScreen) jwaVar).G0(false);
                    break;
                }
                break;
            default:
                Object targetController2 = ((PhotoViewerWidget) this.b).getTargetController();
                jwaVar = targetController2 instanceof jwa ? (jwa) targetController2 : null;
                if (jwaVar != null) {
                    ((ChatMediaViewerScreen) jwaVar).G0(false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.w2e
    public void g(z2e z2eVar) {
    }

    @Override // defpackage.ah9
    public void h() {
        ((i50) this.b).h();
    }

    @Override // defpackage.q78
    public s78 i(o78 o78Var) {
        Context context;
        int i = oaf.a;
        if (i < 23 || (i < 31 && ((context = (Context) this.b) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new yb9().i(o78Var);
        }
        int iG = ia9.g(o78Var.c.n);
        z04.J("Creating an asynchronous MediaCodec adapter for track type " + oaf.H(iG));
        td tdVar = new td(iG);
        tdVar.b = true;
        return tdVar.i(o78Var);
    }

    @Override // defpackage.ah9
    public void j() {
    }

    @Override // defpackage.w2e
    public void k(z2e z2eVar) {
        bc7[] bc7VarArr = StickerSetBottomSheet.A0;
        ((i3e) ((StickerSetBottomSheet) this.b).s0.getValue()).s(z2eVar.a);
    }

    @Override // defpackage.ah9
    public void l() {
        ((i50) this.b).h();
    }

    @Override // defpackage.do7
    public void m(go7 go7Var, long j, long j2, boolean z) {
    }

    @Override // defpackage.hwa
    public void n() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr = GifViewerWidget.u0;
                GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
                gifViewerWidget.r0().z(gifViewerWidget.n0(), gifViewerWidget.m0());
                break;
            default:
                bc7[] bc7VarArr2 = PhotoViewerWidget.X;
                PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.b;
                photoViewerWidget.p0().z(photoViewerWidget.n0(), photoViewerWidget.m0());
                break;
        }
    }

    @Override // defpackage.nr8
    public boolean o(wq8 wq8Var) {
        e7 e7Var = (e7) this.b;
        if (wq8Var == e7Var.c) {
            return false;
        }
        ((qae) wq8Var).L0.getClass();
        e7Var.getClass();
        nr8 nr8Var = e7Var.X;
        if (nr8Var != null) {
            return nr8Var.o(wq8Var);
        }
        return false;
    }

    public d24 p() {
        d24 d24Var = new d24((HashMap) this.b);
        d24.f(d24Var);
        return d24Var;
    }

    @Override // defpackage.ah9
    public void q() {
    }

    @Override // defpackage.ah9
    public void r() {
        ((i50) this.b).h();
    }

    @Override // defpackage.ah9
    public void s() {
        i50 i50Var = (i50) this.b;
        Long l = (Long) i50Var.Z;
        ch9 ch9Var = (ch9) i50Var.c;
        long jL = ((uh9) ch9Var).l();
        if (l != null && l.longValue() == jL) {
            return;
        }
        if (((Long) i50Var.Z) == null) {
            i50Var.Z = Long.valueOf(((uh9) ch9Var).l());
        }
        if (i50Var.b) {
            return;
        }
        ((kld) i50Var.o).g(new g50(new eqe(oea.a)));
        i50Var.h();
    }

    @Override // defpackage.ah9
    public void t() {
        i50 i50Var = (i50) this.b;
        i50Var.h();
        ((kld) i50Var.o).g(f50.a);
    }

    public void u(ru6 ru6Var, long j) {
        Bitmap underlyingBitmap;
        CloseableStaticBitmap closeableStaticBitmap = ru6Var instanceof CloseableStaticBitmap ? (CloseableStaticBitmap) ru6Var : null;
        if (closeableStaticBitmap == null || (underlyingBitmap = closeableStaticBitmap.getUnderlyingBitmap()) == null) {
            return;
        }
        ((yd) ((uuc) this.b)).c(new oo0(underlyingBitmap, 0), j + ".jpg");
    }

    @Override // defpackage.do7
    public void v(go7 go7Var, long j, long j2) {
        boolean z;
        bkg bkgVar = (bkg) this.b;
        if (bkgVar != null) {
            synchronized (tu0.i) {
                z = tu0.j;
            }
            if (z) {
                bkgVar.p();
            } else {
                ((y14) bkgVar.b).x(new IOException(new ConcurrentModificationException()));
            }
        }
    }

    public Pattern w(String str) {
        Object obj;
        sh0 sh0Var = (sh0) this.b;
        synchronized (sh0Var) {
            obj = ((rec) sh0Var.c).get(str);
        }
        Pattern patternCompile = (Pattern) obj;
        if (patternCompile == null) {
            patternCompile = Pattern.compile(str);
            sh0 sh0Var2 = (sh0) this.b;
            synchronized (sh0Var2) {
                ((rec) sh0Var2.c).put(str, patternCompile);
            }
        }
        return patternCompile;
    }

    @Override // defpackage.e8
    public void x(Object obj) {
        d8 d8Var = (d8) obj;
        c cVar = (c) this.b;
        i16 i16Var = (i16) cVar.F.pollLast();
        if (i16Var == null) {
            return;
        }
        a aVarC = cVar.c.c(i16Var.a);
        if (aVarC == null) {
            return;
        }
        aVarC.s0(i16Var.b, d8Var.a, d8Var.b);
    }

    public Object y(Object obj) {
        return ((Thread) obj).getState();
    }

    public void z(Exception exc) {
        z04.v("Audio sink error", exc);
        qz7 qz7Var = ((v78) this.b).R1;
        Handler handler = (Handler) qz7Var.b;
        if (handler != null) {
            handler.post(new w60(qz7Var, exc, 1));
        }
    }

    public /* synthetic */ qqd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public qqd(int i) {
        this.a = 21;
        sh0 sh0Var = new sh0((char) 0, 16);
        sh0Var.b = i;
        sh0Var.c = new rec(sh0Var, ((i * 4) / 3) + 1);
        this.b = sh0Var;
    }

    public qqd(bj6 bj6Var) {
        this.a = 16;
        this.b = (IncorrectJpegMetadataQuirk) bj6Var.e(IncorrectJpegMetadataQuirk.class);
    }
}

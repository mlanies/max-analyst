package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.fragment.app.b;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.crop.FrgTamCropImage;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.messages.settings.FrgMediaSettings;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class z16 implements w56, fnb, y2a, qj3, fu3, d7b, grd, mq1, s0a, b7b, cw7, m88, n88, fa8, lde, rj8, pj3, pj8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z16(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        int contentHeight;
        FrgLocalVideo frgLocalVideo = (FrgLocalVideo) this.b;
        b bVarB0 = frgLocalVideo.b0();
        if (bVarB0 == null) {
            contentHeight = 0;
        } else {
            int iA = fk4.a(bVarB0);
            if (bVarB0 instanceof ActLocalMedias) {
                ActLocalMedias actLocalMedias = (ActLocalMedias) bVarB0;
                dl9 dl9Var = actLocalMedias.j1;
                if (dl9Var != null) {
                    contentHeight = actLocalMedias.f1.getContentHeight() + ((View) dl9Var.c).getHeight();
                } else {
                    contentHeight = actLocalMedias.f1.getContentHeight();
                }
            } else {
                contentHeight = iA;
            }
        }
        Rect rect = new Rect(x6gVar.b(), x6gVar.d(), x6gVar.c(), contentHeight);
        wk9 wk9Var = frgLocalVideo.J1;
        if (wk9Var != null) {
            wk9Var.A(rect);
        }
        return x6gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m88, defpackage.n88
    public int a(Object obj) {
        switch (this.a) {
            case 19:
                try {
                    return ((x78) obj).c((oy5) this.b) ? 1 : 0;
                } catch (MediaCodecUtil$DecoderQueryException unused) {
                    return -1;
                }
            default:
                y78 y78Var = (y78) obj;
                y78Var.getClass();
                qy5 qy5Var = (qy5) this.b;
                String str = qy5Var.n;
                String str2 = y78Var.b;
                return ((str2.equals(str) || str2.equals(p88.b(qy5Var))) == true && y78Var.c(qy5Var, false)) ? 1 : 0;
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 4:
                zl4 zl4Var = (zl4) obj;
                FrgMediaSettings frgMediaSettings = (FrgMediaSettings) obj2;
                if (frgMediaSettings.y1 == null) {
                    frgMediaSettings.y1 = new hc3();
                }
                frgMediaSettings.y1.a(zl4Var);
                break;
            case 5:
                FrgTamCropImage frgTamCropImage = (FrgTamCropImage) obj2;
                q5 q5VarG1 = frgTamCropImage.g1();
                if (q5VarG1 != null) {
                    q5VarG1.setResult(0);
                    int i = jpc.E;
                    Handler handler = a14.i;
                    a14.N(0, q5VarG1, q5VarG1.getString(i));
                    frgTamCropImage.e1();
                    break;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((ml0) obj2).e((List) obj);
                break;
            case 13:
                hm9.r("dq7", (Throwable) obj, "loadThumbnail: %d, thumbnailUri validate error", Long.valueOf(((dq7) obj2).X.b));
                break;
            case 25:
                ((x4b) obj).m((Surface) obj2);
                break;
            default:
                ((ts8) obj2).M(((Integer) obj).intValue());
                break;
        }
    }

    @Override // defpackage.w56, defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 0:
                jze jzeVar = (jze) obj;
                ((e26) this.b).getClass();
                return jzeVar;
            default:
                kze kzeVar = (kze) obj;
                ((f26) this.b).getClass();
                return kzeVar;
        }
    }

    @Override // defpackage.fnb
    public void b() {
        die dieVar = ((FrgAttachPhoto) this.b).M1;
        if (dieVar != null) {
            cqc.b((sd7) dieVar.o);
            Iterator it = ((List) dieVar.b).iterator();
            while (it.hasNext()) {
                ((lz) it.next()).a();
            }
        }
    }

    @Override // defpackage.fa8
    public void c(w98 w98Var) throws RemoteException {
        switch (this.a) {
            case 21:
                qr6 qr6Var = w98Var.w;
                a98 a98Var = w98Var.a;
                if (qr6Var != null) {
                    z04.u("Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    a98Var.release();
                    break;
                } else {
                    uh3 uh3Var = (uh3) this.b;
                    w98Var.w = uh3Var.c;
                    w98Var.q = uh3Var.e;
                    k3b k3bVar = uh3Var.f;
                    w98Var.r = k3bVar;
                    k3b k3bVar2 = uh3Var.g;
                    w98Var.s = k3bVar2;
                    k3b k3bVarI = w98.i(k3bVar, k3bVar2);
                    w98Var.t = k3bVarI;
                    zw6 zw6Var = uh3Var.k;
                    w98Var.o = zw6Var;
                    w98Var.p = c73.a(zw6Var, w98Var.q, k3bVarI);
                    w98Var.n = uh3Var.j;
                    try {
                        uh3Var.c.asBinder().linkToDeath(w98Var.g, 0);
                        obd obdVar = w98Var.e;
                        w98Var.k = new obd(obdVar.a.a(), uh3Var.a, uh3Var.b, obdVar.a.getPackageName(), uh3Var.c, uh3Var.h);
                        a98Var.j();
                        break;
                    } catch (RemoteException unused) {
                        a98Var.release();
                        return;
                    }
                }
            default:
                if (w98Var.isConnected() && w98Var.j.isEmpty()) {
                    qad qadVar = w98Var.n.c;
                    long j = qadVar.c;
                    qad qadVar2 = (qad) this.b;
                    if (j < qadVar2.c && j47.f(qadVar2, qadVar)) {
                        w98Var.n = w98Var.n.j(qadVar2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.cw7
    public void d() {
        iw7 iw7Var = (iw7) this.b;
        ((OneMeDraweeView) iw7Var.a.b).setVisibility(8);
        if (iw7Var.c) {
            iw7Var.o = true;
        }
    }

    @Override // defpackage.s0a
    public void e(ez9 ez9Var) throws IllegalArgumentException {
        lp7 lp7Var = (lp7) this.b;
        fef fefVar = lp7Var.e;
        if (fefVar == null) {
            if (ez9Var.h()) {
                return;
            }
            Throwable illegalStateException = new IllegalStateException("Video content can't be null");
            if (ez9Var.e(illegalStateException)) {
                return;
            }
            j47.Z(illegalStateException);
            return;
        }
        lp7Var.h.setDataSource(fefVar.l().getPath());
        try {
            lp7Var.j = Long.parseLong(lp7Var.h.extractMetadata(9));
        } catch (Exception e) {
            hm9.p("lp7", "Can'e extract duration", e);
            lp7Var.j = ((ok0) lp7Var.e).a;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < lp7Var.i && !ez9Var.h(); i++) {
            Bitmap scaledFrameAtTime = lp7Var.h.getScaledFrameAtTime((lp7Var.j / lp7Var.i) * i * 1000, 2, lp7Var.c, lp7Var.d);
            if (!ez9Var.h()) {
                arrayList.add(scaledFrameAtTime);
                ez9Var.d(arrayList);
            }
        }
    }

    @Override // defpackage.pj8
    public void f(x4b x4bVar, oh8 oh8Var) {
        ((pj3) this.b).accept(x4bVar);
    }

    public boolean g(ey1 ey1Var, int i, Bundle bundle) {
        ys3 sy4Var;
        Object obj = this.b;
        switch (this.a) {
            case 8:
                if ((i & 1) != 0) {
                    try {
                        ((wmc) ey1Var.b).r();
                        InputContentInfo inputContentInfo = (InputContentInfo) ((wmc) ey1Var.b).a;
                        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                    } catch (Exception unused) {
                        return false;
                    }
                }
                ClipDescription description = ((InputContentInfo) ((wmc) ey1Var.b).a).getDescription();
                wmc wmcVar = (wmc) ey1Var.b;
                ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) wmcVar.a).getContentUri()));
                if (Build.VERSION.SDK_INT >= 31) {
                    sy4Var = new sy4(clipData, 2);
                } else {
                    zs3 zs3Var = new zs3();
                    zs3Var.b = clipData;
                    zs3Var.c = 2;
                    sy4Var = zs3Var;
                }
                sy4Var.b(((InputContentInfo) wmcVar.a).getLinkUri());
                sy4Var.setExtras(bundle);
                return zmf.g((View) obj, sy4Var.build()) == null;
            default:
                int i2 = MessageComposeEditText.w0;
                ((MessageComposeEditText) obj).getClass();
                return false;
        }
    }

    @Override // defpackage.lde
    public Object get() {
        ye8 ye8Var = (ye8) this.b;
        ye8Var.getClass();
        return ye8Var.n(ze8.o, new x50(true, false, true));
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        a37 a37Var = (a37) this.b;
        a37Var.getClass();
        ArrayList arrayList = new ArrayList();
        df5 df5VarC = a37Var.c("https://www.instagram.com/p/%s/", nqdVar);
        if (df5VarC == null) {
            df5VarC = a37Var.c("https://www.instagram.com/p/%s/embed/", nqdVar);
        }
        if (df5VarC != null) {
            arrayList.add(df5VarC);
        }
        if (nqdVar.h()) {
            return;
        }
        if (arrayList.isEmpty()) {
            nqdVar.onError(new FetcherException(4, "Failed to fetch instagram video"));
        } else {
            nqdVar.a(new ff5("Instagram", arrayList));
        }
    }

    @Override // defpackage.rj8
    public Object k(ii8 ii8Var, oh8 oh8Var, int i) {
        Object obj = this.b;
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ii8Var.k(oh8Var, (ffc) ((zw6) obj));
            default:
                ew6 ew6Var = ew6.b;
                if (!ii8Var.i()) {
                    ((pj8) obj).f(ii8Var.s, oh8Var);
                    sj8.M0(oh8Var, i, new sad(0));
                }
                return ew6.b;
        }
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        va8 va8Var = (va8) this.b;
        va8Var.getClass();
        ju0.D().execute(new vs5(va8Var, 12, lq1Var));
        return va8Var + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        return ((Locale) obj).getLanguage().equals(((Locale) this.b).getLanguage());
    }

    @Override // defpackage.fu3
    public Object u(Task task) throws IOException {
        Object obj;
        ((bwf) this.b).getClass();
        ukg ukgVar = (ukg) task;
        synchronized (ukgVar.a) {
            fp3.p("Task is not yet complete", ukgVar.c);
            if (ukgVar.d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (IOException.class.isInstance(ukgVar.f)) {
                throw ((Throwable) IOException.class.cast(ukgVar.f));
            }
            Exception exc = ukgVar.f;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            obj = ukgVar.e;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        bundle.toString();
        new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // defpackage.d7b
    /* renamed from: apply */
    public boolean mo0apply(Object obj) {
        return ((ww0) obj).a((Uri) this.b);
    }
}

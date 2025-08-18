package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.net.Uri;
import android.os.Looper;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.media3.transformer.ExportException;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottieDrawable;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* loaded from: classes2.dex */
public final /* synthetic */ class u3c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u3c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        List listD0;
        switch (this.a) {
            case 0:
                RLottieDrawable rLottieDrawable = ((t3c) this.b).b;
                try {
                    vo0 vo0Var = rLottieDrawable.s1;
                    if (vo0Var != null) {
                        vo0Var.b();
                    }
                } catch (Throwable unused) {
                }
                RLottieDrawable.H1.post(rLottieDrawable.r1);
                return;
            case 1:
                ((f4c) this.b).w();
                return;
            case 2:
                ((u6c) this.b).d.Y();
                return;
            case 3:
                RecordManagerImpl.onRecordStarted$lambda$5((RecordManagerImpl) this.b);
                return;
            case 4:
                n05 n05Var = (n05) this.b;
                if (xi4.a.e(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    adc.r(n05Var);
                    return;
                }
                return;
            case 5:
                wj4 wj4Var = (wj4) ((djb) this.b).c;
                if (wj4Var.b) {
                    return;
                }
                adc adcVar = (adc) wj4Var.g;
                Objects.toString(adcVar.F);
                zm4 zm4Var = adcVar.a0;
                zm4Var.e();
                kq0.w((bm7) zm4Var.k).d(new v05(wj4Var, (see) wj4Var.d, (bue) wj4Var.e, 26), adcVar.e);
                return;
            case 6:
                ((ymc) this.b).a.release();
                return;
            case 7:
                ((znc) this.b).A();
                return;
            case 8:
                ((zuc) this.b).c();
                return;
            case 9:
                ((wu1) this.b).a();
                return;
            case 10:
                SdkCoroutineWorker.b((SdkCoroutineWorker) this.b);
                return;
            case 11:
                bc7[] bc7VarArr = SelectAlbumWidget.Y;
                ((SelectAlbumWidget) this.b).n0().k();
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                d6d d6dVar = (d6d) this.b;
                d6dVar.getClass();
                try {
                    if (d6dVar.f.u) {
                        return;
                    }
                    d6dVar.f.h();
                    d6dVar.c += d6dVar.f.w;
                    d6dVar.f.o.release();
                    e6d e6dVar = d6dVar.f;
                    e6dVar.m = false;
                    int i = e6dVar.n + 1;
                    e6dVar.n = i;
                    if (i == e6dVar.a.size()) {
                        e6d e6dVar2 = d6dVar.f;
                        e6dVar2.n = 0;
                        e6dVar2.s++;
                    }
                    e6d e6dVar3 = d6dVar.f;
                    lv4 lv4Var = (lv4) e6dVar3.a.get(e6dVar3.n);
                    e6d e6dVar4 = d6dVar.f;
                    vt vtVar = e6dVar4.d;
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    e6d e6dVar5 = d6dVar.f;
                    e6dVar4.o = vtVar.B(lv4Var, looperMyLooper, e6dVar5, e6dVar5.e);
                    d6dVar.f.o.start();
                    return;
                } catch (RuntimeException e) {
                    d6dVar.f.d(ExportException.a(e, 1000));
                    return;
                }
            case 13:
                ((cd6) this.b).k();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                o23 o23Var = (o23) this.b;
                synchronized (((ArrayDeque) o23Var.o)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) o23Var.a).edit();
                    String str = (String) o23Var.b;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) o23Var.o).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) o23Var.c);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                er0 er0Var = (er0) this.b;
                er0Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) er0Var.e;
                dnf dnfVar = sideSheetBehavior.i;
                if (dnfVar != null && dnfVar.f()) {
                    er0Var.b(er0Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.y(er0Var.b);
                        return;
                    }
                    return;
                }
            case 16:
                ((rod) this.b).g();
                return;
            case LangUtils.HASH_SEED /* 17 */:
                e70 e70Var = (e70) ((ey1) this.b).b;
                e70Var.q = true;
                if (e70Var.g == 2) {
                    e70Var.a();
                    return;
                }
                return;
            case 18:
                l7b l7bVar = (l7b) this.b;
                l7bVar.getClass();
                try {
                    Map mapD0 = mz7.d0((Map) ((AtomicReference) ((khe) l7bVar.b).getValue()).get());
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream((File) ((k56) l7bVar.c).invoke())));
                    try {
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeInt(mapD0.size());
                        for (Map.Entry entry : mapD0.entrySet()) {
                            dataOutputStream.writeUTF((String) entry.getKey());
                            Object value = entry.getValue();
                            if (value instanceof Boolean) {
                                dataOutputStream.writeInt(2);
                                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                            } else if (value instanceof Integer) {
                                dataOutputStream.writeInt(3);
                                dataOutputStream.writeInt(((Number) value).intValue());
                            } else if (value instanceof Long) {
                                dataOutputStream.writeInt(4);
                                dataOutputStream.writeLong(((Number) value).longValue());
                            } else if (value instanceof Float) {
                                dataOutputStream.writeInt(5);
                                dataOutputStream.writeFloat(((Number) value).floatValue());
                            } else if (value instanceof Double) {
                                dataOutputStream.writeInt(6);
                                dataOutputStream.writeDouble(((Number) value).doubleValue());
                            } else {
                                if (!(value instanceof String)) {
                                    throw new IllegalArgumentException("Write unknown type of value " + value);
                                }
                                dataOutputStream.writeInt(1);
                                dataOutputStream.writeUTF((String) value);
                            }
                        }
                        v3c.i(dataOutputStream, null);
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            v3c.i(dataOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused2) {
                    return;
                }
            case 19:
                g03 g03Var = (g03) this.b;
                ((ard) g03Var.c).o.h(g03Var.b);
                return;
            case 20:
                svd svdVar = (svd) this.b;
                Surface surface = svdVar.v0;
                if (surface != null) {
                    Iterator it2 = svdVar.a.iterator();
                    while (it2.hasNext()) {
                        ((n75) it2.next()).a.m2(null);
                    }
                }
                SurfaceTexture surfaceTexture = svdVar.u0;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                svdVar.u0 = null;
                svdVar.v0 = null;
                return;
            case 21:
                ((f9e) this.b).b();
                return;
            case 22:
                ((CountDownLatch) this.b).countDown();
                return;
            case 23:
                xs4 xs4Var = (xs4) ((nw4) this.b).o;
                if (xs4Var != null) {
                    Iterator it3 = xs4Var.values().iterator();
                    while (it3.hasNext()) {
                        ((iee) it3.next()).c();
                    }
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((u00) this.b).f();
                return;
            case 25:
                ihe iheVar = (ihe) this.b;
                iheVar.g(iheVar);
                return;
            case 26:
                jhe jheVar = (jhe) this.b;
                c54.o(jheVar.f, "Need to call openCaptureSession before using this API.");
                q40 q40Var = jheVar.b;
                synchronized (q40Var.b) {
                    ((LinkedHashSet) q40Var.o).add(jheVar);
                }
                ((CameraCaptureSession) ((ph4) jheVar.f.a).a).close();
                jheVar.c.execute(new u3c(25, jheVar));
                return;
            case 27:
                pje pjeVar = (pje) this.b;
                pjeVar.a(2);
                try {
                    Context context = pjeVar.a;
                    String strQ = c37.q();
                    File file = new File(context.getCacheDir(), strQ.equals(context.getPackageName()) ? "tracer" : "tracer-" + Uri.encode(strQ.replace(':', '-')));
                    m6d.y(file);
                    File fileJ = lk5.J(file, "tags");
                    synchronized (pjeVar.e) {
                        listD0 = x53.D0(pjeVar.e);
                    }
                    dy7.d(fileJ, listD0);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 28:
                ((b8c) this.b).d();
                return;
            default:
                tle tleVar = (tle) this.b;
                tleVar.getClass();
                hm9.k(tle.B0, "handleIntent: close and re-create session");
                ((yle) tleVar.x0.getValue()).i();
                return;
        }
    }
}

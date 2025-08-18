package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.camera.core.ProcessingException;
import com.google.android.gms.tasks.Task;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.util.LangUtils;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.messages.video.fetcher.FetcherException;

/* loaded from: classes2.dex */
public final class l7b implements nm0, f2a, JavaAudioDeviceModule.AudioRecordErrorCallback, erd, a76, l3a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ l7b(int i, boolean z) {
        this.a = i;
    }

    @Override // defpackage.erd
    public void a(Object obj) {
        switch (this.a) {
            case 7:
                try {
                    Object objMo131apply = ((b66) this.c).mo131apply(obj);
                    Objects.requireNonNull(objMo131apply, "The mapper function returned a null value.");
                    ((erd) this.b).a(objMo131apply);
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    onError(th);
                    return;
                }
            default:
                kee keeVar = (kee) obj;
                keeVar.getClass();
                try {
                    ((lee) ((nw4) this.c).b).c(keeVar);
                    break;
                } catch (ProcessingException unused) {
                    return;
                }
        }
    }

    @Override // defpackage.f2a
    public void b() {
        ((fab) ((iab) this.b)).i(null);
    }

    @Override // defpackage.f2a
    public void c(zl4 zl4Var) {
        AtomicReference atomicReference;
        switch (this.a) {
            case 4:
                break;
            default:
                ((erd) this.b).c(zl4Var);
                return;
        }
        do {
            atomicReference = (AtomicReference) this.c;
            if (atomicReference.compareAndSet(null, zl4Var)) {
                return;
            }
        } while (atomicReference.get() == null);
        zl4Var.g();
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        int i = ((iee) this.b).f;
        if (i == 2 && (th instanceof CancellationException)) {
            return;
        }
        v3c.o(i);
    }

    @Override // defpackage.f2a
    public void e(Object obj) {
        try {
            j47.s0((iab) this.b, obj);
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.nm0
    public void f() {
        byte[] bArr = oaf.f;
        wpa wpaVar = (wpa) this.c;
        wpaVar.getClass();
        wpaVar.E(bArr.length, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c A[EDGE_INSN: B:64:0x011c->B:50:0x011c BREAK  A[LOOP:1: B:36:0x00e3->B:49:0x010b], SYNTHETIC] */
    @Override // defpackage.nm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.lm0 g(defpackage.sa4 r17, long r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l7b.g(sa4, long):lm0");
    }

    public View h(int i, int i2, int i3, int i4) {
        hmf hmfVar = (hmf) this.b;
        int iP = hmfVar.p();
        int iR = hmfVar.r();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewT = hmfVar.t(i);
            int iL = hmfVar.l(viewT);
            int iW = hmfVar.w(viewT);
            ve veVar = (ve) this.c;
            veVar.b = iP;
            veVar.c = iR;
            veVar.d = iL;
            veVar.e = iW;
            if (i3 != 0) {
                veVar.a = i3;
                if (veVar.a()) {
                    return viewT;
                }
            }
            if (i4 != 0) {
                veVar.a = i4;
                if (veVar.a()) {
                    view = viewT;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean i(View view) {
        hmf hmfVar = (hmf) this.b;
        int iP = hmfVar.p();
        int iR = hmfVar.r();
        int iL = hmfVar.l(view);
        int iW = hmfVar.w(view);
        ve veVar = (ve) this.c;
        veVar.b = iP;
        veVar.c = iR;
        veVar.d = iL;
        veVar.e = iW;
        veVar.a = 24579;
        return veVar.a();
    }

    public void j() {
        nqd nqdVar = (nqd) ((sqd) this.b);
        if (nqdVar.h()) {
            return;
        }
        nqdVar.onError(new FetcherException(4, "Failed to fetch Vimeo video"));
    }

    public void k(Object obj, String str) {
        AtomicReference atomicReference = (AtomicReference) ((khe) this.b).getValue();
        while (true) {
            Map map = (Map) atomicReference.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (obj == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, obj);
            }
            while (!atomicReference.compareAndSet(map, linkedHashMap)) {
                if (atomicReference.get() != map) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        ykg ykgVar = (ykg) this.b;
        qne qneVar = (qne) this.c;
        synchronized (ykgVar.f) {
            ykgVar.e.remove(qneVar);
        }
    }

    public void m() {
        hze.a(new u3c(18, this));
    }

    @Override // defpackage.f2a
    public void onError(Throwable th) {
        switch (this.a) {
            case 4:
                ((fab) ((iab) this.b)).i(th);
                break;
            default:
                ((erd) this.b).onError(th);
                break;
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordError(String str) {
        ((y8) this.b).onWebRtcAudioRecordError(str);
        a4c a4cVar = (a4c) this.c;
        a4cVar.log("SharedPeerConnectionFac", "onWebRtcAudioRecordError: " + str);
        a4cVar.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordError", new Exception(wg0.i("onWebRtcAudioRecordError ", str)));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordInitError(String str) {
        ((y8) this.b).onWebRtcAudioRecordInitError(str);
        a4c a4cVar = (a4c) this.c;
        a4cVar.log("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError: " + str);
        a4cVar.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError", new Exception(wg0.i("onWebRtcAudioRecordInitError ", str)));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        ((y8) this.b).onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        a4c a4cVar = (a4c) this.c;
        a4cVar.log("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError: . " + str);
        a4cVar.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError", new Exception(wg0.i("onWebRtcAudioRecordStartError ", str)));
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return "Bounds{lower=" + ((v27) this.b) + " upper=" + ((v27) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l7b(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ l7b(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public l7b(k56 k56Var) {
        this.a = 6;
        this.c = k56Var;
        this.b = new khe(new ie(9, this));
    }

    public l7b(int i) {
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED /* 17 */:
                ee6 ee6Var = ee6.d;
                this.b = new SparseIntArray();
                this.c = ee6Var;
                break;
            default:
                this.b = new tt3(cpc.f, new eqe(dpc.h), Integer.valueOf(woc.D0), (Integer) null, 20);
                this.c = new tt3(cpc.b, new eqe(dpc.e), Integer.valueOf(gpc.u), (Integer) null, 20);
                break;
        }
    }

    public l7b(je7 je7Var) {
        this.a = 0;
        je7 je7Var2 = iyc.l;
        this.b = new khe(new dr(je7Var));
        this.c = je7Var2;
    }

    public l7b(tue tueVar) {
        this.a = 2;
        this.b = tueVar;
        this.c = new wpa();
    }

    public l7b(uye uyeVar) {
        this.a = 11;
        this.b = uyeVar.a;
        this.c = uyeVar.b;
    }

    public l7b(hmf hmfVar) {
        this.a = 14;
        this.b = hmfVar;
        ve veVar = new ve();
        veVar.a = 0;
        this.c = veVar;
    }

    public l7b(WindowInsetsAnimation.Bounds bounds) {
        this.a = 16;
        this.b = v27.c(bounds.getLowerBound());
        this.c = v27.c(bounds.getUpperBound());
    }
}

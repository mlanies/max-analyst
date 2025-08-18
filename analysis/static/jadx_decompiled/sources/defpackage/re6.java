package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import com.facebook.animated.gif.GifImage;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import com.jakewharton.processphoenix.ProcessPhoenix;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.android.OneMeApplication;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.msgpack.core.buffer.OutputStreamBufferOutput;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException;

/* loaded from: classes.dex */
public class re6 implements gg, lv, b4c, vg1, x85, t7c, qt3, ko7, a76, wu, qj3, Loggable, noc, z14, lxd {
    public static re6 X;
    public static int Y;
    public static re6 c;
    public static final Object o = new Object();
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ re6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static sh0 i0(long j, hoc hocVar) {
        if (hocVar == null) {
            throw new IllegalArgumentException("Illegal 'command' value: null");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            tw8 tw8Var = vw8.b;
            ww8 ww8Var = new ww8(new OutputStreamBufferOutput(byteArrayOutputStream, tw8Var.c), tw8Var);
            try {
                l0(ww8Var, j, hocVar);
                v3c.i(ww8Var, null);
                return new sh0(2, byteArrayOutputStream.toByteArray());
            } finally {
            }
        } catch (JSONException e) {
            throw new IllegalArgumentException("Unable to serialize command: " + hocVar.getClass(), e);
        }
    }

    public static void l0(ww8 ww8Var, long j, hoc hocVar) {
        if (hocVar instanceof ehc) {
            ehc ehcVar = (ehc) hocVar;
            ww8Var.m(1);
            ww8Var.m(0);
            ww8Var.n(j);
            ww8Var.n(ehcVar.b);
            ww8Var.n(ehcVar.a);
            return;
        }
        if (!(hocVar instanceof d6f)) {
            if (hocVar instanceof nhc) {
                ww8Var.m(3);
                ww8Var.m(0);
                ww8Var.n(j);
                ww8Var.m0(((nhc) hocVar).a ? (byte) -61 : (byte) -62);
                return;
            }
            if (!(hocVar instanceof chc)) {
                throw new IllegalArgumentException("No serializer for command: " + j + " " + hocVar.getClass());
            }
            chc chcVar = (chc) hocVar;
            ww8Var.m(4);
            ww8Var.m(0);
            ww8Var.n(j);
            ww8Var.n(chcVar.a);
            ww8Var.n(chcVar.b);
            return;
        }
        d6f d6fVar = (d6f) hocVar;
        ww8Var.m(0);
        ww8Var.m(0);
        ww8Var.n(j);
        ww8Var.m0(d6fVar.b ? (byte) -61 : (byte) -62);
        List<m7d> list = d6fVar.a;
        int size = list.size();
        if (size == 0) {
            ww8Var.m0((byte) -64);
        } else {
            ww8Var.g(size * 2);
            for (m7d m7dVar : list) {
                ww8Var.U(f46.P(m7dVar));
                l7d l7dVar = m7dVar.b;
                if (l7dVar.a) {
                    ww8Var.m(1);
                } else {
                    ww8Var.m(0);
                    ww8Var.m0((byte) -64);
                    ww8Var.m(l7dVar.b);
                    ww8Var.m(l7dVar.c);
                    ww8Var.m(au1.s(l7dVar.d));
                }
            }
        }
        ww8Var.m0((byte) -64);
    }

    public static String m0(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public static re6 n0(Context context) {
        fp3.n(context);
        synchronized (re6.class) {
            if (c == null) {
                whg whgVar = mjg.a;
                synchronized (mjg.class) {
                    try {
                        if (mjg.c == null) {
                            mjg.c = context.getApplicationContext();
                        }
                    } finally {
                    }
                }
                c = new re6(context, 0);
            }
        }
        return c;
    }

    public static re6 p0() {
        synchronized (o) {
            try {
                re6 re6Var = X;
                if (re6Var == null) {
                    return new re6(1, false);
                }
                X = (re6) re6Var.b;
                re6Var.b = null;
                Y--;
                return re6Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final pig t0(PackageInfo packageInfo, pig... pigVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        uig uigVar = new uig(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < pigVarArr.length; i++) {
            if (pigVarArr[i].equals(uigVar)) {
                return pigVarArr[i];
            }
        }
        return null;
    }

    public static final boolean u0(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (!z) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z ? t0(packageInfo2, hjg.a) : t0(packageInfo2, hjg.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.z14, defpackage.a24
    public boolean A() {
        return true;
    }

    @Override // defpackage.z14, defpackage.a24
    public long C() {
        return 0L;
    }

    @Override // defpackage.z14, defpackage.a24
    public long D(long j) {
        return 1L;
    }

    @Override // defpackage.z14, defpackage.a24
    public long E(long j, long j2) {
        return 1L;
    }

    @Override // defpackage.x85
    public vh9 F() {
        throw null;
    }

    @Override // defpackage.gg
    public int G() {
        return ((ue) this.b).a;
    }

    @Override // defpackage.qt3
    public qt3 I(Collection collection) {
        ((Bundle) this.b).putBundle("actions", ay7.e(collection));
        return this;
    }

    @Override // defpackage.qt3
    public qt3 L(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Bundle bundle = (Bundle) this.b;
        bundle.putFloat("x", f);
        bundle.putFloat("y", f2);
        return this;
    }

    @Override // defpackage.gg
    public int M(int i) {
        return ((int[]) ((ue) this.b).g)[i];
    }

    @Override // defpackage.lxd
    public kxd Q() {
        return (xxc) this.b;
    }

    @Override // defpackage.qt3
    public qt3 R(float f) {
        Rect rect = fk6.b;
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    @Override // defpackage.qt3
    public qt3 S(Bundle bundle) {
        ((Bundle) this.b).putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        return this;
    }

    @Override // defpackage.vg1
    public void T(float f, float f2) {
        xg1 xg1Var = (xg1) this.b;
        vg1 applicationPipDepended = xg1Var.getApplicationPipDepended();
        if (applicationPipDepended != null) {
            applicationPipDepended.T(f, f2);
        }
        PointF pointF = xg1Var.s0;
        pointF.x = f;
        pointF.y = f2;
    }

    @Override // defpackage.qt3
    public qt3 U(iqe iqeVar) {
        ((Bundle) this.b).putParcelable("header", iqeVar);
        return this;
    }

    @Override // defpackage.noc
    public sh0 W(long j, hoc hocVar) throws RtcCommandSerializeException {
        try {
            return i0(j, hocVar);
        } catch (Throwable th) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, th);
        }
    }

    @Override // defpackage.qt3
    public qt3 Y(View view) {
        if (view.getId() == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int id = view.getId();
        Bundle bundle = (Bundle) this.b;
        bundle.putInt("anchor_id", id);
        bundle.putSerializable("anchor_class", view.getClass());
        return this;
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        f17 f17Var = (f17) obj;
        d15 d15Var = (d15) this.b;
        d15Var.q.getClass();
        long jU = pq9.u();
        if (f17Var.f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        c54.k(jU >= 0);
        f17Var.g = jU;
        if (f17Var.f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        f17Var.h = true;
        f17Var.b();
        kq0.a(kq0.w(f17Var.d), new wd6(14, this), d15Var.h);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case LangUtils.HASH_SEED /* 17 */:
                d47 d47Var = (d47) this.b;
                d47Var.d.f(d47Var);
                d47Var.l.compareAndSet(true, false);
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof UndeliverableException)) {
                    if (!(th instanceof SQLiteDatabaseCorruptException)) {
                        Thread threadCurrentThread = Thread.currentThread();
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                        if (uncaughtExceptionHandler != null) {
                            uncaughtExceptionHandler.uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    } else {
                        ProcessPhoenix.b((OneMeApplication) this.b);
                        break;
                    }
                } else {
                    hm9.p("RxJavaErrorHandler", "rxjava undeliverable error", th);
                    ((ri4) bcf.a.getAccessor().c(ri4.class)).e();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wu
    public bm7 apply(Object obj) {
        return kq0.r(((l66) this.b).apply(obj));
    }

    @Override // defpackage.z14, defpackage.a24
    public long b(long j) {
        return 0L;
    }

    @Override // defpackage.qt3
    public rt3 build() {
        return new ContextMenuPopupWindow(new Bundle((Bundle) this.b));
    }

    @Override // defpackage.ko7
    public void c() throws IOException {
        x14 x14Var = (x14) this.b;
        x14Var.A.c();
        DashManifestStaleException dashManifestStaleException = x14Var.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        ((d15) this.b).b(0, "Unable to acquire InputBuffer.", th);
    }

    @Override // defpackage.qt3
    public qt3 d0() {
        ((Bundle) this.b).putBoolean("dim", true);
        return this;
    }

    @Override // defpackage.gg
    public int g0() {
        return ((GifImage) ((ue) this.b).e).i();
    }

    @Override // defpackage.t7c
    public ce3 getConfig() {
        return (ce3) this.b;
    }

    @Override // defpackage.lv
    public e5f h0(long j, List list) {
        ((ua3) ((ta3) this.b)).makeCompleting$kotlinx_coroutines_core(list);
        return e5f.a;
    }

    @Override // defpackage.z14, defpackage.a24
    public long j(long j, long j2) {
        return j2;
    }

    public g03 j0(int i, byte[] bArr) {
        if (i == 0) {
            throw new IllegalArgumentException("Illegal 'format' value: null");
        }
        if (i != 2) {
            throw new UnsupportedOperationException("Only binary format is supported");
        }
        try {
            gy8 gy8VarA = vw8.a(bArr);
            try {
                int iV0 = gy8VarA.v0();
                int iV02 = gy8VarA.v0();
                int iV03 = gy8VarA.v0();
                if (iV02 != 0) {
                    throw new UnsupportedOperationException("Unsupported version: " + iV02 + " for command " + iV0);
                }
                if (iV03 == 0) {
                    g03 g03Var = iV0 != 0 ? iV0 != 1 ? null : new g03(gy8VarA.w0(), new fhc(Integer.valueOf(gy8VarA.v0())), 8) : k0(gy8VarA);
                    v3c.i(gy8VarA, null);
                    return g03Var;
                }
                throw new IllegalArgumentException("Error code " + iV03 + " for command " + iV0);
            } finally {
            }
        } catch (Throwable th) {
            throw new IllegalArgumentException("Unable to decode command body: ".concat(xj6.a(bArr)), th);
        }
    }

    @Override // defpackage.z14, defpackage.a24
    public long k(long j, long j2) {
        return 0L;
    }

    public g03 k0(gy8 gy8Var) {
        fp1 fp1VarZ;
        long jW0 = gy8Var.w0();
        HashMap map = new HashMap();
        int iX0 = gy8Var.x0();
        for (int i = 0; i < iX0; i++) {
            if (gy8Var.n().a() == 5) {
                String strZ0 = gy8Var.z0();
                fp1VarZ = f46.Z(strZ0);
                if (fp1VarZ == null) {
                    throw new IllegalArgumentException("Not found video track participant key for ".concat(strZ0));
                }
            } else {
                int iV0 = gy8Var.v0();
                fp1VarZ = (fp1) ((ConcurrentHashMap) ((o9g) this.b).b).get(Integer.valueOf(iV0));
                if (fp1VarZ == null) {
                    throw new IllegalArgumentException(zr6.h(iV0, "Not found video track participant key for "));
                }
            }
            map.put(fp1VarZ, gy8Var.v0() == -1 ? e6f.b : e6f.a);
        }
        return new g03(jW0, new f6f(map), 8);
    }

    @Override // defpackage.z14, defpackage.a24
    public long m(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.z14
    public q4c n(long j) {
        return (q4c) this.b;
    }

    public int o0() {
        return ((GifImage) ((ue) this.b).e).h();
    }

    @Override // org.webrtc.Loggable
    public void onLogMessage(String str, Logging.Severity severity, String str2) {
        a4c a4cVar;
        WeakReference weakReference = (WeakReference) this.b;
        if (weakReference == null || str == null || str2 == null || (a4cVar = (a4c) weakReference.get()) == null) {
            return;
        }
        a4cVar.log(str2, str);
    }

    public void q0() {
        synchronized (o) {
            try {
                int i = Y;
                if (i < 5) {
                    Y = i + 1;
                    re6 re6Var = X;
                    if (re6Var != null) {
                        this.b = re6Var;
                    }
                    X = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qt3
    public qt3 r() {
        Rect rect = fk6.b;
        Rect rect2 = fk6.b;
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelable("highlight_padding", rect2);
        bundle.remove("highlight_radius");
        return this;
    }

    public void r0(CaptureRequest.Key key, Object obj) {
        be3 be3Var = be3.c;
        ((mi9) this.b).d(cv1.v0(key), be3Var, obj);
    }

    @Override // defpackage.qt3
    public qt3 s() {
        Bundle bundle = (Bundle) this.b;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    public int s0() {
        return ((GifImage) ((ue) this.b).e).k();
    }

    @Override // defpackage.b4c
    public boolean shouldHideSensitiveInformation() {
        ((x6a) ((je7) this.b).getValue()).getClass();
        return true;
    }

    @Override // defpackage.noc
    public g03 t(int i, byte[] bArr) throws RtcCommandSerializeException {
        try {
            return j0(i, bArr);
        } catch (Throwable th) {
            throw new RtcCommandSerializeException(null, false, th);
        }
    }

    @Override // defpackage.z14, defpackage.a24
    public long v(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.qt3
    public qt3 w(Rect rect, float f) {
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    @Override // defpackage.gg
    public int x() {
        return ((GifImage) ((ue) this.b).e).e();
    }

    @Override // defpackage.qt3
    public qt3 y() {
        ((Bundle) this.b).putBoolean("dark_theme", true);
        return this;
    }

    @Override // defpackage.vg1
    public PointF z() {
        PointF pointFZ;
        xg1 xg1Var = (xg1) this.b;
        vg1 applicationPipDepended = xg1Var.getApplicationPipDepended();
        return (applicationPipDepended == null || (pointFZ = applicationPipDepended.z()) == null) ? dy7.y(xg1Var.getContext()) : pointFZ;
    }

    public /* synthetic */ re6(int i, boolean z) {
        this.a = i;
    }

    public re6(Context context, int i) {
        boolean zIsEmpty;
        this.a = i;
        switch (i) {
            case 29:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.b = sharedPreferences;
                File file = new File(kt3.c(context), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            zIsEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (zIsEmpty) {
                            return;
                        }
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                        return;
                    }
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        e.getMessage();
                        return;
                    }
                    return;
                }
            default:
                this.b = context.getApplicationContext();
                return;
        }
    }

    public re6(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = mi9.b();
                break;
            case 9:
                this.b = new khe(new ie(13, this));
                break;
            case 10:
                this.b = new Bundle();
                break;
            case 19:
                this.b = (ExtraCroppingQuirk) zi4.a.e(ExtraCroppingQuirk.class);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                this.b = new b9b();
                break;
            case 28:
                this.b = new xxc();
                break;
            default:
                this.b = new CopyOnWriteArrayList();
                break;
        }
    }
}

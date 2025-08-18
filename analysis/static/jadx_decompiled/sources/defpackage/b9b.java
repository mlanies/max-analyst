package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.http.util.LangUtils;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class b9b implements erd, a76, CapturerObserver, y2a, lp {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b9b(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static float f(int i, float[] fArr) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        if (i > 0) {
            return f / i;
        }
        return 0.0f;
    }

    public static v3c i(View view) {
        if (view instanceof AdapterView) {
            return new xwc(0);
        }
        if (view instanceof ScrollView) {
            return new xwc(3);
        }
        if (view instanceof RecyclerView) {
            return new ywc((RecyclerView) view);
        }
        if (view instanceof NestedScrollView) {
            return new xwc(2);
        }
        if (view instanceof HorizontalScrollView) {
            return new xwc(1);
        }
        if (view.getParent() instanceof View) {
            return i((View) view.getParent());
        }
        return null;
    }

    public static View j(View view) {
        if ((view instanceof AdapterView) || (view instanceof ScrollView) || (view instanceof RecyclerView) || (view instanceof NestedScrollView) || (view instanceof HorizontalScrollView)) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return j((View) view.getParent());
        }
        return null;
    }

    public static b9b k(mb0 mb0Var) {
        la0 la0Var = la0.c;
        c54.o(mb0Var, "quality cannot be null");
        c54.o(la0Var, "fallbackStrategy cannot be null");
        c54.j("Invalid quality: " + mb0Var, mb0.k.contains(mb0Var));
        return new b9b(Collections.singletonList(mb0Var), la0Var);
    }

    public static b9b l(List list, la0 la0Var) {
        c54.o(list, "qualities cannot be null");
        c54.j("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mb0 mb0Var = (mb0) it.next();
            c54.j("qualities contain invalid quality: " + mb0Var, mb0.k.contains(mb0Var));
        }
        return new b9b(list, la0Var);
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        x6g x6gVarF = zmf.f(view, x6gVar);
        if (x6gVarF.a.m()) {
            return x6gVarF;
        }
        int iB = x6gVarF.b();
        Rect rect = (Rect) this.b;
        rect.left = iB;
        rect.top = x6gVarF.d();
        rect.right = x6gVarF.c();
        rect.bottom = x6gVarF.a();
        ViewPager viewPager = (ViewPager) this.c;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            x6g x6gVarB = zmf.b(viewPager.getChildAt(i), x6gVarF);
            rect.left = Math.min(x6gVarB.b(), rect.left);
            rect.top = Math.min(x6gVarB.d(), rect.top);
            rect.right = Math.min(x6gVarB.c(), rect.right);
            rect.bottom = Math.min(x6gVarB.a(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        o6g n6gVar = Build.VERSION.SDK_INT >= 30 ? new n6g(x6gVarF) : new m6g(x6gVarF);
        n6gVar.f(v27.b(i2, i3, i4, i5));
        return n6gVar.b();
    }

    @Override // defpackage.erd
    public void a(Object obj) {
        switch (this.a) {
            case 6:
                erd erdVar = (erd) this.b;
                try {
                    ((ol0) ((ib3) this.c).c).accept(obj, null);
                    erdVar.a(obj);
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    erdVar.onError(th);
                    return;
                }
            case 7:
            default:
                c54.p("Unexpected result from SurfaceRequest. Surface was provided twice.", ((bc0) obj).a != 3);
                ((SurfaceTexture) this.b).release();
                hre hreVar = ((gre) this.c).a;
                if (hreVar.j != null) {
                    hreVar.j = null;
                    break;
                }
                break;
            case 8:
                ((tj3) this.b).accept(new bc0(0, (Surface) this.c));
                break;
        }
    }

    public ld9 b(gy8 gy8Var) {
        float f;
        int iS0 = gy8Var.s0();
        fp1 fp1Var = null;
        Long lValueOf = null;
        float f2 = 1.0f;
        boolean zU0 = false;
        boolean zU02 = false;
        for (int i = 0; i < iS0; i++) {
            if (i == 0) {
                int iV0 = gy8Var.v0();
                fp1 fp1Var2 = (fp1) ((ConcurrentHashMap) ((o9g) this.b).b).get(Integer.valueOf(iV0));
                if (fp1Var2 == null) {
                    throw new RuntimeException(zr6.h(iV0, "Can't find compact id for "));
                }
                fp1Var = fp1Var2;
            } else if (i == 1) {
                byte b = gy8Var.readByte();
                if (b == -54) {
                    f = gy8Var.m0(4).getFloat(gy8Var.v0);
                } else {
                    if (b != -53) {
                        throw gy8.r0("Float", b);
                    }
                    f = (float) gy8Var.m0(8).getDouble(gy8Var.v0);
                }
                f2 = f;
            } else if (i == 2) {
                zU0 = gy8Var.u0();
            } else if (i != 3) {
                if (i != 4) {
                    gy8Var.z();
                } else {
                    zU02 = gy8Var.u0();
                }
            } else if (gy8Var.n().a() == 3) {
                lValueOf = Long.valueOf(gy8Var.w0());
            }
        }
        if (fp1Var != null) {
            return new ld9(fp1Var, f2, zU0, lValueOf, zU02);
        }
        throw new RuntimeException("Watch together parse error");
    }

    @Override // defpackage.erd
    public void c(zl4 zl4Var) {
        ((erd) this.b).c(zl4Var);
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        switch (this.a) {
            case 8:
                c54.p("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof qee);
                ((tj3) this.b).accept(new bc0(1, (Surface) this.c));
                return;
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    public boolean e(String str, String str2, d4c d4cVar, a4c a4cVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        boolean zContainsKey = linkedHashMap.containsKey(str);
        String str3 = (String) linkedHashMap.put(str, str2);
        if (!zContainsKey || !Objects.equals(str3, str2)) {
            return true;
        }
        a4cVar.log("CodecPrefUtil", "parameter " + str + " value did not change");
        return false;
    }

    public void g(long j, wpa wpaVar) {
        if (wpaVar.a() < 9) {
            return;
        }
        int iG = wpaVar.g();
        int iG2 = wpaVar.g();
        int iU = wpaVar.u();
        if (iG == 434 && iG2 == 1195456820 && iU == 3) {
            z04.r(j, wpaVar, (yze[]) this.c);
        }
    }

    public void h(pa5 pa5Var, l3f l3fVar) {
        int i = 0;
        while (true) {
            yze[] yzeVarArr = (yze[]) this.c;
            if (i >= yzeVarArr.length) {
                return;
            }
            l3fVar.a();
            l3fVar.b();
            yze yzeVarMo6B = pa5Var.mo6B(l3fVar.e, 3);
            qy5 qy5Var = (qy5) ((List) this.b).get(i);
            String str = qy5Var.n;
            fm9.e("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            ny5 ny5Var = new ny5();
            l3fVar.b();
            ny5Var.a = l3fVar.f;
            ny5Var.m = ia9.l(str);
            ny5Var.e = qy5Var.e;
            ny5Var.d = qy5Var.d;
            ny5Var.F = qy5Var.G;
            ny5Var.p = qy5Var.q;
            yzeVarMo6B.e(new qy5(ny5Var));
            yzeVarArr[i] = yzeVarMo6B;
            i++;
        }
    }

    public void m(rde rdeVar) {
        try {
            yig yigVar = (yig) this.c;
            xeg xegVar = new xeg(rdeVar);
            Parcel parcelG0 = yigVar.G0();
            agg.c(parcelG0, xegVar);
            yigVar.H0(parcelG0, 12);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String n(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void o(String str) {
        ((a4c) this.b).log("OKWSSignaling", str);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        rkf rkfVar = (rkf) this.c;
        ((a4c) rkfVar.c).log("VideoRecord", "Capture started (success=" + z + "), notify listener");
        w5e w5eVar = rkfVar.Z;
        if (w5eVar != null) {
            ((kq7) w5eVar.a).g.execute(new scg(w5eVar, z, !z));
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        rkf rkfVar = (rkf) this.c;
        ((a4c) rkfVar.c).log("VideoRecord", "Capture stopped, notify listener");
        w5e w5eVar = rkfVar.Z;
        if (w5eVar != null) {
            boolean z = false;
            ((kq7) w5eVar.a).g.execute(new scg(w5eVar, z, z));
        }
    }

    @Override // defpackage.erd
    public void onError(Throwable th) {
        try {
            ((ol0) ((ib3) this.c).c).accept(null, th);
        } catch (Throwable th2) {
            c37.B(th2);
            th = new CompositeException(th, th2);
        }
        ((erd) this.b).onError(th);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
    }

    public trf p(gy8 gy8Var) {
        int iS0 = gy8Var.s0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iS0; i++) {
            try {
                arrayList.add(b(gy8Var));
            } catch (Throwable th) {
                ((a4c) this.c).log("WatchTogetherUpdateParser", "Can't parse video state update " + th);
            }
        }
        return new trf(new md9(arrayList));
    }

    public void q() {
        r68 r68Var = (r68) this.b;
        if (r68Var.a) {
            r68Var.d();
            for (int i = 0; i < 2; i++) {
                ((float[]) r68Var.d)[i] = ((float[]) r68Var.f)[i];
                ((float[]) r68Var.e)[i] = ((float[]) r68Var.g)[i];
            }
            if (r68Var.a) {
                return;
            }
            r68Var.a = true;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String string = "[ ";
                if (((sud) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbL = au1.l(string);
                        sbL.append(((sud) this.b).s0[i]);
                        sbL.append(" ");
                        string = sbL.toString();
                    }
                }
                StringBuilder sbO = rh4.o(string, "] ");
                sbO.append((sud) this.b);
                return sbO.toString();
            case 2:
                return "QualitySelector{preferredQualities=" + ((List) this.b) + ", fallbackStrategy=" + ((la0) this.c) + "}";
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.b);
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                if (linkedHashMap.isEmpty()) {
                    return sb.toString();
                }
                sb.append(' ');
                boolean z = true;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(';');
                    }
                    sb.append((String) entry.getKey());
                    String str = (String) entry.getValue();
                    if (str != null) {
                        sb.append('=');
                        sb.append(str);
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b9b(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public b9b(Context context, int i) {
        cjg cjgVar;
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED /* 17 */:
                this.b = new tjg(context, fe6.b);
                synchronized (cjg.class) {
                    try {
                        if (cjg.o == null) {
                            Context applicationContext = context.getApplicationContext();
                            cjg cjgVar2 = new cjg();
                            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                            cjgVar2.b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                            cjgVar2.c = Executors.newSingleThreadExecutor();
                            cjgVar2.a = applicationContext;
                            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new gwe(16, cjgVar2), 0L, 86400L, TimeUnit.SECONDS);
                            cjg.o = cjgVar2;
                        }
                        cjgVar = cjg.o;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.c = cjgVar;
                return;
            default:
                fp3.n(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(h2c.common_google_play_services_unknown_issue);
                return;
        }
    }

    public b9b(a aVar, yig yigVar) {
        this.a = 16;
        this.c = yigVar;
        fp3.n(aVar);
        this.b = aVar;
    }

    public b9b(String str, LinkedHashMap linkedHashMap) {
        this.a = 15;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.c = linkedHashMap2;
        this.b = str;
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
    }

    public b9b(cd6 cd6Var, View view) {
        this.a = 4;
        this.b = view;
    }

    public b9b(List list) {
        this.a = 11;
        this.b = list;
        this.c = new yze[list.size()];
    }

    public b9b(c9b c9bVar) {
        this.a = 0;
        this.c = c9bVar;
    }

    public b9b(ExecutorService executorService) {
        this.a = 3;
        this.c = new us(0);
        this.b = executorService;
    }

    public b9b(r68 r68Var) {
        this.a = 10;
        this.c = null;
        this.b = r68Var;
        r68Var.h = this;
    }

    public b9b() {
        this.a = 1;
        this.b = new tt3(cpc.h, new eqe(yea.r1), Integer.valueOf(gpc.Q), (Integer) null, 20);
        this.c = new tt3(cpc.d, new eqe(yea.q1), Integer.valueOf(gpc.u), (Integer) null, 20);
    }

    public b9b(List list, la0 la0Var) {
        this.a = 2;
        c54.j("No preferred quality and fallback strategy.", (list.isEmpty() && la0Var == la0.c) ? false : true);
        this.b = Collections.unmodifiableList(new ArrayList(list));
        this.c = la0Var;
    }

    public b9b(ViewPager viewPager) {
        this.a = 13;
        this.c = viewPager;
        this.b = new Rect();
    }
}

package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.camera.core.ImageCaptureException;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class ey1 implements i07, o99, qj3, dq3 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ey1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [oz4] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap] */
    public static dg1 c(bg1 bg1Var, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        ?? map;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("participantState");
        dg1 dg1Var = new dg1(bg1Var);
        HashMap map2 = dg1Var.a;
        if (jSONObjectOptJSONObject2 == null) {
            map2.put("hand", new cg1("0", 0L));
        } else {
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("state");
            if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("stateUpdateTs")) == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
            if (itKeys.hasNext()) {
                map = new HashMap(jSONObjectOptJSONObject3.length());
                do {
                    String next = itKeys.next();
                    map.put(next, jSONObjectOptJSONObject3.optString(next));
                } while (itKeys.hasNext());
            } else {
                map = oz4.a;
            }
            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
            if (itKeys2.hasNext()) {
                do {
                    String next2 = itKeys2.next();
                    String str = (String) map.get(next2);
                    if (str != null) {
                        map2.put(next2, new cg1(str, jSONObjectOptJSONObject.optLong(next2)));
                    }
                } while (itKeys2.hasNext());
            }
        }
        return dg1Var;
    }

    @Override // defpackage.o99
    public InputStream a(String str) {
        try {
            return ((AssetManager) this.b).open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Serializable, long[]] */
    @Override // defpackage.qj3
    public void accept(Object obj) {
        int i = 1;
        switch (this.a) {
            case 8:
                Throwable th = (Throwable) obj;
                b32 b32Var = (b32) this.b;
                hm9.p(b32Var.Z, "onUploadFailed: failed", th);
                eoe eoeVarS = b32Var.s();
                long j = b32Var.b;
                eoeVarS.d(j);
                long j2 = b32Var.o;
                if (j2 != 0) {
                    e52 e52VarC = b32Var.b().C(j2);
                    if (e52VarC != null) {
                        b32Var.b().W(j2, v82.b);
                        ((k4a) b32Var.a()).j(e52VarC.b.a);
                    }
                } else {
                    e8d e8dVar = b32Var.a;
                    if (e8dVar == null) {
                        e8dVar = null;
                    }
                    ((el3) e8dVar.i.getValue()).d(0L, null, null);
                    long jT = ((hyc) b32Var.i()).t();
                    if (jT > 0) {
                        k4a k4aVar = (k4a) b32Var.a();
                        k4a.v(k4aVar, new oc2(((p7b) k4aVar.y()).a.o(), new long[]{jT}, i));
                    }
                }
                b32Var.t().c(new oi0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new pke("internal-error", th.toString(), null)));
                break;
            case 16:
                Throwable th2 = (Throwable) obj;
                Objects.requireNonNull(th2, "error is null");
                ((qj3) this.b).accept(new bt9(new fv9(th2)));
                break;
            case 19:
                hm9.p(((ei7) this.b).Z, "failed to store sticker set", (Throwable) obj);
                break;
            default:
                hm9.p(((s8d) this.b).X, "onServiceNotAvailable", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.i07
    public mt2 b() {
        List<ma9> list = (List) ((AtomicReference) ((na9) ((eca) this.b).b.getValue()).c).get();
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (ma9 ma9Var : list) {
            String str = ma9Var.r;
            arrayList.add(new nl2(ma9Var.a, str != null ? Uri.parse(str) : null, ma9Var.b, ma9Var.c, ma9Var.t, ma9Var.f, null, ma9Var.g, false, ma9Var.u, ma9Var.h, (ml2) ml2.Z.get(ma9Var.i), ma9Var.j, ma9Var.k, ma9Var.l, ma9Var.m, ma9Var.n, null, ma9Var.p, ma9Var.q, true, false));
        }
        return new mt2(arrayList, true);
    }

    public List d(JSONArray jSONArray) {
        dg1 dg1VarC;
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                dg1VarC = c(bg1.a(jSONObject.getString("id")), jSONObject);
            } catch (JSONException e) {
                ((a4c) this.b).logException("ParticipantStateParser", "Can't parse one state with index=" + i + " from participantList=" + jSONArray, e);
                dg1VarC = null;
            }
            arrayList.add(dg1VarC);
        }
        return x53.e0(arrayList);
    }

    public void e(String str, String str2, rh5 rh5Var) {
        ((ArrayList) this.b).add(new pq6(str, str2, (String) rh5Var.b, rh5Var));
    }

    public void f(String str, String str2) {
        ((ArrayList) this.b).add(new pq6(str, null, null, b46.o(HTTP.PLAIN_TEXT_TYPE, str2)));
    }

    public bw4 g() {
        n4c.a.getClass();
        return new bw4(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(n4c.b.h())}, 1)), x53.D0((ArrayList) this.b));
    }

    public el4 h(uk4 uk4Var) {
        ((o84) this.b).getClass();
        int i = uk4Var.a;
        ide ideVar = uk4Var.c;
        String str = uk4Var.b;
        lq9 lq9Var = uk4Var.h;
        cu4 cu4Var = new cu4(i, ideVar, str, lq9Var);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new el4(cu4Var, uk4Var.g, new l7(uk4Var.f, uk4Var.e, uk4Var.d), uk4Var.i, lq9Var, executorServiceNewSingleThreadExecutor);
    }

    public void i() {
        uu3 uu3Var = (uu3) this.b;
        uu3Var.viewIsAttached = true;
        uu3Var.viewWasDetached = false;
        uu3Var.attach(uu3Var.view);
    }

    public void j(boolean z) {
        uu3 uu3Var = (uu3) this.b;
        uu3Var.viewIsAttached = false;
        uu3Var.viewWasDetached = true;
        if (uu3Var.isDetachFrozen) {
            return;
        }
        uu3Var.detach(uu3Var.view, false, z);
    }

    public void k(ImageCaptureException imageCaptureException) {
        hm9.n(ey1.class.getName(), "capture image with error");
        cx1 cx1Var = ((CameraxCameraApiView) this.b).s0;
        if (cx1Var != null) {
            ((rxd) cx1Var).b0(new CameraExceptionImpl(imageCaptureException));
        }
    }

    public void l() {
        uu3 uu3Var = (uu3) this.b;
        if (uu3Var.isDetachFrozen) {
            return;
        }
        uu3Var.detach(uu3Var.view, false, false);
    }

    public List m(JSONObject jSONObject) {
        try {
            return d(jSONObject.getJSONArray("participants"));
        } catch (JSONException e) {
            ((a4c) this.b).logException("ParticipantStateParser", "Can't parse state from participantList " + jSONObject, e);
            return nz4.a;
        }
    }

    public dg1 n(JSONObject jSONObject) {
        try {
            bg1 bg1VarE = f46.E(jSONObject);
            if (bg1VarE.a == 0) {
                bg1VarE = f46.F(jSONObject);
            }
            return c(bg1VarE, jSONObject);
        } catch (JSONException e) {
            ((a4c) this.b).logException("ParticipantStateParser", "Can't parse state from " + jSONObject, e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(defpackage.dec r8, defpackage.jt r9, defpackage.jt r10) {
        /*
            r7 = this;
            java.lang.Object r7 = r7.b
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r7.getClass()
            r0 = 0
            r8.v(r0)
            mdc r0 = r7.a1
            r1 = r0
            yb4 r1 = (defpackage.yb4) r1
            if (r9 == 0) goto L2b
            r1.getClass()
            int r3 = r9.b
            int r5 = r10.b
            if (r3 != r5) goto L21
            int r0 = r9.c
            int r2 = r10.c
            if (r0 == r2) goto L2b
        L21:
            int r4 = r9.c
            int r6 = r10.c
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L3a
        L2b:
            r1.m(r8)
            android.view.View r9 = r8.a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r1.i
            r9.add(r8)
            r8 = 1
        L3a:
            if (r8 == 0) goto L3f
            r7.i0()
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey1.o(dec, jt, jt):void");
    }

    public void p(dec decVar, jt jtVar, jt jtVar2) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.c.k(decVar);
        recyclerView.i(decVar);
        decVar.v(false);
        yb4 yb4Var = (yb4) recyclerView.a1;
        yb4Var.getClass();
        int i = jtVar.b;
        int i2 = jtVar.c;
        View view = decVar.a;
        int left = jtVar2 == null ? view.getLeft() : jtVar2.b;
        int top = jtVar2 == null ? view.getTop() : jtVar2.c;
        if (decVar.p() || (i == left && i2 == top)) {
            yb4Var.m(decVar);
            yb4Var.h.add(decVar);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = yb4Var.g(decVar, i, i2, left, top);
        }
        if (zG) {
            recyclerView.i0();
        }
    }

    public String toString() {
        switch (this.a) {
            case 21:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public ey1(Context context) {
        this.a = 15;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setId(tga.a);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        la6 la6Var = (la6) oneMeDraweeView.getHierarchy();
        int i = sga.a;
        ssc sscVar = ssc.m;
        la6Var.i(la6Var.b.getDrawable(i), 1);
        psc pscVarF = la6Var.f(1);
        if (!j47.B(pscVarF.X, sscVar)) {
            pscVarF.X = sscVar;
            pscVarF.Y = null;
            pscVarF.p();
            pscVarF.invalidateSelf();
        }
        this.b = oneMeDraweeView;
    }

    public ey1(int i) {
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED /* 17 */:
                this.b = new ArrayList();
                break;
            case 26:
                this.b = new LruCache(10);
                break;
            case 28:
                this.b = new rq9();
                break;
        }
    }

    public ey1(TextView textView) {
        this.a = 14;
        c54.o(textView, "textView cannot be null");
        this.b = new ny4(textView);
    }
}

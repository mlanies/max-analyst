package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c8d implements tk6, cag, tge, Provider, hpf {
    public static c8d X;
    public static final npa Y = new npa();
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ c8d(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static synchronized c8d r() {
        try {
            if (X == null) {
                X = new c8d(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return X;
    }

    public static void z(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public lk0 A(List list) {
        ArrayList arrayListL = l(list);
        if (arrayListL.size() < 2) {
            return (lk0) mqd.l(arrayListL, null);
        }
        Collections.sort(arrayListL, new v00(3));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((lk0) arrayListL.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListL.size()) {
                break;
            }
            lk0 lk0Var = (lk0) arrayListL.get(i3);
            if (i2 == lk0Var.c) {
                arrayList.add(new Pair(lk0Var.b, Integer.valueOf(lk0Var.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (lk0) arrayListL.get(0);
            }
        }
        HashMap map = (HashMap) this.c;
        lk0 lk0Var2 = (lk0) map.get(arrayList);
        if (lk0Var2 == null) {
            List listSubList = arrayListL.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < listSubList.size(); i5++) {
                i4 += ((lk0) listSubList.get(i5)).d;
            }
            int iNextInt = ((Random) this.o).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= listSubList.size()) {
                    lk0Var2 = (lk0) mqd.m(listSubList);
                    break;
                }
                lk0 lk0Var3 = (lk0) listSubList.get(i);
                i6 += lk0Var3.d;
                if (iNextInt < i6) {
                    lk0Var2 = lk0Var3;
                    break;
                }
                i++;
            }
            map.put(arrayList, lk0Var2);
        }
        return lk0Var2;
    }

    @Override // defpackage.cag
    public void a(TotalCaptureResult totalCaptureResult) {
        if (((lq1) this.c) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.o;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            ((lq1) this.c).b(null);
            this.c = null;
            this.o = null;
        }
    }

    @Override // defpackage.cag
    public void b(re6 re6Var) {
        Rect rect = (Rect) this.b;
        if (rect != null) {
            re6Var.r0(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // defpackage.cag
    public float c() {
        Float f = (Float) ((xv1) this.a).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // defpackage.cag
    public float d() {
        return 1.0f;
    }

    @Override // defpackage.hpf
    public void dispose() {
        SparseArray sparseArray = (SparseArray) ((sh0) this.o).c;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((cn9) sparseArray.valueAt(size)) == ((cn9) this.c)) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // defpackage.cag
    public Rect e() {
        Rect rect = (Rect) this.b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) ((xv1) this.a).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // defpackage.cag
    public void f(float f, lq1 lq1Var) {
        ((Rect) ((xv1) this.a).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float fWidth = r0.width() / f;
        float fHeight = r0.height() / f;
        float fWidth2 = (r0.width() - fWidth) / 2.0f;
        float fHeight2 = (r0.height() - fHeight) / 2.0f;
        this.b = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        lq1 lq1Var2 = (lq1) this.c;
        if (lq1Var2 != null) {
            lq1Var2.d(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.o = (Rect) this.b;
        this.c = lq1Var;
    }

    @Override // defpackage.cag
    public void g() {
        this.o = null;
        this.b = null;
        lq1 lq1Var = (lq1) this.c;
        if (lq1Var != null) {
            lq1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
            this.c = null;
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        Context context = (Context) ((Provider) this.a).get();
        h45 h45Var = (h45) ((Provider) this.b).get();
        pb0 pb0Var = (pb0) ((Provider) this.c).get();
        return new z77(context, h45Var, pb0Var);
    }

    @Override // defpackage.tge
    public int h() {
        boolean z = (((uia) ((i50) this.a).o).X.a & 1) != 0;
        wia wiaVar = (wia) this.c;
        if (z) {
            return wiaVar.getMeasuredHeight();
        }
        return rh4.q(12, fk4.d().getDisplayMetrics().density, ((uge) this.o).getMeasuredHeight() - wiaVar.getMeasuredHeight());
    }

    @Override // defpackage.tk6
    public sk6 i() {
        e52 e52VarC = ((p82) this.c).C(((e52) this.a).a);
        if (e52VarC != null) {
            this.a = e52VarC;
        }
        return new zd2(this, p82.I(((e52) this.a).b, (Set) this.o));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public l0f j(JSONObject jSONObject) throws JSONException {
        nz4 nz4VarD0;
        JSONObject jSONObjectOptJSONObject;
        ((yb9) this.b).getClass();
        zad zadVarE = yb9.e(jSONObject);
        int iOptInt = jSONObject.optInt("participantCount", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("addedParticipantIds");
        nz4 nz4Var = nz4.a;
        lz1 lz1Var = (lz1) this.c;
        List listA = jSONArrayOptJSONArray != null ? lz1Var.a(jSONArrayOptJSONArray) : nz4Var;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("removedParticipantMarkers");
        if (jSONArrayOptJSONArray2 != null) {
            lz1Var.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArrayOptJSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                try {
                    jSONObjectOptJSONObject = jSONObject2.optJSONObject("GRID");
                } catch (JSONException e) {
                    lz1Var.a.logException("ParticipantParser", "Can't parse id from " + jSONObject2, e);
                }
                bg1 bg1VarA = jSONObjectOptJSONObject == null ? null : bg1.a(jSONObjectOptJSONObject.getString("id"));
                if (bg1VarA != null) {
                    linkedHashSet.add(bg1VarA);
                }
            }
            nz4VarD0 = x53.D0(linkedHashSet);
        } else {
            nz4VarD0 = nz4Var;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("addedParticipants");
        return new l0f(zadVarE, iOptInt, listA, jSONArrayOptJSONArray3 != null ? ((die) this.o).H(jSONArrayOptJSONArray3, zadVarE) : null, nz4VarD0);
    }

    @Override // defpackage.tge
    public int k() {
        boolean z = (((uia) ((i50) this.a).o).X.a & 1) != 0;
        wia wiaVar = (wia) this.c;
        return z ? wiaVar.getBottom() : wiaVar.getTop();
    }

    public ArrayList l(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.a;
        z(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.b;
        z(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            lk0 lk0Var = (lk0) list.get(i);
            if (!map.containsKey(lk0Var.b) && !map2.containsKey(Integer.valueOf(lk0Var.c))) {
                arrayList.add(lk0Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.tge
    public void m() {
        Handler handler = cia.a;
        cia.b((zha) ((i50) this.a).s0, yha.b);
    }

    @Override // defpackage.hpf
    public int n(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        StringBuilder sbN = rh4.n(i, "requested global type ", " does not belong to the adapter:");
        sbN.append(((cn9) this.c).c);
        throw new IllegalStateException(sbN.toString());
    }

    @Override // defpackage.hpf
    public int o(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.a;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey > -1) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        sh0 sh0Var = (sh0) this.o;
        int i2 = sh0Var.b;
        sh0Var.b = i2 + 1;
        ((SparseArray) sh0Var.c).put(i2, (cn9) this.c);
        sparseIntArray.put(i, i2);
        ((SparseIntArray) this.b).put(i2, i);
        return i2;
    }

    @Override // defpackage.tge
    public void onDismiss() {
        i50 i50Var = (i50) this.a;
        ViewGroup viewGroup = (ViewGroup) ((WeakReference) i50Var.c).get();
        if (viewGroup != null) {
            viewGroup.post(new do9(i50Var, 4, (mec) this.b));
        }
        Handler handler = cia.a;
        AtomicBoolean atomicBoolean = cia.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            bia biaVar = cia.b;
            if (biaVar != null ? tpa.f(biaVar.b.get(), (zha) i50Var.s0) : false) {
                cia.b = null;
                if (cia.c != null) {
                    cia.d();
                }
            }
            atomicBoolean.set(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map p(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "featuresPerRole"
            org.json.JSONObject r11 = r11.optJSONObject(r0)
            if (r11 != 0) goto Lb
            oz4 r10 = defpackage.oz4.a
            return r10
        Lb:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r11.keys()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.c
            hx9 r3 = (defpackage.hx9) r3
            r3.getClass()
            u61 r3 = defpackage.hx9.r(r2)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "warning: unknown feature: "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "CallFeatureNotificationHandler"
            java.lang.Object r4 = r10.b
            a4c r4 = (defpackage.a4c) r4
            r4.log(r3, r2)
            goto L14
        L3d:
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r2 != 0) goto L46
            wz4 r2 = defpackage.wz4.a
            goto La2
        L46:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            int r5 = r2.length()
            r6 = 0
        L50:
            if (r6 >= r5) goto La1
            java.lang.String r7 = r2.optString(r6)
            if (r7 != 0) goto L59
            goto L9e
        L59:
            java.lang.Object r8 = r10.o
            xxc r8 = (defpackage.xxc) r8
            r8.getClass()
            int r8 = r7.hashCode()
            r9 = -1290540065(0xffffffffb313ebdf, float:-3.4440628E-8)
            if (r8 == r9) goto L8c
            r9 = 62130991(0x3b40b2f, float:1.0582017E-36)
            if (r8 == r9) goto L80
            r9 = 1746537484(0x681a0c0c, float:2.9098667E24)
            if (r8 == r9) goto L74
            goto L94
        L74:
            java.lang.String r8 = "CREATOR"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L7d
            goto L94
        L7d:
            eg1 r7 = defpackage.eg1.a
            goto L98
        L80:
            java.lang.String r8 = "ADMIN"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L89
            goto L94
        L89:
            eg1 r7 = defpackage.eg1.b
            goto L98
        L8c:
            java.lang.String r8 = "SPEAKER"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L96
        L94:
            r7 = 0
            goto L98
        L96:
            eg1 r7 = defpackage.eg1.c
        L98:
            if (r7 != 0) goto L9b
            goto L9e
        L9b:
            r4.add(r7)
        L9e:
            int r6 = r6 + 1
            goto L50
        La1:
            r2 = r4
        La2:
            r0.put(r3, r2)
            goto L14
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8d.p(org.json.JSONObject):java.util.Map");
    }

    @Override // defpackage.tge
    public View q() {
        return (wia) this.c;
    }

    public Size[] s(int i) {
        HashMap map = (HashMap) this.c;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        Size[] outputSizes = ((StreamConfigurationMap) ((fd7) this.a).a).getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return outputSizes;
        }
        Size[] sizeArrP = ((y7g) this.b).p(outputSizes, i);
        map.put(Integer.valueOf(i), sizeArrP);
        return (Size[]) sizeArrP.clone();
    }

    public void t(JSONObject jSONObject) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("feedback");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    ((b46) this.b).getClass();
                    arrayList.add(b46.q(jSONObject2));
                }
            }
            ((yb9) this.c).getClass();
            ((ve5) this.o).onFeedback(new a71(yb9.e(jSONObject), arrayList));
        } catch (JSONException e) {
            ((a4c) this.a).logException("FeedbackNotificationHandler", "Can't parse feedback", e);
        }
    }

    public boolean u(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.b).booleanValue();
        return ((Boolean) this.c).booleanValue();
    }

    public boolean v(Context context) {
        if (((Boolean) this.b) == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.b).booleanValue();
        return ((Boolean) this.b).booleanValue();
    }

    public void w(JSONObject jSONObject) {
        a4c a4cVar = (a4c) this.b;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("features");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                ((hx9) this.c).getClass();
                u61 u61VarR = hx9.r(string);
                if (u61VarR != null) {
                    linkedHashSet.add(u61VarR);
                } else {
                    a4cVar.log("CallFeatureNotificationHandler", "warning: unknown feature: ".concat(string));
                }
            }
            ((a66) this.a).invoke(w51.x0, new x61(linkedHashSet));
        } catch (JSONException e) {
            a4cVar.logException("CallFeatureNotificationHandler", "feature set changed notification parsing error", e);
        }
    }

    public void x(JSONObject jSONObject) {
        try {
            ((a66) this.a).invoke(w51.y0, new y61(p(jSONObject)));
        } catch (JSONException e) {
            ((a4c) this.b).logException("CallFeatureNotificationHandler", "features per role changed notification parsing error", e);
        }
    }

    @Override // defpackage.tge
    public int y() {
        if ((((uia) ((i50) this.a).o).X.a & 1) != 0) {
            return 0;
        }
        return ((uge) this.o).getMeasuredHeight();
    }

    public c8d(int i) {
        switch (i) {
            case 3:
                Random random = new Random();
                this.c = new HashMap();
                this.o = random;
                this.a = new HashMap();
                this.b = new HashMap();
                break;
            case 6:
                break;
            case 11:
                this.a = new l7b(1);
                this.b = new djb(0);
                this.c = new wva();
                this.o = new re6(24);
                break;
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.o = new ArrayDeque();
                break;
        }
    }
}

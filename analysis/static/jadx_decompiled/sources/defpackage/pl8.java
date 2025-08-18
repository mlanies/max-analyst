package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import androidx.work.WorkRequest;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.media.transformer.MediaTransformException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class pl8 implements e15, ab3, r78 {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;
    public Object o;

    public /* synthetic */ pl8(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.o = obj3;
    }

    public static ba4 s(eb8 eb8Var) {
        jb4 jb4Var = new jb4();
        jb4Var.b = null;
        Uri uri = eb8Var.b;
        String string = uri == null ? null : uri.toString();
        boolean z = eb8Var.f;
        w36 w36Var = new w36();
        fm9.f((z && TextUtils.isEmpty(string)) ? false : true);
        w36Var.b = jb4Var;
        w36Var.c = string;
        w36Var.a = z;
        w36Var.o = new HashMap();
        m5f it = eb8Var.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) w36Var.o)) {
                ((HashMap) w36Var.o).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = ew0.a;
        huc hucVar = new huc();
        UUID uuid2 = eb8Var.a;
        uuid2.getClass();
        boolean z2 = eb8Var.d;
        boolean z3 = eb8Var.e;
        int[] iArrC0 = s5c.c0(eb8Var.g);
        int length = iArrC0.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArrC0[i];
            fm9.f(i2 == 2 || i2 == 1);
        }
        ba4 ba4Var = new ba4(uuid2, w36Var, map, z2, (int[]) iArrC0.clone(), z3, hucVar, 300000L);
        byte[] bArr = eb8Var.h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        fm9.k(ba4Var.m.isEmpty());
        ba4Var.v = 0;
        ba4Var.w = bArrCopyOf;
        return ba4Var;
    }

    public f15 A(int i) {
        HashMap map = (HashMap) this.o;
        if (map.containsKey(Integer.valueOf(i))) {
            return (f15) map.get(Integer.valueOf(i));
        }
        e15 e15Var = (e15) this.c;
        ga0 ga0VarE = null;
        if (e15Var.m(i)) {
            f15 f15VarN = e15Var.n(i);
            if (f15VarN != null) {
                ArrayList arrayList = new ArrayList();
                for (ha0 ha0Var : f15VarN.d()) {
                    if (hu4.a(ha0Var, (eu4) this.b)) {
                        arrayList.add(ha0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ga0VarE = ga0.e(f15VarN.a(), f15VarN.b(), f15VarN.c(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), ga0VarE);
        }
        return ga0VarE;
    }

    public boolean B() throws IOException {
        String strTrim;
        if (((String) this.b) != null) {
            return true;
        }
        Queue queue = (Queue) this.o;
        if (!queue.isEmpty()) {
            String str = (String) queue.poll();
            str.getClass();
            this.b = str;
            return true;
        }
        do {
            String line = ((BufferedReader) this.c).readLine();
            this.b = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.b = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public void C(Object obj) {
        wb3 wb3Var = (wb3) this.c;
        LinkedHashMap linkedHashMap = wb3Var.b;
        String str = (String) this.b;
        Object obj2 = linkedHashMap.get(str);
        f8 f8Var = (f8) this.o;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + f8Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        ArrayList arrayList = wb3Var.d;
        arrayList.add(str);
        try {
            wb3Var.b(iIntValue, f8Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    public String D() {
        if (!B()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.b;
        this.b = null;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [nz4] */
    public ipd E(JSONObject jSONObject) {
        try {
            ?? arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rooms");
            if (jSONArrayOptJSONArray == null) {
                arrayList = nz4.a;
            } else {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    hpd hpdVarL = jSONObjectOptJSONObject != null ? ((bwf) this.o).l(jSONObjectOptJSONObject) : null;
                    if (hpdVarL != null) {
                        arrayList.add(hpdVarL);
                    }
                }
            }
            ((yb9) this.b).getClass();
            return new ipd(yb9.e(jSONObject), arrayList);
        } catch (JSONException e) {
            ((a4c) this.c).logException("SessionRoomsParser", "Can't parse rooms state", e);
            return null;
        }
    }

    public void F() {
        Integer num;
        wb3 wb3Var = (wb3) this.c;
        ArrayList arrayList = wb3Var.d;
        String str = (String) this.b;
        if (!arrayList.contains(str) && (num = (Integer) wb3Var.b.remove(str)) != null) {
            wb3Var.a.remove(num);
        }
        wb3Var.e.remove(str);
        LinkedHashMap linkedHashMap = wb3Var.f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = wb3Var.g;
        if (bundle.containsKey(str)) {
            Objects.toString((d8) ay7.v(bundle, str, d8.class));
            bundle.remove(str);
        }
        au1.r(wb3Var.c.get(str));
    }

    @Override // defpackage.r78
    public void a(long j, int i, int i2, int i3) throws MediaCodec.CryptoException {
        ((MediaCodec) this.c).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.ab3
    public void b() {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            ((hc3) this.c).g();
            ((ab3) this.o).b();
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void c(zl4 zl4Var) {
        ((hc3) this.c).a(zl4Var);
    }

    @Override // defpackage.r78
    public void d(int i, long j) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.r78
    public int e() {
        return ((MediaCodec) this.c).dequeueInputBuffer(0L);
    }

    public void f(h1f h1fVar) {
        String str = (String) this.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Transformer.abortSafely, cancel transformer", null);
        }
        try {
            h1fVar.c();
        } catch (Throwable th) {
            hm9.l0((String) this.b, "Transformer.abortSafely, failed to cancel transformer", th);
        }
    }

    @Override // defpackage.r78
    public void flush() {
        ((MediaCodec) this.c).flush();
    }

    @Override // defpackage.r78
    public int g(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.c;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && maf.a < 21) {
                this.o = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.r78
    public ByteBuffer getInputBuffer(int i) {
        return maf.a >= 21 ? ((MediaCodec) this.c).getInputBuffer(i) : ((ByteBuffer[]) this.b)[i];
    }

    @Override // defpackage.r78
    public ByteBuffer getOutputBuffer(int i) {
        return maf.a >= 21 ? ((MediaCodec) this.c).getOutputBuffer(i) : ((ByteBuffer[]) this.o)[i];
    }

    @Override // defpackage.r78
    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.c).getOutputFormat();
    }

    @Override // defpackage.r78
    public void h(int i) {
        ((MediaCodec) this.c).setVideoScalingMode(i);
    }

    public String i(int i, long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            List list = (List) this.b;
            int size = list.size();
            List list2 = (List) this.c;
            if (i2 >= size) {
                sb.append((String) list2.get(list.size()));
                return sb.toString();
            }
            sb.append((String) list2.get(i2));
            if (((Integer) list.get(i2)).intValue() == 1) {
                sb.append(str);
            } else {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                List list3 = (List) this.o;
                if (iIntValue == 2) {
                    sb.append(String.format(Locale.US, (String) list3.get(i2), Long.valueOf(j)));
                } else if (((Integer) list.get(i2)).intValue() == 3) {
                    sb.append(String.format(Locale.US, (String) list3.get(i2), Integer.valueOf(i)));
                } else if (((Integer) list.get(i2)).intValue() == 4) {
                    sb.append(String.format(Locale.US, (String) list3.get(i2), Long.valueOf(j2)));
                }
            }
            i2++;
        }
    }

    @Override // defpackage.r78
    public void j(Surface surface) {
        ((MediaCodec) this.c).setOutputSurface(surface);
    }

    @Override // defpackage.r78
    public void k(int i, rz3 rz3Var, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.c).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) rz3Var.i, j, 0);
    }

    @Override // defpackage.r78
    public void l(r88 r88Var, Handler handler) {
        ((MediaCodec) this.c).setOnFrameRenderedListener(new xx(this, r88Var, 2), handler);
    }

    @Override // defpackage.e15
    public boolean m(int i) {
        switch (this.a) {
            case 2:
                if (((e15) this.c).m(i) && z(i) != null) {
                }
                break;
            default:
                if (((e15) this.c).m(i) && A(i) != null) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.e15
    public f15 n(int i) {
        switch (this.a) {
            case 2:
                return z(i);
            default:
                return A(i);
        }
    }

    public void o(h1f h1fVar) {
        try {
            h1fVar.g();
            pm7 pm7Var = h1fVar.f;
            pm7Var.g();
            pm7Var.d.clear();
        } catch (Throwable th) {
            hm9.l0((String) this.b, "Transformer.cleanupSafely, failed to cleanup transformer", th);
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void onError(Throwable th) {
        if (!((AtomicBoolean) this.b).compareAndSet(false, true)) {
            j47.Z(th);
        } else {
            ((hc3) this.c).g();
            ((ab3) this.o).onError(th);
        }
    }

    public dd3 p(ml8 ml8Var, mv4 mv4Var) {
        int i = 0;
        ww6 ww6Var = new ww6(4);
        ww6Var.a(mv4Var);
        ww6Var.b(new mv4[0]);
        ffc ffcVarJ = ww6Var.j();
        fm9.e("The composition must contain at least one EditedMediaItemSequence.", !ffcVarJ.isEmpty());
        zw6 zw6VarJ = zw6.j(ffcVarJ);
        crd crdVar = crd.u0;
        vv4 vv4Var = vv4.c;
        el8 el8Var = (el8) this.c;
        if (el8Var.j && el8Var.k) {
            ml8Var.e = 0;
        } else {
            i = 2;
            ml8Var.e = 2;
        }
        return new dd3(zw6VarJ, crdVar, vv4Var, false, false, false, i, false);
    }

    public lv4 q(tb8 tb8Var) {
        vv4 vv4Var = vv4.c;
        el8 el8Var = (el8) this.c;
        boolean z = el8Var.i;
        wmd.i(4, "initialCapacity");
        Object[] objArr = new Object[4];
        objArr[0] = b8b.e(el8Var.d, el8Var.e);
        return new lv4(tb8Var, z, false, false, -9223372036854775807L, -2147483647, new vv4(nz4.a, zw6.h(1, objArr)));
    }

    public na4 r(ml8 ml8Var) {
        ml8Var.d = 1;
        int i = ((el8) this.c).f;
        iff iffVar = new iff(i > 0 ? i : -1, 1, -1, -1, 1.0f, -1, -1, false);
        na4 na4Var = new na4((Context) this.o);
        na4Var.c = iffVar;
        na4Var.o = false;
        return new na4(na4Var);
    }

    @Override // defpackage.r78
    public void release() {
        this.b = null;
        this.o = null;
        ((MediaCodec) this.c).release();
    }

    @Override // defpackage.r78
    public void releaseOutputBuffer(int i, boolean z) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, z);
    }

    @Override // defpackage.r78
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.c).setParameters(bundle);
    }

    public tb8 t(ra8 ra8Var) {
        ib8 ib8Var;
        za8 za8Var = new za8();
        s74 s74Var = new s74();
        List listEmptyList = Collections.emptyList();
        ffc ffcVar = ffc.X;
        fb8 fb8Var = new fb8();
        lb8 lb8Var = lb8.d;
        el8 el8Var = (el8) this.c;
        Uri uri = el8Var.b;
        if (ra8Var != null) {
            long j = ra8Var.a;
            if (j != -9223372036854775807L) {
                float f = el8Var.g;
                if (f != 0.0f || el8Var.h != 1.0f) {
                    float f2 = j;
                    float f3 = f * f2;
                    float f4 = f2 * el8Var.h;
                    za8 za8Var2 = new za8();
                    za8Var2.f((long) f3);
                    za8Var2.d((long) f4);
                    za8Var = new bb8(za8Var2).a();
                }
            }
        }
        fm9.k(((Uri) s74Var.e) == null || ((UUID) s74Var.d) != null);
        if (uri != null) {
            ib8Var = new ib8(uri, null, ((UUID) s74Var.d) != null ? new eb8(s74Var) : null, null, listEmptyList, null, ffcVar, null, -9223372036854775807L);
        } else {
            ib8Var = null;
        }
        return new tb8("", new db8(za8Var), ib8Var, new hb8(fb8Var), gd8.J, lb8Var);
    }

    public h1f u(na4 na4Var, ol8 ol8Var) {
        String strL;
        String strL2;
        Context applicationContext = ((Context) this.o).getApplicationContext();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        yb9 yb9Var = new yb9();
        qf4 qf4VarBuild = new DefaultVideoFrameProcessor$Factory$Builder().build();
        applicationContext.getApplicationContext();
        rxd rxdVar = new rxd(13);
        Looper looperW = oaf.w();
        pm7 pm7Var = new pm7(looperW, she.a, new hme(23));
        pm7Var.g();
        pm7Var.d.clear();
        pm7Var.a(ol8Var);
        if (((el8) this.c).k) {
            strL = null;
        } else {
            strL = ia9.l("video/avc");
            fm9.e("Not a video MIME type: " + strL, ia9.k(strL));
        }
        if (strL != null) {
            strL2 = ia9.l(strL);
            fm9.e("Not a video MIME type: " + strL2, strL2 == null || ia9.k(strL2));
        } else {
            strL2 = null;
        }
        f1f f1fVar = new f1f(null, -1, 0, strL2);
        lh4 lh4Var = (lh4) rxdVar.b;
        String str = f1fVar.b;
        if (str != null) {
            fm9.j("Unsupported sample MIME type ".concat(str), lh4Var.w(ia9.g(str)).contains(str));
        }
        String str2 = f1fVar.c;
        if (str2 != null) {
            fm9.j("Unsupported sample MIME type ".concat(str2), lh4Var.w(ia9.g(str2)).contains(str2));
        }
        return new h1f(applicationContext, f1fVar, WorkRequest.MIN_BACKOFF_MILLIS, pm7Var, yb9Var, qf4VarBuild, na4Var, rxdVar, looperW);
    }

    public void v(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.c;
        qob qobVar = new qob(byteArrayOutputStream, map, (Map) this.b, (my9) this.o);
        my9 my9Var = (my9) map.get(obj.getClass());
        if (my9Var != null) {
            my9Var.a(obj, qobVar);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    public void w(ml8 ml8Var, dd3 dd3Var) {
        String str = (String) this.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "executeWithMainLooper", null);
        }
        String str2 = ((el8) this.c).c;
        Handler handler = new Handler(Looper.getMainLooper());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ol8 ol8Var = new ol8(ml8Var, this, countDownLatch, 1);
        final h1f h1fVarU = u(r(ml8Var), ol8Var);
        if (!handler.post(new vq1(this, h1fVarU, dd3Var, str2, ol8Var, 6))) {
            ml8Var.a(new MediaTransformException("Failed to start media transform on main loop", null));
            final int i = 0;
            if (handler.post(new Runnable(this) { // from class: nl8
                public final /* synthetic */ pl8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            this.b.o(h1fVarU);
                            break;
                        case 1:
                            this.b.o(h1fVarU);
                            break;
                        default:
                            this.b.f(h1fVarU);
                            break;
                    }
                }
            })) {
                return;
            }
            String str3 = (String) this.b;
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.Z, str3, "executeWithMainLooper, failed to cleanup transformer on main loop", null);
                return;
            }
            return;
        }
        el8 el8Var = (el8) this.c;
        el8Var.getClass();
        hl8 hl8Var = new hl8(handler, h1fVarU, 500L, 300000L, (wz7) el8Var.l);
        hl8Var.b();
        String str4 = (String) this.b;
        ir6 ir6Var3 = hm9.m;
        if (ir6Var3 != null && ir6Var3.c()) {
            ir6Var3.d(us7.X, str4, "executeWithMainLooper, waiting for completion ...", null);
        }
        try {
            try {
                countDownLatch.await();
                String str5 = (String) this.b;
                ir6 ir6Var4 = hm9.m;
                if (ir6Var4 != null && ir6Var4.c()) {
                    ir6Var4.d(us7.X, str5, "executeWithMainLooper, completed", null);
                }
                hl8Var.a();
                final int i2 = 1;
                if (handler.post(new Runnable(this) { // from class: nl8
                    public final /* synthetic */ pl8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.b.o(h1fVarU);
                                break;
                            case 1:
                                this.b.o(h1fVarU);
                                break;
                            default:
                                this.b.f(h1fVarU);
                                break;
                        }
                    }
                })) {
                    return;
                }
                String str6 = (String) this.b;
                ir6 ir6Var5 = hm9.m;
                if (ir6Var5 != null && ir6Var5.c()) {
                    ir6Var5.d(us7.Z, str6, "executeWithMainLooper, failed to cleanup transformer on main loop", null);
                }
            } catch (InterruptedException e) {
                ml8Var.a(new MediaTransformException("Waiting for media transform completion interrupted", e));
                final int i3 = 2;
                if (!handler.post(new Runnable(this) { // from class: nl8
                    public final /* synthetic */ pl8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.b.o(h1fVarU);
                                break;
                            case 1:
                                this.b.o(h1fVarU);
                                break;
                            default:
                                this.b.f(h1fVarU);
                                break;
                        }
                    }
                })) {
                    String str7 = (String) this.b;
                    ir6 ir6Var6 = hm9.m;
                    if (ir6Var6 != null && ir6Var6.c()) {
                        ir6Var6.d(us7.Z, str7, "executeWithMainLooper, failed to abort media transformer on main loop", null);
                    }
                }
                hl8Var.a();
                final int i4 = 1;
                if (handler.post(new Runnable(this) { // from class: nl8
                    public final /* synthetic */ pl8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.b.o(h1fVarU);
                                break;
                            case 1:
                                this.b.o(h1fVarU);
                                break;
                            default:
                                this.b.f(h1fVarU);
                                break;
                        }
                    }
                })) {
                    return;
                }
                String str8 = (String) this.b;
                ir6 ir6Var7 = hm9.m;
                if (ir6Var7 != null && ir6Var7.c()) {
                    ir6Var7.d(us7.Z, str8, "executeWithMainLooper, failed to cleanup transformer on main loop", null);
                }
            }
        } catch (Throwable th) {
            hl8Var.a();
            final int i5 = 1;
            if (!handler.post(new Runnable(this) { // from class: nl8
                public final /* synthetic */ pl8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i5) {
                        case 0:
                            this.b.o(h1fVarU);
                            break;
                        case 1:
                            this.b.o(h1fVarU);
                            break;
                        default:
                            this.b.f(h1fVarU);
                            break;
                    }
                }
            })) {
                String str9 = (String) this.b;
                ir6 ir6Var8 = hm9.m;
                if (ir6Var8 != null && ir6Var8.c()) {
                    ir6Var8.d(us7.Z, str9, "executeWithMainLooper, failed to cleanup transformer on main loop", null);
                }
            }
            throw th;
        }
    }

    public tr4 x(tb8 tb8Var) {
        ba4 ba4Var;
        tb8Var.b.getClass();
        eb8 eb8Var = tb8Var.b.c;
        if (eb8Var == null) {
            return tr4.a;
        }
        synchronized (this.c) {
            try {
                if (!eb8Var.equals((eb8) this.b)) {
                    this.b = eb8Var;
                    this.o = s(eb8Var);
                }
                ba4Var = (ba4) this.o;
                ba4Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ba4Var;
    }

    public gq9 y() {
        yb9 yb9Var = gq9.a;
        String string = ((SharedPreferences) ((je7) this.c).getValue()).getString("nightmode", "");
        yb9Var.getClass();
        List listP0 = w9e.P0(string, new char[]{','});
        boolean zIsEmpty = listP0.isEmpty();
        fq9 fq9Var = fq9.b;
        if (zIsEmpty) {
            return fq9Var;
        }
        String str = (String) x53.g0(listP0);
        switch (str.hashCode()) {
            case -1609594047:
                return !str.equals("enabled") ? fq9Var : dq9.b;
            case -887328209:
                str.equals("system");
                return fq9Var;
            case -697920873:
                if (!str.equals("schedule")) {
                    return fq9Var;
                }
                int i = ft4.o;
                int i2 = Integer.parseInt((String) listP0.get(1));
                kt4 kt4Var = kt4.MINUTES;
                return new eq9(z7.R(i2, kt4Var), z7.R(Integer.parseInt((String) listP0.get(2)), kt4Var));
            case 3005871:
                return !str.equals("auto") ? fq9Var : new bq9(Integer.parseInt((String) listP0.get(1)));
            case 270940796:
                return !str.equals("disabled") ? fq9Var : cq9.b;
            default:
                return fq9Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.f15 z(int r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl8.z(int):f15");
    }

    public pl8(khe kheVar) {
        this.a = 8;
        this.c = kheVar;
        kld kldVarB = lld.b(0, 1, 2, 1);
        this.b = kldVarB;
        this.o = new v7c(kldVarB);
    }

    public pl8(el8 el8Var) {
        this.a = 0;
        this.c = el8Var;
        this.b = pl8.class.getName();
        this.o = el8Var.a.getApplicationContext();
    }

    public pl8(e15 e15Var, eu4 eu4Var) {
        this.a = 5;
        this.o = new HashMap();
        this.c = e15Var;
        this.b = eu4Var;
    }

    public pl8() {
        this.a = 4;
        this.c = new Object();
    }

    public pl8(Runnable runnable) {
        this.a = 7;
        this.b = new CopyOnWriteArrayList();
        this.o = new HashMap();
        this.c = runnable;
    }

    public pl8(adb adbVar) {
        this.a = 2;
        mu1 mu1Var = eff.o;
        this.o = new HashMap();
        this.c = adbVar;
        this.b = mu1Var;
    }

    public pl8(MediaCodec mediaCodec) {
        this.a = 11;
        this.c = mediaCodec;
        if (maf.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.o = mediaCodec.getOutputBuffers();
        }
    }

    public pl8(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 6;
        this.o = arrayDeque;
        this.c = bufferedReader;
    }
}

package defpackage;

import android.content.Intent;
import android.hardware.camera2.CaptureResult;
import android.media.MediaDrmException;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandExecutionException;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException;

/* loaded from: classes2.dex */
public final class sp3 implements l30, s43, j55, ele, fu3, fd6, pv1, t65, h78, noc, j8e, kx3 {
    public static final sp3 a = new sp3();
    public static final sp3 b = new sp3();
    public static final sp3 c = new sp3();
    public static final sp3 o = new sp3();
    public static final sp3 X = new sp3();
    public static final sp3 Y = new sp3();
    public static final sp3 Z = new sp3();
    public static final sp3 s0 = new sp3();
    public static final sp3 t0 = new sp3();
    public static final sp3 u0 = new sp3();
    public static final /* synthetic */ sp3 v0 = new sp3();

    public static roc C(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("response");
        string.getClass();
        if (string.equals("report-perf-stat")) {
            return new fhc(jSONObject.has("estimatedPerformanceIndex") ? Integer.valueOf(jSONObject.getInt("estimatedPerformanceIndex")) : null);
        }
        if (!string.equals("update-display-layout")) {
            return null;
        }
        if (!jSONObject.has("errorCodeByParticipantId")) {
            return new f6f(Collections.emptyMap());
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("errorCodeByParticipantId");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(f46.Z(next), jSONObject2.getInt(next) == -1 ? e6f.b : e6f.a);
        }
        return new f6f(map);
    }

    public static JSONObject D(long j, hoc hocVar) throws JSONException {
        if (hocVar instanceof ehc) {
            ehc ehcVar = (ehc) hocVar;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("framesReceived", ehcVar.a);
            jSONObject.put("framesDecoded", ehcVar.b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sequence", j);
            jSONObject2.put("command", "report-perf-stat");
            jSONObject2.put("report", jSONObject);
            return jSONObject2;
        }
        if (!(hocVar instanceof d6f)) {
            if (hocVar instanceof nhc) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("sequence", j);
                jSONObject3.put("command", "request-asr");
                jSONObject3.put("start", ((nhc) hocVar).a);
                return jSONObject3;
            }
            if (!(hocVar instanceof chc)) {
                return null;
            }
            chc chcVar = (chc) hocVar;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sequence", j);
            jSONObject4.put("command", "report-network-stat");
            jSONObject4.put("timestamp", chcVar.a);
            jSONObject4.put("bitrate", chcVar.b);
            return jSONObject4;
        }
        d6f d6fVar = (d6f) hocVar;
        JSONObject jSONObject5 = new JSONObject();
        for (m7d m7dVar : d6fVar.a) {
            l7d l7dVar = m7dVar.b;
            jSONObject5.put(f46.P(m7dVar), l7dVar.a ? "ss" : "sz=" + l7dVar.b + "x" + l7dVar.c + ":fit=" + k7d.b(l7dVar.d));
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("sequence", j);
        jSONObject6.put("command", "update-display-layout");
        jSONObject6.put("layouts", jSONObject5);
        if (d6fVar.b) {
            jSONObject6.put("snapshot", true);
        }
        return jSONObject6;
    }

    @Override // defpackage.pv1
    public mv1 A() {
        return mv1.a;
    }

    @Override // defpackage.noc
    public sh0 W(long j, hoc hocVar) throws RtcCommandSerializeException {
        if (hocVar == null) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalArgumentException("Illegal 'command' value: null"));
        }
        try {
            JSONObject jSONObjectD = D(j, hocVar);
            if (jSONObjectD != null) {
                return new sh0(1, jSONObjectD.toString().getBytes());
            }
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalStateException("No serializer for command: " + hocVar.getClass()));
        } catch (JSONException e) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalArgumentException("Unable to serialize command: " + hocVar.getClass(), e));
        }
    }

    @Override // defpackage.t65
    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.pv1
    public nje c() {
        return nje.b;
    }

    @Override // defpackage.t65
    /* renamed from: d */
    public r65 mo2d() {
        throw new IllegalStateException();
    }

    @Override // defpackage.h78, defpackage.i78
    public long e() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.t65
    /* renamed from: f */
    public qz3 mo3f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.t65
    public byte[] g() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.pv1
    public long getTimestamp() {
        return -1L;
    }

    @Override // defpackage.h78, defpackage.i78
    public long h() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.t65
    public boolean i(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // defpackage.t65
    public void j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.t65
    public void k(byte[] bArr) {
    }

    @Override // defpackage.t65
    public byte[] l(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.t65
    public void m(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.t65
    /* renamed from: n */
    public p65 mo4n(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // defpackage.h78, defpackage.i78
    public boolean next() {
        return false;
    }

    @Override // defpackage.t65
    public int o() {
        return 1;
    }

    @Override // defpackage.ele
    public long p(int i, long j, float f) {
        long j2;
        if (j <= 0) {
            return System.currentTimeMillis();
        }
        if (i > 10) {
            j2 = 300000;
        } else {
            hm9.m("sp3", "errorCount = %d^2 * 3 * 1000", Integer.valueOf(i));
            j2 = i * i * 3000;
        }
        return j2 + j;
    }

    @Override // defpackage.pv1
    public nv1 r() {
        return nv1.a;
    }

    @Override // defpackage.t65
    public void release() {
    }

    @Override // defpackage.pv1
    public int s() {
        return 1;
    }

    @Override // defpackage.noc
    public g03 t(int i, byte[] bArr) throws RtcCommandSerializeException, RtcCommandExecutionException {
        if (i == 0) {
            throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Illegal 'format' value: null"));
        }
        if (i != 1) {
            throw new RtcCommandSerializeException(null, false, new UnsupportedOperationException("Only text format is supported"));
        }
        try {
            String str = new String(bArr);
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    Long lValueOf = jSONObject.has("sequence") ? Long.valueOf(jSONObject.getLong("sequence")) : null;
                    String string = jSONObject.has("type") ? jSONObject.getString("type") : null;
                    if ("response".equals(string)) {
                        if (lValueOf == null) {
                            throw new RtcCommandSerializeException(lValueOf, false, new IllegalArgumentException("Unable to decode response id: ".concat(str)));
                        }
                        try {
                            roc rocVarC = C(jSONObject);
                            if (rocVarC == null) {
                                return null;
                            }
                            return new g03(lValueOf.longValue(), rocVarC, 8);
                        } catch (Throwable th) {
                            throw new RtcCommandSerializeException(lValueOf, false, new IllegalArgumentException("Unable to decode response body: ".concat(str), th));
                        }
                    }
                    if (!"error".equals(string)) {
                        return null;
                    }
                    jSONObject.optString("error", "");
                    boolean zOptBoolean = jSONObject.optBoolean("recoverable", false);
                    HashMap map = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map.put(next, strOptString);
                        }
                    }
                    throw new RtcCommandExecutionException(lValueOf, zOptBoolean, null);
                } catch (Throwable th2) {
                    throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response id/type: ".concat(str), th2));
                }
            } catch (Throwable th3) {
                throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response as json: ".concat(str), th3));
            }
        } catch (Throwable th4) {
            throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response as string", th4));
        }
    }

    @Override // defpackage.fu3
    public Object u(Task task) {
        Intent intent = (Intent) ((Bundle) task.f()).getParcelable("notification_data");
        if (intent != null) {
            return new r43(intent);
        }
        return null;
    }

    @Override // defpackage.pv1
    public lv1 v() {
        return lv1.a;
    }

    @Override // defpackage.s43
    public gle w(gy8 gy8Var) {
        int iN;
        String strP;
        if (!gy8Var.m()) {
            return new xm3(null);
        }
        try {
            iN = lz7.N(gy8Var);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int iS = au1.s(k7d.a);
            if (iS != 0) {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iN = 0;
        }
        if (iN == 0) {
            return new xm3(null);
        }
        wm3 wm3VarE = null;
        for (int i = 0; i < iN; i++) {
            try {
                strP = lz7.P(gy8Var);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int iS2 = au1.s(k7d.a);
                if (iS2 != 0) {
                    if (iS2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = null;
            }
            if (strP != null) {
                if (strP.equals("contact")) {
                    try {
                        wm3VarE = wm3.e(gy8Var);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int iS3 = au1.s(k7d.a);
                        if (iS3 != 0) {
                            if (iS3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                        wm3VarE = null;
                    }
                } else {
                    try {
                        gy8Var.z();
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int iS4 = au1.s(k7d.a);
                        if (iS4 != 0) {
                            if (iS4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new xm3(wm3VarE);
    }

    @Override // defpackage.t65
    public void x(wd6 wd6Var) {
    }

    @Override // defpackage.pv1
    public CaptureResult y() {
        return null;
    }
}

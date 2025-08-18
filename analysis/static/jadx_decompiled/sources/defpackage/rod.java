package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class rod {
    public final d4c a;
    public final a4c b;
    public final hrf g;
    public final gw3 o;
    public boolean q;
    public boolean r;
    public volatile long s;
    public volatile long t;
    public final boolean u;
    public final boolean v;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Handler d = new Handler(Looper.getMainLooper());
    public final AtomicLong e = new AtomicLong(1);
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();
    public final LongSparseArray i = new LongSparseArray();
    public final ArrayList j = new ArrayList();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet l = new CopyOnWriteArraySet();
    public boolean p = true;
    public final int n = 5;
    public final int m = 30000;

    public rod(hrf hrfVar, hw3 hw3Var, a4c a4cVar, d4c d4cVar, boolean z, boolean z2) {
        this.g = hrfVar;
        this.o = hw3Var;
        this.b = a4cVar;
        this.a = d4cVar;
        this.u = z;
        this.v = z2;
        hrfVar.m = new sy4(4, this);
    }

    public final d14 a(uod uodVar, long j) {
        try {
            return new d14(uodVar.a().put("sequence", j).toString(), j);
        } catch (JSONException e) {
            this.b.reportException("OKSignaling", "signaling.create.command", e);
            return null;
        }
    }

    public final sa5 b(long j) {
        sa5 sa5Var;
        synchronized (this.f) {
            try {
                int iIndexOfKey = this.i.indexOfKey(j);
                if (iIndexOfKey >= 0) {
                    sa5Var = (sa5) this.i.valueAt(iIndexOfKey);
                    this.i.removeAt(iIndexOfKey);
                } else {
                    sa5Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sa5Var;
    }

    public final void c(uod uodVar, qod qodVar, qod qodVar2) {
        synchronized (this.f) {
            try {
                this.b.log("OKSignaling", "<!> postpone send " + uodVar);
                if (this.v && e(uodVar, qodVar, qodVar2)) {
                    return;
                }
                d14 d14VarA = a(uodVar, this.e.getAndIncrement());
                if (d14VarA == null) {
                    return;
                }
                this.h.add(new sa5(this, uodVar, d14VarA, qodVar, qodVar2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(uod uodVar, boolean z, qod qodVar, qod qodVar2) {
        synchronized (this.f) {
            try {
                boolean z2 = this.u;
                boolean z3 = false;
                boolean z4 = !z2 && this.q;
                if (z2 && this.r) {
                    z3 = true;
                }
                if (z4 || z3 || z) {
                    d14 d14VarA = a(uodVar, this.e.getAndIncrement());
                    if (d14VarA == null) {
                        return;
                    }
                    this.i.put(d14VarA.b, new sa5(this, uodVar, d14VarA, qodVar, qodVar2));
                    this.g.f(d14VarA.a);
                } else {
                    c(uodVar, qodVar, qodVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(uod uodVar, qod qodVar, qod qodVar2) {
        String strOptString;
        sr8 sr8Var = uodVar instanceof wod ? new sr8((wod) uodVar, 1) : uodVar instanceof vod ? new sr8((vod) uodVar, 0) : null;
        if (sr8Var == null) {
            return false;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (size > 0) {
            if (size <= 0) {
                throw new IndexOutOfBoundsException("No more elements in the list");
            }
            int i = size - 1;
            apd apdVarW = sr8Var.w(((sa5) arrayList.get(i)).a);
            if (!apdVarW.equals(xod.a)) {
                if (apdVarW instanceof zod) {
                    sa5 sa5Var = (sa5) arrayList.get(i);
                    long jLongValue = Long.valueOf(sa5Var.b).longValue();
                    uod uodVar2 = ((zod) apdVarW).a;
                    d14 d14VarA = a(uodVar2, jLongValue);
                    sa5 sa5Var2 = d14VarA != null ? new sa5(this, uodVar2, d14VarA, qodVar, qodVar2) : null;
                    if (sa5Var2 == null) {
                        return false;
                    }
                    try {
                        if (sa5Var.e != null) {
                            sa5Var.f.c.post(new dd4(20, sa5Var));
                        }
                    } catch (Throwable th) {
                        try {
                            strOptString = sa5Var.a.a().optString("command");
                        } catch (JSONException unused) {
                            strOptString = "";
                        }
                        this.b.logException("SignalingCommandQueueIterator", wg0.i("Error on discard command ", strOptString), th);
                    }
                    arrayList.set(i, sa5Var2);
                } else if (!apdVarW.equals(yod.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return true;
            }
            size = i;
        }
        return false;
    }

    public final void f(final JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("type");
        long jOptLong = jSONObject.optLong("stamp", 0L);
        if (jOptLong != 0) {
            this.s = Math.max(jOptLong, this.s);
        }
        if (string.equals("response")) {
            String strOptString = jSONObject.optString("response", null);
            long j = jSONObject.getLong("sequence");
            if (!"recover".equals(strOptString) || this.u) {
                sa5 sa5VarB = b(j);
                final qod qodVar = sa5VarB != null ? sa5VarB.d : null;
                if (qodVar != null) {
                    final int i = 0;
                    this.c.post(new Runnable(this) { // from class: pod
                        public final /* synthetic */ rod b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    qod qodVar2 = qodVar;
                                    rod rodVar = this.b;
                                    a4c a4cVar = rodVar.b;
                                    try {
                                        boolean z = qodVar2 instanceof cw0;
                                        JSONObject jSONObject2 = jSONObject;
                                        if (z) {
                                            ((cw0) qodVar2).j(jSONObject2);
                                        } else if (rodVar.p) {
                                            qodVar2.j(jSONObject2);
                                        } else {
                                            a4cVar.log("OKSignaling", "<!> ignoring " + jSONObject2);
                                        }
                                        break;
                                    } catch (Exception e) {
                                        a4cVar.reportException("OKSignaling", "signaling.response", e);
                                        return;
                                    }
                                default:
                                    qod qodVar3 = qodVar;
                                    rod rodVar2 = this.b;
                                    a4c a4cVar2 = rodVar2.b;
                                    try {
                                        boolean z2 = qodVar3 instanceof cw0;
                                        JSONObject jSONObject3 = jSONObject;
                                        if (z2) {
                                            ((cw0) qodVar3).j(jSONObject3);
                                        } else if (rodVar2.p) {
                                            qodVar3.j(jSONObject3);
                                        } else {
                                            a4cVar2.log("OKSignaling", "<!> ignoring " + jSONObject3);
                                        }
                                        break;
                                    } catch (Exception e2) {
                                        a4cVar2.reportException("OKSignaling", "signaling.response", e2);
                                        return;
                                    }
                            }
                        }
                    });
                    return;
                }
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("messages");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    f(jSONArrayOptJSONArray.getJSONObject(i2));
                }
            }
            synchronized (this.f) {
                for (int i3 = 0; i3 < this.i.size(); i3++) {
                    try {
                        d14 d14Var = ((sa5) this.i.valueAt(i3)).c;
                        if (d14Var.b <= j) {
                            this.g.f(d14Var.a);
                        }
                    } finally {
                    }
                }
            }
            return;
        }
        if (!string.equals("notification")) {
            if (string.equals("error")) {
                if (!jSONObject.has("sequence")) {
                    this.c.post(new ewc(this, jSONObject, "listener.response.error", 3));
                    return;
                }
                long j2 = jSONObject.getLong("sequence");
                sa5 sa5VarB2 = b(j2);
                final qod qodVar2 = sa5VarB2 == null ? null : sa5VarB2.e;
                if (qodVar2 != null) {
                    final int i4 = 1;
                    this.c.post(new Runnable(this) { // from class: pod
                        public final /* synthetic */ rod b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    qod qodVar22 = qodVar2;
                                    rod rodVar = this.b;
                                    a4c a4cVar = rodVar.b;
                                    try {
                                        boolean z = qodVar22 instanceof cw0;
                                        JSONObject jSONObject2 = jSONObject;
                                        if (z) {
                                            ((cw0) qodVar22).j(jSONObject2);
                                        } else if (rodVar.p) {
                                            qodVar22.j(jSONObject2);
                                        } else {
                                            a4cVar.log("OKSignaling", "<!> ignoring " + jSONObject2);
                                        }
                                        break;
                                    } catch (Exception e) {
                                        a4cVar.reportException("OKSignaling", "signaling.response", e);
                                        return;
                                    }
                                default:
                                    qod qodVar3 = qodVar2;
                                    rod rodVar2 = this.b;
                                    a4c a4cVar2 = rodVar2.b;
                                    try {
                                        boolean z2 = qodVar3 instanceof cw0;
                                        JSONObject jSONObject3 = jSONObject;
                                        if (z2) {
                                            ((cw0) qodVar3).j(jSONObject3);
                                        } else if (rodVar2.p) {
                                            qodVar3.j(jSONObject3);
                                        } else {
                                            a4cVar2.log("OKSignaling", "<!> ignoring " + jSONObject3);
                                        }
                                        break;
                                    } catch (Exception e2) {
                                        a4cVar2.reportException("OKSignaling", "signaling.response", e2);
                                        return;
                                    }
                            }
                        }
                    });
                }
                String string2 = jSONObject.getString("error");
                if (!"service-unavailable".equals(string2)) {
                    this.a.log(e0e.app_event, "rtc.cmd.error." + string2, (String) null);
                    this.c.post(new ewc(this, jSONObject, "signaling.listener.response.error.seq", 3));
                    return;
                }
                this.a.log(e0e.app_event, "rtc.cmd.service.unavailable", (String) null);
                if (!jSONObject.optBoolean("recoverable", false)) {
                    this.c.post(new ewc(this, jSONObject, "signaling.listener.response.error.seq", 3));
                    return;
                }
                synchronized (this.f) {
                    try {
                        int iIndexOfKey = this.i.indexOfKey(j2);
                        sa5 sa5Var = iIndexOfKey >= 0 ? (sa5) this.i.valueAt(iIndexOfKey) : null;
                        if (sa5Var != null) {
                            d14 d14Var2 = sa5Var.c;
                            long j3 = d14Var2.d + 1;
                            d14Var2.d = j3;
                            if (j3 >= this.n) {
                                this.b.log("OKSignaling", "<!> quit retrying " + ((hw3) this.o).a + " " + d14Var2);
                                this.b.reportException("OKSignaling", "signaling.retry", new RuntimeException("retry.fail"));
                                this.i.removeAt(iIndexOfKey);
                                return;
                            }
                            i76 i76Var = new i76((Object) this, (Object) d14Var2, false, 5);
                            this.j.add(i76Var);
                            this.b.log("OKSignaling", "<!> retrying " + d14Var2);
                            this.d.postDelayed(i76Var, d14Var2.c);
                            long j4 = d14Var2.c * 2;
                            d14Var2.c = j4;
                            d14Var2.c = Math.min(j4, this.m);
                        }
                        return;
                    } finally {
                    }
                }
            }
            return;
        }
        if ("connection".equals(jSONObject.getString("notification"))) {
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("recoverMessages");
            if (jSONArrayOptJSONArray2 != null && this.u) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                    f(jSONArrayOptJSONArray2.getJSONObject(i5));
                }
            }
            String string3 = jSONObject.getJSONObject("conversation").getString("id");
            this.b.log("OKSignaling", "cur cid=" + ((hw3) this.o).a + ", new cid=" + string3);
            gw3 gw3Var = this.o;
            if (gw3Var instanceof hw3) {
                ((hw3) gw3Var).a = string3;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("conversationParams");
            if (jSONObjectOptJSONObject != null) {
                long jOptLong2 = jSONObjectOptJSONObject.optLong("activityTimeout", -1L);
                if (jOptLong2 > 0) {
                    hrf hrfVar = this.g;
                    hrfVar.getClass();
                    hrfVar.i = Math.max(Math.max(jOptLong2 / 2, jOptLong2 - 60000), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                    if (hrfVar.r > 0) {
                        hrfVar.r = Math.max(Math.min(jOptLong2 / 4, 61000L), 11000L);
                    }
                    hrfVar.q.o("updateTimeoutMS timeoutMS=" + hrfVar.i + " serverPingTimeoutMs=" + hrfVar.r);
                }
            }
            synchronized (this.f) {
                this.r = true;
                if (!this.q || this.u) {
                    this.q = true;
                    while (!this.h.isEmpty()) {
                        sa5 sa5Var2 = (sa5) this.h.remove(0);
                        d14 d14Var3 = sa5Var2.c;
                        this.b.log("OKSignaling", "send postponed " + d14Var3);
                        d14 d14Var4 = sa5Var2.c;
                        this.i.put(d14Var4.b, sa5Var2);
                        this.g.f(d14Var4.a);
                    }
                } else {
                    long j5 = this.t;
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("stamp", j5);
                        d14 d14VarA = a(f46.b(jSONObject2, "recover"), this.e.getAndIncrement());
                        if (d14VarA != null) {
                            this.g.f(d14VarA.a);
                        }
                    } catch (JSONException e) {
                        this.b.reportException("OKSignaling", "signaling.recover", e);
                    }
                }
            }
        }
        this.c.post(new flc(this, 18, jSONObject));
    }

    public final void g() {
        this.g.b();
        synchronized (this.f) {
            try {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    this.d.removeCallbacks((Runnable) it.next());
                }
                this.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(ka6 ka6Var, qod qodVar) {
        d(ka6Var, false, qodVar, null);
    }

    public final void i(uod uodVar) {
        d(uodVar, false, null, null);
    }

    public final void j(JSONObject jSONObject, qod qodVar, qod qodVar2) {
        d(new ka6(jSONObject), false, qodVar, qodVar2);
    }
}

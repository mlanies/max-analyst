package defpackage;

import android.net.Uri;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.google.android.material.textfield.TextInputLayout;
import com.my.tracker.obfuscated.f0;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.Size;
import org.webrtc.VideoFileRenderer;
import ru.ok.android.externcalls.analytics.internal.upload.UploadStarter;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ule implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ule(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IOException {
        byte[] bArr;
        DataInputStream dataInputStream;
        fg1 fg1Var;
        bg1 bg1Var;
        switch (this.a) {
            case 0:
                ((f5a) ((wle) this.b).l.getValue()).g(true);
                return;
            case 1:
                ((tme) this.b).b(true);
                return;
            case 2:
                ((TextInputLayout) this.b).o.requestLayout();
                return;
            case 3:
                ywe yweVar = (ywe) this.b;
                yweVar.w0 = null;
                yweVar.a();
                return;
            case 4:
                qye qyeVar = (qye) this.b;
                int andSet = qyeVar.h.getAndSet(8) - 8;
                js4 js4Var = (js4) qyeVar.a.h.a.getValue();
                js4Var.getClass();
                js4Var.a(Collections.singletonList(new ls4("non_fatal", "max_non_fatals_per_session_reached", andSet)));
                return;
            case 5:
                File file = (File) this.b;
                kbd kbdVar = kye.e;
                if (kbdVar == null) {
                    kbdVar = null;
                }
                kbdVar.b();
                yie yieVar = kbdVar.h;
                if (yieVar == null) {
                    return;
                }
                kye kyeVar = kye.a;
                Map mapC = kye.c();
                o97 o97Var = tfg.b;
                Object obj = mapC.get(o97Var);
                if (obj instanceof hta) {
                }
                List<ata> list = nz4.a;
                try {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                } catch (IOException unused) {
                    Objects.toString(file);
                }
                try {
                    List listJ = rq9.j(dataInputStream);
                    v3c.i(dataInputStream, null);
                    list = listJ;
                    file.delete();
                    if (dp3.b(o97Var) || list.isEmpty()) {
                        return;
                    }
                    list.size();
                    kye kyeVar2 = kye.a;
                    String strA = kye.a();
                    if (strA == null) {
                        return;
                    }
                    JSONObject jSONObjectQ0 = j47.q0(yieVar);
                    jSONObjectQ0.put("clientTimeUnixNano", (SystemClock.elapsedRealtimeNanos() + x6b.a) - x6b.b);
                    JSONArray jSONArray = new JSONArray();
                    for (ata ataVar : list) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("timeUnixNano", ataVar.a);
                        jSONObject.put("name", ataVar.b);
                        jSONObject.put("value", ataVar.c);
                        jSONObject.put("unit", ataVar.d);
                        Map map = ataVar.e;
                        if (!map.isEmpty()) {
                            JSONObject jSONObject2 = new JSONObject();
                            for (Map.Entry entry : map.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (value instanceof String) {
                                    jSONObject2.put(str, value);
                                } else if (value instanceof Boolean) {
                                    jSONObject2.put(str, ((Boolean) value).booleanValue());
                                } else if (value instanceof Long) {
                                    jSONObject2.put(str, ((Number) value).longValue());
                                } else if (value instanceof Double) {
                                    jSONObject2.put(str, ((Number) value).doubleValue());
                                } else if (value instanceof Byte) {
                                    jSONObject2.put(str, value);
                                } else if (value instanceof Short) {
                                    jSONObject2.put(str, value);
                                } else if (value instanceof Integer) {
                                    jSONObject2.put(str, ((Number) value).intValue());
                                } else if (value instanceof Float) {
                                    jSONObject2.put(str, value);
                                } else {
                                    jSONObject2.put(str, value.toString());
                                }
                            }
                            jSONObject.put("attributes", jSONObject2);
                        }
                        jSONArray.put(jSONObject);
                    }
                    jSONObjectQ0.put("samples", jSONArray);
                    kye kyeVar3 = kye.a;
                    Object obj2 = kye.c().get(ote.b);
                    if ((obj2 instanceof gx3 ? (gx3) obj2 : null) == null) {
                        mz7.d0(new LinkedHashMap());
                    }
                    try {
                        rq6 rq6VarB = ((wq6) kye.h.getValue()).b(new bkb(Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/perf/upload").appendQueryParameter("crashToken", strA).toString(), b46.o("application/json; charset=utf-8", jSONObjectQ0.toString())));
                        try {
                            rh5 rh5Var = (rh5) rq6VarB.o;
                            oz7.l((rh5Var == null || (bArr = (byte[]) rh5Var.c) == null) ? null : eae.j0(bArr), "PERFORMANCE_METRICS", null);
                            v3c.i(rq6VarB, null);
                            return;
                        } finally {
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                } finally {
                }
            case 6:
                ata ataVar2 = (ata) this.b;
                dze dzeVar = eze.b;
                if (dzeVar instanceof bze) {
                    ((bze) dzeVar).a.add(ataVar2);
                    return;
                } else if (dzeVar instanceof cze) {
                    ((cze) dzeVar).a.d(ataVar2);
                    return;
                } else {
                    Objects.toString(dzeVar);
                    return;
                }
            case 7:
                ((HandlerThread) this.b).quitSafely();
                return;
            case 8:
                UploadStarter.startUpload$lambda$0((String) this.b);
                return;
            case 9:
                UrlSharingListenerManagerImpl.saveUrlSharing$lambda$1((UrlSharingListenerManagerImpl) this.b);
                return;
            case 10:
                ((rdf) this.b).q();
                return;
            case 11:
                ((lq1) ((zm4) this.b).l).b(null);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((VideoFileRenderer) this.b).lambda$release$3();
                return;
            case 13:
                ((uif) this.b).c();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                aab aabVar = (aab) this.b;
                aabVar.getClass();
                int i = oaf.a;
                i74 i74Var = ((o75) aabVar.b).a.D0;
                i74Var.I(i74Var.g((yj8) i74Var.o.X), 1021, new v64(4));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                wva wvaVar = (wva) this.b;
                wvaVar.getClass();
                int i2 = maf.a;
                h74 h74Var = ((n75) wvaVar.c).a.C0;
                h74Var.Q(h74Var.J((xj8) h74Var.o.e), 1021, new v64(24));
                return;
            case 16:
                od odVar = (od) ((ync) this.b).b;
                if (((Boolean) ((k56) odVar.c).invoke()).booleanValue()) {
                    if (!odVar.a) {
                        ((a4c) odVar.b).log("OwnTalkingReporter", "on voice start detected and reported");
                        ync yncVar = (ync) odVar.Y;
                        if (yncVar != null) {
                            kg1 kg1Var = (kg1) yncVar.b;
                            fg1 fg1Var2 = kg1Var.a;
                            boolean zD = fg1Var2.d();
                            fg1Var2.n = true;
                            if (zD != fg1Var2.d() && (bg1Var = (fg1Var = kg1Var.a).a) != null) {
                                kg1Var.e(kg1Var.c(bg1Var), Collections.singletonList(fg1Var));
                            }
                        }
                        odVar.a = true;
                    }
                    ((xpb) odVar.o).e(e5f.a);
                    return;
                }
                return;
            case LangUtils.HASH_SEED /* 17 */:
                hrf hrfVar = (hrf) this.b;
                String strE = hrfVar.h;
                if (hrfVar.k) {
                    long j = hrfVar.l;
                    if (j > 0) {
                        strE = hrf.e(strE, "recoverTs", String.valueOf(j));
                    }
                }
                hrfVar.q.o("transport.reconnect");
                synchronized (hrfVar.b) {
                    hrfVar.h = strE;
                }
                synchronized (hrfVar.e) {
                    hrfVar.f = false;
                    hrfVar.a("reconnect");
                }
                return;
            case 18:
                c7g c7gVar = (c7g) this.b;
                c7gVar.a.getAction();
                c7gVar.b.d(null);
                return;
            case 19:
                o7g o7gVar = (o7g) this.b;
                o7gVar.getClass();
                ((gqc) o7gVar.d).e0(new gte(22, o7gVar));
                return;
            case 20:
                uag uagVar = (uag) this.b;
                uagVar.getClass();
                try {
                    uagVar.d.getClass();
                    return;
                } catch (Throwable th) {
                    uagVar.a.reportException("ProtocolInfo", "rtc.command.handle.command.onsent", th);
                    return;
                }
            case 21:
                vbg vbgVar = (vbg) this.b;
                t54 t54Var = vbgVar.g;
                if (t54Var != null) {
                    t54Var.a();
                    vbgVar.g = null;
                    vbgVar.D = 0;
                }
                vbgVar.b();
                return;
            case 22:
                ((f0) this.b).a();
                return;
            default:
                m5d m5dVar = (m5d) ((gwe) this.b).b;
                nq7 nq7Var = (nq7) m5dVar.b;
                kq7 kq7Var = (kq7) m5dVar.X;
                if (nq7Var == null) {
                    return;
                }
                try {
                    kq7Var.e();
                    Size size = kq7Var.B;
                    DisplayMetrics displayMetrics = kq7Var.A;
                    if (displayMetrics.widthPixels != size.width || displayMetrics.heightPixels != size.height) {
                        kq7Var.n.log("OKRTCLmsAdapter", "Screen size did change" + size.width + "x" + size.height + "->" + displayMetrics.widthPixels + "x" + displayMetrics.heightPixels);
                        int i3 = displayMetrics.widthPixels;
                        size.width = i3;
                        int i4 = displayMetrics.heightPixels;
                        size.height = i4;
                        ((nq7) m5dVar.b).a(i3, i4);
                    }
                } catch (Throwable th2) {
                    kq7Var.n.reportException("OKRTCLmsAdapter", "Error on screen share size update", th2);
                }
                kq7Var.b((nq7) m5dVar.b);
                return;
        }
    }

    public /* synthetic */ ule(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}

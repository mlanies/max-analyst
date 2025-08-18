package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class djb implements e15, a76, erd, ree {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ djb(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c A[Catch: all -> 0x00d8, TryCatch #0 {all -> 0x00d8, blocks: (B:30:0x00bf, B:31:0x00c5, B:57:0x0132, B:33:0x00ca, B:36:0x00d0, B:37:0x00d7, B:42:0x00de, B:43:0x00ec, B:44:0x00ff, B:47:0x0103, B:51:0x010c, B:53:0x0111, B:54:0x011c, B:55:0x0128), top: B:71:0x00bf }] */
    @Override // defpackage.a76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djb.a(java.lang.Object):void");
    }

    public void b(dec decVar, jt jtVar) {
        qpd qpdVar = (qpd) this.b;
        inf infVarA = (inf) qpdVar.get(decVar);
        if (infVarA == null) {
            infVarA = inf.a();
            qpdVar.put(decVar, infVarA);
        }
        infVarA.c = jtVar;
        infVarA.a |= 8;
    }

    @Override // defpackage.erd
    public void c(zl4 zl4Var) {
        switch (this.a) {
            case 5:
                ((erd) this.b).c(zl4Var);
                break;
            default:
                ((erd) this.b).c(zl4Var);
                break;
        }
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        nb0 nb0Var;
        switch (this.a) {
            case 2:
                Objects.toString(th);
                wj4 wj4Var = (wj4) this.c;
                int i = wj4Var.c;
                if (i < wj4Var.a) {
                    wj4Var.c = i + 1;
                    u3c u3cVar = new u3c(5, this);
                    wj4Var.f = ju0.D().schedule(new do9(((adc) wj4Var.g).e, 27, u3cVar), adc.q0, TimeUnit.MILLISECONDS);
                    return;
                }
                adc adcVar = (adc) wj4Var.g;
                synchronized (adcVar.h) {
                    try {
                        nb0Var = null;
                        switch (adcVar.k.ordinal()) {
                            case 1:
                            case 2:
                                nb0 nb0Var2 = adcVar.o;
                                adcVar.o = null;
                                nb0Var = nb0Var2;
                            case 0:
                                if (adcVar.m != -1) {
                                    adcVar.m = -1;
                                    adcVar.a.v(new ub0(-1, adc.m(adcVar.k), adcVar.s));
                                }
                                adcVar.B(zcc.t0);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + adcVar.k + ": " + th);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (nb0Var != null) {
                    adcVar.j(nb0Var, 7, th);
                    return;
                }
                return;
            default:
                if (th instanceof qee) {
                    c54.p(null, ((bm7) this.c).cancel(false));
                    return;
                } else {
                    c54.p(null, ((lq1) this.b).b(null));
                    return;
                }
        }
    }

    public void e(long j, yaf yafVar) {
        if (yafVar.c() < 9) {
            return;
        }
        int iH = yafVar.h();
        int iH2 = yafVar.h();
        int iV = yafVar.v();
        if (iH == 434 && iH2 == 1195456820 && iV == 3) {
            fp3.s(j, yafVar, (xze[]) this.c);
        }
    }

    public void f(oa5 oa5Var, l3f l3fVar) {
        int i = 0;
        while (true) {
            xze[] xzeVarArr = (xze[]) this.c;
            if (i >= xzeVarArr.length) {
                return;
            }
            l3fVar.a();
            l3fVar.b();
            xze xzeVarB = oa5Var.B(l3fVar.e, 3);
            oy5 oy5Var = (oy5) ((List) this.b).get(i);
            String str = oy5Var.w0;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            np8.c(strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "), z);
            my5 my5Var = new my5();
            l3fVar.b();
            my5Var.a = l3fVar.f;
            my5Var.k = str;
            my5Var.d = oy5Var.o;
            my5Var.c = oy5Var.c;
            my5Var.C = oy5Var.O0;
            my5Var.m = oy5Var.y0;
            xzeVarB.d(new oy5(my5Var));
            xzeVarArr[i] = xzeVarB;
            i++;
        }
    }

    @Override // defpackage.ree
    public void g(cc0 cc0Var) {
        ((sif) this.c).e();
        l76 l76Var = (((eu4) this.b).a() && cc0Var.d) ? l76.c : l76.b;
        String str = ((sif) this.c).a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "onTransformationInfoUpdate, transformationInfo=" + cc0Var + ", input format=" + l76Var, null);
        }
        fjf fjfVar = ((sif) this.c).u0;
        if (fjfVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        o76.d((AtomicBoolean) fjfVar.c, true);
        o76.c((Thread) fjfVar.e);
        if (((l76) fjfVar.n) != l76Var) {
            fjfVar.n = l76Var;
            fjfVar.v(fjfVar.b);
        }
    }

    public SharedPreferences h() {
        return ((Context) this.b).getSharedPreferences("tracer-" + ((String) this.c), 0);
    }

    public f15 i(int i) {
        HashMap map = (HashMap) this.c;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? ((e15) this.b).n(i) : (f15) map.get(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            jo7 r0 = (defpackage.jo7) r0
            r0.getClass()
            java.lang.String r1 = "feedback"
            r2 = 0
            java.lang.String r3 = "eventType"
            java.lang.String r3 = r11.getString(r3)     // Catch: org.json.JSONException -> L48
            int r3 = defpackage.h4f.x(r3)     // Catch: org.json.JSONException -> L48
            int r3 = defpackage.au1.s(r3)     // Catch: org.json.JSONException -> L48
            nz4 r4 = defpackage.nz4.a
            java.lang.String r5 = "removedParticipantIds"
            java.lang.String r6 = "addedParticipantIds"
            java.lang.String r7 = "totalCount"
            java.lang.Object r8 = r0.c
            lz1 r8 = (defpackage.lz1) r8
            if (r3 == 0) goto L71
            r9 = 1
            if (r3 == r9) goto L50
            r4 = 2
            if (r3 != r4) goto L4a
            boolean r3 = r11.has(r1)     // Catch: org.json.JSONException -> L48
            if (r3 == 0) goto L9c
            np1 r3 = new np1     // Catch: org.json.JSONException -> L48
            java.lang.Object r4 = r0.b     // Catch: org.json.JSONException -> L48
            b46 r4 = (defpackage.b46) r4     // Catch: org.json.JSONException -> L48
            org.json.JSONObject r11 = r11.getJSONObject(r1)     // Catch: org.json.JSONException -> L48
            r4.getClass()     // Catch: org.json.JSONException -> L48
            z61 r11 = defpackage.b46.q(r11)     // Catch: org.json.JSONException -> L48
            r3.<init>(r11)     // Catch: org.json.JSONException -> L48
            r2 = r3
            goto L9c
        L48:
            r11 = move-exception
            goto L91
        L4a:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException     // Catch: org.json.JSONException -> L48
            r11.<init>()     // Catch: org.json.JSONException -> L48
            throw r11     // Catch: org.json.JSONException -> L48
        L50:
            int r1 = r11.getInt(r7)     // Catch: org.json.JSONException -> L48
            org.json.JSONArray r3 = r11.optJSONArray(r6)     // Catch: org.json.JSONException -> L48
            if (r3 == 0) goto L5f
            java.util.ArrayList r3 = r8.a(r3)     // Catch: org.json.JSONException -> L48
            goto L60
        L5f:
            r3 = r4
        L60:
            org.json.JSONArray r11 = r11.optJSONArray(r5)     // Catch: org.json.JSONException -> L48
            if (r11 == 0) goto L6a
            java.util.ArrayList r4 = r8.a(r11)     // Catch: org.json.JSONException -> L48
        L6a:
            op1 r11 = new op1     // Catch: org.json.JSONException -> L48
            r11.<init>(r1, r3, r4)     // Catch: org.json.JSONException -> L48
        L6f:
            r2 = r11
            goto L9c
        L71:
            int r1 = r11.optInt(r7)     // Catch: org.json.JSONException -> L48
            org.json.JSONArray r3 = r11.optJSONArray(r6)     // Catch: org.json.JSONException -> L48
            if (r3 == 0) goto L80
            java.util.ArrayList r3 = r8.a(r3)     // Catch: org.json.JSONException -> L48
            goto L81
        L80:
            r3 = r4
        L81:
            org.json.JSONArray r11 = r11.optJSONArray(r5)     // Catch: org.json.JSONException -> L48
            if (r11 == 0) goto L8b
            java.util.ArrayList r4 = r8.a(r11)     // Catch: org.json.JSONException -> L48
        L8b:
            mp1 r11 = new mp1     // Catch: org.json.JSONException -> L48
            r11.<init>(r1, r3, r4)     // Catch: org.json.JSONException -> L48
            goto L6f
        L91:
            java.lang.Object r0 = r0.a
            a4c r0 = (defpackage.a4c) r0
            java.lang.String r1 = "WaitingRoomNotificationParser"
            java.lang.String r3 = "Can't parse chat room notification"
            r0.logException(r1, r3, r11)
        L9c:
            if (r2 == 0) goto Lbf
            boolean r11 = r2 instanceof defpackage.mp1
            java.lang.Object r10 = r10.c
            bq1 r10 = (defpackage.bq1) r10
            if (r11 == 0) goto Lac
            mp1 r2 = (defpackage.mp1) r2
            r10.onAttendee(r2)
            goto Lbf
        Lac:
            boolean r11 = r2 instanceof defpackage.np1
            if (r11 == 0) goto Lb6
            np1 r2 = (defpackage.np1) r2
            r10.onFeedback(r2)
            goto Lbf
        Lb6:
            boolean r11 = r2 instanceof defpackage.op1
            if (r11 == 0) goto Lbf
            op1 r2 = (defpackage.op1) r2
            r10.onHandUp(r2)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djb.j(org.json.JSONObject):void");
    }

    public void k(JSONObject jSONObject) {
        pp1 pp1Var;
        jo7 jo7Var = (jo7) this.b;
        jo7Var.getClass();
        try {
            pp1Var = new pp1(!jSONObject.optBoolean("disprove", false));
        } catch (JSONException e) {
            ((a4c) jo7Var.a).logException("WaitingRoomNotificationParser", "Can't parse promotion approved", e);
            pp1Var = null;
        }
        if (pp1Var != null) {
            ((bq1) this.c).onPromotionUpdated(pp1Var);
        }
    }

    public jt l(dec decVar, int i) {
        inf infVar;
        jt jtVar;
        qpd qpdVar = (qpd) this.b;
        int iD = qpdVar.d(decVar);
        if (iD >= 0 && (infVar = (inf) qpdVar.i(iD)) != null) {
            int i2 = infVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                infVar.a = i3;
                if (i == 4) {
                    jtVar = infVar.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    jtVar = infVar.c;
                }
                if ((i3 & 12) == 0) {
                    qpdVar.g(iD);
                    infVar.a = 0;
                    infVar.b = null;
                    infVar.c = null;
                    inf.d.e(infVar);
                }
                return jtVar;
            }
        }
        return null;
    }

    @Override // defpackage.e15
    public boolean m(int i) {
        return i(i) != null;
    }

    @Override // defpackage.e15
    public f15 n(int i) {
        return i(i);
    }

    public void o(dec decVar) {
        inf infVar = (inf) ((qpd) this.b).get(decVar);
        if (infVar == null) {
            return;
        }
        infVar.a &= -2;
    }

    @Override // defpackage.erd
    public void onError(Throwable th) {
        Object objMo131apply;
        switch (this.a) {
            case 5:
                try {
                    ((rqd) this.c).c.accept(th);
                } catch (Throwable th2) {
                    c37.B(th2);
                    th = new CompositeException(th, th2);
                }
                ((erd) this.b).onError(th);
                break;
            default:
                frd frdVar = (frd) this.c;
                b66 b66Var = frdVar.b;
                erd erdVar = (erd) this.b;
                if (b66Var != null) {
                    try {
                        objMo131apply = b66Var.mo131apply(th);
                    } catch (Throwable th3) {
                        c37.B(th3);
                        erdVar.onError(new CompositeException(th, th3));
                        return;
                    }
                } else {
                    objMo131apply = frdVar.c;
                }
                if (objMo131apply != null) {
                    erdVar.a(objMo131apply);
                    break;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                    nullPointerException.initCause(th);
                    erdVar.onError(nullPointerException);
                    break;
                }
        }
    }

    public void p(dec decVar) {
        wv7 wv7Var = (wv7) this.c;
        int iH = wv7Var.h() - 1;
        while (true) {
            if (iH < 0) {
                break;
            }
            if (decVar == wv7Var.i(iH)) {
                Object[] objArr = wv7Var.c;
                Object obj = objArr[iH];
                Object obj2 = c54.c;
                if (obj != obj2) {
                    objArr[iH] = obj2;
                    wv7Var.a = true;
                }
            } else {
                iH--;
            }
        }
        inf infVar = (inf) ((qpd) this.b).remove(decVar);
        if (infVar != null) {
            infVar.a = 0;
            infVar.b = null;
            infVar.c = null;
            inf.d.e(infVar);
        }
    }

    public /* synthetic */ djb(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public djb(IBinder iBinder) throws RemoteException {
        this.a = 16;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new sgg(iBinder);
            this.b = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            throw new RemoteException();
        }
    }

    public djb(int i) {
        this.a = i;
        switch (i) {
            case 7:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                this.b = new qpd();
                this.c = new wv7();
                break;
            default:
                this.b = new tt3(cpc.g, new eqe(dpc.i), Integer.valueOf(gpc.f), (Integer) null, 20);
                this.c = new tt3(cpc.c, new eqe(dpc.f), Integer.valueOf(gpc.u), (Integer) null, 20);
                break;
        }
    }

    public djb(List list) {
        this.a = 10;
        this.b = list;
        this.c = new xze[list.size()];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public djb(yw1 yw1Var, e15 e15Var, bj6 bj6Var) {
        Range rangeB1;
        this.a = 1;
        this.b = e15Var;
        ArrayList arrayListF = bj6Var.f(ExtraSupportedQualityQuirk.class);
        if (arrayListF.isEmpty()) {
            return;
        }
        ?? EmptyMap = 0;
        dff dffVarA = null;
        EmptyMap = 0;
        EmptyMap = 0;
        c54.p(null, arrayListF.size() == 1);
        ((ExtraSupportedQualityQuirk) arrayListF.get(0)).getClass();
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            if ("1".equals(yw1Var.d()) && !e15Var.m(4)) {
                f15 f15VarN = e15Var.n(1);
                ha0 ha0Var = (f15VarN == null || f15VarN.d().isEmpty()) ? null : (ha0) f15VarN.d().get(0);
                if (ha0Var != null) {
                    try {
                        dffVarA = fff.a(eff.Z1(eef.d(ha0Var)), null);
                    } catch (InvalidConfigException unused) {
                    }
                    if (dffVarA != null) {
                        rangeB1 = dffVarA.b1();
                    } else {
                        rangeB1 = mc0.f;
                    }
                    Size size = msd.d;
                    ga0 ga0VarE = ga0.e(f15VarN.a(), f15VarN.b(), f15VarN.c(), Collections.singletonList(a14.p(ha0Var, size, rangeB1)));
                    EmptyMap = new HashMap();
                    EmptyMap.put(4, ga0VarE);
                    Size size2 = new Size(ha0Var.e, ha0Var.f);
                    if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                        EmptyMap.put(1, ga0VarE);
                    }
                }
            }
        } else {
            EmptyMap = Collections.emptyMap();
        }
        if (EmptyMap != 0) {
            this.c = new HashMap((Map) EmptyMap);
        }
    }
}

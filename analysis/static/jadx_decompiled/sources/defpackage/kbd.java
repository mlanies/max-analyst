package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class kbd {
    public final Context a;
    public volatile boolean d;
    public yie f;
    public yie h;
    public volatile fbd k;
    public volatile fbd l;
    public final Object b = new Object();
    public final l7b c = new l7b(new ie(7, this));
    public final long e = System.currentTimeMillis();
    public long g = Long.MIN_VALUE;
    public long i = Long.MIN_VALUE;
    public List j = nz4.a;

    public kbd(Context context) {
        this.a = context;
    }

    public static void d(kbd kbdVar, int i, boolean z, bjd bjdVar, int i2) {
        fbd fbdVar = null;
        if ((i2 & 1) != 0) {
            fbd fbdVar2 = kbdVar.k;
            if (fbdVar2 == null) {
                fbdVar2 = null;
            }
            i = fbdVar2.f;
        }
        if ((i2 & 2) != 0) {
            fbd fbdVar3 = kbdVar.k;
            if (fbdVar3 == null) {
                fbdVar3 = null;
            }
            z = fbdVar3.h;
        }
        if ((i2 & 4) != 0) {
            fbd fbdVar4 = kbdVar.k;
            if (fbdVar4 == null) {
                fbdVar4 = null;
            }
            bjdVar = fbdVar4.g;
        }
        synchronized (kbdVar.b) {
            kbdVar.b();
            fbd fbdVar5 = kbdVar.k;
            if (fbdVar5 == null) {
                fbdVar5 = null;
            }
            kbdVar.k = fbd.a(fbdVar5, i, bjdVar, z, 31);
            List listD0 = x53.d0(1, kbdVar.j);
            fbd fbdVar6 = kbdVar.k;
            if (fbdVar6 != null) {
                fbdVar = fbdVar6;
            }
            ArrayList arrayListU0 = x53.u0(listD0, fbdVar);
            kbdVar.j = arrayListU0;
            kbdVar.c.k(xfg.C(arrayListU0).toString(), "session_states");
            kbdVar.c.m();
        }
    }

    public final void a() {
        synchronized (this.b) {
            b();
            this.i = this.e;
            this.j = Collections.singletonList(x53.p0(this.j));
            this.c.k(Long.valueOf(this.i), "session_state_upload_ts");
            this.c.k(xfg.C(this.j).toString(), "session_states");
            this.c.m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0029, B:14:0x0032, B:19:0x0057, B:21:0x0063, B:24:0x0069, B:25:0x007a, B:27:0x0098, B:28:0x009c, B:31:0x00bd, B:32:0x00c1, B:35:0x00c6, B:37:0x0100, B:39:0x010c, B:43:0x0123, B:18:0x0053), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0029, B:14:0x0032, B:19:0x0057, B:21:0x0063, B:24:0x0069, B:25:0x007a, B:27:0x0098, B:28:0x009c, B:31:0x00bd, B:32:0x00c1, B:35:0x00c6, B:37:0x0100, B:39:0x010c, B:43:0x0123, B:18:0x0053), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0029, B:14:0x0032, B:19:0x0057, B:21:0x0063, B:24:0x0069, B:25:0x007a, B:27:0x0098, B:28:0x009c, B:31:0x00bd, B:32:0x00c1, B:35:0x00c6, B:37:0x0100, B:39:0x010c, B:43:0x0123, B:18:0x0053), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0029, B:14:0x0032, B:19:0x0057, B:21:0x0063, B:24:0x0069, B:25:0x007a, B:27:0x0098, B:28:0x009c, B:31:0x00bd, B:32:0x00c1, B:35:0x00c6, B:37:0x0100, B:39:0x010c, B:43:0x0123, B:18:0x0053), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbd.b():void");
    }

    public final yie c() {
        Map mapSingletonMap;
        b();
        yie yieVar = this.f;
        if (yieVar == null) {
            yieVar = null;
        }
        yieVar.getClass();
        String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(new Date());
        Map map = yieVar.m;
        if (map.isEmpty()) {
            mapSingletonMap = Collections.singletonMap("date", str);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("date", str);
            mapSingletonMap = linkedHashMap;
        }
        return yie.a(yieVar, false, mapSingletonMap, 12287);
    }

    public final void e(boolean z) {
        synchronized (this.b) {
            b();
            yie yieVar = this.f;
            if ((yieVar == null ? null : yieVar).k == z) {
                return;
            }
            if (yieVar == null) {
                yieVar = null;
            }
            yie yieVarA = yie.a(yieVar, z, null, 15359);
            this.f = yieVarA;
            this.c.k(j47.q0(yieVarA).toString(), "session_system_state");
            d(this, 0, z, null, 5);
        }
    }

    public final void f(Map map) {
        boolean z;
        synchronized (this.b) {
            try {
                b();
                yie yieVar = this.f;
                yie yieVar2 = null;
                if (yieVar == null) {
                    yieVar = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(yieVar.m);
                loop0: while (true) {
                    z = false;
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        String strY0 = w9e.Y0(32, str);
                        String strY02 = str2 != null ? w9e.Y0(64, str2) : null;
                        if (tpa.f(linkedHashMap.get(strY0), strY02)) {
                            break;
                        }
                        if (strY02 != null) {
                            linkedHashMap.put(strY0, strY02);
                        } else {
                            linkedHashMap.remove(strY0);
                        }
                        z = true;
                    }
                }
                if (z) {
                    yie yieVar3 = this.f;
                    if (yieVar3 != null) {
                        yieVar2 = yieVar3;
                    }
                    yie yieVarA = yie.a(yieVar2, false, linkedHashMap, 12287);
                    this.f = yieVarA;
                    this.c.k(j47.q0(yieVarA).toString(), "session_system_state");
                    this.c.m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(int i) {
        b();
        fbd fbdVar = this.l;
        if (fbdVar != null) {
            synchronized (this.b) {
                b();
                fbd fbdVarA = fbd.a(fbdVar, i, null, false, 223);
                this.l = fbdVarA;
                if (this.j.size() <= 1) {
                    return;
                }
                ArrayList arrayListU0 = x53.u0(x53.u0(x53.d0(2, this.j), fbdVarA), x53.p0(this.j));
                this.j = arrayListU0;
                this.c.k(xfg.C(arrayListU0).toString(), "session_states");
                this.c.m();
            }
        }
    }
}

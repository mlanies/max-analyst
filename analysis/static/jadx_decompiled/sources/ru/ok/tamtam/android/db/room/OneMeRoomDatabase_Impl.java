package ru.ok.tamtam.android.db.room;

import androidx.work.impl.model.WorkersQueueDao;
import androidx.work.impl.model.WorkersQueueDao_Impl;
import defpackage.a7c;
import defpackage.adb;
import defpackage.alc;
import defpackage.ana;
import defpackage.b4e;
import defpackage.d34;
import defpackage.d9c;
import defpackage.dt2;
import defpackage.ea9;
import defpackage.ed1;
import defpackage.ew9;
import defpackage.fd5;
import defpackage.fp3;
import defpackage.hoe;
import defpackage.ir3;
import defpackage.ja4;
import defpackage.kw9;
import defpackage.l0f;
import defpackage.le5;
import defpackage.mtf;
import defpackage.n4e;
import defpackage.od2;
import defpackage.od5;
import defpackage.oj;
import defpackage.oy8;
import defpackage.p19;
import defpackage.qef;
import defpackage.qfa;
import defpackage.rfa;
import defpackage.rva;
import defpackage.s1e;
import defpackage.sh;
import defpackage.t19;
import defpackage.tp4;
import defpackage.ud5;
import defpackage.uz2;
import defpackage.v47;
import defpackage.v89;
import defpackage.w4d;
import defpackage.w8f;
import defpackage.wh;
import defpackage.xde;
import defpackage.xrc;
import defpackage.yx9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class OneMeRoomDatabase_Impl extends OneMeRoomDatabase {
    public volatile le5 A;
    public volatile tp4 B;
    public volatile w4d C;
    public volatile alc D;
    public volatile WorkersQueueDao_Impl E;
    public volatile hoe F;
    public volatile ir3 G;
    public volatile rva H;
    public volatile s1e I;
    public volatile n4e J;
    public volatile dt2 K;
    public volatile t19 L;
    public volatile wh M;
    public volatile oj N;
    public volatile a7c O;
    public volatile xrc P;
    public volatile mtf Q;
    public volatile adb R;
    public volatile w8f n;
    public volatile oy8 o;
    public volatile qef p;
    public volatile ed1 q;
    public volatile b4e r;
    public volatile fd5 s;
    public volatile od5 t;
    public volatile d9c u;
    public volatile ja4 v;
    public volatile ew9 w;
    public volatile kw9 x;
    public volatile yx9 y;
    public volatile ud5 z;

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final fd5 A() {
        fd5 fd5Var;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new fd5(this);
                }
                fd5Var = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fd5Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final od5 B() {
        od5 od5Var;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new od5(this);
                }
                od5Var = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return od5Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final ud5 C() {
        ud5 ud5Var;
        if (this.z != null) {
            return this.z;
        }
        synchronized (this) {
            try {
                if (this.z == null) {
                    this.z = new ud5(this);
                }
                ud5Var = this.z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ud5Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final le5 D() {
        le5 le5Var;
        if (this.A != null) {
            return this.A;
        }
        synchronized (this) {
            try {
                if (this.A == null) {
                    this.A = new le5(this);
                }
                le5Var = this.A;
            } catch (Throwable th) {
                throw th;
            }
        }
        return le5Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final oy8 E() {
        oy8 oy8Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new oy8(this);
                }
                oy8Var = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oy8Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final t19 F() {
        t19 t19Var;
        if (this.L != null) {
            return this.L;
        }
        synchronized (this) {
            try {
                if (this.L == null) {
                    this.L = new t19(this);
                }
                t19Var = this.L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t19Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final ew9 G() {
        ew9 ew9Var;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            try {
                if (this.w == null) {
                    this.w = new ew9(this);
                }
                ew9Var = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ew9Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final kw9 H() {
        kw9 kw9Var;
        if (this.x != null) {
            return this.x;
        }
        synchronized (this) {
            try {
                if (this.x == null) {
                    this.x = new kw9(this);
                }
                kw9Var = this.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kw9Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final yx9 I() {
        yx9 yx9Var;
        if (this.y != null) {
            return this.y;
        }
        synchronized (this) {
            try {
                if (this.y == null) {
                    this.y = new yx9(this);
                }
                yx9Var = this.y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yx9Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final rva J() {
        rva rvaVar;
        if (this.H != null) {
            return this.H;
        }
        synchronized (this) {
            try {
                if (this.H == null) {
                    this.H = new rva(this);
                }
                rvaVar = this.H;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rvaVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final adb K() {
        adb adbVar;
        if (this.R != null) {
            return this.R;
        }
        synchronized (this) {
            try {
                if (this.R == null) {
                    adb adbVar2 = new adb();
                    adbVar2.a = this;
                    adbVar2.b = new sh(this, 17);
                    adbVar2.c = new p19(this, 22);
                    this.R = adbVar2;
                }
                adbVar = this.R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return adbVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final a7c L() {
        a7c a7cVar;
        if (this.O != null) {
            return this.O;
        }
        synchronized (this) {
            try {
                if (this.O == null) {
                    this.O = new a7c(this);
                }
                a7cVar = this.O;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a7cVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final d9c M() {
        d9c d9cVar;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    this.u = new d9c(this);
                }
                d9cVar = this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d9cVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final alc N() {
        alc alcVar;
        if (this.D != null) {
            return this.D;
        }
        synchronized (this) {
            try {
                if (this.D == null) {
                    this.D = new alc(this);
                }
                alcVar = this.D;
            } catch (Throwable th) {
                throw th;
            }
        }
        return alcVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final xrc O() {
        xrc xrcVar;
        if (this.P != null) {
            return this.P;
        }
        synchronized (this) {
            try {
                if (this.P == null) {
                    this.P = new xrc(this);
                }
                xrcVar = this.P;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xrcVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final w4d P() {
        w4d w4dVar;
        if (this.C != null) {
            return this.C;
        }
        synchronized (this) {
            try {
                if (this.C == null) {
                    this.C = new w4d(this);
                }
                w4dVar = this.C;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w4dVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final s1e Q() {
        s1e s1eVar;
        if (this.I != null) {
            return this.I;
        }
        synchronized (this) {
            try {
                if (this.I == null) {
                    this.I = new s1e(this);
                }
                s1eVar = this.I;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s1eVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final b4e R() {
        b4e b4eVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new b4e(this);
                }
                b4eVar = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b4eVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final n4e S() {
        n4e n4eVar;
        if (this.J != null) {
            return this.J;
        }
        synchronized (this) {
            try {
                if (this.J == null) {
                    this.J = new n4e(this);
                }
                n4eVar = this.J;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n4eVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final hoe T() {
        hoe hoeVar;
        if (this.F != null) {
            return this.F;
        }
        synchronized (this) {
            try {
                if (this.F == null) {
                    this.F = new hoe(this);
                }
                hoeVar = this.F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hoeVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final w8f U() {
        w8f w8fVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new w8f(this);
                }
                w8fVar = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w8fVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final qef V() {
        qef qefVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new qef(this);
                }
                qefVar = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qefVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final mtf W() {
        mtf mtfVar;
        if (this.Q != null) {
            return this.Q;
        }
        synchronized (this) {
            try {
                if (this.Q == null) {
                    this.Q = new mtf(this);
                }
                mtfVar = this.Q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mtfVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final WorkersQueueDao X() {
        WorkersQueueDao_Impl workersQueueDao_Impl;
        if (this.E != null) {
            return this.E;
        }
        synchronized (this) {
            try {
                if (this.E == null) {
                    this.E = new WorkersQueueDao_Impl(this);
                }
                workersQueueDao_Impl = this.E;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workersQueueDao_Impl;
    }

    @Override // defpackage.ilc
    public final v47 e() {
        HashMap map = new HashMap(2);
        map.put("chat_title", "chat_title_content");
        map.put("contact_title", "contact_title_content");
        return new v47(this, map, new HashMap(0), "uploads", "message_uploads", "video_conversions", "contact_location", "chat_location", "call_links", "sticker_sets", "favorite_sticker_sets", "favorite_stickers", "recent", "default_emoji", "fcm_notifications", "fcm_notifications_history", "fcm_notifications_analytics", "notifications_read_marks", "notifications_tracker_messages", "draft_uploads", "chat_folder", "folder_and_chats", "selected_mentions", "chat_title", "contact_title", "WorkerQueueItem", "tasks", "contacts", "phones", "events", "stickers", "chats", "messages", "animoji", "animoji_set", "reactions_section", "saved_msg_chat", "webapp_biometry", "profile");
    }

    @Override // defpackage.ilc
    public final xde f(d34 d34Var) {
        return d34Var.c.a(new ana(d34Var.a, d34Var.b, new l0f(d34Var, new rfa(this), "f23a258b18fc08c44a6e0c456b946baa", "5161dd42e4d943bd0a1a2ee9b29f8077"), false, false));
    }

    @Override // defpackage.ilc
    public final List g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qfa(0));
        arrayList.add(new qfa(1));
        arrayList.add(new ea9(5, 6, 16));
        arrayList.add(new ea9(6, 7, 17));
        arrayList.add(new ea9(8, 9, 18));
        arrayList.add(new ea9(9, 10, 19));
        arrayList.add(new ea9(10, 11, 12));
        arrayList.add(new ea9(11, 12, 13));
        arrayList.add(new ea9(12, 13, 14));
        arrayList.add(new ea9(13, 14, 15));
        return arrayList;
    }

    @Override // defpackage.ilc
    public final Set i() {
        return new HashSet();
    }

    @Override // defpackage.ilc
    public final Map j() {
        HashMap map = new HashMap();
        map.put(w8f.class, Collections.emptyList());
        map.put(oy8.class, Collections.emptyList());
        map.put(qef.class, Collections.emptyList());
        map.put(fp3.class, Collections.emptyList());
        map.put(od2.class, Collections.emptyList());
        map.put(ed1.class, Collections.emptyList());
        map.put(b4e.class, Collections.emptyList());
        map.put(fd5.class, Collections.emptyList());
        map.put(od5.class, Collections.emptyList());
        map.put(d9c.class, Collections.emptyList());
        map.put(ja4.class, Collections.emptyList());
        map.put(ew9.class, Collections.emptyList());
        map.put(kw9.class, Collections.emptyList());
        map.put(yx9.class, Collections.emptyList());
        map.put(ud5.class, Collections.emptyList());
        map.put(le5.class, Collections.emptyList());
        map.put(tp4.class, Collections.emptyList());
        map.put(w4d.class, Collections.emptyList());
        map.put(alc.class, Collections.emptyList());
        map.put(WorkersQueueDao.class, WorkersQueueDao_Impl.getRequiredConverters());
        map.put(hoe.class, Collections.emptyList());
        map.put(ir3.class, Collections.emptyList());
        map.put(rva.class, Collections.emptyList());
        map.put(s1e.class, Collections.emptyList());
        map.put(n4e.class, Collections.emptyList());
        map.put(dt2.class, Arrays.asList(uz2.class));
        map.put(t19.class, Arrays.asList(v89.class));
        map.put(wh.class, Collections.emptyList());
        map.put(oj.class, Collections.emptyList());
        map.put(a7c.class, Collections.emptyList());
        map.put(xrc.class, Collections.emptyList());
        map.put(mtf.class, Collections.emptyList());
        map.put(adb.class, Collections.emptyList());
        return map;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final wh t() {
        wh whVar;
        if (this.M != null) {
            return this.M;
        }
        synchronized (this) {
            try {
                if (this.M == null) {
                    this.M = new wh(this);
                }
                whVar = this.M;
            } catch (Throwable th) {
                throw th;
            }
        }
        return whVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final oj u() {
        oj ojVar;
        if (this.N != null) {
            return this.N;
        }
        synchronized (this) {
            try {
                if (this.N == null) {
                    this.N = new oj(this);
                }
                ojVar = this.N;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ojVar;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final ed1 v() {
        ed1 ed1Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new ed1(this);
                }
                ed1Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ed1Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final dt2 w() {
        dt2 dt2Var;
        if (this.K != null) {
            return this.K;
        }
        synchronized (this) {
            try {
                if (this.K == null) {
                    this.K = new dt2(this);
                }
                dt2Var = this.K;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dt2Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final ir3 x() {
        ir3 ir3Var;
        if (this.G != null) {
            return this.G;
        }
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = new ir3(this);
                }
                ir3Var = this.G;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ir3Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final ja4 y() {
        ja4 ja4Var;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v == null) {
                    this.v = new ja4(this);
                }
                ja4Var = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ja4Var;
    }

    @Override // ru.ok.tamtam.android.db.room.OneMeRoomDatabase
    public final tp4 z() {
        tp4 tp4Var;
        if (this.B != null) {
            return this.B;
        }
        synchronized (this) {
            try {
                if (this.B == null) {
                    this.B = new tp4(this);
                }
                tp4Var = this.B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tp4Var;
    }
}

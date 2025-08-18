package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.SurfaceTexture;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.transformer.ExportException;
import com.google.android.gms.tasks.Task;
import com.my.tracker.obfuscated.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class gte implements qj3, y2a, km7, pj3, ehe, bb3, b66, pme, grd, l3a, o1d, y3g, pv6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gte() {
        this.a = 10;
        this.b = q8f.UPLOADING;
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        Toolbar toolbar = (Toolbar) ((ai3) this.b).b;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
        v6g v6gVar = x6gVar.a;
        marginLayoutParams.topMargin = v6gVar.f(7).b;
        toolbar.setLayoutParams(marginLayoutParams);
        j47.p(toolbar, v6gVar.f(7).c);
        j47.q(toolbar, v6gVar.f(7).a);
        return x6gVar;
    }

    @Override // defpackage.ehe
    public Object a() {
        SQLiteDatabase sQLiteDatabaseM;
        int i = 1;
        Object obj = this.b;
        switch (this.a) {
            case 4:
                gqc gqcVar = (gqc) ((l33) obj);
                gqcVar.getClass();
                int i2 = p33.e;
                m5d m5dVar = new m5d();
                HashMap map = new HashMap();
                sQLiteDatabaseM = gqcVar.m();
                sQLiteDatabaseM.beginTransaction();
                try {
                    p33 p33Var = (p33) gqc.n0(sQLiteDatabaseM.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new u00(gqcVar, map, m5dVar, 27));
                    sQLiteDatabaseM.setTransactionSuccessful();
                    return p33Var;
                } finally {
                }
            case 5:
                gqc gqcVar2 = (gqc) ((h45) obj);
                long jA = gqcVar2.b.a() - gqcVar2.o.d;
                sQLiteDatabaseM = gqcVar2.m();
                sQLiteDatabaseM.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jA)};
                    gqc.n0(sQLiteDatabaseM.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new bqc(i, gqcVar2));
                    int iDelete = sQLiteDatabaseM.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM.setTransactionSuccessful();
                    sQLiteDatabaseM.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 6:
                gqc gqcVar3 = (gqc) ((t8f) obj).i;
                sQLiteDatabaseM = gqcVar3.m();
                sQLiteDatabaseM.beginTransaction();
                try {
                    sQLiteDatabaseM.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gqcVar3.b.a()).execute();
                    sQLiteDatabaseM.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                o7g o7gVar = (o7g) obj;
                Iterator it = ((Iterable) ((gqc) o7gVar.b).o(new p4c(15))).iterator();
                while (it.hasNext()) {
                    o7gVar.c.a((hc0) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((tj8) obj2).c((dpd) obj);
                break;
            case 3:
                ((k1f) obj2).d((ExportException) obj);
                break;
            default:
                ((y8f) obj2).a((v6f) obj);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        df5 df5Var;
        df5 df5Var2;
        switch (this.a) {
            case 10:
                w8f w8fVar = (w8f) obj;
                w8fVar.getClass();
                xlc xlcVarA = xlc.a(1, "SELECT * FROM uploads WHERE upload_status=?");
                xlcVarA.j(1, ((q8f) this.b).a);
                return new t28(new u8f(w8fVar, xlcVarA, 1));
            default:
                ff5 ff5Var = (ff5) obj;
                Object ee9Var = null;
                if (ff5Var != null) {
                    List<df5> list = ff5Var.b;
                    if (!list.isEmpty()) {
                        k20 k20Var = (k20) this.b;
                        j20 j20Var = k20Var.l;
                        boolean z = j20Var != null && j20Var.d;
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                df5Var = (df5) it.next();
                                if (df5Var.a == 2) {
                                }
                            } else {
                                df5Var = null;
                            }
                        }
                        if (df5Var != null) {
                            ee9Var = new b24(ff5Var.a, df5Var.b, k20Var.k, k20Var.c, k20Var.a, k20Var.g, k20Var.n, z, k20Var.p, k20Var.q, k20Var.e, k20Var.f);
                        } else {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    df5Var2 = (df5) it2.next();
                                    if (df5Var2.a == 1) {
                                    }
                                } else {
                                    df5Var2 = null;
                                }
                            }
                            if (df5Var2 != null) {
                                ee9Var = new yn6(ff5Var.a, df5Var2.b, k20Var.k, k20Var.c, k20Var.a, k20Var.g, k20Var.n, z, k20Var.p, k20Var.q, k20Var.e, k20Var.f);
                            } else {
                                ArrayList<df5> arrayList = new ArrayList();
                                for (df5 df5Var3 : list) {
                                    if (df5Var3.a == 3) {
                                        arrayList.add(df5Var3);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                                    for (df5 df5Var4 : arrayList) {
                                        try {
                                            arrayList2.add(new ce9(df5Var4.c, df5Var4.b, df5Var4.d, df5Var4.e));
                                        } catch (Throwable th) {
                                            throw new RuntimeException(th);
                                        }
                                    }
                                    ee9Var = new ee9(ff5Var.a, arrayList2, k20Var.k, k20Var.c, k20Var.a, k20Var.n, z, k20Var.p, k20Var.q);
                                }
                            }
                        }
                    }
                }
                hm9.m("VideoRipper", "getVideoContent: processFetchResult for videoContent %s", ee9Var);
                return ee9Var;
        }
    }

    @Override // defpackage.bb3
    public void b(ra3 ra3Var) {
        switch (this.a) {
            case 7:
                a9f a9fVar = (a9f) this.b;
                a9fVar.getClass();
                hm9.n("a9f", "clear: ");
                synchronized (a9fVar) {
                    a9fVar.a.clear().e(((y8f) a9fVar.b.getValue()).clear()).a();
                }
                if (ra3Var.h()) {
                    return;
                }
                ra3Var.b();
                return;
            default:
                ((Map) ((c9f) this.b).b).clear();
                ra3Var.b();
                return;
        }
    }

    public void c(Display display) {
        kgf kgfVar = (kgf) this.b;
        if (display == null) {
            kgfVar.i = -9223372036854775807L;
            kgfVar.j = -9223372036854775807L;
        } else {
            kgfVar.getClass();
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            kgfVar.i = refreshRate;
            kgfVar.j = (refreshRate * 80) / 100;
        }
    }

    @Override // defpackage.pv6
    public void f(qv6 qv6Var) {
        mag magVar = (mag) this.b;
        magVar.getClass();
        try {
            ov6 ov6VarG = qv6Var.g();
            if (ov6VarG != null) {
                magVar.b.j(ov6VarG);
            }
        } catch (IllegalStateException e) {
            e.getMessage();
        }
    }

    @Override // defpackage.o1d
    public int i(int i) {
        switch (this.a) {
            case LangUtils.HASH_SEED /* 17 */:
                return ((w2g) ((ol7) ((WebAppSettingsScreen) this.b).Z.C(i))).a();
            default:
                w2g w2gVar = (w2g) ((ol7) ((WebAppsSettingScreen) this.b).o.C(i));
                if (w2gVar.a() != 0) {
                    return w2gVar.a();
                }
                return 0;
        }
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        h1f h1fVar = (h1f) this.b;
        ol8 ol8Var = (ol8) obj;
        h1fVar.t.getClass();
        v85 v85VarA = h1fVar.q.a();
        String str = ol8Var.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "onCompleted", null);
        }
        ml8 ml8Var = ol8Var.a;
        ml8Var.f.set(v85VarA);
        ml8Var.g.set(null);
        ol8Var.a();
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        int i;
        boolean z;
        boolean z2;
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ypf ypfVar = (ypf) this.b;
                ypfVar.getClass();
                if (rq9.v0 == null) {
                    rq9.v0 = new rq9();
                }
                rq9 rq9Var = rq9.v0;
                l7b l7bVar = new l7b(ypfVar, 15, nqdVar);
                rq9Var.getClass();
                String str = ypfVar.a;
                if (str.length() == 0) {
                    new IllegalArgumentException("Video identifier cannot be empty");
                    l7bVar.j();
                    break;
                } else {
                    try {
                        qq9.e(str).e(new bdb(l7bVar, 13, new qq9()));
                        break;
                    } catch (IOException e) {
                        l7bVar.j();
                        e.printStackTrace();
                        return;
                    }
                }
            default:
                x9g x9gVar = (x9g) this.b;
                String[] strArr = {x9gVar.a};
                w9g w9gVar = x9gVar.b;
                w9gVar.execute(strArr);
                SparseArray sparseArray = (SparseArray) w9gVar.get();
                if (sparseArray != null && sparseArray.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        sparseArray.keyAt(i2);
                        y9g y9gVar = (y9g) sparseArray.valueAt(i2);
                        py5 py5Var = y9gVar.a;
                        if (py5Var != null && (i = py5Var.e) > 0 && !(z = py5Var.f) && !(z2 = py5Var.g)) {
                            arrayList.add(new df5(z ? 2 : z2 ? 1 : 3, -1, py5Var.c, i, y9gVar.b));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        nqdVar.onError(new FetcherException(4, "Can't find any link"));
                        break;
                    } else if (!nqdVar.h()) {
                        nqdVar.a(new ff5("YouTube", arrayList));
                        break;
                    }
                } else if (!nqdVar.h()) {
                    nqdVar.onError(new FetcherException(4, "Can't get video link"));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        switch (this.a) {
            case 16:
                prf.b((Intent) this.b);
                break;
            case 20:
                ((c7g) this.b).b.d(null);
                break;
            case 21:
                ((ScheduledFuture) this.b).cancel(false);
                break;
            default:
                x.b.a((x.c) this.b, task);
                break;
        }
    }

    public /* synthetic */ gte(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ gte(VideoView videoView, SurfaceTexture surfaceTexture) {
        this.a = 14;
        this.b = videoView;
    }
}

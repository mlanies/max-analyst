package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.view.Surface;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import java.io.EOFException;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class glc implements yk, u43, r2a, vt, bvc, tj8 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ glc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vt
    public xt B(lv4 lv4Var, Looper looper, wt wtVar, md3 md3Var) {
        va4 va4Var = new va4();
        if (lv4Var.d) {
            synchronized (va4Var) {
                va4Var.c = 4;
            }
        }
        return new go9((Context) this.b, lv4Var, new oc4((Context) this.b, va4Var), (pkg) ((u43) this.c), md3Var.b, looper, wtVar, (she) this.o);
    }

    @Override // defpackage.bvc
    public void a() {
        wuc wucVar = (wuc) ((k56) this.b).invoke();
        if (wucVar == null) {
            return;
        }
        ((an9) ((je7) this.o).getValue()).f(wucVar, (spa) ((k56) this.c).invoke());
    }

    @Override // defpackage.r2a
    public void b() {
        ((a95) this.b).b();
        ((th4) this.c).e = true;
    }

    @Override // defpackage.tj8
    public void c(dpd dpdVar) {
        ((xpb) this.c).e(dpdVar);
    }

    @Override // defpackage.u43
    public y84 d(qy5 qy5Var, Surface surface, boolean z) {
        y84 y84VarD = ((u43) this.b).d(qy5Var, surface, z);
        this.o = y84VarD.b();
        return y84VarD;
    }

    @Override // defpackage.tj8
    public void e(dpd dpdVar) {
        ((tj8) this.b).e(dpdVar);
    }

    @Override // defpackage.r2a
    public void f(hl hlVar) {
        up6 up6Var = (up6) this.o;
        if (up6Var instanceof up6) {
            up6Var.e = hlVar;
        }
    }

    @Override // defpackage.u43
    public y84 g(qy5 qy5Var) {
        y84 y84VarG = ((u43) this.b).g(qy5Var);
        this.c = y84VarG.b();
        return y84VarG;
    }

    @Override // defpackage.yk
    public za7 getFailParser() {
        return (za7) this.o;
    }

    @Override // defpackage.yk
    public za7 getOkParser() {
        return (za7) this.c;
    }

    @Override // defpackage.fl
    public int getPriority() {
        return ((fl) this.b).getPriority();
    }

    @Override // defpackage.fl
    public kl getScope() {
        return ((fl) this.b).getScope();
    }

    @Override // defpackage.fl
    public Uri getUri() {
        return ((fl) this.b).getUri();
    }

    public ir3 h() {
        return (ir3) ((khe) this.c).getValue();
    }

    public long i() {
        ra4 ra4Var = (ra4) this.o;
        if (ra4Var != null) {
            return ra4Var.o;
        }
        return -1L;
    }

    public void j(r24 r24Var, Uri uri, Map map, long j, long j2, oa5 oa5Var) throws UnrecognizedInputFormatException {
        boolean z;
        boolean z2 = true;
        ra4 ra4Var = new ra4(r24Var, j, j2);
        this.o = ra4Var;
        if (((ka5) this.c) != null) {
            return;
        }
        ka5[] ka5VarArrB = ((qa5) this.b).b(uri, map);
        if (ka5VarArrB.length == 1) {
            this.c = ka5VarArrB[0];
        } else {
            int length = ka5VarArrB.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                ka5 ka5Var = ka5VarArrB[i];
                try {
                } catch (EOFException unused) {
                    z = ((ka5) this.c) != null || ra4Var.o == j;
                } catch (Throwable th) {
                    if (((ka5) this.c) == null && ra4Var.o != j) {
                        z2 = false;
                    }
                    np8.f(z2);
                    ra4Var.Y = 0;
                    throw th;
                }
                if (ka5Var.h(ra4Var)) {
                    this.c = ka5Var;
                    ra4Var.Y = 0;
                    break;
                } else {
                    z = ((ka5) this.c) != null || ra4Var.o == j;
                    np8.f(z);
                    ra4Var.Y = 0;
                    i++;
                }
            }
            if (((ka5) this.c) == null) {
                int i2 = maf.a;
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < ka5VarArrB.length; i3++) {
                    sb.append(ka5VarArrB[i3].getClass().getSimpleName());
                    if (i3 < ka5VarArrB.length - 1) {
                        sb.append(", ");
                    }
                }
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder(rh4.e(58, string));
                sb2.append("None of the available extractors (");
                sb2.append(string);
                sb2.append(") could read the stream.");
                String string2 = sb2.toString();
                uri.getClass();
                throw new UnrecognizedInputFormatException(string2, null, false, 1);
            }
        }
        ((ka5) this.c).g(oa5Var);
    }

    public long k(pl3 pl3Var) {
        ir3 ir3VarH = h();
        long j = pl3Var.a;
        km3 km3Var = new km3(0L, j, 0, 0, pl3Var);
        ConcurrentHashMap concurrentHashMap = ((d56) ((khe) this.o).getValue()).a;
        ilc ilcVar = ir3VarH.a;
        ilcVar.b();
        ilcVar.c();
        try {
            long jD = ir3VarH.b.D(km3Var);
            ilcVar.r();
            ilcVar.l();
            if (pl3Var.j == 0 || !pl3Var.a()) {
                Object obj = concurrentHashMap.get(Long.valueOf(j));
                List list = pl3Var.f;
                if (!(obj == null ? false : obj.equals(Integer.valueOf(list.hashCode())))) {
                    concurrentHashMap.remove(Long.valueOf(j));
                    qec qecVar = g56.a;
                    e56 e56VarB = g56.b(list);
                    if (e56VarB != null) {
                        String strC = bre.c(pl3Var.p);
                        if (oag.t(strC)) {
                            strC = "";
                        }
                        String strK = b0d.k(strC);
                        e56 e56Var = e56VarB.c;
                        ir3VarH.b(strK, e56VarB.a, e56VarB.b, e56Var != null ? e56Var.a : null, e56Var != null ? e56Var.b : null, j);
                        concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(list.hashCode()));
                        hm9.n(ir3.class.getName(), "update_fts_title_contacts2 for #" + j);
                    }
                }
            }
            return jD;
        } catch (Throwable th) {
            ilcVar.l();
            throw th;
        }
    }

    @Override // defpackage.fl
    public boolean shouldGzip() {
        return ((fl) this.b).shouldGzip();
    }

    @Override // defpackage.fl
    public boolean shouldPost() {
        return ((fl) this.b).shouldPost();
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                ph4 ph4Var = (ph4) ((ph4) this.c).b;
                String str = "";
                while (ph4Var != null) {
                    Object obj = ph4Var.a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    ph4Var = (ph4) ph4Var.b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fl
    public boolean willWriteParams() {
        return ((fl) this.b).willWriteParams();
    }

    @Override // defpackage.fl
    public boolean willWriteSupplyParams() {
        return ((fl) this.b).willWriteSupplyParams();
    }

    @Override // defpackage.fl
    public void writeParams(kb7 kb7Var) {
        ((fl) this.b).writeParams(kb7Var);
    }

    @Override // defpackage.fl
    public void writeSupplyParams(kb7 kb7Var) {
        ((fl) this.b).writeSupplyParams(kb7Var);
    }

    public /* synthetic */ glc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public glc(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new h7b(23, false);
                this.c = new sy4(29);
                this.o = new h7b(23, false);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                this.b = Collections.emptyList();
                this.c = Collections.emptyList();
                break;
            default:
                this.b = new w4d(17, false);
                this.c = new w4d(17, false);
                this.o = wz4.a;
                break;
        }
    }

    public glc(i50 i50Var) {
        this.a = 12;
        this.b = i50Var;
        xpb xpbVar = new xpb();
        this.c = xpbVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ztc ztcVarA = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVarA, "scheduler is null");
        this.o = new o1a(xpbVar, 50L, timeUnit, ztcVarA, false).n(ce.a()).p(new gte(0, i50Var));
    }

    public glc(k56 k56Var, k56 k56Var2, int i) {
        this.a = 11;
        k56Var2 = (i & 2) != 0 ? new xid(12) : k56Var2;
        khe kheVarD = l1e.a.getAccessor().d(an9.class);
        this.b = k56Var;
        this.c = k56Var2;
        this.o = kheVarD;
    }

    public glc(jlc jlcVar) {
        this.a = 0;
        this.b = jlcVar;
        this.c = new khe(new lwa(14, this));
        this.o = new khe(bv3.w0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public glc(wuc wucVar) {
        this(new rzd(2, wucVar), null, 6);
        this.a = 11;
    }

    public glc(wye wyeVar, djb djbVar) {
        this.a = 4;
        this.b = wyeVar;
        this.c = wyeVar.i;
        va8 va8Var = new va8(12, (byte) 0);
        va8Var.c = "CRASH_REPORT";
        va8Var.b = djbVar;
        this.o = new h7b(va8Var);
    }

    public glc(fl flVar, za7 za7Var) {
        this.a = 1;
        nd2 nd2Var = nd2.b;
        this.b = flVar;
        this.c = za7Var;
        this.o = nd2Var;
    }

    public glc(File file) {
        this.a = 13;
        this.b = null;
        this.c = file;
        this.o = null;
    }

    public glc(Boolean bool) {
        this.a = 13;
        this.b = null;
        this.c = null;
        this.o = bool;
    }

    public glc(String str, int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = str;
                this.c = null;
                this.o = null;
                break;
            default:
                ph4 ph4Var = new ph4();
                this.c = ph4Var;
                this.o = ph4Var;
                this.b = str;
                break;
        }
    }
}

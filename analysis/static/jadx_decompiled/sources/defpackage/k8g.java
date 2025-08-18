package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.fragment.app.b;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.android.gms.common.api.ResolvableApiException;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import org.apache.http.HttpStatus;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.shared.BinderNotFoundValueException;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes.dex */
public final class k8g implements v43, Provider, s7c, pr7, pa5 {
    public static final /* synthetic */ int o = 0;
    public final Object a;
    public Object b;
    public Object c;

    public /* synthetic */ k8g(Object obj) {
        this.a = obj;
    }

    public static k8g x(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new k8g(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public void A() {
        FrgBase frgBase = (FrgBase) this.b;
        Context contextD0 = frgBase.d0();
        String[] strArr = wmd.f;
        if (!wmd.j(contextD0, strArr)) {
            FrgDlgPermissions frgDlgPermissionsN1 = FrgDlgPermissions.n1(strArr, jpc.e2, jpc.c2, jpc.d2, false);
            frgDlgPermissionsN1.b1(169, frgBase);
            frgDlgPermissionsN1.k1(frgBase.f0(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
        } else {
            Context contextD02 = frgBase.d0();
            if (contextD02 == null) {
                return;
            }
            q().getClass();
            oe6.a(contextD02, this);
        }
    }

    @Override // defpackage.pa5
    /* renamed from: B */
    public yze mo6B(int i, int i2) {
        pa5 pa5Var = (pa5) this.a;
        if (i2 != 3) {
            return pa5Var.mo6B(i, i2);
        }
        SparseArray sparseArray = (SparseArray) this.c;
        qbe qbeVar = (qbe) sparseArray.get(i);
        if (qbeVar != null) {
            return qbeVar;
        }
        qbe qbeVar2 = new qbe(pa5Var.mo6B(i, i2), (mbe) this.b);
        sparseArray.put(i, qbeVar2);
        return qbeVar2;
    }

    public m20 C() {
        m20 m20Var = new m20();
        m20Var.a = new ArrayList((List) this.a);
        m20Var.b = (z07) this.b;
        return m20Var;
    }

    @Override // defpackage.pa5
    public void J(v1d v1dVar) {
        ((pa5) this.a).J(v1dVar);
    }

    @Override // defpackage.q7c
    public Object T0(Object obj, bc7 bc7Var) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        try {
            Object objInvoke = ((k56) this.a).invoke();
            this.b = objInvoke;
            ((ia5) this.c).b.add(new ha5(objInvoke, new es3(12, this)));
            return objInvoke;
        } catch (Throwable th) {
            throw new BinderNotFoundValueException("could not extract value for name ".concat(bc7Var.getName()), th);
        }
    }

    @Override // defpackage.v43
    public boolean a() {
        return ((v43) this.a).a();
    }

    @Override // defpackage.v43
    public y84 b(qy5 qy5Var) {
        y84 y84VarB = ((v43) this.a).b(qy5Var);
        this.b = y84VarB.b();
        return y84VarB;
    }

    @Override // defpackage.v43
    public boolean c() {
        return ((v43) this.a).c();
    }

    @Override // defpackage.v43
    public y84 d(qy5 qy5Var) {
        y84 y84VarD = ((v43) this.a).d(qy5Var);
        this.c = y84VarD.b();
        return y84VarD;
    }

    public void e(hoc hocVar) {
        ((Handler) this.c).post(new gbg(this, hocVar, 1));
    }

    @Override // defpackage.pr7
    public void f() {
        hm9.n("k8g", "onSuccessCheckSettings");
    }

    @Override // defpackage.pr7
    public void g(Exception exc) throws IntentSender.SendIntentException {
        b bVarB0;
        hm9.p("k8g", "onFailureCheckSettings", exc);
        q().getClass();
        if ((exc instanceof ResolvableApiException) && (bVarB0 = ((FrgBase) this.b).b0()) != null) {
            try {
                q().getClass();
                if (exc instanceof ResolvableApiException) {
                    PendingIntent pendingIntent = ((ResolvableApiException) exc).a.c;
                    if (pendingIntent != null) {
                        fp3.n(pendingIntent);
                        bVarB0.startIntentSenderForResult(pendingIntent.getIntentSender(), HttpStatus.SC_MOVED_PERMANENTLY, null, 0, 0, 0);
                    }
                }
            } catch (IntentSender.SendIntentException unused) {
                hm9.p("k8g", "Can't resolve check settings error", exc);
                ((cba) ((o45) this.a)).c(new HandledException("Can't resolve check settings error"), true);
            }
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new iz3((Context) ((Provider) this.a).get(), (d9f) ((Provider) this.b).get(), (d9f) ((Provider) this.c).get());
    }

    public l20 h(int i) {
        if (i < 0) {
            return null;
        }
        List list = (List) this.a;
        if (i >= list.size()) {
            return null;
        }
        return (l20) list.get(i);
    }

    public int i() {
        List list = (List) this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public l20 j(String str) {
        for (l20 l20Var : (List) this.a) {
            if (oag.d(str, l20Var.r)) {
                return l20Var;
            }
        }
        return null;
    }

    public l20 k(g20 g20Var) {
        for (l20 l20Var : (List) this.a) {
            if (l20Var.a == g20Var) {
                return l20Var;
            }
        }
        return null;
    }

    public ColorStateList l(int i) {
        int resourceId;
        ColorStateList colorStateListN;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListN = z7.n((Context) this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListN;
    }

    public long m() {
        sa4 sa4Var = (sa4) this.c;
        if (sa4Var != null) {
            return sa4Var.o;
        }
        return -1L;
    }

    public Drawable n(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : s36.n((Context) this.a, resourceId);
    }

    public Drawable o(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.b).hasValue(i) || (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) == 0) {
            return null;
        }
        gn gnVarA = gn.a();
        Context context = (Context) this.a;
        synchronized (gnVarA) {
            drawableE = gnVarA.a.e(resourceId, context, true);
        }
        return drawableE;
    }

    @Override // defpackage.s7c
    public void o1(Object obj, bc7 bc7Var, Object obj2) {
        if (obj2 == null) {
            this.b = null;
        }
    }

    public Typeface p(int i, int i2, co coVar) {
        int resourceId = ((TypedArray) this.b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = vic.a;
        Context context = (Context) this.a;
        if (context.isRestricted()) {
            return null;
        }
        return vic.b(context, resourceId, typedValue, i2, coVar, true, false);
    }

    public oe6 q() {
        if (((oe6) this.c) == null) {
            this.c = (oe6) ((y8a) ((ed3) ((FrgBase) this.b).p1.b)).getAccessor().c(oe6.class);
        }
        return (oe6) this.c;
    }

    public ArrayList r(String str) {
        xlc xlcVarA = xlc.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str);
        }
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(cursorO.isNull(0) ? null : cursorO.getString(0));
            }
            return arrayList;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public qnf s(h23 h23Var, String str) {
        boolean zIsInstance;
        qnf qnfVarA;
        jsc jscVar;
        gh7 gh7Var;
        xnf xnfVar = (xnf) this.a;
        qnf qnfVar = (qnf) xnfVar.a.get(str);
        Map map = h23.b;
        Class clsJ = h23Var.a;
        Integer num = (Integer) map.get(clsJ);
        if (num != null) {
            zIsInstance = f8.n(num.intValue(), qnfVar);
        } else {
            if (clsJ.isPrimitive()) {
                clsJ = ft.j(nec.a(clsJ));
            }
            zIsInstance = clsJ.isInstance(qnfVar);
        }
        vnf vnfVar = (vnf) this.b;
        if (zIsInstance) {
            if ((vnfVar instanceof jsc) && (gh7Var = (jscVar = (jsc) vnfVar).d) != null) {
                fp3.e(qnfVar, jscVar.e, gh7Var);
            }
            return qnfVar;
        }
        wh9 wh9Var = new wh9((lz3) this.c);
        wh9Var.a(xxc.Z, str);
        try {
            try {
                qnfVarA = vnfVar.c(h23Var, wh9Var);
            } catch (AbstractMethodError unused) {
                qnfVarA = vnfVar.b(h23Var.a(), wh9Var);
            }
        } catch (AbstractMethodError unused2) {
            qnfVarA = vnfVar.a(h23Var.a());
        }
        qnf qnfVar2 = (qnf) xnfVar.a.put(str, qnfVarA);
        if (qnfVar2 != null) {
            qnfVar2.b();
        }
        return qnfVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8g.t():boolean");
    }

    public void u(t24 t24Var, Uri uri, Map map, long j, long j2, pa5 pa5Var) throws UnrecognizedInputFormatException {
        boolean z;
        boolean z2 = true;
        sa4 sa4Var = new sa4(t24Var, j, j2);
        this.c = sa4Var;
        if (((la5) this.b) != null) {
            return;
        }
        la5[] la5VarArrB = ((ra5) this.a).b(uri, map);
        int length = la5VarArrB.length;
        ls5 ls5Var = zw6.b;
        wmd.i(length, "expectedSize");
        ww6 ww6Var = new ww6(length);
        if (la5VarArrB.length == 1) {
            this.b = la5VarArrB[0];
        } else {
            int length2 = la5VarArrB.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                la5 la5Var = la5VarArrB[i];
                try {
                } catch (EOFException unused) {
                    z = ((la5) this.b) != null || sa4Var.o == j;
                } catch (Throwable th) {
                    if (((la5) this.b) == null && sa4Var.o != j) {
                        z2 = false;
                    }
                    fm9.k(z2);
                    sa4Var.Y = 0;
                    throw th;
                }
                if (la5Var.n(sa4Var)) {
                    this.b = la5Var;
                    sa4Var.Y = 0;
                    break;
                } else {
                    ww6Var.e(la5Var.o());
                    z = ((la5) this.b) != null || sa4Var.o == j;
                    fm9.k(z);
                    sa4Var.Y = 0;
                    i++;
                }
            }
            if (((la5) this.b) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                o97 o97Var = new o97(", ", 0);
                Iterator it = br7.Z(new un0(4), zw6.k(la5VarArrB)).iterator();
                StringBuilder sb2 = new StringBuilder();
                o97Var.a(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                ffc ffcVarJ = ww6Var.j();
                UnrecognizedInputFormatException unrecognizedInputFormatException = new UnrecognizedInputFormatException(string, null, false, 1);
                zw6.j(ffcVarJ);
                throw unrecognizedInputFormatException;
            }
        }
        ((la5) this.b).S(pa5Var);
    }

    public void v(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            j8g j8gVar = new j8g((String) it.next(), str);
            ilc ilcVar = (ilc) this.a;
            ilcVar.b();
            ilcVar.c();
            try {
                ((x7g) this.b).C(j8gVar);
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        }
    }

    @Override // defpackage.pa5
    public void w() {
        ((pa5) this.a).w();
    }

    public void y(int i, String[] strArr, int[] iArr) {
        Context contextD0;
        Context contextD02;
        FrgBase frgBase = (FrgBase) this.b;
        if (i == 169) {
            if (!wmd.O((FrgBase) this.b, strArr, iArr, wmd.f, jpc.a2, jpc.b2) || (contextD02 = frgBase.d0()) == null) {
                return;
            }
            q().getClass();
            oe6.a(contextD02, this);
            return;
        }
        if (i == 175) {
            if (!wmd.O((FrgBase) this.b, strArr, iArr, wmd.g, jpc.T1, jpc.b2) || (contextD0 = frgBase.d0()) == null) {
                return;
            }
            q().getClass();
            oe6.a(contextD0, this);
        }
    }

    public void z() {
        ((TypedArray) this.b).recycle();
    }

    public /* synthetic */ k8g(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ k8g(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public k8g(a4c a4cVar) {
        this.b = new CopyOnWriteArrayList();
        this.c = new Handler(Looper.getMainLooper());
        if (a4cVar != null) {
            this.a = a4cVar;
            return;
        }
        throw new IllegalArgumentException("Illegal 'uncaughtExceptionHandler' value: null");
    }

    public k8g(sy4 sy4Var) {
        c32 c32Var = z04.c;
        nd2 nd2Var = a14.g;
        this.a = sy4Var;
        this.b = c32Var;
        this.c = nd2Var;
    }

    public k8g(ilc ilcVar) {
        this.a = ilcVar;
        this.b = new x7g(ilcVar, 3);
        this.c = new ktf(ilcVar, 14);
    }

    public k8g(m20 m20Var) {
        this.a = m20Var.a;
        this.b = m20Var.b;
        this.c = m20Var.c;
    }

    public k8g(pa5 pa5Var, mbe mbeVar) {
        this.a = pa5Var;
        this.b = mbeVar;
        this.c = new SparseArray();
    }

    public k8g(Context context, sy4 sy4Var, ExecutorService executorService) {
        this.a = executorService;
        this.b = context;
        this.c = sy4Var;
    }

    public k8g(ia5 ia5Var, ga5 ga5Var) {
        this.c = ia5Var;
        this.a = ga5Var;
    }

    public k8g(Context context) {
        this.a = new Object();
        this.c = new HashMap();
        this.b = new bnc(this, context);
    }
}

package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class kdg implements ge6, he6 {
    public final ok d;
    public final zk e;
    public final aab f;
    public final int i;
    public final xdg j;
    public boolean k;
    public final /* synthetic */ ie6 o;
    public final LinkedList c = new LinkedList();
    public final HashSet g = new HashSet();
    public final HashMap h = new HashMap();
    public final ArrayList l = new ArrayList();
    public ph3 m = null;
    public int n = 0;

    public kdg(ie6 ie6Var, de6 de6Var) {
        this.o = ie6Var;
        Looper looper = ie6Var.x0.getLooper();
        c8d c8dVarA = de6Var.a();
        kad kadVar = new kad((Account) c8dVarA.b, (xs) c8dVarA.c, (String) c8dVarA.a, (String) c8dVarA.o);
        z04 z04Var = (z04) de6Var.c.c;
        fp3.n(z04Var);
        ok okVarE = z04Var.e(de6Var.a, looper, kadVar, de6Var.o, this, this);
        String str = de6Var.b;
        if (str != null && (okVarE instanceof a)) {
            ((a) okVarE).C0 = str;
        }
        if (str != null && (okVarE instanceof fr9)) {
            au1.r(okVarE);
            throw null;
        }
        this.d = okVarE;
        this.e = de6Var.X;
        this.f = new aab(15);
        this.i = de6Var.Z;
        if (!okVarE.j()) {
            this.j = null;
            return;
        }
        Context context = ie6Var.X;
        fc9 fc9Var = ie6Var.x0;
        c8d c8dVarA2 = de6Var.a();
        this.j = new xdg(context, fc9Var, new kad((Account) c8dVarA2.b, (xs) c8dVarA2.c, (String) c8dVarA2.a, (String) c8dVarA2.o));
    }

    @Override // defpackage.ge6
    public final void R(int i) {
        Looper looperMyLooper = Looper.myLooper();
        ie6 ie6Var = this.o;
        if (looperMyLooper == ie6Var.x0.getLooper()) {
            f(i);
        } else {
            ie6Var.x0.post(new zj0(i, 5, this));
        }
    }

    public final void a(ph3 ph3Var) {
        HashSet hashSet = this.g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        au1.r(it.next());
        if (s36.l(ph3Var, ph3.X)) {
            this.d.d();
        }
        throw null;
    }

    public final void b(Status status) {
        fp3.i(this.o.x0);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z) {
        fp3.i(this.o.x0);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            peg pegVar = (peg) it.next();
            if (!z || pegVar.a == 2) {
                if (status != null) {
                    pegVar.a(status);
                } else {
                    pegVar.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            peg pegVar = (peg) arrayList.get(i);
            if (!this.d.isConnected()) {
                return;
            }
            if (h(pegVar)) {
                linkedList.remove(pegVar);
            }
        }
    }

    public final void e() {
        ok okVar = this.d;
        ie6 ie6Var = this.o;
        fp3.i(ie6Var.x0);
        this.m = null;
        a(ph3.X);
        if (this.k) {
            fc9 fc9Var = ie6Var.x0;
            zk zkVar = this.e;
            fc9Var.removeMessages(11, zkVar);
            ie6Var.x0.removeMessages(9, zkVar);
            this.k = false;
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            vdg vdgVar = (vdg) it.next();
            vdgVar.a.getClass();
            try {
                bdb bdbVar = vdgVar.a;
                ((ofc) ((pkg) bdbVar.c).a).accept(okVar, new qne());
            } catch (DeadObjectException unused) {
                R(3);
                okVar.b("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        d();
        g();
    }

    public final void f(int i) {
        ie6 ie6Var = this.o;
        fp3.i(ie6Var.x0);
        this.m = null;
        this.k = true;
        String strI = this.d.i();
        aab aabVar = this.f;
        aabVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strI != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strI);
        }
        aabVar.r(true, new Status(20, sb.toString(), null, null));
        fc9 fc9Var = ie6Var.x0;
        zk zkVar = this.e;
        fc9Var.sendMessageDelayed(Message.obtain(fc9Var, 9, zkVar), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        fc9 fc9Var2 = ie6Var.x0;
        fc9Var2.sendMessageDelayed(Message.obtain(fc9Var2, 11, zkVar), 120000L);
        ((SparseIntArray) ie6Var.Z.b).clear();
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((vdg) it.next()).c.run();
        }
    }

    public final void g() {
        ie6 ie6Var = this.o;
        fc9 fc9Var = ie6Var.x0;
        zk zkVar = this.e;
        fc9Var.removeMessages(12, zkVar);
        fc9 fc9Var2 = ie6Var.x0;
        fc9Var2.sendMessageDelayed(fc9Var2.obtainMessage(12, zkVar), ie6Var.a);
    }

    public final boolean h(peg pegVar) {
        pe5 pe5Var;
        if (!(pegVar instanceof odg)) {
            ok okVar = this.d;
            pegVar.d(this.f, okVar.j());
            try {
                pegVar.c(this);
            } catch (DeadObjectException unused) {
                R(1);
                okVar.b("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        odg odgVar = (odg) pegVar;
        pe5[] pe5VarArrG = odgVar.g(this);
        if (pe5VarArrG == null || pe5VarArrG.length == 0) {
            pe5Var = null;
        } else {
            pe5[] pe5VarArrH = this.d.h();
            if (pe5VarArrH == null) {
                pe5VarArrH = new pe5[0];
            }
            us usVar = new us(pe5VarArrH.length);
            for (pe5 pe5Var2 : pe5VarArrH) {
                usVar.put(pe5Var2.a, Long.valueOf(pe5Var2.b()));
            }
            int length = pe5VarArrG.length;
            for (int i = 0; i < length; i++) {
                pe5Var = pe5VarArrG[i];
                Long l = (Long) usVar.get(pe5Var.a);
                if (l == null || l.longValue() < pe5Var.b()) {
                    break;
                }
            }
            pe5Var = null;
        }
        if (pe5Var == null) {
            ok okVar2 = this.d;
            pegVar.d(this.f, okVar2.j());
            try {
                pegVar.c(this);
            } catch (DeadObjectException unused2) {
                R(1);
                okVar2.b("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        this.d.getClass();
        if (!this.o.y0 || !odgVar.f(this)) {
            odgVar.b(new UnsupportedApiCallException(pe5Var));
            return true;
        }
        ldg ldgVar = new ldg(this.e, pe5Var);
        int iIndexOf = this.l.indexOf(ldgVar);
        if (iIndexOf >= 0) {
            ldg ldgVar2 = (ldg) this.l.get(iIndexOf);
            this.o.x0.removeMessages(15, ldgVar2);
            fc9 fc9Var = this.o.x0;
            fc9Var.sendMessageDelayed(Message.obtain(fc9Var, 15, ldgVar2), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        } else {
            this.l.add(ldgVar);
            fc9 fc9Var2 = this.o.x0;
            fc9Var2.sendMessageDelayed(Message.obtain(fc9Var2, 15, ldgVar), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
            fc9 fc9Var3 = this.o.x0;
            fc9Var3.sendMessageDelayed(Message.obtain(fc9Var3, 16, ldgVar), 120000L);
            ph3 ph3Var = new ph3(2, null);
            if (!i(ph3Var)) {
                this.o.b(ph3Var, this.i);
            }
        }
        return false;
    }

    public final boolean i(ph3 ph3Var) {
        synchronized (ie6.B0) {
            this.o.getClass();
        }
        return false;
    }

    public final void j() {
        ie6 ie6Var = this.o;
        fp3.i(ie6Var.x0);
        ok okVar = this.d;
        if (okVar.isConnected() || okVar.c()) {
            return;
        }
        try {
            l7b l7bVar = ie6Var.Z;
            Context context = ie6Var.X;
            l7bVar.getClass();
            fp3.n(context);
            int iG = okVar.g();
            SparseIntArray sparseIntArray = (SparseIntArray) l7bVar.b;
            int iB = sparseIntArray.get(iG, -1);
            if (iB == -1) {
                iB = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iG && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iB == -1) {
                    iB = ((fe6) l7bVar.c).b(context, iG);
                }
                sparseIntArray.put(iG, iB);
            }
            if (iB != 0) {
                ph3 ph3Var = new ph3(iB, null);
                ph3Var.toString();
                m(ph3Var, null);
                return;
            }
            zk zkVar = this.e;
            od odVar = new od();
            odVar.Y = ie6Var;
            odVar.o = null;
            odVar.X = null;
            odVar.a = false;
            odVar.b = okVar;
            odVar.c = zkVar;
            if (okVar.j()) {
                xdg xdgVar = this.j;
                fp3.n(xdgVar);
                iod iodVar = xdgVar.i;
                if (iodVar != null) {
                    iodVar.disconnect();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(xdgVar));
                kad kadVar = xdgVar.h;
                kadVar.Z = numValueOf;
                Handler handler = xdgVar.e;
                xdgVar.i = (iod) xdgVar.f.e(xdgVar.d, handler.getLooper(), kadVar, (jod) kadVar.Y, xdgVar, xdgVar);
                xdgVar.j = odVar;
                Set set = xdgVar.g;
                if (set == null || set.isEmpty()) {
                    handler.post(new gwe(11, xdgVar));
                } else {
                    xdgVar.i.w();
                }
            }
            try {
                okVar.e(odVar);
            } catch (SecurityException e) {
                m(new ph3(10), e);
            }
        } catch (IllegalStateException e2) {
            m(new ph3(10), e2);
        }
    }

    @Override // defpackage.he6
    public final void k(ph3 ph3Var) {
        m(ph3Var, null);
    }

    public final void l(peg pegVar) {
        fp3.i(this.o.x0);
        boolean zIsConnected = this.d.isConnected();
        LinkedList linkedList = this.c;
        if (zIsConnected) {
            if (h(pegVar)) {
                g();
                return;
            } else {
                linkedList.add(pegVar);
                return;
            }
        }
        linkedList.add(pegVar);
        ph3 ph3Var = this.m;
        if (ph3Var == null || ph3Var.b == 0 || ph3Var.c == null) {
            j();
        } else {
            m(ph3Var, null);
        }
    }

    public final void m(ph3 ph3Var, RuntimeException runtimeException) {
        iod iodVar;
        fp3.i(this.o.x0);
        xdg xdgVar = this.j;
        if (xdgVar != null && (iodVar = xdgVar.i) != null) {
            iodVar.disconnect();
        }
        fp3.i(this.o.x0);
        this.m = null;
        ((SparseIntArray) this.o.Z.b).clear();
        a(ph3Var);
        if ((this.d instanceof seg) && ph3Var.b != 24) {
            ie6 ie6Var = this.o;
            ie6Var.b = true;
            fc9 fc9Var = ie6Var.x0;
            fc9Var.sendMessageDelayed(fc9Var.obtainMessage(19), 300000L);
        }
        if (ph3Var.b == 4) {
            b(ie6.A0);
            return;
        }
        if (this.c.isEmpty()) {
            this.m = ph3Var;
            return;
        }
        if (runtimeException != null) {
            fp3.i(this.o.x0);
            c(null, runtimeException, false);
            return;
        }
        if (!this.o.y0) {
            b(ie6.c(this.e, ph3Var));
            return;
        }
        c(ie6.c(this.e, ph3Var), null, true);
        if (this.c.isEmpty() || i(ph3Var) || this.o.b(ph3Var, this.i)) {
            return;
        }
        if (ph3Var.b == 18) {
            this.k = true;
        }
        if (!this.k) {
            b(ie6.c(this.e, ph3Var));
            return;
        }
        ie6 ie6Var2 = this.o;
        zk zkVar = this.e;
        fc9 fc9Var2 = ie6Var2.x0;
        fc9Var2.sendMessageDelayed(Message.obtain(fc9Var2, 9, zkVar), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
    }

    public final void n(ph3 ph3Var) {
        fp3.i(this.o.x0);
        ok okVar = this.d;
        okVar.b("onSignInFailed for " + okVar.getClass().getName() + " with " + String.valueOf(ph3Var));
        m(ph3Var, null);
    }

    public final void o() {
        fp3.i(this.o.x0);
        Status status = ie6.z0;
        b(status);
        this.f.r(false, status);
        for (hm7 hm7Var : (hm7[]) this.h.keySet().toArray(new hm7[0])) {
            l(new ieg(hm7Var, new qne()));
        }
        a(new ph3(4));
        ok okVar = this.d;
        if (okVar.isConnected()) {
            okVar.f(new y7f(3, this));
        }
    }

    @Override // defpackage.ge6
    public final void onConnected() {
        Looper looperMyLooper = Looper.myLooper();
        ie6 ie6Var = this.o;
        if (looperMyLooper == ie6Var.x0.getLooper()) {
            e();
        } else {
            ie6Var.x0.post(new gwe(9, this));
        }
    }
}

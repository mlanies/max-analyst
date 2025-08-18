package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public class go9 implements xt {
    public static go9 f;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;

    public go9(ArrayList arrayList, String str, String str2, int i) {
        this.a = 3;
        this.d = arrayList;
        this.e = str;
        this.c = str2;
        this.b = i;
    }

    public static void b(go9 go9Var, int i) {
        synchronized (go9Var.c) {
            try {
                if (go9Var.b == i) {
                    return;
                }
                go9Var.b = i;
                Iterator it = ((CopyOnWriteArrayList) go9Var.e).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    f84 f84Var = (f84) weakReference.get();
                    if (f84Var != null) {
                        f84Var.a(i);
                    } else {
                        ((CopyOnWriteArrayList) go9Var.e).remove(weakReference);
                    }
                }
            } finally {
            }
        }
    }

    public static go9 h(gy8 gy8Var) {
        int i;
        int iN = lz7.N(gy8Var);
        ArrayList arrayList = null;
        if (iN == 0) {
            return null;
        }
        int i2 = 0;
        String strP = null;
        String strP2 = null;
        for (int i3 = 0; i3 < iN; i3++) {
            String strZ0 = gy8Var.z0();
            strZ0.getClass();
            switch (strZ0) {
                case "credential":
                    strP2 = lz7.P(gy8Var);
                    break;
                case "username":
                    strP = lz7.P(gy8Var);
                    break;
                case "urls":
                    int iG = lz7.G(gy8Var);
                    ArrayList arrayList2 = new ArrayList(iG);
                    for (int i4 = 0; i4 < iG; i4++) {
                        arrayList2.add(lz7.P(gy8Var));
                    }
                    if (arrayList2.isEmpty()) {
                        i = 1;
                        i2 = i;
                        arrayList = arrayList2;
                    } else {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (str.startsWith("stun:") || str.startsWith("stuns:")) {
                                i = 3;
                                i2 = i;
                                arrayList = arrayList2;
                                break;
                            } else if (str.startsWith("turn:") || str.startsWith("turns:")) {
                                i = 2;
                                i2 = i;
                                arrayList = arrayList2;
                            }
                        }
                        i = 1;
                        i2 = i;
                        arrayList = arrayList2;
                    }
                    break;
                default:
                    gy8Var.z();
                    break;
            }
        }
        return new go9(arrayList, strP, strP2, i2);
    }

    @Override // defpackage.xt
    public int a(fm5 fm5Var) {
        if (this.b == 2) {
            u75 u75Var = (u75) this.c;
            fm5Var.b = Math.min((int) ((u75Var.k() * 100) / u75Var.c()), 99);
        }
        return this.b;
    }

    public h3b c() {
        return new h3b((String) this.d, (CharSequence) this.e, this.b, (Bundle) this.c);
    }

    public Object d() {
        Object objRemoveLast;
        synchronized (this.c) {
            objRemoveLast = ((ArrayDeque) this.d).removeLast();
        }
        return objRemoveLast;
    }

    @Override // defpackage.xt
    public cx6 e() {
        jn jnVar = new jn(4);
        glc glcVar = (glc) this.e;
        String str = (String) glcVar.c;
        if (str != null) {
            jnVar.I(1, str);
        }
        String str2 = (String) glcVar.o;
        if (str2 != null) {
            jnVar.I(2, str2);
        }
        return jnVar.j();
    }

    public void f(Object obj) {
        Object objD;
        synchronized (this.c) {
            try {
                objD = ((ArrayDeque) this.d).size() >= this.b ? d() : null;
                ((ArrayDeque) this.d).addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((av1) this.e) == null || objD == null) {
            return;
        }
        ((ov6) objD).close();
    }

    public boolean g() {
        boolean zIsEmpty;
        synchronized (this.c) {
            zIsEmpty = ((ArrayDeque) this.d).isEmpty();
        }
        return zIsEmpty;
    }

    public void i(Bundle bundle) {
        this.c = bundle;
    }

    @Override // defpackage.xt
    public void release() {
        ((u75) this.c).release();
        this.b = 0;
    }

    @Override // defpackage.xt
    public void start() {
        tb8 tb8Var = ((lv4) this.d).a;
        u75 u75Var = (u75) this.c;
        u75Var.getClass();
        u75Var.O0(zw6.n(tb8Var));
        u75Var.prepare();
        this.b = 1;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("{urls=");
                sb.append((List) this.d);
                sb.append(", username='");
                sb.append((String) this.e);
                sb.append("', credential='");
                sb.append((String) this.c);
                sb.append("', type=");
                int i = this.b;
                sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "STUN" : "TURN" : "UNKNOWN");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public go9(int i, av1 av1Var) {
        this.a = 1;
        this.c = new Object();
        this.b = i;
        this.d = new ArrayDeque(i);
        this.e = av1Var;
    }

    public go9(Context context) {
        this.a = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.e = new CopyOnWriteArrayList();
        this.c = new Object();
        this.b = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new an(8, this), intentFilter);
    }

    public go9(Context context, lv4 lv4Var, wj8 wj8Var, pkg pkgVar, int i, Looper looper, wt wtVar, she sheVar) {
        this.a = 2;
        this.d = lv4Var;
        glc glcVar = new glc(3, pkgVar);
        this.e = glcVar;
        cf4 cf4Var = new cf4(context);
        me4 me4Var = new me4(context);
        me4Var.z = true;
        me4Var.M = false;
        cf4Var.b(new oe4(me4Var));
        fc4.l("bufferForPlaybackMs", 250, 0, "0");
        fc4.l("bufferForPlaybackAfterRebufferMs", 500, 0, "0");
        fc4.l("minBufferMs", 50000, 250, "bufferForPlaybackMs");
        fc4.l("minBufferMs", 50000, 500, "bufferForPlaybackAfterRebufferMs");
        fc4.l("maxBufferMs", 50000, 50000, "minBufferMs");
        fc4 fc4Var = new fc4(new n64(1), 50000, 50000, 250, 500, false);
        x65 x65Var = new x65(context, new lc4(6, new a75(lv4Var.b, lv4Var.c, lv4Var.d, glcVar, i, wtVar)), new v65(context, 4));
        fm9.k(!x65Var.v);
        x65Var.d = new lc4(2, wj8Var);
        fm9.k(!x65Var.v);
        x65Var.e = new lc4(3, cf4Var);
        fm9.k(!x65Var.v);
        x65Var.f = new lc4(7, fc4Var);
        fm9.k(!x65Var.v);
        looper.getClass();
        x65Var.i = looper;
        fm9.k(!x65Var.v);
        x65Var.u = false;
        long j = oaf.O() ? MultiFileUploader.UPLOAD_NEXT_INTERVAL : 500L;
        fm9.k(!x65Var.v);
        x65Var.s = j;
        if (sheVar != she.a) {
            fm9.k(!x65Var.v);
            x65Var.b = sheVar;
        }
        u75 u75VarA = x65Var.a();
        this.c = u75VarA;
        u75VarA.x0.a(new z65(this, wtVar));
        this.b = 0;
    }

    public go9(y7g y7gVar, Toolbar toolbar) {
        this.a = 5;
        this.b = xxb.toolbar_title;
        this.d = y7gVar;
        this.e = toolbar;
    }

    public go9(String str, CharSequence charSequence, int i) {
        this.a = 4;
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(charSequence)) {
                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
            }
            if (i != 0) {
                this.d = str;
                this.e = charSequence;
                this.b = i;
                return;
            }
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
        }
        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
    }
}
